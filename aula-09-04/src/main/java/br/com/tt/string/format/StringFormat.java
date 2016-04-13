package br.com.tt.string.format;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class StringFormat {
	public static void main(String[] args) throws ParseException {
		String nome = "Maria";
		Boolean situcao = Boolean.TRUE;

		String strSituacao = situcao ? "Ativo" : "Inativo";

		System.out.println("O cliente " + nome + " está " + strSituacao);

		String cliente = String.format("O cliente %s está %s", nome,
				strSituacao);

		System.out.println(cliente);

		System.out.println(String.format("LIKE = %%%s%%", "arcia"));

		System.out.println(String.format("Soma de %d + %d = %d ", 4, 3, 4 + 3));

		System.out
				.println(String.format("O total da compra é %10.2f", 586.969));

		System.out.format("O nome é %s%nIdade é %d%n", "Carlos", 35);

		System.out.println("Data: " + new Date());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String ano = sdf.format(new Date());
		System.out.println("Ano = " + ano);

		String data = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		System.out.println("Data = " + data);

		SimpleDateFormat sdfDataHoraBr = new SimpleDateFormat(
				"dd/MM/yyyy hh:mm:ss");
		String dataHora = sdfDataHoraBr.format(new Date());
		System.out.println("Data = " + dataHora);
		Date data10 = sdfDataHoraBr.parse("10/04/2016 09:33:45");

		System.out.println(sdfDataHoraBr.format(data10));

		// Formatando Valore
		
		Double Valor = new Double(9876543.21);

		Locale locale = new Locale("pt", "BR");
		Currency local = Currency.getInstance(locale);

		NumberFormat currencyFormatter = NumberFormat
				.getCurrencyInstance(locale);

		String idiomaPais = locale.getDisplayName();

		String moeda = local.getDisplayName();
		String valorFormatado = currencyFormatter.format(Valor);
		System.out.println(idiomaPais + ", " + moeda + ": " + valorFormatado);

	}
}
