package br.com.tt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.tt.dao.PetDao;
import br.com.tt.model.Cliente;
import br.com.tt.model.Contato;
import br.com.tt.model.Endereco;
import br.com.tt.model.Estado;
import br.com.tt.model.Pet;

public class Sistema {
	public static void main(String[] args) throws Exception {
	/****	
	//	new PetDao().salvar( getPet());
	//	new PetDao().consultar(getPet()).forEach(pet -> System.out.println(pet));
	 
		new PetDao().consultar(null).forEach(pet->System.out.println(pet));
	/Pet pet1 = getPet();
		Pet pet2 = getPet();
		pet2.setId(100);
		pet1.setId(100);
		System.out.println(pet1.equals(pet2)); //equal compara conteúdo
		System.out.println(pet1.hashCode());
		
		List<Pet> pets = new PetDao().consultar();
		System.out.println("Lista não ordenada");
		pets.forEach(pet->System.out.println(pet));
		pets.sort(new Comparator<Pet>(){
			@Override
			public int compare(Pet p1, Pet p2){
				return p1.getId()-p2.getId();
			}
		});
		**********/
		
		Estado[] values = Estado.values();
		for (Estado estado : values) {
			System.out.println(estado + " - " + estado.getCodigo() + " - " + estado.getDescricao());
		}
		
		
		Cliente cliente = new Cliente();
		cliente.setId(1L);
		cliente.setNome("TESTE 123");
		cliente.setEndereco(new ArrayList<>());
		cliente.getEndereco().add(new Endereco("89898-000"));
		cliente.getEndereco().add(new Endereco("45454545"));
		cliente.getEndereco().add(new Endereco("7878789789"));
		
		cliente.setContatos(new ArrayList<>());
		cliente.getContatos().add(new Contato("(51) 8189-0761"));
		
		System.out.println(cliente);
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
