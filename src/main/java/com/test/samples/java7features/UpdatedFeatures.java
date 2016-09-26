package com.test.samples.java7features;

import java.io.FileOutputStream;
import java.io.IOException;

public class UpdatedFeatures {

	public static void main(String[] args) throws IOException {
		try (FileOutputStream fis = new FileOutputStream("file1.txt")) { // this
																			// is
																			// called
																			// try
																			// with
																			// resource
																			// leaks

			System.out.println("Hello world");
		}
	}

}
