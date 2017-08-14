package com.test.samples.searchingteknix;

public class BinarySearch {

	public static void main(String[] args) {
		// Binary search can only be executed on Sorted collection.
		int srcArray[] = { 2, 4, 6, 10, 20, 30, 35, 45, 55, 69, 75, 82, 84, 86, 88, 90, 92, 94, 96, 99 };
		int key = 69;
		BinarySearch bs = new BinarySearch();
		int result = bs.performBinarySearch(srcArray, key);
		if (result == -1) {
			System.out.println("Oops. Key not found");
		} else {
			System.out.println("Your key found at :" + result + " position");
		}

	}

	private int performBinarySearch(int[] srcArray, int key) {
		int start = 0;
		int end = srcArray.length - 1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (srcArray[mid] == key) {
				return mid;
			} else if (srcArray[mid] > key) {
				end = mid - 1;
			} else if (srcArray[mid] < key) {
				start = mid + 1;
			}
		}
		return -1;
	}

}
