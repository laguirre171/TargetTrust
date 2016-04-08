package br.com.tt;

import java.util.ArrayList;
import java.util.List;

public class Java8 {

	public static void main(String[] args) {
		List<String> clientes = new ArrayList<>();
		clientes.add("Pedra");
		clientes.add("Maria");
		clientes.add("Marcia");
		clientes.add("Bruno");
		
		//programação funcional
		//clientes.forEach(c -> System.out.println(c));
		clientes.forEach(c -> System.out.println("--> " + c));
		
 
	}

}
