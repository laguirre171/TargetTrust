package br.com.tt;

import java.util.Comparator;
import java.util.List;

import br.com.tt.dao.PetDao;
import br.com.tt.model.Pet;

public class Sistema {
	public static void main(String[] args) throws Exception {
	/****	
	//	new PetDao().salvar( getPet());
	//	new PetDao().consultar(getPet()).forEach(pet -> System.out.println(pet));
	 */
		new PetDao().consultar(null).forEach(pet->System.out.println(pet));
	/*	Pet pet1 = getPet();
		Pet pet2 = getPet();
		pet2.setId(100);
		pet1.setId(100);
		System.out.println(pet1.equals(pet2)); //equal compara conteúdo
		System.out.println(pet1.hashCode());
		**********/
		List<Pet> pets = new PetDao().consultar();
		System.out.println("Lista não ordenada");
		pets.forEach(pet->System.out.println(pet));
		pets.sort(new Comparator<Pet>(){
			@Override
			public int compare(Pet p1, Pet p2){
				return p1.getId()-p2.getId();
			}
		});
	}

	private static Pet getPet() throws Exception {
		Pet pet = new Pet();
		pet.setId(new PetDao().proximoId());
		pet.setNome("3");
		pet.setCor("Branco");
		pet.setRaca("Vira Lata");
		return pet;
	}
}
