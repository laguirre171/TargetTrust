package br.com.tt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.tt.ConnectionFactory;
import br.com.tt.model.Pet;

public class PetDao implements Dao<Pet> {

	private static final String SQL_INSERT = "INSERT INTO PET(ID,NOME,COR,RACA)"
			+ "VALUES(?,?,?,?)";
	private static final String SQL_QUERY_SELECT = "SELECT * FROM PET"
			+ "VALUES(?,?,?,?)";
	rivate static final String SQL_QUERY_SELECT_NOME = "SELECT * FROM  PET WHERE NOME LIKE ?";

	public void salvar(Pet entity) {
		// TODO Auto-generated method stub
		try (Connection conn = new ConnectionFactory().getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setInt(1, entity.getId());
			pstmt.setString(2, entity.getNome());
			pstmt.setString(3, entity.getRaca());
			pstmt.setString(4, entity.getCor());
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
				 pstmt = conn
						.prepareStatement(SQL_QUERY_SELECT);
			}else{
				pstmt = conn
						.prepareStatement(SQL_QUERY_SELECT_NOME);
				pstmt.setString(1, "%"+ entity.getNome()+ "%");
			}
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				Pet pet = new Pet();
				pet.setId(rs.getInt("id"));
				pet.setNome(rs.getString("nome"));
				pet.setCor(rs.getString("cor"));
				pet.setRaca(rs.getString("raca"));
				pets.add(pet);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pets;
	}
	
	/*
	public static void main(String[] args) {
		new PetDao().consultar(null).forEach(pet -> System.out.println(pet));
	
	}
	*/
	
	
}
