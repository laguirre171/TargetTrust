package br.com.tt;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortMap001 {

	
	///sort é igaual a ordenar 
	//ordena pela chave
	// integer possui comparador
	public static void main(String[] args) {
		SortedMap<Integer, String> map = new TreeMap<>();
		map.put(1, "aaa");
		map.put(9, "bbb");
		map.put(5, "ccc");
		map.put(2, "ddd");
		for (Map.Entry<Integer, String> elemento : map.entrySet()) {
			System.out.println(elemento.getKey() + " - " + elemento.getValue());
			
		}
	}
	
}
