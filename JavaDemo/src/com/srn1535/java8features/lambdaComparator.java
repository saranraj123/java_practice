package com.srn1535.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}

public class lambdaComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"Whole Milk",4.5));
		productList.add(new Product(2,"Bread",3.45));
		productList.add(new Product(3,"Peanut Butter",1.99));
		
		//productList.forEach((product)-> System.out.println(product.id+"::"+product.name));;
		
		Collections.sort(productList, (Product p1, Product p2) -> {
			if (p1.id > p2.id)
				return -1;
			if (p1.id < p2.id)
				return 1;
			else
				return 0;
		});

		productList.forEach((n)-> System.out.println(n.price));
	}

}
