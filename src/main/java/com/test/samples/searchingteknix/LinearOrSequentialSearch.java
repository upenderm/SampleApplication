package com.test.samples.searchingteknix;

public class LinearOrSequentialSearch {

	public static void main(String[] args) {
		int srcArray[] = { 15, 68, 93, 45, 67, 21, 35, 62, 41, 43, 95, 78, 54, 58, 96 };
		int key = 62;
		LinearOrSequentialSearch loss = new LinearOrSequentialSearch();
		int result = loss.performLinearOrSequentialSearch(srcArray, key);
		if (result == -1) {
			System.out.println("Oops. Key not found");
		}
		else{
			System.out.println("Your key found at :" + result + " position");
		}
	}

	private int performLinearOrSequentialSearch(int[] srcArray, int key) {
		for (int i = 0; i < srcArray.length; i++) {
			if (srcArray[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
