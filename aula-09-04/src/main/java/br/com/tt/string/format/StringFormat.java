package br.com.tt.string.format;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringFormat {
	public static void main(String[] args) throws ParseException {
		String nome = "Maria";
		Boolean situacao = Boolean.TRUE;
		String strSituacao = situacao ? "Ativo" : "Inativo"; 
		
		System.out.println("O cliente " + nome  + " está " + situacao );
		
		String cliente = String.format("O cliente %s está %s", nome, strSituacao);
		
		System.out.println(cliente);
		
		System.out.println(String.format("LIKE = %%%s%%", "arcia"));
		
		System.out.println(String.format("Soma de %d + %d = %d", 4,3,4+3));
		
		System.out.println(String.format("O total da compra é %10.2f", 586.969));
		
		System.out.format("O nome é %s%nIdade é %d", "Carlos", 35);
		
		System.out.println("Data: " + new Date());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy");
		String ano = simpleDateFormat.format(new Date());
		System.out.println("Ano = " + ano);
		
		SimpleDateFormat sdtDataHoraBr = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String dataHora = sdtDataHoraBr.format(new Date());
		System.out.println(dataHora);
		Date data10 = sdtDataHoraBr.parse("10/04/2016 09:33:45");
		System.out.println(data10);
		
		//String moeda = local.getDisplayName();
		//System.out.println(moeda);
		
		
	}

}
