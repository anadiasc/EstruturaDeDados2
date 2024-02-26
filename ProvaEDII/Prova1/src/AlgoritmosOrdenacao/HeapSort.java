package AlgoritmosOrdenacao;


public class HeapSort {
    private static int tam;
    private static int[] vetor;
    public static int comparacoes = 0, trocas = 0;
    
    public static void heapsort(int[] array) {
        vetor = array;          
        tam = vetor.length - 1;
        
        comparacoes++;
        
        constroiHeap();
        
        for (int i = tam; i > 0; i--) {
            troca(0, tam);
            tam -= 1;           
            maxHeapifica(0);
        }
    }
    
    private static void constroiHeap() {
        int meio = (int) (tam/2);
        comparacoes++;
        for (int i = meio - 1; i >= 0; i--) {
            maxHeapifica(i);
        }
    }
   
    private static void troca(int i, int j) {
        int aux;
        aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
        
        trocas++;
    }
 
    private static void maxHeapifica(int pai) {
    	comparacoes++;
        
    	int maior = pai,            
            esquerda = 2 * pai + 1,
            direita = 2 * pai + 2;
        
        if (esquerda <= tam && vetor[esquerda] > vetor[maior]) {
        	 maior = esquerda;
        }
        if (direita <= tam && vetor[direita] > vetor[maior]) {
        	maior = direita;
        }
        comparacoes++;  
        if (maior != pai) {
            troca(pai, maior);
            maxHeapifica(maior);
        }
    }
}