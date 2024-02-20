package Atividade1.Questao3;

public class BuscaBinaria {
	protected int direita, esquerda, meio, cont;
	protected boolean encontrado = false;
	
	public int buscaBin(Produtos[] produtos, int cod) {
		this.esquerda = 0;
		this.direita = produtos.length-1;
		
		while(this.esquerda<=this.direita && !encontrado) {
			meio=(direita+esquerda)/2;
			
			if (produtos[meio].cod == cod) {
				encontrado = true;		
			}else if (cod < produtos[meio].cod) {
				direita = meio - 1;
			}else {
				esquerda = meio + 1;
			}
			cont++;
		}
		return cont;
	}
}
