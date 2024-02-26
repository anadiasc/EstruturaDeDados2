package Main;

import AlgoritmosOrdenacao.HeapSort;
import AlgoritmosOrdenacao.MetricasAlgoritmos;

public class TesteHS {
	public static void main(String[] args) {
		//String caminho = "numeros_ordenados.txt";
		//String caminho = "numeros_invertidos.txt";
		String caminho = "numeros_desordenados.txt";
		int[] vetor = new int[1000000]; 
		int j=0;

		String texto = Arquivo.ler(caminho);

		for(String str: texto.split(";")) {
			vetor[j] = Integer.parseInt(str);
			j++;
		}
		long inicio = System.currentTimeMillis();
		HeapSort.heapsort(vetor);
		long fim = System.currentTimeMillis() - inicio;
		
		MetricasAlgoritmos.metricas(fim, HeapSort.comparacoes, HeapSort.trocas);
	}
}
