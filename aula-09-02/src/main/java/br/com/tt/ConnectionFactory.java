package br.com.tt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";

	// Credenciais de Acesso
	public static final String USER = "postgres";
	public static final String PASS = "target";

	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(DB_URL, USER, PASS);
	}

}
