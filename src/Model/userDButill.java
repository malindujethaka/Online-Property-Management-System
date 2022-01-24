package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import DBConnection.DataBaseConnect;




public class userDButill {
	
	private static int success;
	private static boolean result;
	private static boolean resultx;
	
	
	public static int validate(String userName,String Password){
		
		//ArrayList <user> u1=new ArrayList<>();
		//create database connection
		
		
		//validate
		
		try {
		
			Connection cons=DataBaseConnect.getDBConnect();
			Statement sts=cons.createStatement();
			String sqls="select NIC,Password from seller where NIC='"+userName+"' and Password='"+Password+"'";
			ResultSet res=sts.executeQuery(sqls);
			
			
			
			Connection conb=DataBaseConnect.getDBConnect();
			Statement stb=conb.createStatement();
			String sqlb="select NIC,Password from buyer where NIC='"+userName+"' and Password='"+Password+"'";
			ResultSet reb=stb.executeQuery(sqlb);
			
			
			Connection conac=DataBaseConnect.getDBConnect();
			Statement stac=conac.createStatement();
			String sqlac="select NIC,Password from admin where NIC='"+userName+"' and Password='"+Password+"'";
			ResultSet reac=stac.executeQuery(sqlac);
			
			Connection conad=DataBaseConnect.getDBConnect();
			Statement stad=conad.createStatement();
			String sqlad="select NIC,Password from accountant where NIC='"+userName+"' and Password='"+Password+"'";
			ResultSet read=stad.executeQuery(sqlad);
			
			if(res.next()) {
				success=1;
				//String username=re.getString(1);
				//String password=re.getString(2);
				
				//user u=new user(username,password);
				//u1.add(u);
			}
			else if(reb.next()) {
				success=2;
			}
			else if(reac.next()) {
				success=3;
			}
			else if(read.next()) {
				success=4;
			}
			else {
				success =8;
			}
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		return success;
		
		
	}
	
	public static boolean exsist(String userName ){
		
	
		
		try {
			
			
			Connection cons=DataBaseConnect.getDBConnect();
			Statement sts=cons.createStatement();
			String sqls="select NIC from seller where NIC='"+userName+"'";
			ResultSet res=sts.executeQuery(sqls);
			
			if(res.next() ) {
				result=true;
			}
			else {
				result=false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public static boolean addSeller(String firstName,String lastName,String username,String email,String mobile,String address,String postalcode,String companyName,String CompanyAddress,String CompanyMobile,String password) {
		
		
		try {
			
			
			Connection cons=DataBaseConnect.getDBConnect();
			Statement sts=cons.createStatement();
			String sqls="insert into seller values(0,'"+firstName+"','"+lastName+"','"+username+"','"+ email+"','"+mobile+"','"+address+"','"+postalcode+"','"+companyName+"','"+CompanyAddress+"','"+CompanyMobile+"','"+password+"')";
			int res=sts.executeUpdate(sqls);
			if(res>0) {
				resultx=true;
			}
			else {
				resultx=false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return resultx;
	}

public static boolean addBuyer(String firstName,String lastName,String username,String email,String mobile,String address,String postalcode,String companyName,String CompanyAddress,String CompanyMobile,String password) {
	
	
	try {
		
		
		Connection cons=DataBaseConnect.getDBConnect();
		Statement sts=cons.createStatement();
		String sqls="insert into buyer values(0,'"+firstName+"','"+lastName+"','"+username+"','"+ email+"','"+mobile+"','"+address+"','"+postalcode+"','"+companyName+"','"+CompanyAddress+"','"+CompanyMobile+"','"+password+"')";
		int res=sts.executeUpdate(sqls);
		if(res>0) {
			resultx=true;
		}
		else {
			resultx=false;
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return resultx;
}

}
	
	

