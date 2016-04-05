package br.com.tt;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando o Sistema");
		Animal cachorro = new Animal();
		Animal gato = new Animal();
		cachorro.setApelido("Rex");
		gato.setApelido("ab");
		
		Pessoa donoDoRex = new Pessoa();
		donoDoRex.setNome("Pedro da Silva");
		donoDoRex.setCpf("003792469-11");
		
		
		cachorro.setDono(donoDoRex);
		
		
		
		System.out.println(cachorro.getApelido() + " -- Dono: " + cachorro.getDono().getNome());
		System.out.println(gato.getApelido());
		

	}

}
