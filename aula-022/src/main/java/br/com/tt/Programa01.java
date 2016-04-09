package br.com.tt;

public class Programa01 {

	static String[] frutas;

	public static void main(String[] args) { //ultima fronteira antes da tela do user
		try{			
			lancaException();
		}catch{
			System.out.println("Falha no sistema");
		}
		
		multiException();
		
		try{
			minhaException();
		}catch{
			System.out.println(e.getMessage);
		}
	}

	public static void lancaException() throws Exception {
		String array[] = new String[0];
		String valor = array[10];
		// "Não vai apresentar essa linha pois apresentou erro na linha
		// anterior"
		System.out.println(valor);
	}

	public static void multiException() {
		try {
			frutas.toString();
			frutas = new String[0];
			String banana = frutas[2];
		} catch (Throwable e) {
			System.out.println("Ocorreu um Throwable");
		}
	}

	public static void minhaException() throws MinhaException {
		String nome = "a";
		if (nome.length() < 3) {
			throw new MinhaException("Digitar nome com no minimo 3 letras");
		}
	}
	
	public static void exceptionFinally(){
		try{
			String nome = "maria";
				
			}catch (Exception e){
				
		}finally{
			System.out.println("Sempre executa");
		}
	}

}
