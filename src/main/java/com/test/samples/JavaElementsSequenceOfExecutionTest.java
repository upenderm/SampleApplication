package com.test.samples;

public class JavaElementsSequenceOfExecutionTest {
	
	static {
		System.out.println("Hello from static block");
	}
	
	{
		System.out.println("Hello from Non static block");
	}

	public JavaElementsSequenceOfExecutionTest() {
		System.out.println("Hello from constructor");
	}

	public static void staticMethodTest(){
		System.out.println("In static method test"); 
	}
	
	public void nonStaticMethodTest(){
		System.out.println("In non static method test");
	}
	
	public static void main(String[] args) {
		System.out.println("In main method");
		JavaElementsSequenceOfExecutionTest jst = new JavaElementsSequenceOfExecutionTest();
		JavaElementsSequenceOfExecutionTest.staticMethodTest();
		jst.nonStaticMethodTest();
	}

}
