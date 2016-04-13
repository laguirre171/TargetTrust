package br.com.tt.model;

public class Pet {

	private Integer id;
	private String nome;
	private String cor;
	private String raca;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", nome=" + nome + ", cor=" + cor + ", raca="
				+ raca + "]";
	}

}
