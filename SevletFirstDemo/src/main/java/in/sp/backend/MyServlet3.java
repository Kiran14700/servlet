package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//second way
public class MyServlet3 extends HttpServlet {
 @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	 //if you want to print in the web page then use this printwriter method
	 PrintWriter out=response.getWriter();
	 out.print("I am in doGet() method browser");
	 
	 //Backend code
System.out.println("im in doGet() Method");
 }


}
