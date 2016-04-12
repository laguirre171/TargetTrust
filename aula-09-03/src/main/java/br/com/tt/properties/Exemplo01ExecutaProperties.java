package br.com.tt.properties;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Exemplo01ExecutaProperties {

	public static void main(String[] args) throws Exception{
		//cria um properties
		Properties prop = new Properties();
		//seta os valores do properties
		prop.setProperty("dataBase", "postgres");
		prop.setProperty("user", "postgres");
		prop.setProperty("password", "target");
		
		//Criando um objeto de saída de Stream
		OutputStream output = new FileOutputStream("config.properties");
		
		prop.store(output, "Dados de Acesso a Base de Dados");
		
		System.out.println("Properties salvo com sucesso");
		
	}

}
