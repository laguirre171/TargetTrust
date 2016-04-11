/**
 * 
 */
package br.com.tt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author sala03
 *
 */
public class Exemplo01Select {

	/**
	 * @param args
	 */
	// URL de acesso
	public static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";

	// Credenciais de Acesso
	public static final String USER = "postgres";
	public static final String PASS = "target";

	// Driver de Acesso
	public static final String JDBC_DRIVER = "org.postgresql.Driver";

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;

		// Passo 1: Abrir Conexão
		System.out.println("Iniciando conexão com a base de dados...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		System.out.println("Conexão estabelecida com seucesso...");

		// Passo 2: Executar uma Query
		System.out.println("Iniciando um statement...");
		stmt = conn.createStatement();
		String sql = "SELECT * FROM PET";
		// character varying
		// 255
		ResultSet rs = stmt.executeQuery(sql);

		// Passo 3: Extrair dados através do Result Set
		while (rs.next()) {
			//extraindo atraves do nome da coluna
			int id = rs.getInt("id");
			String nome = rs.getString("nome");
			String cor = rs.getString("Cor");
			String raca = rs.getString("raca");
			System.out.println("ID: " + id + "\tNome :" + nome + "\tCor :" + cor
					+ "\tRaça: " + raca);
		}
		// Passo 4: Limpar variáveis e fechar conexão
		rs.close();
		stmt.close();
		conn.close();
		
	}

}
