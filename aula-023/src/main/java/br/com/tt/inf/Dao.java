package br.com.tt.inf;

import java.util.List;

public interface Dao<T> {

	public abstract void salvar();

	// Todos os metodos são: public abstract
	// não é necessario digitar

	<I> T buscar(I id);

	<E> List<T> consultar(E e);

}
