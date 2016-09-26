package com.test.samples.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleGDPRates {

	public static void main(String[] args) {
		// Please open the en_US properties file and go thru. there is some imp. info.
		String format = "%10s%20s%20s%20s";
		System.out
				.println("\n------------------------------------------------------------------------");
		System.out.println("\t\tGDP Rates of different countries");
		System.out
				.println("------------------------------------------------------------------------\n");
		System.out.format(format, "Month", "India", "Spain", "France" + "\n");
		ResourceBundle enBundle = ResourceBundle.getBundle("countryGdp");
		ResourceBundle esBundle = ResourceBundle.getBundle("countryGdp",
				new Locale("es_ES"));
		ResourceBundle frBundle = ResourceBundle.getBundle("countryGdp",
				new Locale("fr_CA"));
		int enCount = 0;
		int esCount = 0;
		int frCount = 0;
		for (MonthsEnum em : MonthsEnum.values()) {
			System.out.format(format, em,
					enBundle.getString(em.getMonthName()),
					esBundle.getString(em.getMonthName()),
					frBundle.getString(em.getMonthName()) + "\n");
			enCount = enCount
					+ Integer.parseInt(enBundle.getString(em.getMonthName()));
			esCount = esCount
					+ Integer.parseInt(esBundle.getString(em.getMonthName()));
			frCount = frCount
					+ Integer.parseInt(frBundle.getString(em.getMonthName()));
		}
		System.out.println("\n------------------------------------------------------------------------");
		System.out.format(format, "Average GDP", enCount
				/ MonthsEnum.values().length, esCount
				/ MonthsEnum.values().length, frCount
				/ MonthsEnum.values().length);
		System.out.println("\n------------------------------------------------------------------------");
	}

	public enum MonthsEnum {
		JANUARY(1, "january"), FEBRAURY(2, "febraury"), MARCH(3, "march"), APRIL(
				4, "april"), MAY(5, "may"), JUNE(6, "june"), JULY(7, "july"), AUGUST(
				8, "august"), SEPTEMBER(9, "september"), OCTOBER(10, "october"), NOVEMBER(
				11, "november"), DECEMBER(12, "december");
		private Integer monthId;
		private String monthName;

		MonthsEnum(Integer monthId, String monthName) {
			this.monthId = monthId;
			this.monthName = monthName;
		}

		public Integer getMonthId() {
			return monthId;
		}

		public String getMonthName() {
			return monthName;
		}
	}

}
