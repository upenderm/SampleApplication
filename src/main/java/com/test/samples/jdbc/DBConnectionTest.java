package com.test.samples.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest {

   public static void main(String[] args) {
      try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/videorentalstore", "root", "root");
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("select * from videorentalstore.customer_details");
         while(rs.next()){
            System.out.println(rs.getString("email"));
         }
         
      }
      catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }

}
