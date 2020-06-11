
package com.umar.crud;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class Model2 {
	//get data from table
	public static List getData() {
		int id;
		String username;
		String type;
		List<Members> members = new ArrayList();
 		//load mysql driver
 		try {
		Class.forName("com.mysql.jdbc.Driver");
		//get connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/testing?useSSL=false", "root", "");
		//create statement
		Statement stmt = con.createStatement();
		//execute query
		ResultSet rs = stmt.executeQuery("SELECT * FROM members");
		while(rs.next()) {
			id = rs.getInt(1);
			username = rs.getString(2);
			type = rs.getString(3);
			Members member = new Members(id, username, type);
			members.add(member);
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
		return members;
	}
}