package br.com.tt.inf;

import java.util.List;
//A interface n�o deve mudar bubca - ela pre define m�todos
public interface Dao<T> {
	
	//void salvar(); //por default todos os m�todos s�o public abstract
	//T buscar();
	
	public abstract void salvar();
	<I> T buscar(I id);
	
	List<T>consultar();
	
		
	
	
	

}
