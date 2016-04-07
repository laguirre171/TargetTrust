package br.com.tt;

public class Programa {

	public static void main(String[] args) {
		comprar("Marcia", 15D,"Banana", "Maçã", "Arroz"); //só pode ser utilizado no último parametro do método o varags que é um tipo de array
	}
	
	public static void comprar(String cliente, Double valor, String...produtos ){ //esses ... são os vargs
		
		System.out.println("Cliente: " + cliente);
		System.out.println("Valor  : " + valor);
		
		int i = 0;
		for ( String cadaProduto: produtos) {
			System.out.println("\t - " + ++i + "º " + cadaProduto );
		}
		
		
	}
}
