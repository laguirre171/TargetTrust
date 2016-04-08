package br.com.tt;

public class Programa {

	public static void main(String[] args) {
		Integer val1 = 5; //inbox - transformando de primitivo para objeto
		Integer val2 = 3; //inbox
		
		// Para realizar o calculo necessitamos realizar o outbox
		// realiza a soma com os primitivos
		// realiza o inbox para atribuir a variavel "resultado"
		Integer resultado = val1 + val2;
		System.out.println("Resultado: " + resultado);
		
	}

}
