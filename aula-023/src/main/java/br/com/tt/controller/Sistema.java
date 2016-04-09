package br.com.tt.controller;

import br.com.tt.model.Funcionario;
import br.com.tt.model.Pessoa;

public class Sistema {

	public static void main(String[] args) {
		Pessoa pessoa = new Funcionario();
		
		if (pessoa instanceof Funcionario){
			Funcionario funcionario = (Funcionario) pessoa;
			funcionario.getSalario();
			//ou
			((Funcionario) pessoa).getSalario();
		}
		
	}

}
