package br.com.tt;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String turno = "M";

		switch (turno) {
		case "M":
			System.out.println("Bom dia");

			break;
		case "T":
			System.out.println("Boa tarde");
			break;
		case "N":
			System.out.println("Boa Noite");
			break;

		default:
			System.out.println("Olá");
			break;
		}

	}

}
