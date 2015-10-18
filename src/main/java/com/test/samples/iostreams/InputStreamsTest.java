package com.test.samples.iostreams;

import java.io.DataInputStream;
import java.io.IOException;

public class InputStreamsTest {

	public InputStreamsTest() {
		
	}
	public static void main(String[] args) {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Hello Upender");
		try {
			String str = dis.readLine();
			System.out.println("Your entered string is :"+str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
