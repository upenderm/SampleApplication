package com.test.samples.iostreams;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("c:\\MyDrive\\JavaProgramCreatedThisFolder\\SerializeProgram.txt");
		System.out.println("File existance :"+file.exists());
		System.out.println("File pathi is :"+file.getAbsolutePath());
		System.out.println("File name is :"+file.getName());
		System.out.println("File parent is :"+file.getParent());
		System.out.println("File is a folder :"+file.isDirectory());
	}

}
