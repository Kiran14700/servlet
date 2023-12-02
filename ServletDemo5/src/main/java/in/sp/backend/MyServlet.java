package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")

public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myname=req.getParameter("name1");    //it will print in the console
		String myemail=req.getParameter("email1");
		System.out.println("Name :"+myname);
		System.out.println("Email :"+myemail);
		
		
		
		PrintWriter out=resp.getWriter();           //it will print the form  in the web page
		out.print("Name :"+myname);
		out.print("Email :"+myemail);

	}

}
