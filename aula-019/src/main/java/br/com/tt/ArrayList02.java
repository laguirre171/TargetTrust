package br.com.tt;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		List lista = new ArrayList();		
		lista.add("Pedro");
		lista.add(1);
		lista.add(new Aluno());
		
		for (Object elementoDaLista : lista) {
			System.out.println(elementoDaLista.getClass().getName() + " - " );
			System.out.println(elementoDaLista + " - ");
			System.out.println((elementoDaLista instanceof Aluno) + " - \n");
			
		}

	}

}
