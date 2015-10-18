package com.test.samples.iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingTestByReaders {
	
	// there are some errors in this program.... and it will not run.
	

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("C:\\Users\\mamindu\\Desktop\\New Text Document.txt");
			StringBuilder sb = new StringBuilder();
			int i = fr.read();
			while(i!=-1){
				char ch = (char)i;
				sb.append(ch);
			}
			char[] ch2 = sb.toString().toCharArray();
			FileWriter fw = new FileWriter("c:\\MyDrive\\JavaProgramCreatedThisFolder\\IcameFromBufferReadersJavaProgram.txt", true);
			fw.write(ch2);
			fw.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
