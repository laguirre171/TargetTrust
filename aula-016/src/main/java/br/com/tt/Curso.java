package br.com.tt;

public class Curso {
	private DiaSemana diaSemana; //Enum vira tipo de dados
	private String curso;
	
	
	
	
	@Override
	public String toString() {
		return "Curso [diaSemana=" + diaSemana + ", curso=" + curso + "]";
	}
	public DiaSemana getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	

}
