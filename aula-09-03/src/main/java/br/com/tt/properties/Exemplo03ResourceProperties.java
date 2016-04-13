package br.com.tt.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Exemplo03ResourceProperties {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		String fileName = "config.properties";
		Class<Exemplo03ResourceProperties> clazz = Exemplo03ResourceProperties.class;
		InputStream input = clazz.getClassLoader().getResourceAsStream(fileName);
		if (input == null) {
			System.err.println("Não foi possivel localizar " + fileName);
			return;
		}
		prop.load(input);
		System.out.println(prop.getProperty("dataBase"));
		System.out.println(prop.getProperty("user"));
		System.out.println(prop.getProperty("password"));
	}

}
