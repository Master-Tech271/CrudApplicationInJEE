//insert data in table
package com.umar.crud;
import java.sql.*;

public class Model{
	private static String username = null;
	private static String type = null;

	public Model(String username, String type) {
		this.username = username;
		this.type = type;
	}

	public static boolean insertData() throws SQLException, Exception{
		if( username!=null && type!=null) {
			 String INSERT_DATA = "INSERT INTO members (username, type)"+ "VALUES('"+Model.username+"', '"+Model.type+"')";
			String url = "jdbc:mysql://localhost:3306/testing?useSSL=false";
			String user_name = "root";
			String password = "";
			//load mysql driver
			Class.forName("com.mysql.jdbc.Driver");
			//get connection
			Connection con = DriverManager.getConnection(url, user_name, password);
			//create statement
			Statement stmt = con.createStatement();
			//execute query
			stmt.executeUpdate(INSERT_DATA);
			con.close();
			return true;
		}
		else {
			return false;
		}
	}
}