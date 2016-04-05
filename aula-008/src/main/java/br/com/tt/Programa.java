package br.com.tt;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando o Sistema");
		Animal cachorro = new Animal();
		Animal gato = new Animal();
		cachorro.setApelido("Rex");
		
		gato.setApelido("abc");
		gato.setDono(new Pessoa());
		gato.getDono().setNome("Maria da Silva");
		gato.getDono().setCpf("0327882469-11");
		
		Pessoa donoDoRex = new Pessoa();
		donoDoRex.setNome("Pedro da Silva");
		donoDoRex.setCpf("003792469-11");
		
				
		cachorro.setDono(donoDoRex);
						
		System.out.println(cachorro.getApelido() + " -- Dono: " + cachorro.getDono().getNome());
		System.out.println(gato.getApelido() + " -- Dono: " + gato.getDono().getNome());
		

	}

}
