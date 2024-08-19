package com.test.samples.annotations;

public class CustomAnnotationExample {

	public static void main(String[] args) {
		testCustomAnnotationExample();

	}

	@CustomAnnotation(custId = 5, custName = "Upender")
	private static void testCustomAnnotationExample() {
		System.out.println("Hi");
		
	}

}
