package br.com.tt;

import java.util.HashSet;
import java.util.Set;

public class HashSet01 {

	public static void main(String[] args) {
		Set<String> frutas = new HashSet<>();
		frutas.add("ma�a");
		frutas.add("ma�a");
		frutas.add("ma�a");
		frutas.add("ma�a");
		
		for (String fruta : frutas) {
			System.out.println(fruta);
			
		}
		
		
	}

}
