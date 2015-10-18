package com.test.samples.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\mamindu\\Desktop\\New Text Document.txt"); 
			int size = fis.available();
			byte[] br = new byte[size];
			fis.read(br);
			
			String data = new String(br);
			System.out.println(data);
			FileOutputStream fos = new FileOutputStream("c:\\MyDrive\\JavaProgramCreatedThisFolder\\IcameFromJavaProgram.txt", true);
			
			byte[] ba = data.getBytes();
			fos.write(ba);
			
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
