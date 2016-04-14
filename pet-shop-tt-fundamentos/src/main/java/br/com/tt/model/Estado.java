package br.com.tt.model;

public enum Estado {
	RS(1,"Rio Grande do Sul"),
	SC(2,"Santa Catarina"),
	PR(3,"Paran�"),
	SP(4,"S�o Paulo");
	
	String descricao;
	int codigo;
	
	private Estado(int codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
	public int getCodigo(){
		return codigo;
	}
}
