package br.com.tt.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UtilFile {
	public static void salvar(String path,Object o) {
		try {
			
		
		


		
			
			
			
			Files.write(Paths.get(path), new ObjectMapper().writeValueAsString(o).toString().getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
