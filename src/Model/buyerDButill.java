package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBConnection.DataBaseConnect;
import Entity.UserInformation;

public class buyerDButill {

	private static Connection c=null;
	private static Statement s=null;
	private static ResultSet r=null;
	private static boolean result;
	public static List<UserInformation> verify(String username,String password){
		ArrayList<UserInformation> by=new ArrayList<>();
		
		//validate user
		try {
		
		c=DataBaseConnect.getDBConnect();
		s=c.createStatement();
		String sql="select * from buyer where NIC='"+username+"'and Password='"+password+"'";
		r=s.executeQuery(sql);
		 
		
		if(r.next()) {
			
			String uFirstName=r.getString(2);
			String uLastName=r.getString(3);
			String uNic=r.getString(4);
			String uEmail=r.getString(5);
			String uPhone=r.getString(6);
			String uAddress=r.getString(7);
			String uPostalCode=r.getString(8);
			String uComName=r.getString(9);
			String uComAddress=r.getString(10);
			String uComPhone=r.getString(11);
			String uPassword=r.getString(12);
			
			UserInformation b1=new UserInformation(uFirstName,uLastName,uNic,uEmail,uPhone,uAddress,uPostalCode,uComName,uComAddress,uComPhone,uPassword);
			by.add(b1);
		}
		
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		return by;
	}
	public static boolean deleteAccount(String userName) {
		
		try{
				
				 c=DataBaseConnect.getDBConnect();
				 s=c.createStatement();
				 String sqla="delete from buyer where NIC='"+userName+"'";
				 int rs=s.executeUpdate(sqla);
				
				if(rs>0) {
					result=true;
				}
				else {
					result=false;
				}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;	
		}
}
