package br.com.tt;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Programa {
	
	
	public static void main(String[] args) {
		//teste(1);
		//teste("aaaa");
		
		List<String> lista = new ArrayList<>();
		lista.add("Testo 1");
		lista.add("Testo 2");
		lista.add("Testo 3");
		
		int a = 4 + 5;
		Set<String> listaValoresUnicos = new HashSet<String>();
		listaValoresUnicos.add("Testo set 1");
		listaValoresUnicos.add("Testo set 2");
		listaValoresUnicos.add("Testo set 3");

		teste(lista);
		teste(listaValoresUnicos);
	}
	
	//iterator cria um objeto que verifica a existência de um próximo elemento. um tipo de for each
	public static <T extends Collection<String>> void teste(T t){  //esse método recebe qq coisa. É generics
		System.out.println(t);
		Iterator<E> iterator = t.iterator();
		while (iterator.hasNext()){
			System.out.println((Object) iterator.next());
			
		}
	}

}
