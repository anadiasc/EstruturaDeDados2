package AlgoritmosOrdenacao;

public class BubbleSort {
	protected int n, i, aux;
	
	//ordenação de forma crescente
	public void cresBublleSort(int[] vetor) { 
		for (n=1;n<=vetor.length;n++) {
			for (i=0;i<=(vetor.length-2);i++) {
				if (vetor[i]> vetor[i+1]) {
					aux = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = aux;
				}
			}
		}
	}
	//ordenação de forma decrescente
	public void decresBublleSort(int[] vetor) { 
		for (n=1;n<=vetor.length;n++) {
			for (i=0;i<=(vetor.length-2);i++) {
				if (vetor[i] < vetor[i+1]) {
					aux = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = aux;
				}
			}
		}
	}
}
