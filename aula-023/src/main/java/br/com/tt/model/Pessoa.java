package br.com.tt.model;

public abstract class Pessoa { //não pode criar new
	private String nome;
	private String CPF;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		this.CPF = cPF;
	}

}
