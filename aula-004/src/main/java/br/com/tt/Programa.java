package br.com.tt;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//\t Cria o tab
		// para imprimir \t na tela utilizo \\t
		String nome = "";
		
		System.out.println("\t\tIniciando o Sistema"); 
		nome = JOptionPane.showInputDialog("Digite o Nome:");
		System.out.println("Seu nome � " + nome);
		String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");
		
		//Criando vari�vel inteiro com objeto
		Integer idade = Integer.parseInt(idadeStr);
		System.out.println("Sua idade � " + idade + " anos.");
		
		if (idade >= 18){
			String resultado = "Voc� � maior de 18 anos";
			System.out.println(resultado);	
			JOptionPane.showMessageDialog(null,resultado);
		} else{
			String resultadonegativo = "Voc� � menor de 18 anos"; //ctrl+shift+L para criar variaveis
			System.out.println(resultadonegativo);
			JOptionPane.showMessageDialog(null,resultadonegativo);
		}
		

	}

}
