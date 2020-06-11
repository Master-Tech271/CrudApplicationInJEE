package com.umar.crud;
import java.sql.*;
public class Model3 {
	public static void deleteData(int id) {
		try{
		//load mysql driver
		Class.forName("com.mysql.jdbc.Driver");
		//get connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/testing?useSSL=false", "root", "");
		//create statement
		Statement stmt = con.createStatement();
		//execute Query
		stmt.executeUpdate("DELETE FROM members "+ "WHERE id = "+id);
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
}