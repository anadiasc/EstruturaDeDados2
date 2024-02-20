package Atividade1.Questao3;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Produtos produtos = new Produtos();
		Scanner entrada = new Scanner(System.in);
		BuscaBinaria buscaBinaria = new BuscaBinaria();
		BuscaSequencial buscaSequencial = new BuscaSequencial();
		
		//preencher lista com 12 produtos
		for(int i=0;i<12;i++) {
			int auxCod;
			String auxDes;
			float auxpreco;
			
			System.out.println("INFORME O CÓDIGO DO PRODUTO "+(i+1)+": ");
			auxCod = entrada.nextInt();
			System.out.println("INFORME A DESCRIÇÃO DO PRODUTO "+(i+1)+": ");
			auxDes = entrada.next();
			System.out.println("INFORME O PREÇO DO PRODUTO "+(i+1)+": ");
			auxpreco = entrada.nextFloat();
			
			produtos.adcProd(auxCod, auxDes, auxpreco);;
		}
		
		System.out.println("A quantidade de comparações feitas para encontrar o produto de código 5:");
		System.out.println("Algoritmo de Busca Sequencial: "+buscaSequencial.buscaSeq(produtos.listaProdutos, 3));
		System.out.println("Algoritmo de Busca Binaria: "+buscaBinaria.buscaBin(produtos.listaProdutos, 3));
	}
}
