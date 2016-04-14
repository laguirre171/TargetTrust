package br.com.tt.model;

public class Endereco {
	private Long id;
	private TipoEndereco tipoEndereco;
	private String rua;
	private String bairro;
	private String cep;
	private String cidade;
	private Estado estado;
	
	
	public Long getId() {
		return id;
	}
	
	
	public Endereco(String cep) {
		super();
		this.cep = cep;
	}




	public Endereco() {
		// TODO Auto-generated constructor stub
	}


	public void setId(Long id) {
		this.id = id;
	}
	public TipoEndereco getTipoEndereco() {
		return tipoEndereco;
	}
	public void setTipoEndereco(TipoEndereco tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	

}
