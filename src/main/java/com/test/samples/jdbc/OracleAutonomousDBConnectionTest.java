package com.test.samples.jdbc;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.time.Instant;

public class OracleAutonomousDBConnectionTest {

	static {
		System.setProperty("oracle.net.tns_admin",
				System.getProperty("user.dir") + File.separator + "Wallet_c4clouddb12102023");
	}

	public static void main(String[] args) {
		try {
			Instant startTime = Instant.now();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("db_connection_url", "your_username", "your_password");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from customer_details");
			while (rs.next()) {
				System.out.println(rs.getString("email"));
			}
			Instant endTime = Instant.now();
			
			Duration duration = Duration.between(startTime, endTime);
			System.out.println(duration.getSeconds());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
