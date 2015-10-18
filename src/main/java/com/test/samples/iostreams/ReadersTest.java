package com.test.samples.iostreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadersTest {

	public static void main(String[] args) {
		System.out.println("Hello Upender...");
		System.out.println("this is using Buffered Reader");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		try {
			String str = br.readLine();
			System.out.println("strg is :"+str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
