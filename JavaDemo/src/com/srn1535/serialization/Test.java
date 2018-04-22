package com.srn1535.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Test
{
    public static void main(String[] args)
    {
        try
        {
        	StudentInfo si = new StudentInfo("saran", 104, "asdasd");
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.close();
            fos.close();
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally{
        	System.out.println("DONE");
        }
    }
}