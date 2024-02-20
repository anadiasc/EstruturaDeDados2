package AlgoritmosOrdenacao;

public class SelectionSort {
	int i,j,pos,eleito,menor,maior;
	
	//ordenação de forma crescente
	public void cresSelectionSort(int[] vetor) {
		for(i=0;i<=(vetor.length-2);i++) {
			eleito = vetor[i];
			menor = vetor[i+1];
			pos = i+1;
			
			for(j=i+1;j<=(vetor.length-1);j++) {
				if(vetor[j]<menor) {
					menor = vetor[j];
					pos=j;
				}
			}
			if(menor<eleito) {
				vetor[i] = vetor[pos];
				vetor[pos] = eleito;
			}
		}
	}
	
	public void decresSelectionSort(int[] vetor) {
		for(i=0;i<=(vetor.length-2);i++) {
			eleito = vetor[i];
			maior = vetor[i+1];
			pos = i+1;
			
			for(j=i+1;j<=(vetor.length-1);j++) {
				if(vetor[j]>maior) {
					maior = vetor[j];
					pos=j;
				}
			}
			if(maior>eleito) {
				vetor[i] = vetor[pos];
				vetor[pos] = eleito;
			}
		}
	}
}
