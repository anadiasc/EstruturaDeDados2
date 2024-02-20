package Atividade1.Questao1;

//import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		//Scanner entrada = new Scanner(System.in);

		Funcionarios f1 = new Funcionarios("Diogo",1111);
		Funcionarios f2 = new Funcionarios("Ana",1111);
		Funcionarios f3 = new Funcionarios("Hugo",1111);
		Funcionarios f4 = new Funcionarios("Caio",1111);
		Funcionarios f5 = new Funcionarios("Bruno",1111);
		
		empresa.inserirFunc(f1);
		empresa.inserirFunc(f2);
		empresa.inserirFunc(f3);
		empresa.inserirFunc(f4);
		empresa.inserirFunc(f5);
	
		
		empresa.ordenarLista();
	}
}
