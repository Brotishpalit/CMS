

import java.sql.*;

public class UserRegister extends LoginProcessBase {
	
	String sqlqury="";
	Boolean flag=true;
	
	public UserRegister(String uname){
		super.UserName=uname;
	}
	public UserRegister(String uname,String upassword,String squestion,String sqanswer){
		
		super.UserName=uname;
		super.UserPassword=upassword;
		super.SecurityQuestion=squestion;
		super.QuestionAnswer=sqanswer;
		
		}

	public Boolean userValidate(){
		
		sqlqury="select USERNAME from USERDETAILS";
		
		super.con=Connections.getConnections();
		try {
			super.ps=super.con.prepareStatement(sqlqury);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			super.rs=super.ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		try {
			while(rs.next()){
				if(super.UserName.equals(super.rs.getString(1))){
					flag=false;
				}				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		
	}
	public int insertRegrecord(){
			sqlqury="insert into USERDETAILS values ('"  + super.UserName + "' ,'" + super.UserPassword + "','" + super.SecurityQuestion + "','" + super.QuestionAnswer + "' ) ";
		  super.con=Connections.getConnections();
		  int status=0;
		  try {
			super.ps=super.con.prepareStatement(sqlqury);
			status=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return status;
	}

}
