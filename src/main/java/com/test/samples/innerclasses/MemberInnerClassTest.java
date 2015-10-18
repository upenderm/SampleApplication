package com.test.samples.innerclasses;

public class MemberInnerClassTest {
	int x = 10;

	public MemberInnerClassTest() {

	}

	public String testHello() {
		System.out
				.println("See you can access non static members of outer class directly in MIC's");
		return "";
	}

	class HelloWorld {
		public HelloWorld() {
			System.out.println("in cons. of inner class");
		}

		public String function1() {
			System.out.println(x);
			testHello();
			return "";
		}

	}

	public static void main(String s[]) {
		MemberInnerClassTest.HelloWorld mh = new MemberInnerClassTest().new HelloWorld();
		System.out.print(mh.function1());
	}
}
