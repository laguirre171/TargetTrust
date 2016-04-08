package br.com.tt;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("Pedro");
		lista.add("Maria");
		lista.add("Bruno");
		lista.add("Marcia");
		lista.add("Lucas");
		
		lista.remove("Maria"); //para remover tem que ser exatamente igual, por isso é string; só remove a primeira ocorrencia
	
		for (String nome : lista) {
			System.out.println(nome);
			
		}
		
		lista.clear();
		System.out.println(lista.isEmpty());

	}

}
