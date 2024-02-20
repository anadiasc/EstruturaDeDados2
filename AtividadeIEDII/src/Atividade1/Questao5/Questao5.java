package Atividade1.Questao5;

import java.util.Scanner;

import AlgoritmosOrdenacao.SelectionSort;

public class Questao5 {
	public static void main(String[] args) {
		ColecaoNumeros col1 = new ColecaoNumeros();
		Scanner entrada = new Scanner(System.in);
		SelectionSort selectionSort = new SelectionSort();
		int i, numUsuario;
		int j = 0;
		
		while(j<15) {
			i = entrada.nextInt();
			
			if(col1.cadastarNum(i)) {
				j++;
			}else {
				System.out.print("O número já está na lista");
			}
		}
		//ordenando os números inseridos pelo usuario
		selectionSort.cresSelectionSort(col1.colecao);
		
		System.out.print("Digite um número: ");
		numUsuario = entrada.nextInt();
		
		if(col1.verificaNum(numUsuario)==true) {
			System.out.println("O número "+numUsuario+" está na lista");
			
			System.out.println("Verificar posição por:\n1. Busca sequencial\n2. Busca binária\n-> ");
			
			int escolha = entrada.nextInt();
			
			if(escolha == 1) {
				col1.verificaPosicaoBSequencial(numUsuario);
			}else if(escolha == 2) {
				col1.verificaPosicaoBBinaria(numUsuario);
			}else {
				System.out.println("escolha inválida");
			}
		}else {
			System.out.println("O número "+numUsuario+" não está na lista");
		}
	}
}
