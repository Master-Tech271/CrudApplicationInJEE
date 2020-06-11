package com.umar.crud;
import java.sql.*;
public class Model4 {
	public static void updateData(int id, String username, String type) {
		try{
		//load mysql driver
		Class.forName("com.mysql.jdbc.Driver");
		//get connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/testing?useSSL=false", "root", "");
		//create statement
		Statement stmt = con.createStatement();
		//execute Query
		stmt.executeUpdate("UPDATE members SET username= '"+username+"', type = '"+type+"' WHERE id = "+id);
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
}