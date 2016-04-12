package br.com.tt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exemplo03Insert {

	// Credenciais de Acesso
	public static final String USER = "postgres";
	public static final String PASS = "target";
	public static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
	
	// Driver de Acesso
	public static final String JDBC_DRIVER = "org.postgresql.Driver";

	public static void main(String[] args) throws SQLException{

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			conn.setAutoCommit(false); //precisa dar um commit 
			String sql = "INSERT INTO PET(ID,NOME,COR,RACA)"
					+ "VALUES(?,?,?,?)"; // não passar valores aqui, pois pode
											// receber sqlinject
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 7);
			pstmt.setString(2, "Kiko");
			pstmt.setString(3, "Preto");
			pstmt.setString(4, "Vira Lata");

			pstmt.execute();

			conn.commit();
			//pstmt.close();
			conn.close();
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		}finally{
			pstmt.close();
			conn.close();
		}

	}
}
	

	
