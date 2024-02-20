package Atividade1.Questao1;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import Atividade1.Questao4.Alunos;


public class Empresa {
	protected Funcionarios[] listaFunc = new Funcionarios[5];
	protected Scanner entrada = new Scanner(System.in);
	protected int qtd;
	protected BubbleSort bs = new BubbleSort();
	protected InsertionSort is = new InsertionSort();
	protected SelectionSort ss = new SelectionSort();
	
	
	public Empresa() {
		
	}
	
	public void cadastrarFunc(String nome, float salario) {
		inserirFunc(new Funcionarios(nome, salario));
	}
	
	public void inserirFunc(Funcionarios func) {
		listaFunc[qtd] = func;
		qtd++;
	}
	
	public void ordenarLista() {
		System.out.println("| ESCOLHA A FORMA DE ORDENAÇÃO: ");
		System.out.println("| 1. ORDEM CRESCENTE DE SALARIO ");
		System.out.println("| 2. ORDEM DESCRESCENTE DE SALARIO ");
		System.out.println("| 3. ORDEM ALFABÉTICA ");
		
		int escolha = entrada.nextInt();
		int algoritmo;
		
		switch(escolha) {
		case 1:
			menuAlgoritmos();
			
			algoritmo = entrada.nextInt();
			
			switch(algoritmo) {
			case 1:
				bs.cresBublleSort(listaFunc);
				mostrarLista();
				break;
			case 2:
				is.cresInsertionSort(listaFunc);
				mostrarLista();
				break;
			case 3:
				ss.cresSelectionSort(listaFunc);
				mostrarLista();
				break;
			default:
				System.out.println("ESCOLHA INVÁLIDA");
				break;
			}
			break;
		case 2:
			menuAlgoritmos();
			
			algoritmo = entrada.nextInt();
			
			switch(algoritmo) {
			case 1:
				bs.decresBublleSort(listaFunc);
				mostrarLista();
				break;
			case 2:
				is.decresInsertionSort(listaFunc);
				mostrarLista();
				break;
			case 3:
				ss.decresSelectionSort(listaFunc);
				mostrarLista();
				break;
			default:
				System.out.println("ESCOLHA INVÁLIDA");
				break;
			}
			break;
		case 3:
			menuAlgoritmos(); 
			
			algoritmo = entrada.nextInt();
			
			switch(algoritmo) {
			case 1:
				bs.alfaBublleSort(listaFunc);
				mostrarLista();
				break;
			case 2:
				is.alfaInsertionSort(listaFunc);
				mostrarLista();
				break;
			case 3:
				ss.alfaSelectionSort(listaFunc);
				mostrarLista();
				break;
			default:
				System.out.println("ESCOLHA INVÁLIDA");
				break;
			}
			break;
		default:
			System.out.println("ESCOLHA INVÁLIDA");
		}
	}
	
	private void menuAlgoritmos() {
		System.out.println("| ESCOLHA O ALGORITMO DE ORDENAÇÃO: ");
		System.out.println("| 1. BUBBLE SORT");
		System.out.println("| 2. INSERTION SORT");
		System.out.println("| 3. SELECTION SORT");
	}
	
	private void mostrarLista() {
		System.out.println("| LISTA DE FUNCIONARIOS: ");
		for(Funcionarios f: listaFunc) {
			System.out.println("| NOME: "+f.getNome()+" | SALARIO: "+f.getSalario());
		}
	}
}
