package Atividade1.Questao3;

public class BuscaSequencial {
	protected int i, cont;
	protected boolean encontrado = false;
	
	public int buscaSeq(Produtos[] produtos, int cod) {
		while(i<produtos.length && !encontrado) {
			if (produtos[i].cod == cod) {
				encontrado = true;		
			}else {
				i++;
			}
			cont++;
		}
		return cont;
	}
}
