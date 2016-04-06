package br.com.tt;

public class PassaValorPrimitivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int preco = 100; //Tipo primitivo
		calcular(preco);
		System.out.println("Valor de preco: " + preco);

	}

	private static void calcular(int args) {
		// TODO Auto-generated method stub
		if (args > 0 && args < 2000){
			args = 55;
		}
		System.out.println("Valor de args é : " + args);
		
	}

}
