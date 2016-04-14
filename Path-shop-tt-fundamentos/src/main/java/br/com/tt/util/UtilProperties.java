package br.com.tt.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UtilProperties {
	public static Properties getProperties(String fileName) throws IOException {
		Properties prop = new Properties();
		InputStream input = UtilProperties.class.getClassLoader()
				.getResourceAsStream(fileName);
		if (input == null) {
			System.err.println("Não foi possivel localizar " + fileName);
			return null;
		}
		prop.load(input);
		return prop;
	}
}
