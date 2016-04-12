package br.com.tt.properties;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Exemplo06ConnectionProperties {
	static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres"; //por ser static final é uma constatnte
	
	public static void main(String[] args) throws IOException, SQLException {
		Properties prop = new Properties();
		String fileName = "config.properties";
		Class<Exemplo03ResourceProperties> clazz = Exemplo03ResourceProperties.class;
		InputStream input = clazz.getClassLoader().getResourceAsStream(fileName);
		
		if(input == null){
			System.err.println("Não foi possível localizar " + fileName);
			return;
		}
		
		prop.load(input);
		
		DriverManager.getConnection(DB_URL,prop);
		System.out.println("Conexão Realizada com Sucesso!");
	}

}
