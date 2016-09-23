package com.test.samples.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {
	static String filePath = System.getProperty("user.dir") + File.separator
			+ "src" + File.separator + "main" + File.separator + "resources";
	static String fileName = filePath + File.separator + "ScannerFile.txt";

	public static void main(String[] args) throws IOException {
		try (FileInputStream fis = new FileInputStream(fileName);
				FileOutputStream fos = new FileOutputStream(filePath
						+ File.separator + "temp.txt");) {
			int size = fis.available();
			byte[] bytes = new byte[size];
			fis.read(bytes);
			String str = new String(bytes);
			System.out.println(str);
			fos.write(str.getBytes());
		}
	}

}
