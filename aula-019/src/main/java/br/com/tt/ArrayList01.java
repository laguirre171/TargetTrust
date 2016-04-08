package br.com.tt;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList();		
		alunos.add(new Aluno());
		Aluno aluno = new Aluno();
		alunos.add(aluno);
		
		System.out.println("Size " + alunos.size());
		alunos.remove(0);
		System.out.println("Size " + alunos.size());
		
		System.out.println("isEmpty = " + alunos.isEmpty());
		
		List<Aluno> turmaJava = new ArrayList<Aluno>();
		turmaJava.add(new Aluno());
		turmaJava.add(new Aluno());
		turmaJava.add(new Aluno());
		turmaJava.add(new Aluno());
		
		alunos.addAll(turmaJava);
		System.out.println("siso" + alunos.size());
	}

}
