package br.com.tt;

public class Animal {
	
	//variaveis de classe ser�o private
	//bot�o direito source/genarate get and setters: Cria o get and set automaticamente
	private String apelido; //S� pode ser utilizado aqui dentro da classe animal
	private String especie;
	private Pessoa dono;
	
	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}


	//se tiver apenas void fica acess�vel somente dentro do pacote
	//sombreamento de vari�veis - usar duas vari�veis com mesmo nome
	public void setApelido(String apelido){  //public fica acess�vel para outros pacotes
		if (apelido.length()>=3){
			this.apelido = apelido; //com o this chama a variavel da classe e o outro � a variavel do m�todo
		}					
	}
	
	public String getApelido(){
		return apelido;
	}
	
}
