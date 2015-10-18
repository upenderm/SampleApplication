package com.test.samples;

import java.sql.Connection;

public class SingleTonDemo {

	private static SingleTonDemo stDemo = null;

	private SingleTonDemo() {

	}

	public static SingleTonDemo getInstance() {

		if (stDemo == null) {
			stDemo = new SingleTonDemo();
		}
		return stDemo;
	}
	
	public Connection getDBConnection(){
		Connection conn = null; 
		/*   Logic to get DB connection   */
		return conn;
	}

}
