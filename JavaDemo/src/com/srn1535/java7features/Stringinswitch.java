package com.srn1535.java7features;

public class Stringinswitch {

	public static void main(String[] args) {
		String game = "hockey";

		switch (game) {
		case "football":
			System.out.println("I don't like watching football");
			break;
		case "cricket":
			System.out.println("I love watching cricket");
			break;
		case "hockey":
			System.out.println("I neither like nor dislike watching hockey");
			break;
		default:
			System.out.println("check if the string is valid");
		}
	}
}
