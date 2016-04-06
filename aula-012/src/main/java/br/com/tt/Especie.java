package br.com.tt;

public class Especie {
	private String nome;
	private Integer codigo;
	private String familia;  //se tivesse o static iria ser um para todos
	private static int qtd;
	
	public Especie(){ //construtor
		qtd++; //soma a quantidade de animais de forma stática
	}
	
	//alt+shift + s depois r cria os get and setters
	
	public static int getQtd() {
		return qtd;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public  String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	

}
