
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Connections {

	public static Connection getConnections() {
		// TODO Auto-generated method stub
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String UserName="system";
		String UserPassword="manager";
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		//System.out.println("Driver Registered.........");
			conn=DriverManager.getConnection(url, UserName, UserPassword);
		//System.out.println("Connection Created........");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return conn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 new Connections().getConnections(); 
}
}