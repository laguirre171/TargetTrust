package br.com.tt;

import br.com.tt.dao.PetDao;
import br.com.tt.model.Pet;

public class Sistema {

	public static void main(String[] args) {
		
		//new PetDao().salvar(getPet());
		new PetDao().consultar(getPet());
	}

	private static Pet getPet() {
		Pet pet = new Pet();
		pet.setId(11);
		pet.setNome("Bilú");
		pet.setRaca("Vira Lata");
		pet.setCor("Amarelo");
		return pet;
	}

}
