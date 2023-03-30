package com.test.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StockPrices {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(7, 1, 5, 3, 6, 4);
		buyAndSellStocks(asList, 2);
	}

	private static void buyAndSellStocks(List<Integer> asList, Integer dayToBuyStock) {
		Integer day = asList.get(dayToBuyStock - 1);
		Integer cp = 0;
		Integer sp = 0;

		Integer highPriceDay = 0;
		for (int i = 0; i < asList.size(); i++) {
			if (asList.get(i) == day) {
				System.out.println(i);
				cp = asList.get(i);
				List<Integer> subList = asList.subList(dayToBuyStock, asList.size());
				System.out.println(subList);
				Collections.sort(subList);
				System.out.println(subList);
				highPriceDay = subList.get(subList.size() - 1);
				System.out.println(subList.get(subList.size() - 1));
			}
			if (asList.get(i) == highPriceDay) {
				System.out.println("Hello I'm going to SELL my stocks today .... Day is " + asList.get(i));
				sp = asList.get(i);
			}
		}
		System.out.println("My profit is :" + (sp - cp));
	}

}
