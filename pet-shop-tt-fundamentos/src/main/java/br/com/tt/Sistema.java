package br.com.tt;

import br.com.tt.dao.PetDao;
import br.com.tt.model.Pet;

public class Sistema {
	public static void main(String[] args) {
		
	//	new PetDao().salvar( getPet());
		new PetDao().consultar(getPet()).forEach(pet -> System.out.println(pet));
	}

	private static Pet getPet() {
		Pet pet = new Pet();
		pet.setId(13);
		pet.setNome("3");
		pet.setCor("Branco");
		pet.setRaca("Vira Lata");
		return pet;
	}
}
