package com.test.samples.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("sampleApp");
		System.out.println(rb.getString("hello"));

		System.out.println("Now in Spanish");
		Locale locale = new Locale("es_ES");
		rb = ResourceBundle.getBundle("sampleApp",locale);
		System.out.println(rb.getString("hello"));
	}

}
