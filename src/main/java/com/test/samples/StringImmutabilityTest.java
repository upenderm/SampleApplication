package com.test.samples;

public class StringImmutabilityTest {
	
	public void testStringImmutability(){
		String s1 = "Hello";
		System.out.println("String before :"+s1);
		s1.concat(" World");
		System.out.println("String after :"+s1);
	}

	public void testStringBuffer(){
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("StringBuffer before :"+sb);
		sb.append(" World");
		System.out.println("StringBuffer after :"+sb);
	}
	
	public void testStringBuilder(){
		StringBuilder sbd = new StringBuilder("Hello");
		System.out.println("StringBuffer before :"+sbd);
		sbd.append(" World");
		System.out.println("StringBuffer after :"+sbd);
	}
	public static void main(String[] args) {
	   StringImmutabilityTest st = new StringImmutabilityTest();
		st.testStringImmutability();
		System.out.println("--------------------------");
		st.testStringBuffer();
		System.out.println("--------------------------");
		st.testStringBuilder();
	}

}
