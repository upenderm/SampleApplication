package com.test.samples.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileExample {
	static String filePath = System.getProperty("user.dir") + File.separator
			+ "src" + File.separator + "main" + File.separator + "resources"
			+ File.separator + "ScannerFile.txt";

	// static String filePath = "E:\\ScannerFile.txt";
	// static String filePath = "ScannerFile.txt";
	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner scan = new Scanner("Java7Features");
				Scanner scan2 = new Scanner(new File(filePath));) {
			System.out.println(scan.next()); // Using string as source
			System.out.println("*************************");
			while (scan2.hasNextLine()) {
				String str = scan2.nextLine();
				if (str.contains(":")) {
					System.out.println(str);
					String[] sArr = str.split(":");
					System.out.println(sArr[0]);
					System.out.println(sArr[1]);
				}
			}
			System.out.println("User directory is :"
					+ System.getProperty("user.dir"));
			
		}

	}

}
