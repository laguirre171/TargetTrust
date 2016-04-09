package br.com.tt.model;

import java.util.List;

import br.com.tt.inf.Dao;

public class Funcionario extends Pessoa implements Dao<Funcionario>{
	private Double salario;
	private String funcao;
	
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public void mostra(){
		System.out.println(this.getNome() + " -- " + this.salario);
	}
	public void salvar() {
		// salvar no banco de dados
		
	}
	public <I> Funcionario buscar(I id) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Funcionario> consultar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
