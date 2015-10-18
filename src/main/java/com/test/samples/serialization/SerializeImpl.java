package com.test.samples.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeImpl {
	
	public static void main(String[] args) {
		SerializationTest st = new SerializationTest();
		st.setEmployeeID(257886);
		st.setEmployeeName("Upender M");
		st.setEmpSalary("50000");
		
		try {
			FileOutputStream fos = new FileOutputStream("c:\\MyDrive\\JavaProgramCreatedThisFolder\\SerializeProgram2.txt", true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(st);
			oos.close();
			
			FileInputStream fis = new FileInputStream("c:\\MyDrive\\JavaProgramCreatedThisFolder\\SerializeProgram2.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			SerializationTest st2 = (SerializationTest)ois.readObject();
			System.out.println("employee id is :"+st2.getEmployeeID());
			System.out.println("employee name is :"+st2.getEmployeeName());
			System.out.println("employee salary is :"+st2.getEmpSalary());
			ois.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
