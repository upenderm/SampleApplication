package com.test.samples.accessspecifiers;

public class AccessModifiersTest {
	
	private int x = 10;

	public static void main(String[] args) {
		AccessModifiersTest ast = new AccessModifiersTest();
		System.out.println(ast.x);

	}
	
	private class myInner{ // access modifier "private" is only applicable to inner class and not to outer.
		
	}

}
