package br.com.tt;

public class MinhaException extends Exception {

	public MinhaException(String message, Throwable cause) {
		super(message, cause);
		System.out.println("Registra no log");
		System.out.println(message);
	}

	public MinhaException(String message) {
		super(message);
		System.out.println("Registra no log");
		System.out.println(message);
	}

}
