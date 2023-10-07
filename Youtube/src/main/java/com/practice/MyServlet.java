package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;




@SuppressWarnings("serial")
public class MyServlet extends HttpServlet 
{

public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
	System.out.println("This is grt method....");
	
	response.setContentType("text/html");
	
	PrintWriter out = response.getWriter();
	
	out.print("<h1>This is get method of my servlet</h1>");
}

}
