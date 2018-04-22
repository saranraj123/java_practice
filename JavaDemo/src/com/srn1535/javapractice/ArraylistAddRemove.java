package com.srn1535.javapractice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistAddRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(11231);
		numbers.add(13);
		System.out.println(LocalTime.now());
		numbers.add(99);
		System.out.println(LocalTime.now());
		numbers.get(1);
		System.out.println(LocalTime.now());
		
		System.out.println("-------------------");
		List<Integer> numbersLink = new LinkedList<Integer>();
		numbersLink.add(1);
		numbersLink.add(11231);
		numbersLink.add(13);
		System.out.println(LocalTime.now());
		numbersLink.add(99);
		System.out.println(LocalTime.now());
		numbersLink.get(1);
		System.out.println(LocalTime.now());

		


	}

}
