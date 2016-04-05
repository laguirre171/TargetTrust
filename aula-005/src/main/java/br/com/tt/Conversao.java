package br.com.tt;

public class Conversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inteiro = 258741;
		long longo = inteiro;
		System.out.println(longo);
		
		//conversao explicita
		inteiro = (int) longo;
		
		Integer wrapperInteiro = 5454;
		
		Long wrapperLong = Long.valueOf(wrapperInteiro);
		
		wrapperInteiro = Integer.parseInt(wrapperLong.toString());
		
	}

}
