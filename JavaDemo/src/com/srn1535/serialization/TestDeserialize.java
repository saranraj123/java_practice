package com.srn1535.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialize {

	public static void main(String[] args){
		try {
			FileInputStream fis = new FileInputStream("student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			StudentInfo sInfo = (StudentInfo) ois.readObject();
			
			System.out.println(sInfo.name);
			System.out.println(sInfo.rid);
			System.out.println(StudentInfo.contact);
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
