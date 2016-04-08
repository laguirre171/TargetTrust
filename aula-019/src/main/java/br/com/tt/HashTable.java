package br.com.tt;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		//Hashtable nomes = new Hashtable();
		//Hashtable <Integer,String> nomes = new Hashtable<Integer, String>();
		Map <Integer,String> nomes = new Hashtable<>();
		
		nomes.put(1, "A");
		nomes.put(2, "B");
		nomes.put(3, "C");
		
		System.out.println(nomes.containsKey(3));
		System.out.println();
		System.out.println(nomes.get(2));
		
		for (Map.Entry<Integer, String> nome : nomes.entrySet()) {
			System.out.println(nome.getKey()+ " - " + nome.getValue());
		} 
	}

}
