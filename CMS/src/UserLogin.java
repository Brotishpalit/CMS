

import java.sql.*;

public class UserLogin extends LoginProcessBase{
	
	Boolean flag=false;
	
	public UserLogin(String uname,String upassword){
		
		super.UserName=uname;
		super.UserPassword=upassword;	
	}
	public Boolean validateLogin(){
		
		con=Connections.getConnections();
      
	    try {
			ps = con.prepareStatement("select *from USERDETAILS");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			while(rs.next()){
				if(super.UserName.equals(rs.getString(1))&& super.UserPassword.equals(rs.getString(2))){
					flag=true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}	
	public static void main(String[]args) {
		
	}
}