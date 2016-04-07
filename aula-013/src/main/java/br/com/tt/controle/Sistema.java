package br.com.tt.controle;

import java.math.BigDecimal;

import br.com.tt.model.Cliente;
import br.com.tt.model.Fornecedor;

public class Sistema {

	private Sistema() { //não permite instancia da classe sistema
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setNome("Maria Silva"); // vem da classe pessoa
		cliente.setCPF("12345678912");
		cliente.setAtivo(Boolean.TRUE); // Esse true é estático - é uma
										// constante por isso é maiuscula
		cliente.setSaldoDivida(new BigDecimal(0));

		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome("Bruno Costa");
		fornecedor.setCPF("21987654321");
		fornecedor.setMaterial("TI");
		fornecedor.setAtivo(Boolean.TRUE);
		
		System.out.println(cliente);
		System.out.println(fornecedor);
		
		//reflection é a capacidade de olhar sobre o próprio objeto e iteragir sobre ele
	}

}
