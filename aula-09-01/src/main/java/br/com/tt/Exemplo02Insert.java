package br.com.tt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exemplo02Insert {
	
	public static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";

	// Credenciais de Acesso
	public static final String USER = "postgres";
	public static final String PASS = "target";

	// Driver de Acesso
	public static final String JDBC_DRIVER = "org.postgresql.Driver";
	
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		
		
		String sql = "INSERT INTO PET(ID,NOME,COR,RACA)" + "VALUES(?,?,?,?)"; //não passar valores aqui, pois pode receber sqlinject
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 10);
		pstmt.setString(2, "Totó");
		pstmt.setString(3, "Preto");
		pstmt.setString(4, "Vira Lata");
		
		pstmt.execute();
		pstmt.close();
		conn.close();
		
	}

}
