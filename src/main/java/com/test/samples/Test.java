package com.test.samples;

import java.util.Random;
import java.util.UUID;
import java.util.stream.IntStream;

import org.apache.commons.lang3.RandomStringUtils;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.getRandomString(10));
		System.out.println(t.getRandomString(16));
		System.out.println(t.getRandomString(5));
		System.out.println(RandomStringUtils.randomAlphanumeric(10).toUpperCase());
		System.out.println(RandomStringUtils.randomAlphanumeric(20).toUpperCase());

		        Random random = new Random();
		        IntStream.range(0,1).forEach(i->System.out.println(generateRandomString(random, 9)));

	}
	public static String getRandomString(int length) 
	{
	   String randomStr = UUID.randomUUID().toString();
	   System.out.println(">>"+randomStr);
	   while(randomStr.length() < length) {
	       randomStr += UUID.randomUUID().toString();
	   }
	   return randomStr.substring(0, length);
	}
	private static String generateRandomString(Random random, int length){
        return random.ints(48,122)
                .filter(i-> (i<57 || i>65) && (i <90 || i>97))
                .mapToObj(i -> (char) i)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
