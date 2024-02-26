package AlgoritmosOrdenacao;

public class InsertionSort {
	protected static int i,j,eleito;
	public static int comparacoes=0, trocas = 0;

	//ordenação de forma crescente
	public static void cresInsertionSort(int[] vetor) {
		for (i=1;i<=(vetor.length-1);i++) {
			comparacoes++;
			eleito = vetor[i];
			j = i-1;
			trocas++;
			while (j>= 0 && vetor[j]>eleito) {
				vetor[j+1] = vetor[j];
				j = j-1;
				trocas++;
			}
			
			vetor[j+1] = eleito;
			trocas++;
		}
	}
}
