package br.com.tt;

public class TesteBreakContinue {
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			if(i % 2 == 0){
				continue; //Volta para o for
			}
			System.out.println("Valor de i " + i);
			if (i>50){
				break; //termina for
			}
		}

	}
}
