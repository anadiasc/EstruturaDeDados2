package Atividade1.Questao4;

public class Alunos {
	protected String nome;
	protected float nota1,nota2;
	protected float mediaPond;

	public Alunos() {
		
	}
	public Alunos(String nome,float nota1,float nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		
		this.mediaPond = (nota1*2) + (nota2*3) / (2+3);
	}
	
	public String getNome() {
		return nome;
	}
}
