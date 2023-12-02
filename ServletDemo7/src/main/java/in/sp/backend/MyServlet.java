package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submitForm")
public class MyServlet extends HttpServlet{

	@Override
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mysearch=req.getParameter("search1");
		//sendRedirect method send response in anotheir url
		//sendRedirect is use by HttpServletResponse
		
		resp.sendRedirect("https://www.google.com");   //by using this we will directly go to the server which we write

		resp.sendRedirect("https://www.google.com/search?q="+mysearch);   //by using this link
		
	
		
	}
}
