package in.rahul.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")
public class Login {

	protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		if(myemail.equals("rahul.cse2034gmail.com") && mypass.equals("rahul123"))
		{
			System.out.println("sucess");
		}
		else {
			System.out.println("failed");
		}
	}
}
