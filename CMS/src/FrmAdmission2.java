import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.ldap.Rdn;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class FrmAdmission2  implements WindowListener,ActionListener {

	
	JFrame frm;
	
	JButton  btnSave, btnSearch,btnUpdate,btnClear,btnDelete;
	
	JRadioButton rdYes, rdNo;
	
	ButtonGroup group;
	
	JLabel lblAddmission_no,lblExam_pass,lblBoard_University,lblSchool_College,lblPassing_Year,
	lblDivision,lblPer_Mark,lblCourse_Name,lblDuration,lblInstitute,lblYear,
	lblGrade,lblParents,lbltech_Knowledge,lbllogo,lblAcadmic_Record,
	lblFather_Name,lblOccupation,lblAnnual_Income,lblMobile;

	JTextField txtAddmission_No,txtExam_pass,txtBoard_University,txtSchool_College,
	txtPassing_Year,txtDivision,txtPer_Mark,txtCourse_Name,
	txtDuration,txtInstitute,txtYear,txtGrade,txtAddmission_No2,txtExam_pass2,txtBoard_University2
	,txtSchool_College2,txtPassing_Year2,txtDivision2,txtPer_Mark2,txtCourse_Name2,
	txtDuration2,txtInstitute2,txtYear2,txtGrade2,txttech_Knowledge,
	txtFather_Name,txtOccupation,txtAnnual_Income,txtMobile;

		
	Font f=new Font("Consolas",Font.BOLD,13);
	Image img=new ImageIcon(this.getClass().getResource("/banner.jpg")).getImage();
		
	public FrmAdmission2(){
		
		
		frm=new JFrame();
		frm.setSize(850,700);
		frm.setLocation(250,10);
		frm.setResizable(false);
		frm.setLayout(null);
		Color hexa=Color.decode("#F7AC8F");
		frm.getContentPane().setBackground(hexa);
		
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
		
		txtAddmission_No2=new JTextField();
		txtAddmission_No2.setBounds(670, 180,150,30);
		txtAddmission_No2.setFont(f);
		txtAddmission_No2.setForeground(Color.BLACK);
		frm.add(txtAddmission_No2);
		
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
		
		txtExam_pass2=new JTextField();
		txtExam_pass2.setBounds(30, 280,135,30);
		txtExam_pass2.setFont(f);
		txtExam_pass2.setForeground(Color.BLACK);
		frm.add(txtExam_pass2);
		
		lblBoard_University=new JLabel(" BOARD/UNIVERSITY");
		lblBoard_University.setBounds(165, 220, 130, 30);
		lblBoard_University.setFont(f);
		lblBoard_University.setForeground(Color.BLUE);
		frm.add(lblBoard_University);
		
		txtBoard_University2=new JTextField();
		txtBoard_University2.setBounds(165, 250,130,30);
		txtBoard_University2.setFont(f);
		txtBoard_University2.setForeground(Color.BLACK);
		frm.add(txtBoard_University2);
		
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
		
		txtSchool_College2=new JTextField();
		txtSchool_College2.setBounds(295, 250,130,30);
		txtSchool_College2.setFont(f);
		txtSchool_College2.setForeground(Color.BLACK);
		frm.add(txtSchool_College2);
		
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
		
		txtPassing_Year2=new JTextField();
		txtPassing_Year2.setBounds(425, 250,130,30);
		txtPassing_Year2.setFont(f);
		txtPassing_Year2.setForeground(Color.BLACK);
		frm.add(txtPassing_Year2);
		
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
		
		txtDivision2=new JTextField();
		txtDivision2.setBounds(555, 250,130,30);
		txtDivision2.setFont(f);
		txtDivision2.setForeground(Color.BLACK);
		frm.add(txtDivision2);
		
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
		
		txtPer_Mark2=new JTextField();
		txtPer_Mark2.setBounds(685, 250,130,30);
		txtPer_Mark2.setFont(f);
		txtPer_Mark2.setForeground(Color.BLACK);
		frm.add(txtPer_Mark2);
		
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
		
		txtCourse_Name2=new JTextField();
		txtCourse_Name2.setBounds(30,420,200,30);
		txtCourse_Name2.setFont(f);
		txtCourse_Name2.setForeground(Color.BLACK);
		frm.add(txtCourse_Name2);

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
		
		txtDuration2=new JTextField();
		txtDuration2.setBounds(230,420,150,30);
		txtDuration2.setFont(f);
		txtDuration2.setForeground(Color.BLACK);
		frm.add(txtDuration2);
		
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
		
		txtInstitute2=new JTextField();
		txtInstitute2.setBounds(380,420,200,30);
		txtInstitute2.setFont(f);
		txtInstitute2.setForeground(Color.BLACK);
		frm.add(txtInstitute2);
		
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
		
		txtYear2=new JTextField();
		txtYear2.setBounds(580,420,120,30);
		txtYear2.setFont(f);
		txtYear2.setForeground(Color.BLACK);
		frm.add(txtYear2);
		
		lblGrade=new JLabel("      GRADE");
		lblGrade.setBounds(700,360,115, 30);
		lblGrade.setFont(f);
		lblGrade.setForeground(Color.BLUE);
		frm.add(lblGrade);
		
		txtGrade2=new JTextField();
		txtGrade2.setBounds(700,390,115,30);
		txtGrade2.setFont(f);
		txtGrade2.setForeground(Color.BLACK);
		frm.add(txtGrade2);
		
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
		
		group= new ButtonGroup();
		rdYes=new JRadioButton("YES");
		rdYes.setBounds(240,320, 50, 30);
		rdYes.setFont(f);
		rdYes.setForeground(Color.BLUE);
		group.add(rdYes);
		frm.add(rdYes);
		
		rdNo=new JRadioButton("NO");
		rdNo.setBounds(300,320,50, 30);
		rdNo.setFont(f);
		rdNo.setForeground(Color.BLUE);
		group.add(rdNo);
		frm.add(rdNo);
		
		btnSave=new JButton("SAVE");
		btnSave.setBounds(30, 600, 130, 40);
		btnSave.setFont(f);
		btnSave.setForeground(Color.BLUE );
		frm.add(btnSave);
		btnSave.addActionListener(this);
		
		btnSearch=new JButton("SEARCH");
		btnSearch.setBounds(200, 600, 130, 40);
		btnSearch.setFont(f);
		btnSearch.setForeground(Color.BLUE );
		frm.add(btnSearch);
		btnSearch.addActionListener(this);
		
		btnUpdate=new JButton("UPDATE");
		btnUpdate.setBounds(360, 600, 130, 40);
		btnUpdate.setFont(f);
		btnUpdate.setForeground(Color.BLUE );
		frm.add(btnUpdate);
		btnUpdate.addActionListener(this);
		
		
		btnClear=new JButton("CLEAR");
		btnClear.setBounds(520, 600, 130, 40);
		btnClear.setFont(f);
		btnClear.setForeground(Color.BLUE );
		frm.add(btnClear);
		btnClear.addActionListener(this);
		
		btnDelete=new JButton("DELETE");
		btnDelete.setBounds(680, 600, 130, 40);
		btnDelete.setFont(f);
		btnDelete.setForeground(Color.BLUE );
		frm.add(btnDelete);
		btnDelete.addActionListener(this);
		
		
		
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
		DFrmAdmission adm=new DFrmAdmission();
		txtAddmission_No2.setText(Integer.toString(adm.getAdmissionnumber()));
        txtAddmission_No2.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(btnSave)){
			if(e.getActionCommand().equalsIgnoreCase("NEW")){
				
				txtAddmission_No2.setEditable(false);
				DFrmAdmission adm=new DFrmAdmission();
				txtAddmission_No2.setText(Integer.toString(adm.getAdmissionnumber()));
				seteditable();
				btnUpdate.setEnabled(false);
				btnUpdate.setText("EDIT");
				btnSave.setText("SAVE");
			}else if(e.getActionCommand().equalsIgnoreCase("Save")){
			DFrmAdmission2 adm =new DFrmAdmission2();
			int s=adm.insert_recored(Integer.parseInt(txtAddmission_No.getText()), txtExam_pass.getText().toString().toUpperCase(),
					txtBoard_University.getText().toString().toUpperCase(),txtSchool_College.getText().toString().toUpperCase(),
					txtYear.getText().toString().toUpperCase(),txtDivision.getText().toString().toUpperCase(),Integer.parseInt(txtPer_Mark.getText()),
					txtExam_pass2.getText().toString().toUpperCase(),txtBoard_University2.getText().toString().toUpperCase(),
					txtSchool_College2.getText().toString().toUpperCase(),txtYear2.getText().toString().toUpperCase(),txtDivision2.getText().toString().toUpperCase(),
					Integer.parseInt(txtPer_Mark2.getText()),txttech_Knowledge.getText().toString().toUpperCase(),txtCourse_Name.getText().toString().toUpperCase(),
					txtDuration.getText().toString().toUpperCase(),txtInstitute.getText().toString().toUpperCase(),
					txtYear.getText().toString().toUpperCase(),txtGrade.getText().toString().toUpperCase(),txtCourse_Name2.getText().toString().toUpperCase(),
					txtDuration2.getText().toString().toUpperCase(),txtInstitute2.getText().toString().toUpperCase(),
					txtYear2.getText().toString().toUpperCase(),txtGrade2.getText().toString().toUpperCase(),txtFather_Name.getText().toString().toUpperCase(),
					txtOccupation.getText().toString().toUpperCase(),Integer.parseInt(txtAnnual_Income.getText()),
					Integer.parseInt(txtMobile.getText()));
			if(s==1){
				JOptionPane.showMessageDialog(null, "SUCESSFULLY INSERTED");
				DFrmAdmission adm1=new DFrmAdmission();
				txtAddmission_No2.setText(Integer.toString(adm1.getAdmissionnumber()));
				
				
			}else{
				JOptionPane.showMessageDialog(null, "NOT INSERTED");
			}
		  }
			
		}else if (e.getSource().equals(btnSearch)){
			if(e.getActionCommand().equalsIgnoreCase("search")){
				btnSearch.setText("FIND");
				seteditable();
				//btnSearch.setText("FIND");
				txtAddmission_No2.setText("");
				txtAddmission_No2.setEditable(true);
				txtAddmission_No2.grabFocus();
				btnSave.setText("NEW");
			}else if(e.getActionCommand().equalsIgnoreCase("FIND")){
				 btnUpdate.setEnabled(true);
			       DFrmAdmission adm=new DFrmAdmission();
			       if(txtAddmission_No2.getText().length()>0){
			    	   ResultSet rs= adm.search_recored(Integer.parseInt(txtAddmission_No2.getText()));
			    	   try {
						if(rs.next()){
							    txtExam_pass.setText(rs.getString(2));
							   txtBoard_University.setText(rs.getString(3));
								txtSchool_College.setText(rs.getString(4));
								txtYear.setText(rs.getString(5));
								txtDivision.setText(rs.getString(6));
								txtPer_Mark.setText(rs.getString(7));
								txtExam_pass2.setText(rs.getString(8));
								txtBoard_University2.setText(rs.getString(9));
								txtSchool_College2.setText(rs.getString(10));
								txtYear2.setText(rs.getString(11));
								txtDivision2.setText(rs.getString(12));
								txtPer_Mark2.setText(rs.getString(13));
								txttech_Knowledge.setText(rs.getString(14));
								txtCourse_Name.setText(rs.getString(15));
								txtDuration.setText(rs.getString(16));
								txtInstitute.setText(rs.getString(17));
								txtYear.setText(rs.getString(18));
								txtGrade.setText(rs.getString(19));
								txtCourse_Name2.setText(rs.getString(20));
								txtDuration2.setText(rs.getString(21));
								txtInstitute2.setText(rs.getString(22));
								txtYear2.setText(rs.getString(23));
								txtGrade2.setText(rs.getString(24));
								txtFather_Name.setText(rs.getString(25));
								txtOccupation.setText(rs.getString(26));
								txtAnnual_Income.setText(rs.getString(27));
								txtMobile.setText(rs.getString(28));
							
						   }
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			       }
				
			}
		}else if(e.getSource().equals(btnUpdate)){
			if(e.getActionCommand().equalsIgnoreCase("EDIT")){
				setenabled();
			}else if(e.getActionCommand().equalsIgnoreCase("UPDATE")){
				DFrmAdmission2 adm =new DFrmAdmission2();
				int s=adm.update_recoread(Integer.parseInt(txtAddmission_No.getText()), txtExam_pass.getText().toString().toUpperCase(),
						txtBoard_University.getText().toString().toUpperCase(),txtSchool_College.getText().toString().toUpperCase(),
						txtYear.getText().toString().toUpperCase(),txtDivision.getText().toString().toUpperCase(),Integer.parseInt(txtPer_Mark.getText()),
						txtExam_pass2.getText().toString().toUpperCase(),txtBoard_University2.getText().toString().toUpperCase(),
						txtSchool_College2.getText().toString().toUpperCase(),txtYear2.getText().toString().toUpperCase(),txtDivision2.getText().toString().toUpperCase(),
						Integer.parseInt(txtPer_Mark2.getText()),txttech_Knowledge.getText().toString().toUpperCase(),txtCourse_Name.getText().toString().toUpperCase(),
						txtDuration.getText().toString().toUpperCase(),txtInstitute.getText().toString().toUpperCase(),
						txtYear.getText().toString().toUpperCase(),txtGrade.getText().toString().toUpperCase(),txtCourse_Name2.getText().toString().toUpperCase(),
						txtDuration2.getText().toString().toUpperCase(),txtInstitute2.getText().toString().toUpperCase(),
						txtYear2.getText().toString().toUpperCase(),txtGrade2.getText().toString().toUpperCase(),txtFather_Name.getText().toString().toUpperCase(),
						txtOccupation.getText().toString().toUpperCase(),Integer.parseInt(txtAnnual_Income.getText()),
						Integer.parseInt(txtMobile.getText()));
				if(s==1){
					JOptionPane.showMessageDialog(null, "SUCESSFULLY UPDATE");
					/*DfrmAdmission adm1=new DfrmAdmission();
					txtAddmission_No2.setText(Integer.toString(adm1.getAdmissionnumber()));*/
					btnUpdate.setText("EDIT");
					btnUpdate.setEnabled(false);
					
				}else{
					JOptionPane.showMessageDialog(null, "NOT UPDATE");
				}
			}
		}else if(e.getSource().equals(btnClear)){
			clear();
		}else if(e.getSource().equals(btnDelete)){
			DFrmAdmission2 adm=new DFrmAdmission2();
			ResultSet s =adm.delete_reacored(Integer.parseInt(txtAddmission_No2.getText()));
			
		}
	}
	public void seteditable(){
		txtAddmission_No.setEditable(true);
		txtExam_pass.setEditable(false);
		txtBoard_University.setEditable(false);
		txtSchool_College.setEditable(false);
		txtYear.setEditable(false);
		txtDivision.setEditable(false);
		txtPer_Mark.setEditable(false);
		txtExam_pass2.setEditable(false);
		txtBoard_University2.setEditable(false);
		txtSchool_College2.setEditable(false);
		txtYear2.setEditable(false);
		txtDivision2.setEditable(false);
		txtPer_Mark2.setEditable(false);
		txttech_Knowledge.setEditable(false);
		txtCourse_Name.setEditable(false);
		txtDuration.setEditable(false);
		txtInstitute.setEditable(false);
		txtYear.setEditable(false);
		txtGrade.setEditable(false);
		txtCourse_Name2.setEditable(false);
		txtDuration2.setEditable(false);
		txtInstitute2.setEditable(false);
		txtYear2.setEditable(false);
		txtGrade2.setEditable(false);
		txtFather_Name.setEditable(false);
		txtOccupation.setEditable(false);
		txtAnnual_Income.setEditable(false);
		txtMobile.setEditable(false);
	}
	public void setenabled(){
		txtAddmission_No.setEditable(false);
		txtExam_pass.setEditable(true);
		txtBoard_University.setEditable(true);
		txtSchool_College.setEditable(true);
		txtYear.setEditable(true);
		txtDivision.setEditable(true);
		txtPer_Mark.setEditable(true);
		txtExam_pass2.setEditable(true);
		txtBoard_University2.setEditable(true);
		txtSchool_College2.setEditable(true);
		txtYear2.setEditable(true);
		txtDivision2.setEditable(true);
		txtPer_Mark2.setEditable(true);
		txttech_Knowledge.setEditable(true);
		txtCourse_Name.setEditable(true);
		txtDuration.setEditable(true);
		txtInstitute.setEditable(true);
		txtYear.setEditable(true);
		txtGrade.setEditable(true);
		txtCourse_Name2.setEditable(true);
		txtDuration2.setEditable(true);
		txtInstitute2.setEditable(true);
		txtYear2.setEditable(true);
		txtGrade2.setEditable(true);
		txtFather_Name.setEditable(true);
		txtOccupation.setEditable(true);
		txtAnnual_Income.setEditable(true);
		txtMobile.setEditable(true);
	}
	
	private void clear() {
		txtExam_pass.setText(null);
		txtBoard_University.setText(null);
		txtSchool_College.setText(null);
		txtYear.setText(null);
		txtDivision.setText(null);
		txtPer_Mark.setText(null);
		txtExam_pass2.setText(null);
		txtBoard_University2.setText(null);
		txtSchool_College2.setText(null);
		txtYear2.setText(null);
		txtDivision2.setText(null);
		txtPer_Mark2.setText(null);
		txttech_Knowledge.setText(null);
		txtCourse_Name.setText(null);
		txtDuration.setText(null);
		txtInstitute.setText(null);
		txtYear.setText(null);
		txtGrade.setText(null);
		txtCourse_Name2.setText(null);
		txtDuration2.setText(null);
		txtInstitute2.setText(null);
		txtYear2.setText(null);
		txtGrade2.setText(null);
		txtFather_Name.setText(null);
		txtOccupation.setText(null);
		txtAnnual_Income.setText(null);
		txtMobile.setText(null);
	}
}
