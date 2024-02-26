package AlgoritmosOrdenacao;

public class MergeSort {
	public static int comparacoes=0, trocas = 0;
	
	public static void merge(int vetor[],int inicio, int fim) {
		int meio;
		if(inicio<fim) {
			meio = (inicio+fim)/2;
			merge(vetor,inicio,meio);
			merge(vetor,meio+1,fim);
			intercala(vetor,inicio,fim,meio);
		}
	}
	
	public static void intercala(int vetor[],int inicio,int fim, int meio) {
		int poslivre, inicio_vetor1, inicio_vetor2,i;
		int aux[] = new int[1000000];
		inicio_vetor1 = inicio;
		inicio_vetor2 = meio+1;
		poslivre = inicio;
		
		while(inicio_vetor1<=meio && inicio_vetor2<=fim) {
			comparacoes++;
			if(vetor[inicio_vetor1]<= vetor[inicio_vetor2]){
				aux[poslivre] = vetor[inicio_vetor1];
				inicio_vetor1 = inicio_vetor1+1;
			}else{
				aux[poslivre] = vetor[inicio_vetor2];
				inicio_vetor2 = inicio_vetor2 + 1;
			}
			poslivre = poslivre+1;
		}
		
		for(i=inicio_vetor1;i<=meio;i++) {
			aux[poslivre] = vetor[i];
			poslivre = poslivre + 1;
		}
		
		for(i=inicio_vetor2;i<=fim;i++) {
			aux[poslivre] = vetor[i];
			poslivre = poslivre+1;
		}
		
		for(i=inicio;i<=fim;i++) {
			vetor[i] = aux[i];
			trocas++;
		}
	}
}
