import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DFrmAdmission2 {
	PreparedStatement ps;
	  ResultSet rs;
		Connection conn;
	public int insert_recored(int ADMISSION2_ID,String EXAMINATION_PASSED,String BORD_UNIVERSITY,  
			  String SCHOOL_COLLEGE ,String YEAR_OF_PASSING ,String DIVISION ,int MARKS,  
			  String EXAMINATION_PASSED2,String BORD_UNIVERSITY2,String SCHOOL_COLLEGE2,  
			  String YEAR_OF_PASSING2 ,String DIVISION2,int MARKS2,String COMPUTER_KNOWLEDGE ,  
			  String COMPUTER_COURSE_NAME,String COMPUTER_DURATION,String COMPUTER_INSTITUTE,  
			  String COMPUTER_YEAR,String COMPUTER_GRADE,String COMPUTER_COURSE_NAME2,
			  String COMPUTER_DURATION2,String COMPUTER_INSTITUTE2,String COMPUTER_YEAR2,
			  String COMPUTER_GRADE2,String FATHER_NAME,String FATHER_OCCUPATION , 
			  int FATHER_ANNUAL_INCOME ,int FATHER_MOB_NO ){
		String sql="insert into stud_admission2 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int status=0;
		conn=Connections.getConnections();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, ADMISSION2_ID);
			ps.setString(2, EXAMINATION_PASSED);
			ps.setString(3, BORD_UNIVERSITY);
			ps.setString(4, SCHOOL_COLLEGE);
			ps.setString(5, YEAR_OF_PASSING);
			ps.setString(6, DIVISION);
			ps.setInt(7, MARKS);
			ps.setString(8, EXAMINATION_PASSED2);
			ps.setString(9,BORD_UNIVERSITY2);
			ps.setString(10, SCHOOL_COLLEGE2);
			ps.setString(11, YEAR_OF_PASSING2);
			ps.setString(12, DIVISION2);
			ps.setInt(13, MARKS2);
			ps.setString(14, COMPUTER_KNOWLEDGE);
			ps.setString(15, COMPUTER_COURSE_NAME);
			ps.setString(16, COMPUTER_DURATION);
			ps.setString(17, COMPUTER_INSTITUTE);
			ps.setString(18, COMPUTER_YEAR);
			ps.setString(19, COMPUTER_GRADE);
			ps.setString(20, COMPUTER_COURSE_NAME2);
			ps.setString(21, COMPUTER_DURATION2);
			ps.setString(22, COMPUTER_INSTITUTE2);
			ps.setString(23, COMPUTER_YEAR2);
			ps.setString(24, COMPUTER_GRADE2);
			ps.setString(25, FATHER_NAME);
			ps.setString(26, FATHER_OCCUPATION);
			ps.setInt(27, FATHER_ANNUAL_INCOME);
			ps.setInt(28, FATHER_MOB_NO);
			
			status=ps.executeUpdate();
			conn.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return status;
		
	}
	public int update_recoread(int ADMISSION2_ID,String EXAMINATION_PASSED,String BORD_UNIVERSITY,  
			  String SCHOOL_COLLEGE ,String YEAR_OF_PASSING ,String DIVISION ,int MARKS,  
			  String EXAMINATION_PASSED2,String BORD_UNIVERSITY2,String SCHOOL_COLLEGE2,  
			  String YEAR_OF_PASSING2 ,String DIVISION2,int MARKS2,String COMPUTER_KNOWLEDGE ,  
			  String COMPUTER_COURSE_NAME,String COMPUTER_DURATION,String COMPUTER_INSTITUTE,  
			  String COMPUTER_YEAR,String COMPUTER_GRADE,String COMPUTER_COURSE_NAME2,
			  String COMPUTER_DURATION2,String COMPUTER_INSTITUTE2,String COMPUTER_YEAR2,
			  String COMPUTER_GRADE2,String FATHER_NAME,String FATHER_OCCUPATION , 
			  int FATHER_ANNUAL_INCOME ,int FATHER_MOB_NO){
		String sql="update stud_admission2 set ";
		int status=0;
		conn=Connections.getConnections();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, ADMISSION2_ID);
			ps.setString(2, EXAMINATION_PASSED);
			ps.setString(3, BORD_UNIVERSITY);
			ps.setString(4, SCHOOL_COLLEGE);
			ps.setString(5, YEAR_OF_PASSING);
			ps.setString(6, DIVISION);
			ps.setInt(7, MARKS);
			ps.setString(8, EXAMINATION_PASSED2);
			ps.setString(9,BORD_UNIVERSITY2);
			ps.setString(10, SCHOOL_COLLEGE2);
			ps.setString(11, YEAR_OF_PASSING2);
			ps.setString(12, DIVISION2);
			ps.setInt(13, MARKS2);
			ps.setString(14, COMPUTER_KNOWLEDGE);
			ps.setString(15, COMPUTER_COURSE_NAME);
			ps.setString(16, COMPUTER_DURATION);
			ps.setString(17, COMPUTER_INSTITUTE);
			ps.setString(18, COMPUTER_YEAR);
			ps.setString(19, COMPUTER_GRADE);
			ps.setString(20, COMPUTER_COURSE_NAME2);
			ps.setString(21, COMPUTER_DURATION2);
			ps.setString(22, COMPUTER_INSTITUTE2);
			ps.setString(23, COMPUTER_YEAR2);
			ps.setString(24, COMPUTER_GRADE2);
			ps.setString(25, FATHER_NAME);
			ps.setString(26, FATHER_OCCUPATION);
			ps.setInt(27, FATHER_ANNUAL_INCOME);
			ps.setInt(28, FATHER_MOB_NO);
			
			status=ps.executeUpdate();
			conn.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
		return status;
		
	}
	public ResultSet search_recored(int AdmissionNo2){
		String sql="select  ";
		conn=Connections.getConnections();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, AdmissionNo2);
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		
		
	}
	public ResultSet delete_reacored(int admissionNO2){
		String sql="delete from stud_admission2 where admissionNO2=?";
		conn =Connections.getConnections();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, admissionNO2);
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		
	}
  
}
