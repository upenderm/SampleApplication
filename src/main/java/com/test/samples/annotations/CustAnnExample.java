package com.test.samples.annotations;

public class CustAnnExample {
	
	@CustomAnnotation(custId = 5, custName = "Upender")
	public void test(){
		System.out.println("Hi");
	}

}
