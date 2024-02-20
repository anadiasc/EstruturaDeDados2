package Atividade1.Questao4;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Escola escola = new Escola();
		Scanner entrada = new Scanner(System.in);
		
		
		for(int i=0;i<8;i++) {
			String auxNome;
			float auxNota1,auxNota2;
			
			System.out.println("INFORME O NOME DO ALUNO "+(i+1)+": ");
			auxNome = entrada.next();
			System.out.println("INFORME A NOTA 1 DO ALUNO "+(i+1)+": ");
			auxNota1 = entrada.nextFloat();
			System.out.println("INFORME O NOTA 2 DO DO ALUNO "+(i+1)+": ");
			auxNota2 = entrada.nextFloat();
			
			escola.adcAlunos(auxNome, auxNota1, auxNota2);
		}
		
		escola.ordemMedPond();
		
		escola.ordemNota1();
		
		escola.mostrarReprovados();
	}
}
