package br.com.tt;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet01 {

	//não permite duplicação de objetos
	public static void main(String[] args) {
		Set<String> frutas = new HashSet<>();
		frutas.add("maça");
		frutas.add("maça");
		frutas.add("banana");
		frutas.add("maça");
		
		for (String fruta : frutas) {
			System.out.println(fruta);
			
		}
		
		Set<String> frutas01 = new TreeSet<>();
		frutas01.add("maça");
		frutas01.add("maça");
		frutas01.add("banana");
		frutas01.add("maça");
		
		for (String fruta : frutas01) {
			System.out.println(fruta);
			
		}
		
		Set<String> frutas02 = new LinkedHashSet<>();
		frutas02.add("maça");
		frutas02.add("maça");
		frutas02.add("banana");
		frutas02.add("maça");
		
		for (String fruta : frutas02) {
			System.out.println(fruta);
			
		}

		
		
		
		
	}

}
