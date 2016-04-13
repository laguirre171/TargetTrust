package br.com.tt.controller;

import br.com.tt.model.Cliente;
import br.com.tt.model.Funcionario;
import br.com.tt.model.Pessoa;

public class Sistema {

	public static void main(String[] args) {
		 Pessoa pessoa = new Funcionario();
		 
		 if(pessoa instanceof Funcionario){
			 Funcionario funcionario = (Funcionario) pessoa;
			 funcionario.getSalario();
			 // Ou
			 ((Funcionario) pessoa).getSalario();
			 
			 funcionario.setNome("Bruno");
			 funcionario.setCpf("545454");
			 funcionario.setSalario(7000D);
			 funcionario.setFuncao("Desenvolvedor JAVA");
			 
			 funcionario.salvar();
		 }
		 
		 Cliente cliente = new Cliente();
		 cliente.setNome("Marcia");
		 cliente.setCpf("57878757");
		 cliente.salvar();
		 
	}

}
