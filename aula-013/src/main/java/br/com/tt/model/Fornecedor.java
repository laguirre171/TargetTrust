package br.com.tt.model;

import java.util.Calendar;

public class Fornecedor extends Pessoa {
	private Boolean ativo;
	private String material;
	
	
	
	public Fornecedor(String nome, String cPF, Calendar dataNasc, Boolean ativo, String material) {
		super(nome, cPF, dataNasc);
		this.ativo = ativo;
		this.material = material;
	}
	
	public Fornecedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fornecedor(Boolean ativo, String material) {
		super();
		this.ativo = ativo;
		this.material = material;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	

}
