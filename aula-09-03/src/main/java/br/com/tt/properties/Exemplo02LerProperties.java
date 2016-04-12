package br.com.tt.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Exemplo02LerProperties {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		InputStream input =  new FileInputStream("config.properties");
		prop.load(input);
		String dataBase = (String) prop.get("dataBase");
		System.out.println("Chave: dataBase, \tValor : " + dataBase);
		
		String user = prop.getProperty("user");
		System.out.println("Chave: user,     \tValor : " + user);
		
		System.out.println("Chave: password, \tValor : " + prop.getProperty("password"));
	}

}
