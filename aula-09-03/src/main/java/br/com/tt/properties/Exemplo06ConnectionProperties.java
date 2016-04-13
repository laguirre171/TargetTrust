package br.com.tt.properties;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Exemplo06ConnectionProperties {
	

	public static void main(String[] args) throws IOException, SQLException {
		Properties prop = new Properties();
		String fileName = "db.properties";
		Class<Exemplo03ResourceProperties> clazz = Exemplo03ResourceProperties.class;
		InputStream input = clazz.getClassLoader().getResourceAsStream(fileName);
		if (input == null) {
			System.err.println("Não foi possivel localizar " + fileName);
			return;
		}
		prop.load(input);
		String host = prop.getProperty("host");
		String porta = prop.getProperty("porta");
		String banco = prop.getProperty("banco");
		String url = "jdbc:postgresql://"+host+":"+porta+"/"+banco;
		DriverManager.getConnection(url,prop);
		System.out.println("Conexão Realizada com sucesso!");
	}
}





