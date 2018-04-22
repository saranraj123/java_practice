package com.srn1535.java5features;

public class Varargsexample {
	static void display(String... values) {
		for (String s : values) {
			System.out.println(s);
		}
	}
	static void add(String a,int... values){
		System.out.println("a="+a);
		int total=0;
		for (int s : values ) {
			total+= s;
		}
		System.out.println("total="+total);
	}
	
	public static void main(String args[]) {
		//display();// zero argument
		//display("my", "name", "is", "varargs");// four arguments
		add("hi",1,2,3,4);
		add("hello",32,45);
		add("howareyou");
	}
}
