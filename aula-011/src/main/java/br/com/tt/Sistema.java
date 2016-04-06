package br.com.tt;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("Rex"); //alt + shift + l 
		Animal animal2 = new Animal("Totó","Pedro");
		
		System.out.println(animal.getApelido());
		System.out.println(animal2.getApelido() + " " + animal2.getDono());
		
		System.out.println("-----------------------------------------------------\n\n\n");
		new Gato("Lua", "Marcia",2).escrever();

	}

}
