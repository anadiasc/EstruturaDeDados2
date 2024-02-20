package Atividade1.Questao4;


public class Escola {
	protected Alunos[] listaAlunos = new Alunos[8];
	protected int qtdAlunos;
	
	public Escola() {
		
	}
	
	public void adcAlunos(String nome,float nota1,float nota2) {
		this.listaAlunos[qtdAlunos] = new Alunos(nome,nota1,nota2);
		qtdAlunos++;
	}
	
	public void ordemMedPond() {
		ordenarPorMedia();
		
		System.out.println("| LISTA DE ALUNOS (DECRES. POR MÉDIA PONDERADA) |");
		for (Alunos aluno: listaAlunos) {
			System.out.print("NOME: "+aluno.nome+" | NOTA 1: "+aluno.nota1+" | NOTA 2: "+aluno.nota2+" | MÉDIA: "+aluno.mediaPond);
			System.out.print("\n");
		}
	}
	
	private void ordenarPorMedia() {
		float maior;
		int i,pos,j;
		Alunos eleito;
		
		for(i=0;i<=(this.listaAlunos.length-2);i++) {
			eleito = this.listaAlunos[i];
			maior = this.listaAlunos[i+1].mediaPond;
			pos = i+1;
			
			for(j=i+1;j<=(this.listaAlunos.length-1);j++) {
				if(this.listaAlunos[j].mediaPond>maior) {
					maior = this.listaAlunos[j].mediaPond;
					pos=j;
				}
			}
			if(maior>eleito.mediaPond) {
				this.listaAlunos[i] = this.listaAlunos[pos];
				this.listaAlunos[pos] = eleito;
				
			}
		}
	}
	
	public void ordemNota1() {
		ordenarPorNota();
		
		System.out.println("| LISTA DE ALUNOS (CRES. POR NOTA 1) |");
		for (Alunos aluno: listaAlunos) {
			System.out.print("NOME: "+aluno.nome+" | NOTA 1: "+aluno.nota1+" | NOTA 2: "+aluno.nota2+" | MÉDIA: "+aluno.mediaPond);
			System.out.print("\n");
		}
	}
	
	private void ordenarPorNota() {
		float menor;
		int i,pos,j;
		Alunos eleito;
		
		for(i=0;i<=(this.listaAlunos.length-2);i++) {
			eleito = this.listaAlunos[i];
			menor = this.listaAlunos[i+1].nota1;
			pos = i+1;
			
			for(j=i+1;j<=(this.listaAlunos.length-1);j++) {
				if(this.listaAlunos[j].nota1<menor) {
					menor = this.listaAlunos[j].nota1;
					pos=j;
				}
			}
			if(menor<eleito.nota1) {
				this.listaAlunos[i] = this.listaAlunos[pos];
				this.listaAlunos[pos] = eleito;
			}
		}
	}
	
	public void mostrarReprovados() {
		Alunos[] reprovados = verificarReprovacao();
		
		if(reprovados.length==0) {
			System.out.println("Não há alunos reprovados");
		}else {
			System.out.println("| LISTA DE ALUNOS REPROVADOS |");
			ordenarAlfa(reprovados);
		}
	}
	
	private Alunos[] verificarReprovacao() {
		Alunos[] reprovados = new Alunos[8];
		int j=0;
		
		for (Alunos aluno: this.listaAlunos) {
			if (aluno!=null) {
				if (aluno.mediaPond<7) {
					reprovados[j]=aluno;
					j++;
				}
			}
		}
		return reprovados;
	}
	
	public void ordenarAlfa(Alunos[] lista) {
		int n = lista.length;
        boolean trocou;
        
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (lista[i].nome.compareTo(lista[i+1].nome) > 0) {
                	Alunos aux = lista[i];
                	lista[i] = lista[i+1];
                	lista[i+1]= aux;
                    trocou = true;
                }
            }
            n--;
        } while (trocou);
	}
}
