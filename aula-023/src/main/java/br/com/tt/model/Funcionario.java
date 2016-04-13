package br.com.tt.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import br.com.tt.inf.Dao;
import br.com.tt.util.UtilFile;

public class Funcionario extends Pessoa implements Dao<Funcionario> {

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

	@Override
	public void mostra() {
		System.out.println(this.getNome() + " -- " + this.salario);

	}

	public void salvar() {
		// salvar no banco de dados
		System.out.println("Salvando funcionario");
		UtilFile.salvar("./funcionario.txt", this);

		
	}

	public <I> Funcionario buscar(I id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <E> List<Funcionario> consultar(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Funcionario [ "+super.toString()+"salario=" + salario + ", funcao=" + funcao + "]";
	}

	
}
