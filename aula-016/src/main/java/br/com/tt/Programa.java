package br.com.tt;

public class Programa {

	public static void main(String[] args) {
		Curso curso01 = new Curso();
		curso01.setDiaSemana(DiaSemana.SABADO);
		curso01.setCurso("Java Fundamentos"); //alt + shift + r renomeia variaveis
		
		System.out.println(curso01);
		System.out.println(curso01.getDiaSemana().mostra());
		
		System.out.println("---------------------------------");
		for (DiaSemana diasemana : DiaSemana.values()) {
			System.out.println(diasemana);
		}

	}

}
