package it.lessons.collection.set;

import java.time.LocalDate;
import java.time.Month;

public class DateMain {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2024, 11, 12);
		
		Month month = date.getMonth();
		int year = date.getYear();
		int dayOfMonth = date.getDayOfMonth();
		if(date.isAfter(LocalDate.now())) {
			System.out.println("è successivo");
		} else {
			System.out.println("è prima o uguale");
		}
		System.out.println(dayOfMonth + "/" + month.getValue() + "/" + year);
		
	}
}
