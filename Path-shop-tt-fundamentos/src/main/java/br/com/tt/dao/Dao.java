package br.com.tt.dao;

import java.util.List;

public interface Dao<T> {
	
	void salvar(T entity);
	
	List<T> consultar(T entity);

}
