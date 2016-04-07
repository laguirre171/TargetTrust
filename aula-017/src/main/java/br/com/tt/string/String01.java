package br.com.tt.string;

import br.com.tt.util.Texto;

public class String01 {
	
	public static void main(String[] args) {
		String nome = "Luís Fábio Aguirre"; //Isso é um objeto
		
		nome.toUpperCase();
		System.out.println(nome.toUpperCase());
		System.out.println(nome);
		
		nome = nome.toUpperCase(); //Isso é um objeto
		System.out.println("Upper " + nome);
		
		nome = nome.toLowerCase(); //Isso é um objeto
		System.out.println("Lower: " + nome);
		
		int length = nome.length();
		System.out.println("Comprimento da String " + length);
		
		boolean startswith = nome.startsWith(nome);
		System.out.println("String inicia com: " + startswith);
		
		boolean endswith = nome.endsWith("");
		System.out.println(endswith);
		
		int indexOf = nome.indexOf(" ");
		System.out.println(indexOf);
		
		String primeiroNome = nome.substring(0, nome.indexOf(" "));
		System.out.println("Primeiro Nome: " + primeiroNome);
		char letra = nome.charAt(0);
		nome = (nome.charAt(0)+"").toUpperCase() + nome.substring(1, nome.length());
		System.out.println(nome);
		
		Texto.mostrarNomes(nome);
		
		System.out.println("aaaa".equals("Aaaa"));
		
		String data = "07/04/2016";
		data = data.replace("/", "-");
		System.out.println("replace = " + data);
		
		
		//System.out.println("\"aaaa".equals(\"Aaaa\") = "+ "aaaa".equals("Aaaa"));
		//System.out.println("\"aaaa".equals(\"Aaaa\") = "+ "aaaa".equals("Aaaa"));
		
		String t = "a" + "b" + "c"; //cria 6 objetos
		StringBuffer r = new StringBuffer(); //Entra como uma thread
		r.append("a");
		r.append("b");
		r.append("c");
		System.out.println("StringBuffer" + r);
		System.out.println("Comprimento" + r.length());
		r.trimToSize();
		System.out.println(r);
		r.insert(1, "DDD");
		System.out.println(r);
		
		StringBuilder b = new StringBuilder().append("a").append("b").append("c"); //não entra como thread é melhor
		System.out.println("StringBuilder = " + b);
		
		StringBuilder inverter = new StringBuilder();
		for (int i = b.length(); i >=0 ; i--) {
			inverter.append(b.charAt(i));
		}
		System.out.println(inverter);
		System.out.println(inverter.reverse());
		
		System.out.println(inverter.hashCode());
		
				
	}


	
}
