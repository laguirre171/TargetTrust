package br.com.tt.data;

import java.sql.Date;
import java.util.Calendar;

public class Data {
	public static void main(String[] args) {

		// @Deprecated não teve ser utilizado
		Date date = new Date(2016, 3, 10);

		Calendar data = Calendar.getInstance();
		System.out.println("Ano = " + data.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mes = " + data.get(Calendar.MONTH));
		System.out.println("Dia = " + data.get(Calendar.YEAR));

		data.add(Calendar.MONTH, 3);
		
		System.out.println("Ano = " + data.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mes = " + data.get(Calendar.MONTH));
		System.out.println("Dia = " + data.get(Calendar.YEAR));
	}
}
