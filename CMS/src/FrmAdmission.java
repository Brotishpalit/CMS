import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class FrmAdmission  implements WindowListener,ActionListener,FocusListener{

	JFrame frm;
	JButton btnNEW, btnUploade,btnSearch,btnUpdate,btnClear,btnDelete;
	
	JLabel lblEnquiry_Id,lblAdmission_No,lblReligion,lblCategory,lblMartial,lblSemester,lblNationality,
	lblCourse_Title,lblStudent_Name, lblFather_Name, lblDOB, lblAge, lblQualifaction,lblPercentage, lblGender, 
	lblWorking, lblFull_Address, lblParents_Mob, lblStudent_Mob, lblEmailId, lblMode, lblPhoto,lbllogo,
	lblUniversity, lblSource_of_Information, lblDate,lblFamialy_Income;
	
	JTextField txtEnquiry_Id,txtStudent_Name, txtFather_Name, txtDOB, txtQualifaction,
	txtPercentage, txtParents_Mob, txtStudent_Mob, txtEmailId, txtDate,
	txtAdmission_No,txtSemester, txtCourse_Title,txtFamialy_Income,txtNationality;
	
	JComboBox cmbGender, cmbWorking, cmbMode, cmbUniversity, cmbSource_of_Information, 
	cmbCourse_of_Applied,cmbCategory,cmbMartial,cmbReligion;
	
	JTextArea txtFull_Address;
	
	String arr[]={" MALE"," FEMALE"};
	String arr1[]={" YES"," NO"};
	String arr5[]={" Married"," UNMARRIED"};
	String arr6[]={" GEN","OBC","ST","SC"};
	String arr2[]={" REGULAR"," CORRESPONDENCE"};
	String arr7[]={" HINDU"," MUSLIM"," BUDDIST"," SIKH"," JAIN"};
	String arr3[]={" MAGADH UNIVERSITY "," SIKKIM MANIPAL UNIVERSITY ", " OTHER(IN CORRESPONDENCE)"};
	String arr4[]={" STUDENT REFERENCE"," HOARDING"," ONLINE"," RELATIVE"," NEWSPAPER"," OTHER"};
	
	Font f=new Font("Consolas",Font.BOLD,13);
	Image img=new ImageIcon(this.getClass().getResource("/banner1.jpg")).getImage();
	Image img1=new ImageIcon(this.getClass().getResource("/banner 2.jpg")).getImage();
	
	public FrmAdmission(){
		
		
		frm=new JFrame();
		frm.setSize(1100,750);
		frm.setLocation(130, 0);
		frm.setResizable(false);
		Color hexa=Color.decode("#ffe6e6");
		frm.getContentPane().setBackground(hexa);
		frm.setLayout(null);
		
		frm.setTitle("ADMISSION FORM");
		
		lbllogo=new JLabel();
		lbllogo.setBounds(20, 5, 1050, 170);
		lbllogo.setIcon(new ImageIcon(img1));
		frm.add(lbllogo);
		
		lblPhoto=new JLabel();
		lblPhoto.setBounds(900, 270, 170,220 );
		lblPhoto.setIcon(new ImageIcon(img));
		frm.add(lblPhoto);
		
		lblEnquiry_Id=new JLabel("ENQUIRY ID");
		lblEnquiry_Id.setBounds(20, 180, 100, 30);
		lblEnquiry_Id.setFont(f);
		lblEnquiry_Id.setForeground(Color.BLUE);
		frm.add(lblEnquiry_Id);
		
		txtEnquiry_Id=new JTextField();
		txtEnquiry_Id.setBounds(150, 180, 250, 30);
		txtEnquiry_Id.setFont(f);
		txtEnquiry_Id.setForeground(Color.BLACK);
		txtEnquiry_Id.addFocusListener(this);
		frm.add(txtEnquiry_Id);
		
		lblDate=new JLabel("DATE");
		lblDate.setBounds(470, 180, 100, 30);
		lblDate.setFont(f);
		lblDate.setForeground(Color.BLUE);
		frm.add(lblDate);
		
		txtDate=new JTextField();
		txtDate.setBounds(590, 180, 250, 30);
		txtDate.setFont(f);
		txtDate.setForeground(Color.BLACK );
		frm.add(txtDate);
				
		btnUploade=new JButton("UPLOAD");
		btnUploade.setBounds(900, 500, 170, 40);
		btnUploade.setFont(f);
		btnUploade.setForeground(Color.BLUE );
		frm.add(btnUploade);
		btnUploade.addActionListener(this);
		
		
		lblAdmission_No=new JLabel("ADMISSION No");
		lblAdmission_No.setBounds(940, 180, 100, 30);
		lblAdmission_No.setFont(f);
		lblAdmission_No.setForeground(Color.BLUE );
		frm.add(lblAdmission_No);
		
		txtAdmission_No=new JTextField();
		txtAdmission_No.setBounds(900, 210, 170, 30);
		txtAdmission_No.setFont(f);
		txtAdmission_No.setForeground(Color.BLACK );
		frm.add(txtAdmission_No);
		
		
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
		
		txtParents_Mob=new JTextField();
		txtParents_Mob.setBounds(150, 540, 250, 30);
		txtParents_Mob.setFont(f);
		txtParents_Mob.setForeground(Color.BLACK );
		frm.add(txtParents_Mob);
		
		lblStudent_Mob=new JLabel("STUDENT MOB");
		lblStudent_Mob.setBounds(480, 540, 100, 30);
		lblStudent_Mob.setFont(f);
		lblStudent_Mob.setForeground(Color.BLUE );
		frm.add(lblStudent_Mob);
		
		txtStudent_Mob=new JTextField();
		txtStudent_Mob.setBounds(600, 540, 240, 30);
		txtStudent_Mob.setFont(f);
		txtStudent_Mob.setForeground(Color.BLACK );
		frm.add(txtStudent_Mob);
		
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
		
		btnNEW=new JButton("SAVE");
		btnNEW.setBounds(60, 660, 130, 40);
		btnNEW.setFont(f);
		btnNEW.setForeground(Color.BLUE );
		frm.add(btnNEW);
		btnNEW.addActionListener(this);
		
		btnSearch=new JButton("SEARCH");
		btnSearch.setBounds(250, 660, 130, 40);
		btnSearch.setFont(f);
		btnSearch.setForeground(Color.BLUE );
		frm.add(btnSearch);
		btnSearch.addActionListener(this);
		
		btnUpdate=new JButton("EDIT");
		btnUpdate.setBounds(450, 660, 130, 40);
		btnUpdate.setFont(f);
		btnUpdate.setForeground(Color.BLUE );
		frm.add(btnUpdate);
		btnUpdate.addActionListener(this);
		
		
		btnClear=new JButton("CLEAR");
		btnClear.setBounds(650, 660, 130, 40);
		btnClear.setFont(f);
		btnClear.setForeground(Color.BLUE );
		frm.add(btnClear);
		btnClear.addActionListener(this);
		
		btnDelete=new JButton("DELETE");
		btnDelete.setBounds(850, 660, 130, 40);
		btnDelete.setFont(f);
		btnDelete.setForeground(Color.BLUE );
		frm.add(btnDelete);
		btnDelete.addActionListener(this);
		
		

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.addWindowListener(this);
		frm.setVisible(true);
	}

	public static void main(String[] args) {
		new FrmAdmission();
	}
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//JOptionPane.showMessageDialog(null, "hello");
		if(e.getSource().equals(btnNEW)){
			if(e.getActionCommand().equalsIgnoreCase("NEW")){
			//JOptionPane.showMessageDialog(null, "hello");
			txtAdmission_No.setEditable(false);
			/*txtEnquiry_Id.setEditable(true);
			txtCourse_Title.setEditable(false);
			txtDate.setEditable(false);*/
			DFrmAdmission adm=new DFrmAdmission();
			txtAdmission_No.setText(Integer.toString(adm.getAdmissionnumber()));
			setEditable();
			txtAdmission_No.setEditable(false);
			btnUpdate.setEnabled(false);
			btnUpdate.setText("EDIT");
			txtEnquiry_Id.setEditable(true);
			btnNEW.setText("SAVE");
		}else if (e.getActionCommand().equalsIgnoreCase("SAVE")){
				DFrmAdmission adm=new DFrmAdmission();
				int s=adm.insert_record(Integer.parseInt(txtAdmission_No.getText()),Integer.parseInt(txtEnquiry_Id.getText()),
						txtDate.getText().toUpperCase(),txtStudent_Name.getText().toUpperCase(), txtFather_Name.getText().toUpperCase(), txtDOB.getText().toUpperCase(),
						txtNationality.getText().toUpperCase(),cmbGender.getSelectedItem().toString().toUpperCase(),txtQualifaction.getText().toUpperCase(),
						Double.parseDouble((txtPercentage.getText())), cmbWorking.getSelectedItem().toString().toUpperCase(),
						txtCourse_Title.getText().toUpperCase(),txtSemester.getText().toUpperCase(),cmbMartial.getSelectedItem().toString().toUpperCase(),
						cmbCategory.getSelectedItem().toString().toUpperCase(),cmbReligion.getSelectedItem().toString().toUpperCase(),txtFull_Address.getText().toUpperCase(),
						txtEmailId.getText(), txtParents_Mob.getText(), txtStudent_Mob.getText(),cmbMode.getSelectedItem().toString().toUpperCase(),
						cmbUniversity.getSelectedItem().toString().toUpperCase(), cmbSource_of_Information.getSelectedItem().toString().toUpperCase(),
						Integer.parseInt(txtFamialy_Income.getText()));
				
	
			if(s==1){
				JOptionPane.showMessageDialog(null, "SUCESSFULLY INSERTED");
				
				txtAdmission_No.setText(Integer.toString(adm.getAdmissionnumber()));
				new FrmAdmission2();
				
				//btnSave.setText("NEXT");
			}else{
				JOptionPane.showMessageDialog(null, "not INSERTED");
			}
		  }
			
		}else if (e.getSource().equals(btnSearch)){
			if(e.getActionCommand().equalsIgnoreCase("search")){
				setEditable();
					txtEnquiry_Id.setEditable(false);
					txtStudent_Name.setEditable(false);
					txtFather_Name.setEditable(false);
					txtDate.setEditable(false);
					txtDOB.setEditable(false);
					txtNationality.setEditable(false);
					txtSemester.setEditable(false);
					cmbMartial.setEnabled(false);
					cmbCategory.setEnabled(false);
					cmbReligion.setEnabled(false);
					txtQualifaction.setEditable(false);
					txtPercentage.setEditable(false);
					txtFull_Address.setEditable(false);
					txtEmailId.setEditable(false);
					txtParents_Mob.setEditable(false);
					txtStudent_Mob.setEditable(false);
					txtCourse_Title.setEditable(false);
					cmbGender.setEnabled(false);
					cmbWorking.setEnabled(false);
					cmbMode.setEnabled(false);
					cmbUniversity.setEnabled(false);
					cmbSource_of_Information.setEnabled(false);
					txtFamialy_Income.setEditable(false);
			
				//btnUpdate.setEnabled(true);
				btnSearch.setText("FIND");
				txtAdmission_No.setText("");
				txtAdmission_No.setEditable(true);
				txtAdmission_No.grabFocus();
				btnNEW.setText("NEW");
				//btnNEW.setText("NEW");
				
			    }else if(e.getActionCommand().equalsIgnoreCase("FIND")){
				       btnUpdate.setEnabled(true);
				       DFrmAdmission adm=new DFrmAdmission();
				       if(txtAdmission_No.getText().length()>0){
					
				
				    	   ResultSet rs= adm.search_recored(Integer.parseInt(txtAdmission_No.getText()));
				try {
					if(rs.next()){
						txtEnquiry_Id.setText(rs.getString(1));
						txtDate.setText(rs.getString(2));
						txtStudent_Name.setText(rs.getString(3));
						txtFather_Name.setText(rs.getString(4));
						txtDOB.setText(rs.getString(5));
						txtNationality.setText(rs.getString(6));
						if(rs.getString(7).equals("MALE"))
						{
						cmbGender.setSelectedIndex(0);
						}
						else if(rs.getString(7).equals("FEMALE"))
						{
						cmbGender.setSelectedIndex(1);
						}
						cmbGender.setSelectedItem(rs.getString(7));
						txtQualifaction.setText(rs.getString(8));
						txtPercentage.setText(rs.getString(9));
						if(rs.getString(10).equals("YES")){
							cmbWorking.setSelectedIndex(0);
							
						}else if(rs.getString(10).equals("NO")){
							cmbWorking.setSelectedIndex(1);
						}
						cmbWorking.setSelectedItem(rs.getString(10));
						txtCourse_Title.setText(rs.getString(11));
						txtSemester.setText(rs.getString(12));
						if(rs.getString(13).equals("marrid")){
							cmbMartial.setSelectedIndex(0);
							
						}else if(rs.getString(13).equals("UNMARRID")){
							cmbMartial.setSelectedIndex(1);
						}
						cmbMartial.setSelectedItem(rs.getString(13));
						//JOptionPane.showMessageDialog(null, rs.getString(14));
						if(rs.getString(14).equals("GEN")){
							//JOptionPane.showMessageDialog(null, rs.getString(14));
							cmbCategory.setSelectedIndex(0);
						}else if(rs.getString(14).equals("OBC")){
							cmbCategory.setSelectedIndex(1);
							
						}else if(rs.getString(14).equals("ST")){
							cmbCategory.setSelectedIndex(2);
							
						}else if(rs.getString(14).equals("SC")){
							cmbCategory.setSelectedIndex(3);
						}
						cmbCategory.setSelectedItem(rs.getString(14));
						
						if(rs.getString(15).equals("HINDU")){
							cmbReligion.setSelectedIndex(0);
						}else if(rs.getString(15).equals("MUSLIM")){
							cmbReligion.setSelectedIndex(1);
						}else if(rs.getString(15).equals("BUDDIST")){
							cmbReligion.setSelectedIndex(2);
						}else if(rs.getString(15).equals("SIKH")){
							cmbReligion.setSelectedIndex(3);
						}else if(rs.getString(15).equals("JAIN")){
							cmbReligion.setSelectedIndex(4);
						}
						cmbReligion.setSelectedItem(rs.getString(15));
						txtFull_Address.setText(rs.getString(16));
						txtEmailId.setText(rs.getString(17));
						txtParents_Mob.setText(rs.getString(18));
						txtStudent_Mob.setText(rs.getString(19));
						if(rs.getString(20).equals("REGULAR")){
							cmbMode.setSelectedIndex(0);
						}else if(rs.getString(20).equals("CORRESPONDENCE")){
							cmbMode.setSelectedIndex(1);
							}
						cmbMode.setSelectedItem(rs.getString(20));
						if(rs.getString(21).equals("MAGADH UNIVERSITY")){
							cmbUniversity.setSelectedIndex(0);
						}else if(rs.getString(21).equals("SIKKIM MANIPAL UNIVERSITY")){
							cmbUniversity.setSelectedIndex(1);
						}else if(rs.getString(21).equals("OTHER")){
							cmbUniversity.setSelectedIndex(2);
						}
						cmbUniversity.setSelectedItem(rs.getString(21));
						if(rs.getString(22).equals("STUDENT REFERENCE")){
							cmbSource_of_Information.setSelectedIndex(0);
						}else if(rs.getString(22).equals("HOARDING")){
							cmbSource_of_Information.setSelectedIndex(1);
						}else if(rs.getString(22).equals("ONLINE")){
							cmbSource_of_Information.setSelectedIndex(2);
						}else if(rs.getString(22).equals("RELATIVE")){
							cmbSource_of_Information.setSelectedIndex(3);
						}else if(rs.getString(22).equals("NEWSPAPER")){
							cmbSource_of_Information.setSelectedIndex(4);
						}else if(rs.getString(22).equals("OTHER")){
							cmbSource_of_Information.setSelectedIndex(5);
						}
						cmbSource_of_Information.setSelectedItem(rs.getString(22));
						txtFamialy_Income.setText(rs.getString(23));
						
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
			}
			}else if(e.getSource().equals(btnUpdate)){
				if(btnUpdate.getActionCommand().equalsIgnoreCase("EDIT")){
            	  setEditable1();
            	  btnUpdate.setText("UPDATE");
				
			
		
			   }else if(e.getActionCommand().equalsIgnoreCase("UPDATE")){
				     DFrmAdmission adm1 =new DFrmAdmission();
				     int s=adm1.update_record(Integer.parseInt(txtAdmission_No.getText()),
						txtDate.getText().toUpperCase(),txtStudent_Name.getText().toUpperCase(), txtFather_Name.getText().toUpperCase(), 
						txtDOB.getText().toUpperCase(),txtNationality.getText().toUpperCase(),cmbGender.getSelectedItem().toString().toUpperCase(),
						txtQualifaction.getText().toUpperCase(),Double.parseDouble((txtPercentage.getText())),
						cmbWorking.getSelectedItem().toString().toUpperCase(),txtCourse_Title.getText().toUpperCase(),
						txtSemester.getText().toUpperCase(),cmbMartial.getSelectedItem().toString().toUpperCase(),
						cmbCategory.getSelectedItem().toString().toUpperCase(),cmbReligion.getSelectedItem().toString().toUpperCase(),
						txtFull_Address.getText().toUpperCase(),txtEmailId.getText(), txtParents_Mob.getText(), 
						txtStudent_Mob.getText(),cmbMode.getSelectedItem().toString().toUpperCase(),
						cmbUniversity.getSelectedItem().toString().toUpperCase(), cmbSource_of_Information.getSelectedItem().toString().toUpperCase(),
						Integer.parseInt(txtFamialy_Income.getText()));
				JOptionPane.showMessageDialog(null, s);
				if(s==1){
					JOptionPane.showMessageDialog(null, "SUCESSFULLY UPDATED");
					clear();
					//txtEnquiry_Id.setText(Integer.toString(adm1.getAdmissionnumber()));
					btnUpdate.setText("EDIT");
					btnUpdate.setEnabled(false);
				}else{
					JOptionPane.showMessageDialog(null, "NOT UPDATED");
				}
		
	
			}
			
			}else if (e.getSource().equals(btnClear)){
				clear();
			}else if(e.getSource().equals(btnDelete)){
				
	
			}

	}



		
			
		// TODO Auto-generated method stub
		


	private void clear() {
		// TODO Auto-generated method stub
		
			txtStudent_Name.setText("");
			txtFather_Name.setText(null);
			txtDate.setText(null);
			txtDOB.setText(null);
			txtNationality.setText(null);
			txtQualifaction.setText(null);
			txtPercentage.setText(null);
			txtSemester.setText(null);
			txtFamialy_Income.setText(null);
			cmbMartial.setSelectedIndex(-1);
			cmbCategory.setSelectedIndex(-1);
			cmbReligion.setSelectedIndex(-1);			
			txtFull_Address.setText(null);
			txtEmailId.setText(null);
			txtParents_Mob.setText(null);
			txtStudent_Mob.setText(null);
			txtCourse_Title.setText(null);
			cmbGender.setSelectedIndex(-1);
			cmbWorking.setSelectedIndex(-1);
			cmbMode.setSelectedIndex(-1);
			cmbUniversity.setSelectedIndex(-1);
			cmbSource_of_Information.setSelectedIndex(-1);
			
		
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
		txtAdmission_No.setText(Integer.toString(adm.getAdmissionnumber()));
		setEditable();
		txtAdmission_No.setEditable(false);
		btnUpdate.setEnabled(false);
		btnUpdate.setText("EDIT");
		//new DfrmAdmission().getAdmissionnumber();
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
	

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent evt) {
		// TODO Auto-generated method stub
		ResultSet rs;
		DFrmAdmission enq=new DFrmAdmission();
		if(evt.getSource()==txtEnquiry_Id){
		if(txtEnquiry_Id.getText().length()>0){
rs=enq.sec_record(Integer.parseInt(txtEnquiry_Id.getText()));
		
		try {
			if(rs.next()){
				txtStudent_Name.setText(rs.getString(1));
				txtFather_Name.setText(rs.getString(2));
				txtDOB.setText(rs.getString(3));
				//txtAge.setText(rs.getString(4));
				txtQualifaction.setText(rs.getString(5));
				txtPercentage.setText(rs.getString(6));
				if(rs.getString(7).equals("MALE"))
				{
				cmbGender.setSelectedIndex(0);
				}
				else if(rs.getString(7).equals("FEMALE"))
				{
				cmbGender.setSelectedIndex(1);
				}
				cmbGender.setSelectedItem(rs.getString(7));
				if(rs.getString(8).equals("yes"))
				{
				cmbWorking.setSelectedIndex(0);
				}
				else if(rs.getString(8).equals("NO"))
				{
				cmbWorking.setSelectedIndex(1);
				}
				cmbWorking.setSelectedItem(rs.getString(8));
				txtCourse_Title.setText(rs.getString(14));
				txtFull_Address.setText(rs.getString(9));
				txtParents_Mob.setText(rs.getString(10));
				txtStudent_Mob.setText(rs.getString(11));
				if(rs.getString(12).equals("MAGADH UNIVERSITY"))
				{
				cmbUniversity.setSelectedIndex(0);
				}
				else if(rs.getString(12).equals("SIKKIM MANIPAL UNIVERSITY"))
				{
				cmbUniversity.setSelectedIndex(1);
				}
				else if(rs.getString(12).equals("OTHER(IN CORRESPONDENCE")){
				
				cmbUniversity.setSelectedIndex(2);
				}
				cmbUniversity.setSelectedItem(rs.getString(12));
				txtEmailId.setText(rs.getString(13));
				//txtCourse_Interested.setText(rs.getString(14));
				if(rs.getString(15).equals("REGULAR"))
				{
				cmbMode.setSelectedIndex(0);
				}
				else if(rs.getString(15).equals("CORRESPONDENCE"))
				{
				cmbMode.setSelectedIndex(1);
				}
				cmbMode.setSelectedItem(rs.getString(15));
				if(rs.getString(16).equals("STUDENT REFERENCE"))
				{
				cmbSource_of_Information.setSelectedIndex(0);
				}
				else if(rs.getString(16).equals("HOARDING"))
				{
				cmbSource_of_Information.setSelectedIndex(1);
				}
				else if(rs.getString(16).equals("RELATIVE")){
				
					cmbSource_of_Information.setSelectedIndex(2);
					
				}
							
				else if(rs.getString(16).equals("ONLINE")){
					
					cmbSource_of_Information.setSelectedIndex(3);	
				}
			     else if(rs.getString(16).equals("NEWSPAPER")){
					
					cmbSource_of_Information.setSelectedIndex(4);	
				}
			     else if(rs.getString(16).equals("OTHER")){
						
						cmbSource_of_Information.setSelectedIndex(5);	
					}
				cmbSource_of_Information.setSelectedItem(rs.getString(16));
				txtDate.setText(rs.getString(17));
}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		}
}
	public void setEditable1()
	{
		txtStudent_Name.setEditable(true);
		txtFather_Name.setEditable(true);
		txtDate.setEditable(true);
		txtDOB.setEditable(true);
		txtNationality.setEditable(true);
		txtQualifaction.setEditable(true);
		txtPercentage.setEditable(true);
		txtFull_Address.setEditable(true);
		txtEmailId.setEditable(true);
		txtParents_Mob.setEditable(true);
		txtStudent_Mob.setEditable(true);
		txtCourse_Title.setEditable(true);
		txtSemester.setEditable(true);
		cmbMartial.setEnabled(true);
		cmbCategory.setEnabled(true);
		cmbReligion.setEnabled(true);
		cmbGender.setEnabled(true);
		cmbWorking.setEnabled(true);
		cmbMode.setEnabled(true);
		cmbUniversity.setEnabled(true);
		cmbSource_of_Information.setEnabled(true);
		txtFamialy_Income.setEditable(true);
	}

}





                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                