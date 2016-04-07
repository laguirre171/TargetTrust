package br.com.tt;

public class Programa {

	public static void main(String[] args) {
		comprar("Marcia", 15D,"Banana", "Ma��", "Arroz"); //s� pode ser utilizado no �ltimo parametro do m�todo o varags que � um tipo de array
	}
	
	public static void comprar(String cliente, Double valor, String...produtos ){ //esses ... s�o os vargs
		
		System.out.println("Cliente: " + cliente);
		System.out.println("Valor  : " + valor);
		
		int i = 0;
		for ( String cadaProduto: produtos) {
			System.out.println("\t - " + ++i + "� " + cadaProduto );
		}
		
		
	}
}
