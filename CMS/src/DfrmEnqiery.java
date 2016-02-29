import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DfrmEnqiery extends Connections {
  PreparedStatement ps;
  ResultSet rs;
	Connection conn;
	public int getenqnumber(){
		String sql="select stud_enq_number from student_enquery";
		conn=Connections.getConnections();
		int result=1000;
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
	public int ins_record(int enqNO,String name,String father_name,String DOB,int age,String quallifcation,
			double percent,String gender,String working,String add,String p_mobnum,String st_num,String university,
			String email,String inst_course,String Smode,String source,String date){
		String sql="insert into student_enquery values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int status=0;
		conn=Connections.getConnections();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, enqNO);
			ps.setString(2, name);
			ps.setString(3, father_name);
			ps.setString(4, DOB);
			ps.setInt(5, age);
			ps.setString(6, quallifcation);
			ps.setDouble(7, percent);
			ps.setString(8, gender);
			ps.setString(9, working);
			ps.setString(10, add);
			ps.setString(11, p_mobnum);
			ps.setString(12, st_num);
			ps.setString(13, university);
			ps.setString(14, email);
			ps.setString(15, inst_course);
			ps.setString(16, Smode);
			ps.setString(17, source);
			ps.setString(18, date);
			status=ps.executeUpdate();
			
			conn.commit();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}
	public ResultSet  sec_record(int enqno){
	String Sql="select stud_name ,stud_fname,stud_dob ,stud_age ,stud_qualification,stud_percentage,"
			+ "stud_gender,stud_working,stud_full_address,stud_parent_mobno,stud_student_mobno,stud_university,"
			+ "stud_email_id,stud_course_interested,stud_study_mode,stud_source_of_info,"
			+ "stud_enq_date from student_enquery where stud_enq_number=" + enqno + "";
		conn=Connections.getConnections();
		try {
			ps=conn.prepareStatement(Sql);
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public int update_record(int enqNO,String name,String father_name,String DOB,int age,String quallifcation,Double percent,
			String gender,String working,String add,String p_mobnum,String st_num,String university,String email,
			String inst_course,String Smode,String source,String date){
		String sql="update student_enquery set stud_name=?,stud_fname=?,stud_dob=?,stud_age=?,"
					+ "stud_qualification=?,stud_percentage=?,stud_gender=?,stud_working=?,stud_full_address=?,"
				+ "stud_parent_mobno=?,stud_student_mobno=?,stud_university=?,stud_email_id=?,"
				+ "stud_course_interested=?,stud_study_mode=?,stud_source_of_info=?,stud_enq_date=?"
				+ " where stud_enq_number=?";
		int status=0;
		conn=Connections.getConnections();
		try {
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setString(2, father_name);
			ps.setString(3, DOB);
			ps.setInt(4, age);
			ps.setString(5, quallifcation);
			ps.setDouble(6, percent);
			ps.setString(7, gender);
			ps.setString(8, working);
			ps.setString(9, add);
			ps.setString(10, p_mobnum);
			ps.setString(11, st_num);
			ps.setString(12, university);
			ps.setString(13, email);
			ps.setString(14, inst_course);
			ps.setString(15, Smode);
			ps.setString(16, source);
			ps.setString(17, date);
			ps.setInt(18, enqNO);
			status=ps.executeUpdate();
			
			conn.commit();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		}
		
	
}


