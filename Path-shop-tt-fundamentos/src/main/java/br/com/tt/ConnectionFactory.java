package br.com.tt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import br.com.tt.util.UtilProperties;

public class ConnectionFactory {

	public Connection getConnection() throws SQLException, IOException {
		Properties prop = UtilProperties.getProperties("db.properties");
		
		String host = prop.getProperty("host");
		String porta = prop.getProperty("porta");
		String banco = prop.getProperty("banco");
		String url = "jdbc:postgresql://" + host + ":" + porta + "/" + banco;
		return DriverManager.getConnection(url, prop);

	}


}
