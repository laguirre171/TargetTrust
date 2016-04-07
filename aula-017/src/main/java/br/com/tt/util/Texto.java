package br.com.tt.util;

public class Texto {

	public static void mostrarNomes(String nome) {
		String[] nomes = nome.split(" ");
		String nomePrint = "";
		for (int i = 0; i < nomes.length; i++) {
			//System.out.println(" - " + nomes[i]);
			nomes[i] = (nomes[i].charAt(0)+"").toUpperCase() + nomes[i].substring(1, nomes[i].length());
			nomePrint = nomePrint+nomes[i] + " ";
		} 
		System.out.println("Show name: " + nomePrint);
	}
	
}
