import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FrmAdmission2  implements WindowListener{

	
	JFrame frm;
	
	JButton btnSave, btnSearch,btnUpdate,btnClear;
	
	JLabel lblExam_pass,lblBoard_University,lblSchool_College,lblPassing_Year,lblDivision,lblPer_Mark,lblCourse_Name,
	lblDuration,lblInstitute,lblYear,lblGrade,lbltech_Knowledge,lbllogo;

	JTextField txtExam_pass,txtBoard_University,txtSchool_College,txtPassing_Year,txtDivision,txtPer_Mark,txtCourse_Name,
	txtDuration,txtInstitute,txtYear,txtGrade,txttech_Knowledge;

	
	Font f=new Font("Consolas",Font.BOLD,13);
	Image img=new ImageIcon(this.getClass().getResource("/banner.jpg")).getImage();
	//Image img1=new ImageIcon(this.getClass().getResource("/banner 2.jpg")).getImage();
	
	public FrmAdmission2(){
		
		
		frm=new JFrame();
		frm.setSize(900,600);
		frm.setLocation(130, 0);
		frm.setResizable(false);
		frm.setLayout(null);
		
		frm.setTitle("ADMISSION FORM2");
	
		lbllogo=new JLabel();
		lbllogo.setBounds(20, 5, 1050, 170);
		lbllogo.setIcon(new ImageIcon(img));
		frm.add(lbllogo);
		
		lblExam_pass=new JLabel("EXAMINATION PASSED");
		lblExam_pass.setBounds(30, 180, 135, 30);
		lblExam_pass.setFont(f);
		lblExam_pass.setForeground(Color.BLUE);
		frm.add(lblExam_pass);
		
		txtExam_pass=new JTextField();
		txtExam_pass.setBounds(30, 210,135,30);
		txtExam_pass.setFont(f);
		txtExam_pass.setForeground(Color.BLACK);
		frm.add(txtExam_pass);
		
		lblBoard_University=new JLabel(" BOARD/UNIVERSITY");
		lblBoard_University.setBounds(165, 180, 130, 30);
		lblBoard_University.setFont(f);
		lblBoard_University.setForeground(Color.BLUE);
		frm.add(lblBoard_University);
		
		txtBoard_University=new JTextField();
		txtBoard_University.setBounds(165, 210,130,30);
		txtBoard_University.setFont(f);
		txtBoard_University.setForeground(Color.BLACK);
		frm.add(txtBoard_University);
		
		lblSchool_College=new JLabel(" SCHOOL/COLLEGE");
		lblSchool_College.setBounds(295, 180, 130, 30);
		lblSchool_College.setFont(f);
		lblSchool_College.setForeground(Color.BLUE);
		frm.add(lblSchool_College);
		
		txtSchool_College=new JTextField();
		txtSchool_College.setBounds(295, 210,130,30);
		txtSchool_College.setFont(f);
		txtSchool_College.setForeground(Color.BLACK);
		frm.add(txtSchool_College);
		
		lblPassing_Year=new JLabel(" YEAR OF PASSING");
		lblPassing_Year.setBounds(425, 180, 130, 30);
		lblPassing_Year.setFont(f);
		lblPassing_Year.setForeground(Color.BLUE);
		frm.add(lblPassing_Year);
		
		txtPassing_Year=new JTextField();
		txtPassing_Year.setBounds(425, 210,130,30);
		txtPassing_Year.setFont(f);
		txtPassing_Year.setForeground(Color.BLACK);
		frm.add(txtPassing_Year);
		
		lblDivision=new JLabel("     DIVISION");
		lblDivision.setBounds(555, 180, 130, 30);
		lblDivision.setFont(f);
		lblDivision.setForeground(Color.BLUE);
		frm.add(lblDivision);
		
		txtDivision=new JTextField();
		txtDivision.setBounds(555, 210,130,30);
		txtDivision.setFont(f);
		txtDivision.setForeground(Color.BLACK);
		frm.add(txtDivision);
		
		lblPer_Mark=new JLabel("     %MARKS");
		lblPer_Mark.setBounds(685, 180, 130, 30);
		lblPer_Mark.setFont(f);
		lblPer_Mark.setForeground(Color.BLUE);
		frm.add(lblPer_Mark);
		
		txtPer_Mark=new JTextField();
		txtPer_Mark.setBounds(685, 210,130,30);
		txtPer_Mark.setFont(f);
		txtPer_Mark.setForeground(Color.BLACK);
		frm.add(txtPer_Mark);
		
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.addWindowListener(this);
		frm.setVisible(true);
	
		
	}
	
	public static void main(String[] args) {
		new FrmAdmission2();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
