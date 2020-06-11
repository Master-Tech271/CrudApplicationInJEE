package com.umar.crud;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
public class Controller3 extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		Integer id = Integer.parseInt(request.getParameter("id"));
		String username = request.getParameter("username");
		String type = request.getParameter("type");
		boolean rs = false;
		//pass to model
		Model4.updateData(id, username, type);
		
		response.sendRedirect("show.html");
	}
}