package br.com.tt.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UtilProperties {
	public static Properties getProperties(String fileName) throws IOException {
		Properties prop = UtilProperties.getProperties("db.properties");
		InputStream input = UtilProperties.class.getClassLoader() //static não usa this, vai o nome da classe
				.getResourceAsStream(fileName);

		if (input == null) {
			System.err.println("Não foi possível localizar " + fileName);
			return null;
		}

		prop.load(input);
		return prop;
	}
}
