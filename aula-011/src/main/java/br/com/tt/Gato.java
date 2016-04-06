package br.com.tt;

public class Gato extends Animal { //gato � um animal e consegue usar os metodos de l�
	
	private Integer idade;
	

	public Gato(String apelido, String dono, Integer idade) { //chama a classe que est� em animal e tem uma variavel pr�pria dela
		super(apelido, dono);
		
		this.idade = idade;
	}
	
	public void escrever(){
		System.out.println("Apelido: " + this.getApelido() + "\nDono: " + this.getDono() + "\nIdade: " + idade);
	}

}
