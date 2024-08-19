package com.test.interview;

import java.util.Arrays;
import java.util.List;

public class MonjinTest {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(11, 2, 3, 8, 0, 4, 9, 56, 2, 9, 7, 4, 23, 58, 11);
		int n = 27;

		int nextElement = 0;
		for (int i = 1; i < asList.size(); i++) {
			if (asList.get(i) != 0) {
				if (nextElement + asList.get(i) == n) {

					System.out.println("******" + nextElement + ":" + asList.get(i));

					break;
				}
				nextElement = asList.get(i);
			}
		}
		findPairOfElements(27);

	}

	private static void findPairOfElements(int givenElement) {
		int[] intArr = { 11, 2, 3, 8, 0, 4, 9, 56, 2, 9, 7, 4, 23, 58, 11 };

		int currElement = intArr[0];
		int nextElement = intArr[0];
		boolean flag = false;

		for (int i = 1; i < intArr.length; i++) {
			if ((currElement + nextElement) == givenElement) {
				System.out.println("Pair of elements [CurrentElement at Index [" + (i - 1) + "] = " + currElement
						+ ", NextElement at Index[" + i + "]= " + nextElement + " are matching with the given number ["
						+ givenElement + "]");
				flag = true;
				break;
			}
			currElement = nextElement;
			nextElement = intArr[i];
		}
		if(!flag) {
			System.out.println("Match NOT found");
		}

	}

}
