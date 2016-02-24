import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DFrmAdmission extends Connections{
	PreparedStatement ps;
	  ResultSet rs;
		Connection conn;
		public int getAdmissionnumber(){
			String sql="select stud_admision_id from stud_admision ";
			conn=Connections.getConnections();
			int result=1000000;
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
	public int insert_record(int admision_id,int enqNO,String date,String name,String father_name,String DOB,String nationaity,String gender,String quallifcation,int percent,String working,String course_title,String semester,String martial_ststus,String category,String religon,String add,String email,String p_mobnum,String st_num,String mode,String university,String source,int fimali_income){
		String sql="insert into stud_admision values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int status=0;
		conn=Connections.getConnections();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, admision_id);
			ps.setInt(2, enqNO);
			ps.setString(3, date);
			ps.setString(4, name);
			ps.setString(5, father_name);
			ps.setString(6, DOB);
			ps.setString(7, nationaity);
			ps.setString(8, gender);
			ps.setString(9, quallifcation);
			ps.setInt(10, percent);
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
		
		String Sql="select stud_name ,stud_fname,stud_dob ,stud_qualification,stud_percentage,stud_gender,stud_working,stud_full_address,stud_parent_mobno,stud_student_mobno,stud_university,stud_email_id,stud_course_interested,stud_study_mode,stud_source_of_info from student_enquery where stud_enq_number=?";
			conn=Connections.getConnections();
			try {
				ps=conn.prepareStatement(Sql);
			ps.setInt(1, enqno);
				rs=ps.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;
		}
}
