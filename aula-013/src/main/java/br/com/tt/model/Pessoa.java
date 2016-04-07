package br.com.tt.model;

import java.util.Calendar;

public class Pessoa {
	private String nome;
	private String CPF;
	private Calendar dataNasc;
	
		
		

	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(String nome, String cPF, Calendar dataNasc) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.dataNasc = dataNasc;
	}

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
		CPF = cPF;
	}
	public Calendar getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	

}
