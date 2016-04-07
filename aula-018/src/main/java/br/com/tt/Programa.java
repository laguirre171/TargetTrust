package br.com.tt;

public class Programa {

	public static void main(String[] args) {
		String alunos[] = new String[10];
		// String a = alunos[10]; //Erro: ArrayIndexOutofBoundsException
		alunos[0] = "Pedro";
		alunos[1] = "Maria";
		int i = 0;
		
		for (String aluno : alunos) {
			System.out.println(i++ + "º - " + (aluno ==null ? "" : aluno)); //se diferente de null mostra o nome
		}
	}

}
