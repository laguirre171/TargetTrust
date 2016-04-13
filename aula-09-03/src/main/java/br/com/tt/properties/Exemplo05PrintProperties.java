package br.com.tt.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Exemplo05PrintProperties {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		String fileName = "C:\\Curso Java\\config.properties";
		FileInputStream input = new FileInputStream(fileName);
		prop.load(input);

		Enumeration<?> propertyNames = prop.propertyNames();
		while (propertyNames.hasMoreElements()) {
			String chave = (String) propertyNames.nextElement();
			String valor = prop.getProperty(chave);

			System.out.println("Chave: " + chave + "\n\tValor: " + valor);

		}
	}
}
