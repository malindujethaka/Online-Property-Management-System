package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.userDButill;


@WebServlet("/SellerRegservlet")
public class SellerRegservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	boolean result,resultx;
	boolean reg, checkpass;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName=request.getParameter("fname");
		String lastName=request.getParameter("lname");
		String username=request.getParameter("nic");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String address=request.getParameter("address");
		String postalcode=request.getParameter("fname");
		String password=request.getParameter("pwd");
		String repassword=request.getParameter("repwd");
		String companyName=request.getParameter("cname");
		String CompanyAddress=request.getParameter("caddress");
		String CompanyMobile=request.getParameter("cmobile");
		
		if(password.equals(repassword))
		{	
			result=userDButill.exsist(username);
			if(result==true)
			{
				RequestDispatcher dis=request.getRequestDispatcher("error1.jsp");
				dis.forward(request,response);
			}
			else
			{
				resultx=userDButill.addSeller(firstName,lastName,username,email,mobile,address,postalcode,companyName,CompanyAddress,CompanyMobile,password);
				if(resultx==true)
				{
					RequestDispatcher dis=request.getRequestDispatcher("Login.jsp");
					dis.forward(request,response);
				}
				else
				{
					RequestDispatcher dis=request.getRequestDispatcher("error5.jsp");
					dis.forward(request,response);
			
				}
			}
		}
		else
		{
			RequestDispatcher dis=request.getRequestDispatcher("error2.jsp");
			dis.forward(request,response);
		}
	}	
}


			



