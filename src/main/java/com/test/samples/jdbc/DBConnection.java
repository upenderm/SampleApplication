package com.test.samples.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

   private static DBConnection connection = null;

   private DBConnection() {

   }

   public static DBConnection getInstance() {
      if (connection == null) {
         connection = new DBConnection();
      }
      return connection;
   }

   public Connection getMySqlDBConnection() {
      Connection con = null;
      try {
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/videorentalstore", "root", "root");
      }
      catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
      catch (SQLException e) {
         e.printStackTrace();
      }
      return con;
   }

}
