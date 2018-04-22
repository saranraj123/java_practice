package com.srn1535.java8features;

public class Lambdaexpression {

	interface Addable{  
	    int add(int a,int b);  
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=10;
		
		// Old Style : START
		/*Draw d = new Draw() {
			@Override
			public void display() {
				System.out.println("display something without lambda");
			}
		};*/
		// Old Style : END
		
		// lambda expression : START
		Addable d2 = (int v, int w) -> {
			int x = v+w;
			System.out.println(x);
			return x;
		};
		// lambda expression : END
		//d.display();
		d2.add(10,20);
	}
}
