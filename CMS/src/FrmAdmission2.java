import java.awt.*;
import java.awt.event.*;

import javax.naming.ldap.Rdn;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class FrmAdmission2  implements WindowListener{

	
	JFrame frm;
	
	JButton  btnSave, btnSearch,btnUpdate,btnClear;
	
	JRadioButton rdYes, rdNo;
	
	JLabel lblAddmission_no,lblExam_pass,lblBoard_University,lblSchool_College,lblPassing_Year,
	lblDivision,lblPer_Mark,lblCourse_Name,lblDuration,lblInstitute,lblYear,
	lblGrade,lblParents,lbltech_Knowledge,lbllogo,lblAcadmic_Record,
	lblFather_Name,lblOccupation,lblAnnual_Income,lblMobile;

	JTextField txtAddmission_No,txtExam_pass,txtBoard_University,txtSchool_College,
	txtPassing_Year,txtDivision,txtPer_Mark,txtCourse_Name,
	txtDuration,txtInstitute,txtYear,txtGrade,txttech_Knowledge,
	txtFather_Name,txtOccupation,txtAnnual_Income,txtMobile;

		
	Font f=new Font("Consolas",Font.BOLD,13);
	Image img=new ImageIcon(this.getClass().getResource("/banner.jpg")).getImage();
		
	public FrmAdmission2(){
		
		
		frm=new JFrame();
		frm.setSize(850,700);
		frm.setLocation(300,10);
		frm.setResizable(false);
		frm.setLayout(null);
		
		frm.setTitle("ADMISSION FORM2");
	
		lbllogo=new JLabel();
		lbllogo.setBounds(20, 5, 1050, 170);
		lbllogo.setIcon(new ImageIcon(img));
		frm.add(lbllogo);
		
		lblAcadmic_Record=new JLabel("ACCADMIC RECORD [MINIMUM QUALIFACTION: INTERMEDIATE /+2");
		lblAcadmic_Record.setBounds(30,190,500, 30);
		lblAcadmic_Record.setFont(f);
		lblAcadmic_Record.setForeground(Color.DARK_GRAY);
		frm.add(lblAcadmic_Record);
		
		lblAddmission_no=new JLabel("ADDMISSION No");
		lblAddmission_no.setBounds(530,180,150, 30);
		lblAddmission_no.setFont(f);
		lblAddmission_no.setForeground(Color.BLUE);
		frm.add(lblAddmission_no);
		
		txtAddmission_No=new JTextField();
		txtAddmission_No.setBounds(670, 180,150,30);
		txtAddmission_No.setFont(f);
		txtAddmission_No.setForeground(Color.BLACK);
		frm.add(txtAddmission_No);
		
		lblExam_pass=new JLabel("EXAMINATION PASSED");
		lblExam_pass.setBounds(30, 220, 135, 30);
		lblExam_pass.setFont(f);
		lblExam_pass.setForeground(Color.BLUE);
		frm.add(lblExam_pass);
		
		txtExam_pass=new JTextField();
		txtExam_pass.setBounds(30, 250,135,30);
		txtExam_pass.setFont(f);
		txtExam_pass.setForeground(Color.BLACK);
		frm.add(txtExam_pass);
		
		txtExam_pass=new JTextField();
		txtExam_pass.setBounds(30, 280,135,30);
		txtExam_pass.setFont(f);
		txtExam_pass.setForeground(Color.BLACK);
		frm.add(txtExam_pass);
		
		lblBoard_University=new JLabel(" BOARD/UNIVERSITY");
		lblBoard_University.setBounds(165, 220, 130, 30);
		lblBoard_University.setFont(f);
		lblBoard_University.setForeground(Color.BLUE);
		frm.add(lblBoard_University);
		
		txtBoard_University=new JTextField();
		txtBoard_University.setBounds(165, 250,130,30);
		txtBoard_University.setFont(f);
		txtBoard_University.setForeground(Color.BLACK);
		frm.add(txtBoard_University);
		
		txtBoard_University=new JTextField();
		txtBoard_University.setBounds(165, 280,130,30);
		txtBoard_University.setFont(f);
		txtBoard_University.setForeground(Color.BLACK);
		frm.add(txtBoard_University);
		
		lblSchool_College=new JLabel(" SCHOOL/COLLEGE");
		lblSchool_College.setBounds(295, 220, 130, 30);
		lblSchool_College.setFont(f);
		lblSchool_College.setForeground(Color.BLUE);
		frm.add(lblSchool_College);
		
		txtSchool_College=new JTextField();
		txtSchool_College.setBounds(295, 250,130,30);
		txtSchool_College.setFont(f);
		txtSchool_College.setForeground(Color.BLACK);
		frm.add(txtSchool_College);
		
		txtSchool_College=new JTextField();
		txtSchool_College.setBounds(295, 280,130,30);
		txtSchool_College.setFont(f);
		txtSchool_College.setForeground(Color.BLACK);
		frm.add(txtSchool_College);
		
		lblPassing_Year=new JLabel(" YEAR OF PASSING");
		lblPassing_Year.setBounds(425,220, 130, 30);
		lblPassing_Year.setFont(f);
		lblPassing_Year.setForeground(Color.BLUE);
		frm.add(lblPassing_Year);
		
		txtPassing_Year=new JTextField();
		txtPassing_Year.setBounds(425, 250,130,30);
		txtPassing_Year.setFont(f);
		txtPassing_Year.setForeground(Color.BLACK);
		frm.add(txtPassing_Year);
		
		txtPassing_Year=new JTextField();
		txtPassing_Year.setBounds(425, 280,130,30);
		txtPassing_Year.setFont(f);
		txtPassing_Year.setForeground(Color.BLACK);
		frm.add(txtPassing_Year);
		
		lblDivision=new JLabel("     DIVISION");
		lblDivision.setBounds(555, 220, 130, 30);
		lblDivision.setFont(f);
		lblDivision.setForeground(Color.BLUE);
		frm.add(lblDivision);
		
		txtDivision=new JTextField();
		txtDivision.setBounds(555, 250,130,30);
		txtDivision.setFont(f);
		txtDivision.setForeground(Color.BLACK);
		frm.add(txtDivision);
		
		txtDivision=new JTextField();
		txtDivision.setBounds(555, 280,130,30);
		txtDivision.setFont(f);
		txtDivision.setForeground(Color.BLACK);
		frm.add(txtDivision);
		
		lblPer_Mark=new JLabel("     %MARKS");
		lblPer_Mark.setBounds(685, 220, 130, 30);
		lblPer_Mark.setFont(f);
		lblPer_Mark.setForeground(Color.BLUE);
		frm.add(lblPer_Mark);
		
		txtPer_Mark=new JTextField();
		txtPer_Mark.setBounds(685, 250,130,30);
		txtPer_Mark.setFont(f);
		txtPer_Mark.setForeground(Color.BLACK);
		frm.add(txtPer_Mark);
		
		txtPer_Mark=new JTextField();
		txtPer_Mark.setBounds(685, 280,130,30);
		txtPer_Mark.setFont(f);
		txtPer_Mark.setForeground(Color.BLACK);
		frm.add(txtPer_Mark);
		
		lbltech_Knowledge=new JLabel("COMPUTER TECHNICAL KNOWLEDGE");
		lbltech_Knowledge.setBounds(30,320, 200, 30);
		lbltech_Knowledge.setFont(f);
		lbltech_Knowledge.setForeground(Color.BLUE);
		frm.add(lbltech_Knowledge);
		
		
		lblCourse_Name=new JLabel("    COMPUTER COURSE NAME");
		lblCourse_Name.setBounds(30, 360,200, 30);
		lblCourse_Name.setFont(f);
		lblCourse_Name.setForeground(Color.BLUE);
		frm.add(lblCourse_Name);
		
		txtCourse_Name=new JTextField();
		txtCourse_Name.setBounds(30,390,200,30);
		txtCourse_Name.setFont(f);
		txtCourse_Name.setForeground(Color.BLACK);
		frm.add(txtCourse_Name);
		
		txtCourse_Name=new JTextField();
		txtCourse_Name.setBounds(30,420,200,30);
		txtCourse_Name.setFont(f);
		txtCourse_Name.setForeground(Color.BLACK);
		frm.add(txtCourse_Name);

		lblDuration=new JLabel("      DURATION");
		lblDuration.setBounds(230, 360,150, 30);
		lblDuration.setFont(f);
		lblDuration.setForeground(Color.BLUE);
		frm.add(lblDuration);
		
		txtDuration=new JTextField();
		txtDuration.setBounds(230,390,150,30);
		txtDuration.setFont(f);
		txtDuration.setForeground(Color.BLACK);
		frm.add(txtDuration);
		
		txtDuration=new JTextField();
		txtDuration.setBounds(230,420,150,30);
		txtDuration.setFont(f);
		txtDuration.setForeground(Color.BLACK);
		frm.add(txtDuration);
		
		lblInstitute=new JLabel("          INSTITUTE");
		lblInstitute.setBounds(380, 360,200, 30);
		lblInstitute.setFont(f);
		lblInstitute.setForeground(Color.BLUE);
		frm.add(lblInstitute);
		
		txtInstitute=new JTextField();
		txtInstitute.setBounds(380,390,200,30);
		txtInstitute.setFont(f);
		txtInstitute.setForeground(Color.BLACK);
		frm.add(txtInstitute);
		
		txtInstitute=new JTextField();
		txtInstitute.setBounds(380,420,200,30);
		txtInstitute.setFont(f);
		txtInstitute.setForeground(Color.BLACK);
		frm.add(txtInstitute);
		
		lblYear=new JLabel("    Year");
		lblYear.setBounds(580,360,120, 30);
		lblYear.setFont(f);
		lblYear.setForeground(Color.BLUE);
		frm.add(lblYear);
		
		txtYear=new JTextField();
		txtYear.setBounds(580,390,120,30);
		txtYear.setFont(f);
		txtYear.setForeground(Color.BLACK);
		frm.add(txtYear);
		
		txtYear=new JTextField();
		txtYear.setBounds(580,420,120,30);
		txtYear.setFont(f);
		txtYear.setForeground(Color.BLACK);
		frm.add(txtYear);
		
		lblGrade=new JLabel("      GRADE");
		lblGrade.setBounds(700,360,115, 30);
		lblGrade.setFont(f);
		lblGrade.setForeground(Color.BLUE);
		frm.add(lblGrade);
		
		txtGrade=new JTextField();
		txtGrade.setBounds(700,390,115,30);
		txtGrade.setFont(f);
		txtGrade.setForeground(Color.BLACK);
		frm.add(txtGrade);
		
		txtGrade=new JTextField();
		txtGrade.setBounds(700,420,115,30);
		txtGrade.setFont(f);
		txtGrade.setForeground(Color.BLACK);
		frm.add(txtGrade);
		
		lblParents=new JLabel(" PARTICULAR OF THE PARENTS:");
		lblParents.setBounds(20,460,200, 30);
		lblParents.setFont(f);
		lblParents.setForeground(Color.BLUE);
		frm.add(lblParents);
		
		lblFather_Name=new JLabel("Father_Name");
		lblFather_Name.setBounds(30,490,150, 30);
		lblFather_Name.setFont(f);
		lblFather_Name.setForeground(Color.BLUE);
		frm.add(lblFather_Name);
		
		txtFather_Name=new JTextField();
		txtFather_Name.setBounds(170,490,200,30);
		txtFather_Name.setFont(f);
		txtFather_Name.setForeground(Color.BLACK);
		frm.add(txtFather_Name);
		
		lblOccupation=new JLabel("OCCUPATION");
		lblOccupation.setBounds(400,490,150, 30);
		lblOccupation.setFont(f);
		lblOccupation.setForeground(Color.BLUE);
		frm.add(lblOccupation);
		
		txtOccupation=new JTextField();
		txtOccupation.setBounds(540,490,200,30);
		txtOccupation.setFont(f);
		txtOccupation.setForeground(Color.BLACK);
		frm.add(txtOccupation);
		
		lblMobile=new JLabel("MOBILE No");
		lblMobile.setBounds(400,530,150, 30);
		lblMobile.setFont(f);
		lblMobile.setForeground(Color.BLUE);
		frm.add(lblMobile);
		
		txtMobile=new JTextField();
		txtMobile.setBounds(540,530,200,30);
		txtMobile.setFont(f);
		txtMobile.setForeground(Color.BLACK);
		frm.add(txtMobile);
		
		lblAnnual_Income=new JLabel("ANNUAL INCOME");
		lblAnnual_Income.setBounds(30,530,150, 30);
		lblAnnual_Income.setFont(f);
		lblAnnual_Income.setForeground(Color.BLUE);
		frm.add(lblAnnual_Income);
		
		txtAnnual_Income=new JTextField();
		txtAnnual_Income.setBounds(170,530,200,30);
		txtAnnual_Income.setFont(f);
		txtAnnual_Income.setForeground(Color.BLACK);
		frm.add(txtAnnual_Income);
		
		
		
		
		rdYes=new JRadioButton("YES");
		rdYes.setBounds(240,320, 50, 30);
		rdYes.setFont(f);
		rdYes.setForeground(Color.BLUE);
		frm.add(rdYes);
		
		rdNo=new JRadioButton("NO");
		rdNo.setBounds(300,320, 150, 30);
		rdNo.setFont(f);
		rdNo.setForeground(Color.BLUE);
		frm.add(rdNo);
		
		
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
