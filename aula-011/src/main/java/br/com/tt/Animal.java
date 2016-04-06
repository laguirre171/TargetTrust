package br.com.tt;

public class Animal {
	private String apelido;
	private String dono;
	
	public Animal(String apelido){
		super();
		this.apelido = apelido; //obrigado a ter apelido
	}
	
	public Animal(String apelido, String dono){
		this.apelido = apelido;
		this.dono = dono;
	}

	public String getDono() {
		return dono;
	}

	public String getApelido() {
		return apelido;
	}

}
