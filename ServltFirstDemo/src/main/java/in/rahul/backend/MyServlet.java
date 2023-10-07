package in.rahul.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
		@Override
		protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
		{
			PrintWriter out = resp.getWriter();
			out.print("I am in doGet() method for browser !!");
			
			//backend code
			System.out.println("I am in doGet() method");
		}
}
