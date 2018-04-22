package com.srn1535.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try{

		    FileInputStream fis = new FileInputStream("C:/Saran/sample.txt"); 
		    int k; 
			try{
			    while(( k = fis.read() ) != -1) 
			    { 
				System.out.print((char)k); 
			    } 
			    fis.close(); 
			}catch(IOException ioe){
			    System.out.println("I/O error occurred: "+ioe);
			 }
			catch(NullPointerException e){
			    System.out.println("No content present");
			 }

		}catch(FileNotFoundException fnfe){
	            System.out.println("The specified file is not " +
				"present at the given path");
		 }
		

	}

}
