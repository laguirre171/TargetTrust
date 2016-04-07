package br.com.tt;

public enum DiaSemana {
	SEGUNDA(4), TERCA(4), QUARTA(0), QUINTA(2), SEXTA(2), SABADO(8), DOMINGO(1);

	int horas;

	DiaSemana(int horas) {
		this.horas = horas;
	}
	
	public String mostra(){
		return "Total: " + horas;
	}

}
