package br.com.tt.model;

import java.util.List;

import br.com.tt.inf.Dao;
import br.com.tt.util.UtilFile;

/**
 * @author instrutor
 *
 */
public class Cliente extends Pessoa implements Dao<Cliente> {
	
	
	private String material;
	
	

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void salvar() {
		// TODO Auto-generated method stub
		UtilFile.salvar("./cliente.txt", this);

	}

	public <I> Cliente buscar(I id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <E> List<Cliente> consultar(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void mostra() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Cliente [material=" + material + ", getNome()=" + getNome() + ", getCpf()=" + getCpf() + "]";
	}


	

}
