package br.com.tt.model;

import java.math.BigDecimal;

public class Cliente extends Pessoa {
	private Boolean ativo;
	private BigDecimal saldoDivida;
	
		
	
	
	public Cliente(Boolean ativo, BigDecimal saldoDivida) {
		super();
		this.ativo = ativo;
		this.saldoDivida = saldoDivida;
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
	
	

}
