package AlgoritmosOrdenacao;

public class MetricasAlgoritmos {
	public static void metricas(long tempo, long comparacoes, int trocas) {
		long tempoEmSeg = tempo/1000;
		
		System.out.println("MÉTRICAS:\nTEMPO DE EXECUÇÃO: "+tempoEmSeg+"s\nTOTAL DE COMPARAÇÕES: "+comparacoes+"\nTOTAL DE TROCAS: "+trocas);
	}
}
