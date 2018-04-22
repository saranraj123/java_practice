package com.srn1535.java7features;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Typeinterfaceexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Type inference -> look at the right side- no type argument is passed to ArrayList();
		List<String> names = new ArrayList<>();
		names.add("saran");
		names.add("jeeva");
		names.add("alala");
		names.add("prakash");
		
		Set<String> listToSet = new HashSet(names);
		System.out.println("some order::");
		for(String s:listToSet)
			System.out.println(s);
		
		SortedSet<String> sortSet = new TreeSet<String>(names);
		System.out.println("sorted order::");
		for(String s:sortSet)
			System.out.println(s);
		
		
		LinkedHashSet<String> linkedset = 
                new LinkedHashSet<String>(names);  
		System.out.println("inserted order::");
		for(String s:linkedset)
			System.out.println(s);
		
		
		
		//Collections.sort(names);
		//System.out.println(names);

		
		//Collections.sort(linkedlistofNames);
		//System.out.println(linkedlistofNames);
		
		
	}

}
