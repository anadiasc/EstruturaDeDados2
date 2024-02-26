package Main;


import AlgoritmosOrdenacao.MetricasAlgoritmos;
import AlgoritmosOrdenacao.QuickSort;

public class TesteQS {
	public static void main(String[] args) {
		String caminho = "numeros_ordenados.txt";
		//String caminho = "numeros_invertidos.txt";
		//String caminho = "numeros_desordenados.txt";
		int[] vetor = new int[1000000]; 
		int j=0;

		String texto = Arquivo.ler(caminho);

		for(String str: texto.split(";")) {
			vetor[j] = Integer.parseInt(str);
			j++;
		}
		long inicio = System.currentTimeMillis();
		QuickSort.quickSort(vetor, 0, 999999);
		long fim = System.currentTimeMillis() - inicio;
		
		MetricasAlgoritmos.metricas(fim, QuickSort.comparacoes, QuickSort.trocas);
	}
}
