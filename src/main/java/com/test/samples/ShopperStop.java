package com.test.samples;

public class ShopperStop {

	public static void main(String[] args) {
		getBillWithDiscount(5000, "Regular");
		getBillWithDiscount(10000, "Regular");
		getBillWithDiscount(15000, "Regular");
		getBillWithDiscount(5000, "Premium");
		getBillWithDiscount(10000, "Premium");
		getBillWithDiscount(15000, "Premium");

	}

	private static int getBillWithDiscount(int amount, String custType) {

		if (custType.equals("Regular")) {
			if (amount <= 5000) {
				amount = amount - (amount * 0) / 100;
			} else if (amount > 5000 && amount <= 10000) {
				int stdAmt = 5000 - (5000 * 0) / 100;
				amount = amount - 5000;
				amount = amount - (amount * 10) / 100;
				amount = stdAmt + amount;
			} else {
				int stdAmt = 5000 - (5000 * 0) / 100;
				int stdAmt2 = 5000 - (5000 * 10) / 100;
				amount = amount - 10000;
				amount = amount - (amount * 20) / 100;
				amount = stdAmt + stdAmt2 + amount;
			}
		}
		if (custType.equals("Premium")) {
			if (amount <= 5000) {
				amount = amount - (amount * 10) / 100;
			} else if (amount > 5000 && amount <= 10000) {
				int stdAmt = 5000 - (5000 * 10) / 100;
				amount = amount - 5000;
				amount = amount - (amount * 20) / 100;
				amount = stdAmt + amount;
			} else {
				int stdAmt = 5000 - (5000 * 10) / 100;
				int stdAmt2 = 5000 - (5000 * 20) / 100;
				amount = amount - 10000;
				amount = amount - (amount * 30) / 100;
				amount = stdAmt + stdAmt2 + amount;
			}
		}
		System.out.println(custType + " Bill after applying discount is :"
				+ amount);
		return amount;
	}

}
