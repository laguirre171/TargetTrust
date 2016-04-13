package br.com.tt.properties;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Exemplo01EscreverProperties {

	public static void main(String[] args) throws Exception {
		// cria um Properties
		Properties prop = new Properties();
		// Seta os valores do Properties (Chave,Valor)
		prop.setProperty("dataBase", "postgres");
		prop.setProperty("user", "postgres");
		prop.setProperty("password", "target");
		// Criando um objeto de Saida de Stream
		OutputStream output = new FileOutputStream("config.properties");
		// armazenando o objeto de properties
		prop.store(output, "Dados de Acesso a Base de Dados");
		// Arquivo "config.properties" salvo na pasta do projeto!
		
		System.out.println("Properties salvo com sucesso!");

	}

}
