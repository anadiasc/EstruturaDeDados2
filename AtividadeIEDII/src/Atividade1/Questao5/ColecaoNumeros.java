package Atividade1.Questao5;

import java.util.Arrays;

public class ColecaoNumeros {
	protected int[] colecao = new int[15];
	protected int qtd;
	
	public ColecaoNumeros() {
		
	}
	
	public boolean cadastarNum(int num) {
		if (verificaNum(num)!=true) {
			colecao[qtd] = num;
			qtd++;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verificaNum(int num) {
		if (Arrays.asList(colecao).contains(num)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void verificaPosicaoBBinaria(int num) {
		int indice=auxverificaPosicaoBBinaria(num);
		
		if (indice!= -1) {
            if (indice % 2 == 0) {
                System.out.println("O número " + num + " está em uma posição par.");
            } else {
                System.out.println("O número " + num + " está em uma posição ímpar.");
            }
        } else {
            System.out.println("O número " + num + " não foi encontrado no vetor.");
        }
	
	}
	
	private int auxverificaPosicaoBBinaria(int num) {
		int inicio = 0;
        int fim = this.colecao.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (this.colecao[meio] == num) {
                return meio;
            }

            if (this.colecao[meio] < num) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
	}
	
	public void verificaPosicaoBSequencial(int num) {
		int indice=0;
		for (int y = 0; y < this.colecao.length; y++) {
            if (this.colecao[y] == num) {
                indice = y;
                break; 
            }
        }
		if(indice%2==0) {
			System.out.print("O número "+num+" está em uma posição par da lista");
		}else {
			System.out.print("O número "+num+" está em uma posição ímpar da lista");
		}
	}
}
