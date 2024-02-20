package Atividade1.Questao1;

public class BubbleSort {
	protected int n, i;
	protected Funcionarios aux;
	
	//ordenação de forma crescente
	public void cresBublleSort(Funcionarios[] vetor) { 
		for (n=1;n<=vetor.length;n++) {
			for (i=0;i<=(vetor.length-2);i++) {
				if (vetor[i].salario > vetor[i+1].salario) {
					aux = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = aux;
				}
			}
		}
	}
	//ordenação de forma decrescente
	public void decresBublleSort(Funcionarios[] vetor) { 
		for (n=1;n<=vetor.length;n++) {
			for (i=0;i<=(vetor.length-2);i++) {
				if (vetor[i].salario < vetor[i+1].salario) {
					aux = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = aux;
				}
			}
		}
	}
	
	//ordenação de forma alfabética
		public void alfaBublleSort(Funcionarios[] vetor) { 
			int n = vetor.length;
	        boolean trocou;
	        
	        do {
	            trocou = false;
	            for (int i = 0; i < n - 1; i++) {
	                if (vetor[i].nome.compareTo(vetor[i+1].nome) > 0) {
	                	Funcionarios aux = vetor[i];
	                	vetor[i] = vetor[i+1];
	                	vetor[i+1]= aux;
	                    trocou = true;
	                }
	            }
	            n--;
	        } while (trocou);
		}
}
