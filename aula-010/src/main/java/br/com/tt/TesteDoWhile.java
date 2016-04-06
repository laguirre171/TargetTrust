package br.com.tt;

public class TesteDoWhile {
	public static void main(String[] args) {
		Integer valor = 10;
		
		do{
			valor--;
			System.out.println("Teste Do While " + valor);
		}while(valor < 10 && valor > 0);
	}

}
