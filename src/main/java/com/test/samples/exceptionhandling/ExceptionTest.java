package com.test.samples.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

	public void testExceptions() throws NullPointerException {
		int x  = 0;
		int y= 5;
		System.out.println("x+y is :"+x+y);
		try {
         fileHandling();
      }
      catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
	}
	
	public static void main(String[] args) {
		System.out.println("Exception Handling");
		ExceptionTest et = new ExceptionTest();
		et.testExceptions();

	}
	
	public void fileHandling() throws FileNotFoundException{
	   FileInputStream f = new FileInputStream("");
	   
	}

}
 // If we give directly Exception, instead of NPE, then we must handle the calling place, with try catch. Not doing so gives the error. 
