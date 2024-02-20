package Atividade1.Questao2;

import java.util.Scanner;

import AlgoritmosOrdenacao.SelectionSort;

public class Questao2 {
	protected Scanner entrada = new Scanner(System.in);
	protected int[] vetor = new int[10];
	SelectionSort selectionSort = new SelectionSort();
	
	public Questao2() {
		cadastrarNum();
	}
	
	private void cadastrarNum(){
		System.out.println("Informe 10 numeros inteiros: ");
		for(int i=0;i<10;i++) {
			vetor[i] = entrada.nextInt();
		}
	}
	
	public void mostrarMenor() {
		selectionSort.cresSelectionSort(this.vetor);
		int menor = vetor[0];
		int cont = 0;
		
		for(int num:vetor) {
			if (num==menor) {
				cont++;
			}
		}
		
		System.out.println("O menor número é "+menor+" e ele aparece "+cont+" vez(es)");
	}
	
	public void mostrarMaior() {
		selectionSort.decresSelectionSort(this.vetor);
		int maior = vetor[0];
		int cont = 0;
		
		for(int num:vetor) {
			if (num==maior) {
				cont++;
			}
		}
		
		System.out.println("O maior número é "+maior+" e ele aparece "+cont+" vez(es)");
	}
}
