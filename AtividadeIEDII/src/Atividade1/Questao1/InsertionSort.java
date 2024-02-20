package Atividade1.Questao1;

public class InsertionSort {
	protected int i,j;
	protected Funcionarios eleito;
	
	//ordenação de forma crescente
	public void cresInsertionSort(Funcionarios[] vetor) { 
		for (i=1;i<=(vetor.length-1);i++) {
			eleito = vetor[i];
			j = i-1;
			
			while (j>= 0 && vetor[j].salario>eleito.salario) {
				vetor[j+1] = vetor[j];
				j = j-1;
			}
			
			vetor[j+1] = eleito;
		}
	}
	//ordenação de forma decrescente
	public void decresInsertionSort(Funcionarios[] vetor) { 
		for (i=1;i<=(vetor.length-1);i++) {
			eleito = vetor[i];
			j = i-1;
			
			while (j>= 0 && vetor[j].salario<eleito.salario) {
				vetor[j+1] = vetor[j];
				j = j-1;
			}
			
			vetor[j+1] = eleito;
		}
	}
	
	//ordenação de forma alfabética
	public void alfaInsertionSort(Funcionarios[] vetor) { 
		int n = vetor.length;
        boolean trocou;
        
        do {
            trocou = false;
            for (int i = 0; i < n; i++) {
            	eleito = vetor[i];
    			j = i-1;
    			
    			while (j>= 0 && vetor[j].nome.compareTo(eleito.nome) > 0) {
    				vetor[j+1] = vetor[j];
    				j = j-1;
    				 trocou = true;
    			}
    			vetor[j+1] = eleito;
            }
        } while (trocou);
	}
}
