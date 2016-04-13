package br.com.tt;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import br.com.tt.properties.Exemplo03ResourceProperties;

public class ConnectionFactory {
	
	public static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";

	public Connection getConnection() throws SQLException{
		
		String fileName = "db.properties";
		
		Properties prop = getProperties(fileName);
		String host = prop.getProperty("host");
		String porta = prop.getProperty("porta");
		String banco = prop.getProperty("banco");
		String url = "jdbc:postgresql://" + host + ":" + porta + "/" + banco; 
		
		return DriverManager.getConnection(url,prop);
		
	}



}
