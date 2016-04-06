package br.com.tt;

import java.util.ArrayList;
import java.util.List;

public class TesteForEach {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Pedro");
		nomes.add("Bruno");
		nomes.add("Marcia");
		
		for (String nome : nomes){
			System.out.println(nome);
		}

	}
}
