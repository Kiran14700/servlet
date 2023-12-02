package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/myLogin")
public class Login extends HttpServlet{

	@Override
	//we can use doGet method fr get method and doPost for post
	//in out html file we use post method then we can use doPost or service
	//service accepts all the method
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myemail=req.getParameter("name1");
		String mypass=req.getParameter("pass1");
		
		if(myemail.equals("deepak@gmail.com") && mypass.endsWith("123")) {
			System.out.println("success");
		}
		else {
			System.out.println("failed");
		}
		
		PrintWriter out=resp.getWriter();
		out.print(myemail);
		out.print(mypass);
		
	}
}
