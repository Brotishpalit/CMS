

import java.sql.SQLException;

public class ChangePassword extends LoginProcessBase {
  String sqlquery;
	public ChangePassword(String uname){
		super.UserName=uname;
	}
	public ChangePassword(String uname,String sqanswer,String password){
		super.UserName=uname;
		super.QuestionAnswer=sqanswer;
		super.UserPassword=password;
	}
public 	String getSecQuestion(){
	sqlquery="select SECURITY_QUESTION from USERDETAILS where USERNAME='" + super.UserName + "'" ;
	String ques="";
	super.con=Connections.getConnections();
	try {
		super.ps=con.prepareStatement(sqlquery);
		super.rs=ps.executeQuery();
		while(rs.next()){
			ques=rs.getString(1);
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
	return ques;
}
public Boolean passwordValidate(){
	boolean flag=false;
	sqlquery="select SECURITY_ANSWER from USERDETAILS where USERNAME='" + super.UserName + "'";
	super.con=Connections.getConnections();
	try {
		super.ps=con.prepareStatement(sqlquery);
		super.rs=ps.executeQuery();
		while (rs.next()){
			if(super.QuestionAnswer.equals(rs.getString(1))){
				flag=true;
			}else{
				flag=false;
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

public boolean updatepasswd(){
	boolean flag=false;
	sqlquery="update USERDETAILS set PASSWORD= '" +super.UserPassword + "'where USERNAME='" + super.UserName +"'";
	super.con=Connections.getConnections();
	try {
		super.ps=con.prepareStatement(sqlquery);
		int status=ps.executeUpdate();
		if(status==1){
			flag=true;
		}else{
			flag=false;
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

}
