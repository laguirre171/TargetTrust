package br.com.tt;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1;
		Pessoa p2;
		
		p1 = new Pessoa();
		p1.nome = "Pedro Silva";
		
		
		p2 = p1;
		
		System.out.println(p2.nome);
		
		p1 = new Pessoa();
		p1.nome = "Maria Costa";
		
		System.out.println(p1.nome);
				

	}

}
