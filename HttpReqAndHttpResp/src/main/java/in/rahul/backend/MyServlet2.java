package in.rahul.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class MyServlet2 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
	
		String myname = req.getParameter("name1");
		String myemail = req.getParameter("email");
		
		System.out.println("Name 1: "+myname);
		System.out.println("Email 1 : "+myemail);
		
		PrintWriter out = resp.getWriter();
		out.println("Name : "+myname);
		out.println("Email : "+myemail);
}
}

