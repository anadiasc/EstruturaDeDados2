package AlgoritmosOrdenacao;

public class SelectionSort {
	protected static int i,j,pos,eleito,menor,maior;
	public static int comparacoes=0, trocas = 0;
	
	//ordenação de forma crescente
	public static void cresSelectionSort(int[] vetor) {
		for(i=0;i<=(vetor.length-2);i++) {
			eleito = vetor[i];
			menor = vetor[i+1];
			pos = i+1;
			trocas++;
			
			for(j=i+1;j<=(vetor.length-1);j++) {
				comparacoes++;
				if(vetor[j]<menor) {
					menor = vetor[j];
					pos=j;
				}
			}
			if(menor<eleito) {
				vetor[i] = vetor[pos];
				vetor[pos] = eleito;
				trocas++;
			}
		}
	}
}
