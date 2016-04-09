package br.com.tt.inf;

import java.util.List;
//A interface não deve mudar bubca - ela pre define métodos
public interface Dao<T> {
	
	//void salvar(); //por default todos os métodos são public abstract
	//T buscar();
	
	public abstract void salvar();
	<I> T buscar(I id);
	
	List<T>consultar();
	
		
	
	
	

}
