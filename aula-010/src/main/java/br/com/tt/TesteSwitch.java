package br.com.tt;

public class TesteSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String turno = "T";

		switch (turno) {
		case "M":
			System.out.println("Bom dia");
			break; // Faz não cair na opção defaut e em outras opções quando não satisfeitas 
		case "T":
			System.out.println("Boa tarde");
			break;
		case "N":
			System.out.println("Boa Noite");
			break;

		default: // caso não encontre outra opção
			System.out.println("Olá");
			break;
		}

	}

}
