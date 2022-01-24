package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class userDButill {
	public static List <user>validate(String userName,String Password){
		
		ArrayList <user> u1=new ArrayList<>();
		//create database connection
		String url="jdbc:mysql://localhost:3306/projectdb";
		String user="root";
		String pass="oop@12";
		
		//validate
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, user, pass);
			
			Statement st=con.createStatement();
			String sql="select NIC,Password from seller where NIC='"+userName+"' and Password='"+Password+"'";
			
			ResultSet re=st.executeQuery(sql);
			
			if(re.next()) {
				
				String username=re.getString(1);
				String password=re.getString(2);
				
				user u=new user(username,password);
				u1.add(u);
			}
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		return u1;
		
		
	}
}
