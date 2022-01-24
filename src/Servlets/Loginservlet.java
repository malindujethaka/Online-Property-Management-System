package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.AccountantInformation;
import Entity.AdminInformation;
import Entity.SellerUserInformation;
import Entity.UserInformation;
import Model.accountantDButill;
import Model.adminDButill;
import Model.buyerDButill;
import Model.sellerDButill;
import Model.userDButill;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	int isTrue;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("pass");
	
			
			isTrue=userDButill.validate(username,password);
			if(isTrue==1) {
				try {
					List<SellerUserInformation> sellerDetails=sellerDButill.verify(username, password);
					request.setAttribute("seller", sellerDetails);
					}catch(Exception r) {
						r.getStackTrace();
					}
				RequestDispatcher dis=request.getRequestDispatcher("SellerAcc.jsp");
				dis.forward(request,response);
			}
			else if(isTrue==2) {
				try {
					List<UserInformation> buyDetails=buyerDButill.verify(username, password);
					request.setAttribute("details", buyDetails);
					}catch(Exception r) {
						r.getStackTrace();
					}
				RequestDispatcher dis=request.getRequestDispatcher("BuyerAcc.jsp");
				dis.forward(request,response);
			}
			else if(isTrue==3) {
				try {
					List<AdminInformation> adminDetails=adminDButill.verify(username, password);
					request.setAttribute("admin", adminDetails);
					}catch(Exception r) {
						r.getStackTrace();
					}
				RequestDispatcher dis=request.getRequestDispatcher("AdminAcc.jsp");
				dis.forward(request,response);
			}
			else if(isTrue==4) {
				try {
					List<AccountantInformation>accountantDetails=accountantDButill.verify(username, password);
					request.setAttribute("accountant", accountantDetails);
					}catch(Exception r) {
						r.getStackTrace();
					}
				RequestDispatcher dis=request.getRequestDispatcher("AccountantAcc.jsp");
				dis.forward(request,response);
			}
			else {
				RequestDispatcher diss=request.getRequestDispatcher("error4.jsp");
				diss.forward(request,response);
			}
			
			
	}
	
	

}
