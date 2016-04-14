package br.com.tt.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

/**
 * @author sala03
 *
 */
public class Cliente implements Comparable<Cliente>, Comparator<Cliente> { //ctrol + shift + p
	
	private Long id;
	private String nome;
	private LocalDate dataNasc;
	private List<Endereco> endereco;
	private List<Contato> contatos;
	private BigDecimal receita;
	
	
		
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", dataNasc=" + dataNasc
				+ ", endereco=" + endereco + ", contatos=" + contatos
				+ ", receita=" + receita + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contatos == null) ? 0 : contatos.hashCode());
		result = prime * result
				+ ((dataNasc == null) ? 0 : dataNasc.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((receita == null) ? 0 : receita.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (contatos == null) {
			if (other.contatos != null)
				return false;
		} else if (!contatos.equals(other.contatos))
			return false;
		if (dataNasc == null) {
			if (other.dataNasc != null)
				return false;
		} else if (!dataNasc.equals(other.dataNasc))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (receita == null) {
			if (other.receita != null)
				return false;
		} else if (!receita.equals(other.receita))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public BigDecimal getReceita() {
		return receita;
	}

	public void setReceita(BigDecimal receita) {
		this.receita = receita;
	}

	@Override
	public int compare(Cliente c1, Cliente c2) {
		//return (int) (c1.getId()c1 - c2.getId());
		//Compara por nome
		//return c1.getNome().compareTo(c2.getNome());
		return (int) (c1.getId() - c2.getId());
	}

	@Override
	public int compareTo(Cliente c) {
		return (int) (this.id - c.getId());
	}

}
