package br.com.tt;

public class TesteSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String turno = "T";

		switch (turno) {
		case "M":
			System.out.println("Bom dia");
			break; // Faz n�o cair na op��o defaut e em outras op��es quando n�o satisfeitas 
		case "T":
			System.out.println("Boa tarde");
			break;
		case "N":
			System.out.println("Boa Noite");
			break;

		default: // caso n�o encontre outra op��o
			System.out.println("Ol�");
			break;
		}

	}

}
