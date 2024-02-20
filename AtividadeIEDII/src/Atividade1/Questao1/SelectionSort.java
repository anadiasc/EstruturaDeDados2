package Atividade1.Questao1;

public class SelectionSort {
	protected int i,j,pos;
	protected Funcionarios eleito,menor,maior;
	
	//ordenação de forma crescente
	public void cresSelectionSort(Funcionarios[] vetor) {
		for(i=0;i<=(vetor.length-2);i++) {
			eleito = vetor[i];
			menor = vetor[i+1];
			pos = i+1;
			
			for(j=i+1;j<=(vetor.length-1);j++) {
				if(vetor[j].salario<menor.salario) {
					menor = vetor[j];
					pos=j;
				}
			}
			if(menor.salario<eleito.salario) {
				vetor[i] = vetor[pos];
				vetor[pos] = eleito;
			}
		}
	}
	//ordenação de forma decrescente
	public void decresSelectionSort(Funcionarios[] vetor) {
		for(i=0;i<=(vetor.length-2);i++) {
			eleito = vetor[i];
			maior = vetor[i+1];
			pos = i+1;
			
			for(j=i+1;j<=(vetor.length-1);j++) {
				if(vetor[j].salario>maior.salario) {
					maior = vetor[j];
					pos=j;
				}
			}
			if(maior.salario>eleito.salario) {
				vetor[i] = vetor[pos];
				vetor[pos] = eleito;
			}
		}
	}
	//ordenação de forma alfabética
	public void alfaSelectionSort(Funcionarios[] vetor) {
		for(i=0;i<=(vetor.length-2);i++) {
			eleito = vetor[i];
			maior = vetor[i+1];
			pos = i+1;
			
			for(j=i+1;j<=(vetor.length-1);j++) {
				if(vetor[j].nome.compareTo(maior.nome) < 0) {
					maior = vetor[j];
					pos=j;
				}
			}
			if(maior.nome.compareTo(eleito.nome) < 0) {
				vetor[i] = vetor[pos];
				vetor[pos] = eleito;
			}
		}
	}
}
