import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

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
	public int ins_record(int enqNO,String name,String father_name,String DOB,String age,String quallifcation,int percent,String gender,String working,String add,String p_mobnum,String st_num,String university,String email,String inst_course,String Smode,String source,String date){
		String sql="insert into student_enquery values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int status=0;
		conn=Connections.getConnections();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, enqNO);
			ps.setString(2, name);
			ps.setString(3, father_name);
			ps.setString(4, DOB);
			ps.setString(5, age);
			ps.setString(6, quallifcation);
			ps.setInt(7, percent);
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
	String Sql="select stud_name ,stud_fname,stud_dob ,stud_age ,stud_qualification,stud_percentage,stud_gender,stud_working,stud_full_address,stud_parent_mobno,stud_student_mobno,stud_university,stud_email_id,stud_course_interested,stud_study_mode,stud_source_of_info,stud_enq_date from student_enquery where stud_enq_number=" + enqno + "";
		conn=Connections.getConnections();
		try {
			ps=conn.prepareStatement(Sql);
			rs=ps.executeQuery();
			/*while(rs.next()){
			JOptionPane.showMessageDialog(null, rs.getString(1));
			JOptionPane.showMessageDialog(null, rs.getString(2));
			JOptionPane.showMessageDialog(null, rs.getString(3));
			JOptionPane.showMessageDialog(null, rs.getString(4));
			JOptionPane.showMessageDialog(null, rs.getString(5));
			JOptionPane.showMessageDialog(null, rs.getString(6));
			JOptionPane.showMessageDialog(null, rs.getString(7));
			JOptionPane.showMessageDialog(null, rs.getString(8));
			JOptionPane.showMessageDialog(null, rs.getString(9));
			JOptionPane.showMessageDialog(null, rs.getString(10));
			JOptionPane.showMessageDialog(null, rs.getString(11));
			JOptionPane.showMessageDialog(null, rs.getString(12));
			JOptionPane.showMessageDialog(null, rs.getString(13));*/
			//}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public int update_record(int enqNO,String name,String father_name,String DOB,String string,String quallifcation,int percent,String gender,String working,String add,String p_mobnum,String st_num,String university,String email,String inst_course,String Smode,String source,String date){
		String sql="update student_enquery set stud_name='amit kumar',stud_fname='mahesh kumar gupta',stud_dob='08/03/1996',stud_age=22,stud_qualification='intermediate',stud_percentage=62,stud_gender='male',stud_working='no',stud_full_address='punaichak, patna',stud_parent_mobno='8405984767',stud_student_mobno='8864054031',stud_university='magadh university',stud_email_id='amizyx0@gmail.com',stud_course_interested='bca',stud_study_mode='regular',stud_source_of_info='other',stud_enq_date='18/02/2016' where stud_enq_number=1001";
		int status=0;
		conn=Connections.getConnections();
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, enqNO);
			ps.setString(2, name);
			ps.setString(3, father_name);
			ps.setString(4, DOB);
			ps.setString(5, string);
			ps.setString(6, quallifcation);
			ps.setInt(7, percent);
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
}


