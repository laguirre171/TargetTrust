package br.com.tt;

import java.io.File;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Operadores");
		
		Long soma = 1L + 5L;
		System.out.println(soma);
		
		//Pre incremento
		//Primeiro incrementa um valor e depois atribui um valor
		Long incremento = ++soma;
		
		System.out.println(incremento);

		//somente incrementa o valor
		incremento++;
		System.out.println("Incrementa Pos = " + incremento);
		
		File f1 = new File("");
		File f2 = new File("");
		
		
		//Comparação de referencias - Objetos diferentes nesse momento
		if (f1==f2){
			System.out.println("São iguais");
		} else{
			System.out.println("São diferentes");
		}
		
		f1 = f2;
		if (f1==f2){
			System.out.println("São iguais");
		} else{
			System.out.println("São diferentes");
		}
		
		//equal compara valores dos objetos
		f2 = new File("");
		if(f1.equals(f2)){
			System.out.println("São iguais");
		} else{
			System.out.println("São diferentes");
		}
		
		//&& = E = compara somente se necessário o segundo argumento
		if (true && true ){
			System.out.println("Valores verdadeiros");
		}
		
		if (false || true){
			System.out.println("Um valor é verdadeiro");			
		}
		
		Long val1 = 5L;
		val1+=5; //é igual a val1 = val1 + 5;
		System.out.println("Resultado de val1 = " + val1);
		
		//Boolean.true == true
		Boolean situacao = Boolean.TRUE;
		
		//Segue um ternário em java
		String result = situacao ? "valor verdadeiro":"valor falso"; //É um if para verificar se um valor é verdadeiro ou falso
		System.out.println(result);
		
		//resolve primeiro os parenteses 
		Integer valor = 5 * (3 + 1);
		System.out.println(valor);
	}

}
