import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JOptionPane;


public class DFrmAdmission extends Connections{
	PreparedStatement ps;
	  ResultSet rs;
		Connection conn;
		public int getAdmissionnumber(){
			String sql="select stud_admision_id from stud_admision ";
			conn=Connections.getConnections();
			int result=10000;
			try {
				ps= conn.prepareStatement(sql);
				rs=ps.executeQuery();
				while(rs.next()){
					result=rs.getInt(1);
				}
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
			return result+1;
		}
	public int insert_record(int admision_id,int enqNO,String date,String name,String father_name,String DOB,String nationaity,String gender,String quallifcation,Double percent,String working,String course_title,String semester,String martial_ststus,String category,String religon,String add,String email,String p_mobnum,String st_num,String mode,String university,String source,int fimali_income){
		//JOptionPane.showMessageDialog(null, "hello");
		String sql="insert into stud_admision values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int status=0;
		conn=Connections.getConnections();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, admision_id);
			ps.setInt(2, enqNO);
			ps.setString(3, date);
			//JOptionPane.showMessageDialog(null, date);
			ps.setString(4, name);
			ps.setString(5, father_name);
			ps.setString(6, DOB);
			ps.setString(7, nationaity);
			ps.setString(8, gender);
			ps.setString(9, quallifcation);
			ps.setDouble(10, percent);
			ps.setString(11, working);
			ps.setString(12, course_title);
			ps.setString(13, semester);
			ps.setString(14, martial_ststus);
			ps.setString(15, category);
			ps.setString(16, religon );
			ps.setString(17, add);
			ps.setString(18, email);
			ps.setString(19, p_mobnum);
			ps.setString(20, st_num);
			ps.setString(21, mode);
			ps.setString(22, university);
			ps.setString(23, source);
			ps.setInt(24, fimali_income);
			status=ps.executeUpdate();
			//JOptionPane.showMessageDialog(null, date);
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
	public ResultSet  sec_record(int enqno){
		
		String Sql="select stud_name ,stud_fname,stud_DOB ,stud_age ,stud_qualification,stud_percentage,"
			+ "stud_gender,stud_working,stud_full_address,stud_parent_mobno,stud_student_mobno,stud_university,"
			+ "stud_email_id,stud_course_interested,stud_study_mode,stud_source_of_info,"
			+ "stud_enq_date from student_enquery where stud_enq_number=?";
				conn=Connections.getConnections();
			try {
				ps=conn.prepareStatement(Sql);
			ps.setInt(1,enqno);
				rs=ps.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block;
				e.printStackTrace();
			}
			return rs;
		}
	public ResultSet search_recored(int AdmossionNo){
		String sql="SELECT STUD_ENQ_ID,STUD_ADMISION_DATE,STUD_NAME,STUD_FNAME,STUD_DOB,STUD_NATIONAITY,"
				+ "STUD_GENDER,STUD_QUALIFACTION,STUD_PERCENTAGE,STUD_WORKING,STUD_COURSE_TITLE,STUD_SEMESTER,"
				+ "STUD_MARTIAL_STATUS,STUD_CATEGORY,STUD_RELIGON,STUD_FULL_ADDRESS,STUD_EMAIL_ID,"
				+ "STUD_PARENTS_MOB_NO,STUD_MOB_NO,STUD_MODE,STUD_UNIVERSITY,STUD_SOURCE_OF_INFO,"
				+ "STUD_FIMALI_INCOME FROM STUD_ADMISION WHERE STUD_ADMISION_ID=?";
		conn=Connections.getConnections();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, AdmossionNo);
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
		
	}
	public int update_record(int admisionno,String date,String name,String father_name,String DOB,String nationaity,
			String gender,String quallifcation,Double percent,String working,String inst_course,String semester,String martial,String category,String religon,
			String add,String email,String p_mobnum,String st_num,String Smode,String university,String source,int fimali_income){
		String sql="UPDATE STUD_ADMISION SET STUD_ADMISION_DATE=? ,"
				+ "STUD_NAME=? ,STUD_FNAME=? ,"
				+ "STUD_DOB=? ,STUD_NATIONAITY=?,STUD_GENDER=?,"
				+ "STUD_QUALIFACTION=?,STUD_PERCENTAGE= ?,STUD_WORKING=?,"
				+ "STUD_COURSE_TITLE=?,STUD_SEMESTER=?,STUD_MARTIAL_STATUS= ? ,"
				+ "STUD_CATEGORY=?,STUD_RELIGON= ?,STUD_FULL_ADDRESS=? ,"
				+ "STUD_EMAIL_ID=? ,STUD_PARENTS_MOB_NO=?,"
				+ "STUD_MOB_NO=?,STUD_MODE=?,STUD_UNIVERSITY=?,"
				+ "STUD_SOURCE_OF_INFO=?,STUD_FIMALI_INCOME=?"
				+ " WHERE STUD_ADMISION_ID=?";
		int status=0;
		conn=Connections.getConnections();
		try {
			ps=conn.prepareStatement(sql);
			
			
			ps.setInt(1, admisionno);
			JOptionPane.showMessageDialog(null, admisionno);
			ps.setString(2, date);
			JOptionPane.showMessageDialog(null, date);
			ps.setString(3, name);
			JOptionPane.showMessageDialog(null, name);
			ps.setString(4, father_name);
			JOptionPane.showMessageDialog(null, father_name);
			ps.setString(5, DOB);
			JOptionPane.showMessageDialog(null, DOB);
			ps.setString(6, nationaity);
			JOptionPane.showMessageDialog(null, nationaity);
			ps.setString(7, gender);
			JOptionPane.showMessageDialog(null, gender);
			ps.setString(8, quallifcation);
			JOptionPane.showMessageDialog(null, quallifcation);
			ps.setDouble(9, percent);
			JOptionPane.showMessageDialog(null, percent);
			ps.setString(10, working);
			JOptionPane.showMessageDialog(null, working);
			ps.setString(11, inst_course);
			JOptionPane.showMessageDialog(null, inst_course);
			ps.setString(12, semester);
			JOptionPane.showMessageDialog(null, semester);
			ps.setString(13, martial);
			JOptionPane.showMessageDialog(null, martial);
			ps.setString(14, category);
			JOptionPane.showMessageDialog(null, category);
			ps.setString(15, religon );
			JOptionPane.showMessageDialog(null, religon);
			ps.setString(16, add);
			JOptionPane.showMessageDialog(null, add);
			ps.setString(17, email);
			JOptionPane.showMessageDialog(null, email);
			ps.setString(18, p_mobnum);
			JOptionPane.showMessageDialog(null, p_mobnum);
			ps.setString(19, st_num);
			JOptionPane.showMessageDialog(null, st_num);
			ps.setString(20, Smode);
			JOptionPane.showMessageDialog(null, Smode);
			ps.setString(21, university);
			JOptionPane.showMessageDialog(null, university);
			ps.setString(22, source);
			JOptionPane.showMessageDialog(null, source);
			ps.setInt(23, fimali_income);
			JOptionPane.showMessageDialog(null, fimali_income);
			
			status=ps.executeUpdate();
			JOptionPane.showMessageDialog(null, status);
			
			conn.commit();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		}
	public void delete_recored(){
		
	}
	public ResultSet delete_reacored(int admissionNo){
		String sql="delete from stud_admission2 where admissionNo=?";
		conn =Connections.getConnections();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, admissionNo);
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		
	}
}
