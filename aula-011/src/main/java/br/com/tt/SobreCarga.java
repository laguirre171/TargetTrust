package br.com.tt;

import java.util.ArrayList;
import java.util.List;

public class SobreCarga {
	static List<String> nomes = new ArrayList<String>(); //Lista de nomes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String retorno = pesquisar("M");		
		if (retorno == null){
			System.out.println("Nome não encontrado.");			
		}else{
			System.out.println("O nome " + retorno + " foi encontrado.");
		}
		
		System.out.println(pesquisar(1));

	}
	
	public static String pesquisar(Integer id){
		return nomes.get(id - 1);
	}

	/*
	 * Funcionalidade utilizada para pesquisar através do nome
	 * 
	 * @param nome
	 * 
	 * @return
	 * 
	 */
	public static String pesquisar(String nome) { //Pertence a classe
		for (String nomeVar : nomes) {
			if (nomeVar.startsWith(nome)){
				return nomeVar;				
			}
						
		}
		return null;
	}
	
	static {
		nomes.add("Pedro");
		nomes.add("Maria");
		nomes.add("Carlos");
		nomes.add("Bruno");
		nomes.add("Marcia");
		
	}

}
