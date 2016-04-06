package br.com.tt;

public class Gato extends Animal { //gato é um animal e consegue usar os metodos de lá
	
	private Integer idade;
	

	public Gato(String apelido, String dono, Integer idade) { //chama a classe que está em animal e tem uma variavel própria dela
		super(apelido, dono);
		
		this.idade = idade;
	}
	
	public void escrever(){
		System.out.println("Apelido: " + this.getApelido() + "\nDono: " + this.getDono() + "\nIdade: " + idade);
	}

}
