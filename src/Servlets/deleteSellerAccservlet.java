package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.sellerDButill;

@WebServlet("/deleteSellerAccservlet")
public class deleteSellerAccservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	boolean result;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("uname");
		
		result=sellerDButill.deleteAccount(username);
		if(result==true) {
			RequestDispatcher dis=request.getRequestDispatcher("Home.jsp");
			dis.forward(request,response);
		}
		else {
			RequestDispatcher dis=request.getRequestDispatcher("Login.jsp");
			dis.forward(request,response);
		}
	}

}
