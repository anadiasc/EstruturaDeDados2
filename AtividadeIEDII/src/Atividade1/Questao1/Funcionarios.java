package Atividade1.Questao1;

public class Funcionarios {
	protected String nome;
	protected float salario;
	
	public Funcionarios(String nome, float salario){
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getSalario() {
		return salario;
	}
}
