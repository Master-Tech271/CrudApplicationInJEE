package com.umar.crud;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
public class Controller extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String username = request.getParameter("username");
		String type = request.getParameter("type");
		boolean rs = false;
		//pass to model
		Model model = new Model(username, type);
		try{
		rs = model.insertData();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	catch(Exception ee) {
		ee.printStackTrace();
	}
		if(rs==true) {
			response.getWriter().println("<script language=\"Javascript\">alert('data inserted');</script>");
			response.sendRedirect("show.html");
		}
		else{
			response.getWriter().println("<script language=\"Javascript\">alert('Error!..');</script>");
			response.sendRedirect("show.html");
		}
		response.getWriter().close();
	}
}