package Atividade1.Questao3;

public class Produtos {
	protected int cod;
	protected String descricao;
	protected float preco;	
	protected Produtos[] listaProdutos = new Produtos[12];
	protected int qtdProd;
	
	public Produtos() {
		
	}
	public Produtos(int cod, String descricao, float preco) {
		this.cod = cod;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	protected void adcProd(int cod,String descricao, float preco) {
		listaProdutos[this.qtdProd] = new Produtos(cod,descricao,preco);
		qtdProd++;
	}
}
