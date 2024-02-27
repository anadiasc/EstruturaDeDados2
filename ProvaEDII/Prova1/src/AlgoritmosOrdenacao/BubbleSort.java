package AlgoritmosOrdenacao;

public class BubbleSort {
	protected static int n, i, aux;
	public static long comparacoes=0; 
	public static int trocas = 0;
	
	//ordenação de forma crescente
	public static void cresBublleSort(int[] vetor) { 
		for (n=1;n<=vetor.length-1;n++) {
			comparacoes++;
			for (i=0;i<=(vetor.length-2);i++) {
				comparacoes++;
				if (vetor[i]> vetor[i+1]){
					aux = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = aux;
					trocas++;
				}
			}
		}
	}
}
