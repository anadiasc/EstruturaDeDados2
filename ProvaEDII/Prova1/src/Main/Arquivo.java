package Main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintWriter;


public class Arquivo {
	/**
	 * Método estático que possibilita ler um arquivo
	 * @param caminho
	 * @return String
	 */
	public static String ler(String caminho) {
		String conteudo = "";
		 
		try {
			FileReader arq = new FileReader(caminho);
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = "";
			
			try {
				linha = lerArq.readLine();
				while(linha!=null) {
					conteudo += linha;
					linha = lerArq.readLine();
				}
				arq.close();
			}catch(IOException ex) {
				conteudo = "Erro: não foi possivel ler o arquivo";
			}
			
			
		}catch(FileNotFoundException ex){
			conteudo = "Erro: arquivo não encontrado";
		}
		
		if(conteudo.contains("Erro")) {
			return "";
		}else {
			return conteudo;
		}
	}
	
	/**
	 * Método estático que permite a escrita em um arquivo
	 * @param caminho
	 * @param texto
	 * @return boolean
	 */
	public static boolean escrever(String caminho,String texto) {
		try {
			FileWriter arq = new FileWriter(caminho);
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.println(texto);
			gravarArq.close();
			
			return true;
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	}
}

