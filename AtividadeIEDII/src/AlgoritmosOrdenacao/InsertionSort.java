package AlgoritmosOrdenacao;

public class InsertionSort {
	int i,j,eleito;
	
	//ordenação de forma crescente
	public void cresInsertionSort(int[] vetor) { 
		for (i=1;i<=(vetor.length-1);i++) {
			eleito = vetor[i];
			j = i-1;
			
			while (j>= 0 && vetor[j]>eleito) {
				vetor[j+1] = vetor[j];
				j = j-1;
			}
			
			vetor[j+1] = eleito;
		}
	}
	//ordenação de forma decrescente
	public void decresInsertionSort(int[] vetor) { 
		for (i=1;i<=(vetor.length-1);i++) {
			eleito = vetor[i];
			j = i-1;
			
			while (j>= 0 && vetor[j]<eleito) {
				vetor[j+1] = vetor[j];
				j = j-1;
			}
			
			vetor[j+1] = eleito;
		}
	}
}
