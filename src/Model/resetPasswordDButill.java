package Model;

import java.sql.Connection;

import java.sql.Statement;

import DBConnection.DataBaseConnect;

public class resetPasswordDButill {
		static boolean  result;
		public static boolean resetPassword(String userName,String oldPassword,String newPassword){
			
			
			try {
				
				Connection cons=DataBaseConnect.getDBConnect();
				Statement sts=cons.createStatement();
				String sqls="update seller set Password='"+newPassword+"' where NIC='"+userName+"' and Password='"+oldPassword+"'";
				int res=sts.executeUpdate(sqls);
				
				
				
				Connection conb=DataBaseConnect.getDBConnect();
				Statement stb=conb.createStatement();
				String sqlb="update buyer set password='"+newPassword+"' where NIC='"+userName+"' and Password='"+oldPassword+"'";
				int reb=stb.executeUpdate(sqlb);
				
				
				Connection conac=DataBaseConnect.getDBConnect();
				Statement stac=conac.createStatement();
				String sqlac="update accountant set password='"+newPassword+"' where NIC='"+userName+"' and Password='"+oldPassword+"'";
				int reac=stac.executeUpdate(sqlac);
				
				Connection conad=DataBaseConnect.getDBConnect();
				Statement stad=conad.createStatement();
				String sqlad="update admin  set password='"+newPassword+"' where NIC='"+userName+"' and Password='"+oldPassword+"'";
				int read=stad.executeUpdate(sqlad);
				
				
				if(res>0||reb>0||reac>0||read>0)
				{
					result=true;
				}else {
					result=false;
				}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			return result;
	}
}
