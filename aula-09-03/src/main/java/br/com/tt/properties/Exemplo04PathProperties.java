package br.com.tt.properties;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Exemplo04PathProperties {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		String fileName = "C:\\Curso Java\\config.properties";
		FileInputStream input = new FileInputStream(fileName);
		prop.load(input);
		System.out.println("User = " + prop.getProperty("user"));
	}
}
