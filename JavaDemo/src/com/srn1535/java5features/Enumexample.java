package com.srn1535.java5features;

public class Enumexample {
	
	public enum DIRECTIONS {EAST, WEST, NORTH, SOUTH};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(DIRECTIONS s:DIRECTIONS.values())
			System.out.println(s);
	}
}
