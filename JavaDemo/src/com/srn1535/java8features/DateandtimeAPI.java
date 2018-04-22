package com.srn1535.java8features;

import java.time.LocalDate;

public class DateandtimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		LocalDate date = LocalDate.now();
		System.out.println(date.isLeapYear());
		LocalDate newDate = LocalDate.of(2012, 12, 25);
		System.out.println(newDate.isLeapYear());
	}

}
