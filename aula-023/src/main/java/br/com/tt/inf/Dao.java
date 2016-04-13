package br.com.tt.inf;

import java.util.List;

public interface Dao<T> {

	public abstract void salvar();

	// Todos os metodos s�o: public abstract
	// n�o � necessario digitar

	<I> T buscar(I id);

	<E> List<T> consultar(E e);

}
