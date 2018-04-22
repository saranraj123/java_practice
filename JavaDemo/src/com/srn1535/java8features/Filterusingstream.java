package com.srn1535.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Item{
	int id;
	String name;
	double price;
	public Item(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}

public class Filterusingstream {

	public static void main(String[] args) {

		List<Item> itemList = new ArrayList<Item>();
		itemList.add(new Item(1, "Whole Milk", 4.5));
		itemList.add(new Item(2, "Bread", 3.45));
		itemList.add(new Item(3, "Peanut Butter", 1.99));
		itemList.add(new Item(3, "Brush", 4.99));
		itemList.add(new Item(3, "Toothpaste", 6.89));
		
		List<Integer> sizeList = new ArrayList<Integer>();
		sizeList.add(10);
		sizeList.add(20);
		sizeList.add(30);
		sizeList.add(40);
		

		List<Item> filteredData = itemList.stream().filter(p -> p.price > 4.4)
				.collect(Collectors.toList());

		// Using SummingDouble method of Collectors
		Double totalPrice = itemList.stream().collect(Collectors.summingDouble(f -> f.price));
		System.out.println("totalPrice::" +totalPrice);
		
		// Find max and min price products using min and max function
		
		Double maxPrice = itemList.stream().max((product1,product2)->product1.price>product2.price?1:-1).get().price;
		System.out.println("maxPrice::" +maxPrice);
		
		
		Integer minSize = sizeList.stream().min((a,b)->a>b?1:-1).get();
		System.out.println("minsize::" +minSize);
		
		
		
		//filteredData.forEach(n -> System.out.println(n.name + "::" + n.price));

	}

}
