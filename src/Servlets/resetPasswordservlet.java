package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.resetPasswordDButill;

@WebServlet("/resetPasswordservlet")
public class resetPasswordservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	boolean result;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("username");
		String oldPassword=request.getParameter("oldpass");
		String newPassword=request.getParameter("newpass");
		
		result=resetPasswordDButill.resetPassword(userName, oldPassword, newPassword);
		if(result==true) {
			RequestDispatcher dis=request.getRequestDispatcher("success.jsp");
			dis.forward(request,response);
		}else
		{
			RequestDispatcher dis=request.getRequestDispatcher("error6.jsp");
			dis.forward(request,response);
		}
	}

}
