package in.sp.backend2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("Login")
public class Login extends HttpServlet {
  
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myemail=req.getParameter("email");
		String mypass=req.getParameter("pass1");
		
		PrintWriter out=resp.getWriter();
		
		if(myemail.equals("deepak@gmail.com") && mypass.equals("123"))
		{
			//by RequestDispatcher our url is load in same page
			//RequestDispatcher will not change url
			
			req.setAttribute("name_key", "Deepak");   //set value in the key
			RequestDispatcher rd=req.getRequestDispatcher("/Profile.jsp");  //file is jsp thatswhy we should write jsp
			rd.forward(req, resp);
		}
		else {
			resp.setContentType("text/html");  //html source code ki jagah proper page load kardega
			out.print("<h3 style='color:red'>Email id and passis incorrect </h3>");
			RequestDispatcher rd=req.getRequestDispatcher("/NewFile.html");
			rd.include(req, resp);
			
		}
		
	}
	

}
