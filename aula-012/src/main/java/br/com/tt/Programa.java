package br.com.tt;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Especie cachorros = new Especie();
		cachorros.setCodigo(1);
		cachorros.setNome("Cachorro");
		cachorros.setFamilia("Mamifero");
		
		Especie passaros = new Especie();
		passaros.setCodigo(1);
		passaros.setNome("Passaro");
		passaros.setFamilia("aves");
		
		System.out.println(cachorros.getFamilia());
		System.out.println(passaros.getFamilia());
		
		System.out.println(Especie.getQtd(); //é estático


	}

}
