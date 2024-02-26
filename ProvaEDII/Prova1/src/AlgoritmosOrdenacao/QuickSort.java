package AlgoritmosOrdenacao;

public class QuickSort {
	public static int comparacoes=0, trocas = 0;
	
	public static void troca(int vetor[], int i, int j) {
		int aux;
		aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
	
	public static int particao(int vetor[], int p, int r) {
		int pivo, i, j;
		pivo = vetor[(p+r)/2];
		i = p-1;
		j = r+1;
		
		while(i<j) {
			do {
				j = j-1;
				comparacoes++;
			}while(vetor[j]>pivo);
			
			do {
				i = i+1;
				comparacoes++;
			}while(vetor[i]<pivo);
			
			if(i<j) trocas++; troca(vetor,i,j);
		}
		return j;
	}
	
	public static void quickSort(int vetor[], int p, int r) {
		int q;
		if(p<r) {
			q = particao(vetor,p,r);
			quickSort(vetor,p,q);
			quickSort(vetor,q+1,r);
		}
	}
}
