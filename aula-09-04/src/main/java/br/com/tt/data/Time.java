package br.com.tt.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("d/M/YYYY");
		System.out.println(localDate.format(ofPattern));
		
		localDate = localDate.plusDays(-10);
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd/MMM/YYYY")));
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd/MMMM/YYYY")));
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd-MMMM-YYYY")));
		
	DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	LocalDateTime dateTime = LocalDateTime.parse("01/01/2016 01:01:01",formatDateTime);
	System.out.println(dateTime.format(formatDateTime));
	
	dateTime = dateTime.plusDays(5);
	dateTime = dateTime.plusMonths(2);
	dateTime = dateTime.plusYears(3);
	System.out.println(dateTime.format(formatDateTime));
	
	}
}
