package br.com.tt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.tt.ConnectionFactory;
import br.com.tt.model.Pet;

public class PetDao implements Dao<Pet> {

	private static final String RACA = "RACA";
	private static final String COR = "COR";
	private static final String NOME = "NOME";
	private static final String ID = "ID";
	private static final String WHERE_LIKE = "%%%s%%";
	private static final String SQL_INSERT = "INSERT INTO PET (ID, NOME, COR, RACA) VALUES (?, ?, ?, ?)";
	private static final String SQL_QUERY_SELECT = "SELECT * FROM  PET";
	private static final String SQL_QUERY_SELECT_NOME = "SELECT * FROM  PET WHERE NOME LIKE ?";
	private static final String SQL_QUERY_SELECT_MAX_ID = "SELECT MAX(ID) AS ID FROM  PET";

	public void salvar(Pet entity) {

		try (Connection conn = new ConnectionFactory().getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setInt(1, entity.getId());
			pstmt.setString(2, entity.getNome());
			pstmt.setString(3, entity.getCor());
			pstmt.setString(4, entity.getRaca());

			pstmt.execute();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	@Override
	public List<Pet> consultar(Pet entity) {
		List<Pet> pets = new ArrayList<>();
		try (Connection conn = new ConnectionFactory().getConnection()) {
			PreparedStatement pstmt = null;
			if (entity == null) {
				pstmt = conn.prepareStatement(SQL_QUERY_SELECT);
			} else {
				pstmt = conn.prepareStatement(SQL_QUERY_SELECT_NOME);
				pstmt.setString(1, String.format(WHERE_LIKE, entity.getNome()));
			}
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Pet pet = new Pet();
				pet.setId(rs.getInt(ID));
				pet.setNome(rs.getString(NOME));
				pet.setCor(rs.getString(COR));
				pet.setRaca(rs.getString(RACA));
				pets.add(pet);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pets;
	}

	public List<Pet> consultar() {

		return consultar(null);
	}

	public Integer proximoId() throws Exception {
		try (Connection conn = new ConnectionFactory().getConnection()) {
			PreparedStatement pstmt = null;
			pstmt = conn.prepareStatement(SQL_QUERY_SELECT_MAX_ID);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			return rs.getInt(ID) + 1;
		} catch (Exception e) {
			throw e;
		}
	
	}

}
