package br.com.tt.model;

import java.math.BigDecimal;

public class Cliente extends Pessoa {
	private Boolean ativo;
	private BigDecimal saldoDivida;
	
		
	/*
	
	public Cliente(Boolean ativo, BigDecimal saldoDivida) {
		super();
		this.ativo = ativo;
		this.saldoDivida = saldoDivida;
	}*/
	
	public void geraId(){
		System.out.println(this.getClass().getSimpleName() + Math.random());
	}
	
	
	
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public BigDecimal getSaldoDivida() {
		return saldoDivida;
	}
	public void setSaldoDivida(BigDecimal saldoDivida) {
		this.saldoDivida = saldoDivida;
	}
	
	@Override
	public String toString(){
		return this.getNome() + " " + CPF ; //CPF é protected por isso pode ser utilizado sem o get
	}

}
