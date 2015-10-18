package com.test.samples.accessspecifiers;

public class AccessSpecifiersTest {
	
	private int x = 10;

	public static void main(String[] args) {
		AccessSpecifiersTest ast = new AccessSpecifiersTest();
		System.out.println(ast.x);

	}
	
	private class myInner{ // access specifier "private" is only applicable to inner class and not to outer.
		
	}

}
