package br.com.tt;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet01 {

	//n�o permite duplica��o de objetos
	public static void main(String[] args) {
		Set<String> frutas = new HashSet<>();
		frutas.add("ma�a");
		frutas.add("ma�a");
		frutas.add("banana");
		frutas.add("ma�a");
		
		for (String fruta : frutas) {
			System.out.println(fruta);
			
		}
		
		Set<String> frutas01 = new TreeSet<>();
		frutas01.add("ma�a");
		frutas01.add("ma�a");
		frutas01.add("banana");
		frutas01.add("ma�a");
		
		for (String fruta : frutas01) {
			System.out.println(fruta);
			
		}
		
		Set<String> frutas02 = new LinkedHashSet<>();
		frutas02.add("ma�a");
		frutas02.add("ma�a");
		frutas02.add("banana");
		frutas02.add("ma�a");
		
		for (String fruta : frutas02) {
			System.out.println(fruta);
			
		}

		
		
		
		
	}

}
