import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class FrmAdmission  implements WindowListener,ActionListener{

	JFrame frm;
	JButton btnSave, btnUploade;
	
	JLabel lblEnquiry_Id,lblAdmission_No,lblReligion,lblCategory,lblMartial,lblSemester,lblNationality,
	lblCourse_Title,lblStudent_Name, lblFather_Name, lblDOB, lblAge, lblQualifaction,lblPercentage, lblGender, 
	lblWorking, lblFull_Address, lblParents_Mob, lblStudent_Mob, lblEmailId, lblMode, lblPhoto,lbllogo,
	lblUniversity, lblSource_of_Information, lblDate,lblFamialy_Income;
	
	JTextField txtEnquiry_Id,txtStudent_Name, txtFather_Name, txtDOB, txtQualifaction,
	txtPercentage, txtParents_Mob, txtStudent_Mob, txtEmailId, txtDate,
	txtAdmission_No,txtSemester, txtCourse_Title,txtFamialy_Income,txtNationality;
	
	JComboBox cmbGender, cmbWorking, cmbMode, cmbUniversity, cmbSource_of_Information, 
	cmbCourse_of_Applied,cmbCategory,cmbMartial,cmbReligion;
	
	JFormattedTextField curdate;
	MaskFormatter mf1,mf2,mf3;
	
	
	JTextArea txtFull_Address;
	
	String arr[]={" MALE"," FEMALE"};
	String arr1[]={" YES"," NO"};
	String arr5[]={" Married"," UNMARRIED"};
	String arr6[]={" Gen"," OBC"," ST"," SC"};
	String arr2[]={" REGULAR"," CORRESPONDENCE"};
	String arr7[]={" HINDU"," MUSLIM"," BUDDIST"," SIKH"," JAIN"};
	String arr3[]={" MAGADH UNIVERSITY "," SIKKIM MANIPAL UNIVERSITY ", " OTHER(IN CORRESPONDENCE)"};
	String arr4[]={" STUDENT REFERENCE"," HOARDING"," ONLINE"," RELATIVE"," NEWSPAPER"," OTHER"};
	
	Font f=new Font("Consolas",Font.BOLD,13);
	Image img=new ImageIcon(this.getClass().getResource("/banner1.jpg")).getImage();
	Image img1=new ImageIcon(this.getClass().getResource("/banner 2.jpg")).getImage();
	
	public FrmAdmission() throws ParseException{
		
		
		frm=new JFrame();
		frm.setSize(1100,750);
		frm.setLocation(130, 0);
		frm.setResizable(false);
		frm.setLayout(null);
		
		frm.setTitle("ADMISSION FORM");
		
		lblEnquiry_Id=new JLabel("ENQUIRY ID");
		lblEnquiry_Id.setBounds(20, 180, 100, 30);
		lblEnquiry_Id.setFont(f);
		lblEnquiry_Id.setForeground(Color.BLUE);
		frm.add(lblEnquiry_Id);
		
		txtEnquiry_Id=new JTextField();
		txtEnquiry_Id.setBounds(150, 180, 250, 30);
		txtEnquiry_Id.setFont(f);
		txtEnquiry_Id.setForeground(Color.BLACK);
		frm.add(txtEnquiry_Id);
		
		lblDate=new JLabel("DATE");
		lblDate.setBounds(470, 180, 100, 30);
		lblDate.setFont(f);
		lblDate.setForeground(Color.BLUE);
		frm.add(lblDate);
		
		
		String timestamp=new SimpleDateFormat("dd/MMM/yyyy").format(Calendar.getInstance().getTime());
		
		mf1=new MaskFormatter("##/UUU/####");
		mf1.setPlaceholderCharacter('_');
		curdate=new JFormattedTextField(mf1);
		curdate.setBounds(590, 180, 250, 30);
		curdate.setFont(f);
		curdate.setForeground(Color.BLACK );
		curdate.setText(timestamp);
		curdate.setEditable(true);
		frm.add(curdate);
		
		
		
		
		lbllogo=new JLabel();
		lbllogo.setBounds(20, 5, 1050, 170);
		lbllogo.setIcon(new ImageIcon(img1));
		frm.add(lbllogo);
		
		lblPhoto=new JLabel();
		lblPhoto.setBounds(900, 270, 170,220 );
		lblPhoto.setIcon(new ImageIcon(img));
		frm.add(lblPhoto);
		
		btnUploade=new JButton("UPLOAD");
		btnUploade.setBounds(900, 500, 170, 40);
		btnUploade.setFont(f);
		btnUploade.setForeground(Color.BLUE );
		frm.add(btnUploade);
		btnUploade.addActionListener(this);
		
		lblStudent_Name=new JLabel("STUDENT NAME");
		lblStudent_Name.setBounds(20, 220, 100, 30);
		lblStudent_Name.setFont(f);
		lblStudent_Name.setForeground(Color.BLUE );
		frm.add(lblStudent_Name);
		
		txtStudent_Name=new JTextField();
		txtStudent_Name.setBounds(150, 220, 250, 30);
		txtStudent_Name.setFont(f);
		txtStudent_Name.setForeground(Color.BLACK );
		frm.add(txtStudent_Name);
		
		lblFather_Name=new JLabel("FATHER NAME");
		lblFather_Name.setBounds(470, 220, 100, 30);
		lblFather_Name.setFont(f);
		lblFather_Name.setForeground(Color.BLUE );
		frm.add(lblFather_Name);
		
		txtFather_Name=new JTextField();
		txtFather_Name.setBounds(590, 220, 250, 30);
		txtFather_Name.setFont(f);
		txtFather_Name.setForeground(Color.BLACK );
		frm.add(txtFather_Name);
		
		lblDOB=new JLabel("DATE OF BIRTH");
		lblDOB.setBounds(20, 260, 100, 30);
		lblDOB.setFont(f);
		lblDOB.setForeground(Color.BLUE );
		frm.add(lblDOB);
		
		txtDOB=new JTextField();
		txtDOB.setBounds(150, 260, 250, 30);
		txtDOB.setFont(f);
		txtDOB.setForeground(Color.BLACK );
		frm.add(txtDOB);
			
		lblGender=new JLabel("GENDER");
		lblGender.setBounds(680, 260, 70, 30);
		lblGender.setFont(f);
		lblGender.setForeground(Color.BLUE );
		frm.add(lblGender);
		
		cmbGender=new JComboBox(arr);
		cmbGender.setBounds(750, 260, 90, 30);
		cmbGender.setFont(f);
		cmbGender.setForeground(Color.BLACK);
		frm.add(cmbGender);
		
		lblNationality=new JLabel("NATIONAITY");
		lblNationality.setBounds(470, 260, 100, 30);
		lblNationality.setFont(f);
		lblNationality.setForeground(Color.BLUE );
		frm.add(lblNationality);
		
		txtNationality=new JTextField();
		txtNationality.setBounds(590, 260,75, 30);
		txtNationality.setFont(f);
		frm.add(txtNationality);
				
		lblQualifaction=new JLabel("QUALIFACTION");
		lblQualifaction.setBounds(20, 300, 100, 30);
		lblQualifaction.setFont(f);
		frm.add(lblQualifaction);
		lblQualifaction.setForeground(Color.BLUE );
		
		txtQualifaction=new JTextField();
		txtQualifaction.setBounds(150, 300, 250, 30);
		txtQualifaction.setFont(f);
		txtQualifaction.setForeground(Color.BLACK );
		frm.add(txtQualifaction);
		
		lblPercentage=new JLabel("PERCENTAGE");
		lblPercentage.setBounds(470, 300, 100, 30);
		lblPercentage.setFont(f);
		lblPercentage.setForeground(Color.BLUE );
		frm.add(lblPercentage);
		
		txtPercentage=new JTextField();
		txtPercentage.setBounds(590, 300, 75, 30);
		txtPercentage.setFont(f);
		txtPercentage.setForeground(Color.BLACK );
		frm.add(txtPercentage);
		
		lblCourse_Title=new JLabel("COURSE TITLE");
		lblCourse_Title.setBounds(20, 340, 100, 30);
		lblCourse_Title.setFont(f);
		lblCourse_Title.setForeground(Color.BLUE );
		frm.add(lblCourse_Title);
		
		txtCourse_Title=new JTextField();
		txtCourse_Title.setBounds(150, 340, 250, 30);
		txtCourse_Title.setFont(f);
		txtCourse_Title.setForeground(Color.BLACK );
		frm.add(txtCourse_Title);
		
		lblSemester=new JLabel("SEMESTER");
		lblSemester.setBounds(470, 340, 100, 30);
		lblSemester.setFont(f);
		lblSemester.setForeground(Color.BLUE );
		frm.add(lblSemester);
		
		txtSemester=new JTextField();
		txtSemester.setBounds(590, 340, 250, 30);
		txtSemester.setFont(f);
		txtSemester.setForeground(Color.BLACK );
		frm.add(txtSemester);
		
		lblWorking=new JLabel("WORKING");
		lblWorking.setBounds(680, 300, 70, 30);
		lblWorking.setFont(f);
		lblWorking.setForeground(Color.BLUE );
		frm.add(lblWorking);
		
		cmbWorking=new JComboBox(arr1);
		cmbWorking.setBounds(750, 300, 90, 30);
		cmbWorking.setFont(f);
		cmbWorking.setForeground(Color.BLACK );
		frm.add(cmbWorking);
		
		lblMartial=new JLabel("MARTIAL STATUS");
		lblMartial.setBounds(20, 390,100, 30);
		lblMartial.setFont(f);
		lblMartial.setForeground(Color.BLUE );
		frm.add(lblMartial);
		
		cmbMartial=new JComboBox(arr5);
		cmbMartial.setBounds(150, 390, 100, 30);
		cmbMartial.setFont(f);
		cmbMartial.setForeground(Color.BLACK );
		frm.add(cmbMartial);
		
		lblCategory=new JLabel("CATEGORY");
		lblCategory.setBounds(290, 390, 100, 30);
		lblCategory.setFont(f);
		lblCategory.setForeground(Color.BLUE );
		frm.add(lblCategory);
		
		cmbCategory=new JComboBox(arr6);
		cmbCategory.setBounds(380, 390, 100, 30);
		cmbCategory.setFont(f);
		cmbCategory.setForeground(Color.BLACK );
		frm.add(cmbCategory);
		
		
		lblReligion=new JLabel("RELIGON");
		lblReligion.setBounds(520, 390, 100, 30);
		lblReligion.setFont(f);
		lblReligion.setForeground(Color.BLUE );
		frm.add(lblReligion);
		
		cmbReligion=new JComboBox(arr7);
		cmbReligion.setBounds(620, 390, 100, 30);
		cmbReligion.setFont(f);
		cmbReligion.setForeground(Color.BLACK );
		frm.add(cmbReligion);
		
		lblFull_Address=new JLabel("FULL ADDRESS");
		lblFull_Address.setBounds(20, 430, 100, 30);
		lblFull_Address.setFont(f);
		lblFull_Address.setForeground(Color.BLUE );
		frm.add(lblFull_Address);
		
		txtFull_Address=new JTextArea();
		txtFull_Address.setBounds(150, 430, 690, 60);
		txtFull_Address.setFont(f);
		txtFull_Address.setForeground(Color.BLACK );
		frm.add(txtFull_Address);
		
		lblEmailId=new JLabel("E-Mail ID");
		lblEmailId.setBounds(20, 500, 100, 30);
		lblEmailId.setFont(f);
		lblEmailId.setForeground(Color.BLUE );
		frm.add(lblEmailId);
		
		txtEmailId=new JTextField();
		txtEmailId.setBounds(150, 500, 690, 30);
		txtEmailId.setFont(f);
		txtEmailId.setForeground(Color.BLACK );
		frm.add(txtEmailId);
		
		lblParents_Mob=new JLabel("PARENT'S MOB");
		lblParents_Mob.setBounds(20, 540, 100, 30);
		lblParents_Mob.setFont(f);
		lblParents_Mob.setForeground(Color.BLUE );
		frm.add(lblParents_Mob);
		
		
		mf3=new MaskFormatter("(+##) ##########");
		curdate.setForeground(Color.BLACK );
		curdate=new JFormattedTextField(mf3);
		curdate.setBounds(150, 540, 250, 30);
		curdate.setFont(f);
		frm.add(curdate);
				
		
		lblStudent_Mob=new JLabel("STUDENT MOB");
		lblStudent_Mob.setBounds(480, 540, 100, 30);
		lblStudent_Mob.setFont(f);
		lblStudent_Mob.setForeground(Color.BLUE );
		frm.add(lblStudent_Mob);
	
		mf2=new MaskFormatter("(+##) ##########");
		curdate.setForeground(Color.BLACK );
		curdate=new JFormattedTextField(mf2);
		curdate.setBounds(600, 540, 240, 30);
		curdate.setFont(f);
	
		frm.add(curdate);
		
		lblMode=new JLabel("MODE");
		lblMode.setBounds(20, 580, 200, 30);
		lblMode.setFont(f);
		lblMode.setForeground(Color.BLUE );
		frm.add(lblMode);
		
		cmbMode=new JComboBox(arr2);
		cmbMode.setBounds(150, 580, 250, 30);
		cmbMode.setFont(f);
		cmbMode.setForeground(Color.BLACK );
		frm.add(cmbMode);
		
		lblUniversity=new JLabel("UNIVERSITY");
		lblUniversity.setBounds(480, 580, 100, 30);
		lblUniversity.setFont(f);
		lblUniversity.setForeground(Color.BLUE );
		frm.add(lblUniversity);
		
		cmbUniversity=new JComboBox(arr3);
		cmbUniversity.setBounds(600, 580, 240, 30);
		cmbUniversity.setFont(f);
		cmbUniversity.setForeground(Color.BLACK );
		frm.add(cmbUniversity);
		
		lblSource_of_Information=new JLabel("SOURCE OF INFO");
		lblSource_of_Information.setBounds(20, 620, 200, 30);
		lblSource_of_Information.setFont(f);
		lblSource_of_Information.setForeground(Color.BLUE );
		frm.add(lblSource_of_Information);
		
		cmbSource_of_Information=new JComboBox(arr4);
		cmbSource_of_Information.setBounds(150, 620, 250, 25);
		cmbSource_of_Information.setFont(f);
		cmbSource_of_Information.setForeground(Color.black );
		frm.add(cmbSource_of_Information);
		
		lblFamialy_Income=new JLabel("FAMILY INCOME");
		lblFamialy_Income.setBounds(480, 620, 100, 30);
		lblFamialy_Income.setFont(f);
		lblFamialy_Income.setForeground(Color.BLUE );
		frm.add(lblFamialy_Income);
		
		txtFamialy_Income=new JTextField();
		txtFamialy_Income.setBounds(600, 620, 240, 30);
		txtFamialy_Income.setFont(f);
		txtFamialy_Income.setForeground(Color.BLACK );
		frm.add(txtFamialy_Income);
		
		btnSave=new JButton("NEXT");
		btnSave.setBounds(150, 660, 120, 40);
		btnSave.setFont(f);
		btnSave.setForeground(Color.BLUE );
		frm.add(btnSave);
		btnSave.addActionListener(this);
		
	

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.addWindowListener(this);
		frm.setVisible(true);
	}

	public static void main(String[] args) throws ParseException {
		new FrmAdmission();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
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
		setEditable();
	}
	public void setEditable()
	{
		
		cmbGender.setSelectedIndex(-1);
		cmbWorking.setSelectedIndex(-1);
		cmbCategory.setSelectedIndex(-1);
		cmbMartial.setSelectedIndex(-1);
		cmbReligion.setSelectedIndex(-1);
		cmbMode.setSelectedIndex(-1);
		cmbUniversity.setSelectedIndex(-1);
		cmbSource_of_Information.setSelectedIndex(-1); 
		
	}

}