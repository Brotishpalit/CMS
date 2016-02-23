

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FrmEnquiry implements WindowListener,ActionListener{
	JFrame frm;
	JButton btnNew, btnUpdate, btnSearch, btnClear;
	
	JLabel lblEnquiry_Id,lblStudent_Name, lblFather_Name, lblDOB, lblAge, lblQualifaction,lblPercentage, lblGender, 
	lblWorking, lblFull_Address, lblParents_Mob, lblStudent_Mob, lblEmailId, lblMode, 
	lblUniversity, lblSource_of_Information, lblDate, lblCourse_Interested,lbllogo;
	
	JTextField txtEnquiry_Id,txtStudent_Name, txtFather_Name, txtDOB, txtAge, txtQualifaction,
	txtPercentage, txtParents_Mob, txtStudent_Mob, txtEmailId, txtDate,txtCourse_Interested;
	
	JComboBox cmbGender, cmbWorking, cmbMode, cmbUniversity, cmbSource_of_Information;
		
	JFormattedTextField curdate;
	MaskFormatter mf1,mf2,mf3;
	
	JTextArea txtFull_Address;
	
	String arr[]={" MALE"," FEMALE"};
	String arr1[]={" YES"," NO"};
	String arr2[]={" REGULAR"," CORRESPONDENCE"};
	String arr3[]={" MAGADH UNIVERSITY "," SIKKIM MANIPAL UNIVERSITY ", " OTHER(IN CORRESPONDENCE)"};
	String arr4[]={" STUDENT REFERENCE"," HOARDING"," ONLINE"," RELATIVE"," NEWSPAPER"," OTHER"};
	
	public String getLabelText(String message){
		return "<html><p bgcolor=\"25948F\"><font color=\"ffffff\" style=\"font-size: 12px;\" face=\"Calibri\">&nbsp;&nbsp; " + message + " &nbsp;&nbsp; " + "</font></p></html>";
	}
	
public FrmEnquiry () {
		Font f=new Font("Consolas",Font.BOLD,12);
		Image img=new ImageIcon(this.getClass().getResource("/banner.jpg")).getImage();
		Image img1=new ImageIcon(this.getClass().getResource("/1R58bi61.jpg")).getImage();
		frm=new JFrame();

		frm.setSize(850,700);
		frm.setLocation(240, 15);
		frm.setResizable(false);
		frm.setLayout(null);
		frm.setTitle("Enquiry");
		frm.setBackground(Color.blue);
		frm.addWindowListener(this);
		
		lblEnquiry_Id=new JLabel("ENQUIRY ID");
		lblEnquiry_Id.setBounds(20, 180, 100, 30);
		lblEnquiry_Id.setFont(f);
		lblEnquiry_Id.setForeground(Color.BLUE );
		frm.add(lblEnquiry_Id);
		
		txtEnquiry_Id=new JTextField();
		txtEnquiry_Id.setBounds(150, 180, 250, 30);
		txtEnquiry_Id.setFont(f);
		txtEnquiry_Id.setForeground(Color.black );
		txtEnquiry_Id.setToolTipText(getLabelText("Your Unique ID"));
		frm.add(txtEnquiry_Id);
		
		
		lblDate=new JLabel("DATE");
		lblDate.setBounds(450, 180, 100, 30);
		lblDate.setFont(f);
		lblDate.setForeground(Color.BLUE );
		frm.add(lblDate);
		
String timestamp=new SimpleDateFormat("dd/MMM/yyyy").format(Calendar.getInstance().getTime());
		
		try {
			mf1=new MaskFormatter("  ##/UUU/#### ");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mf1.setPlaceholderCharacter('_');
		curdate=new JFormattedTextField(mf1);
		curdate.setBounds(570, 180, 250, 30);
		curdate.setFont(f);
		curdate.setForeground(Color.BLACK );
		curdate.setText(timestamp);
		curdate.setEditable(true);
		frm.add(curdate);
		
		lblStudent_Name=new JLabel("STUDENT NAME");
		lblStudent_Name.setBounds(20, 220, 100, 30);
		lblStudent_Name.setFont(f);
		lblStudent_Name.setForeground(Color.BLUE );
		frm.add(lblStudent_Name);
		
		txtStudent_Name=new JTextField();
		txtStudent_Name.setBounds(150, 220, 250, 30);
		txtStudent_Name.setFont(f);
		txtStudent_Name.setToolTipText(getLabelText("Student Name"));
		frm.add(txtStudent_Name);
		
		lblFather_Name=new JLabel("FATHER NAME");
		lblFather_Name.setBounds(450, 220, 100, 30);
		lblFather_Name.setFont(f);
		lblFather_Name.setForeground(Color.BLUE );
		frm.add(lblFather_Name);
		
		txtFather_Name=new JTextField();
		txtFather_Name.setBounds(570, 220, 250, 30);
		txtFather_Name.setFont(f);
		txtFather_Name.setToolTipText(getLabelText("Father Name"));
		frm.add(txtFather_Name);
		
		lblDOB=new JLabel("DATE OF BIRTH");
		lblDOB.setBounds(20, 260, 100, 30);
		lblDOB.setFont(f);
		lblDOB.setForeground(Color.BLUE );
		frm.add(lblDOB);
		
		txtDOB=new JTextField();
		txtDOB.setBounds(150, 260, 250, 30);
		txtDOB.setFont(f);
		txtDOB.setToolTipText(getLabelText("Insert Your Date Of Birth"));
		frm.add(txtDOB);
		
		lblAge=new JLabel("AGE");
		lblAge.setBounds(450, 260, 100, 30);
		lblAge.setFont(f);
		lblAge.setForeground(Color.BLUE );
		frm.add(lblAge);
		
		txtAge=new JTextField();
		txtAge.setBounds(570, 260, 50, 30);
		txtAge.setFont(f);
		txtAge.setToolTipText(getLabelText("YOUR CURRENT AGE"));
		frm.add(txtAge);
		
		lblGender=new JLabel("GENDER");
		lblGender.setBounds(640, 260, 70, 30);
		lblGender.setFont(f);
		lblGender.setForeground(Color.BLUE );
		frm.add(lblGender);
		
		cmbGender=new JComboBox(arr);
		cmbGender.setBounds(730, 260, 90, 30);
		cmbGender.setFont(f);
		cmbGender.setToolTipText(getLabelText("SELECT YOUR GENDER"));
		frm.add(cmbGender);
		
		lblQualifaction=new JLabel("QUALIFACTION");
		lblQualifaction.setBounds(20, 300, 100, 30);
		lblQualifaction.setFont(f);
		lblQualifaction.setForeground(Color.BLUE );
		frm.add(lblQualifaction);
		
		txtQualifaction=new JTextField();
		txtQualifaction.setBounds(150, 300, 250, 30);
		txtQualifaction.setFont(f);
		txtQualifaction.setToolTipText(getLabelText("Your Last Qualifaction"));
		frm.add(txtQualifaction);
		
		lblPercentage=new JLabel("PERCENTAGE");
		lblPercentage.setBounds(450, 300, 100, 30);
		lblPercentage.setFont(f);
		lblPercentage.setForeground(Color.BLUE );
		frm.add(lblPercentage);
		
		txtPercentage=new JTextField();
		txtPercentage.setBounds(570, 300, 50, 30);
		txtPercentage.setFont(f);
		txtPercentage.setToolTipText(getLabelText("Your Percantage"));
		frm.add(txtPercentage);
		
		lblWorking=new JLabel("WORKING");
		lblWorking.setBounds(640, 300, 70, 30);
		lblWorking.setFont(f);
		lblWorking.setForeground(Color.BLUE );
		frm.add(lblWorking);
		
		cmbWorking=new JComboBox(arr1);
		cmbWorking.setBounds(730, 300, 90, 30);
		cmbWorking.setFont(f);
		cmbWorking.setToolTipText(getLabelText("Are You Employed Or Not"));
		frm.add(cmbWorking);
		
		lblFull_Address=new JLabel("FULL ADDRESS");
		lblFull_Address.setBounds(20, 340, 100, 30);
		lblFull_Address.setFont(f);
		lblFull_Address.setForeground(Color.BLUE );
		frm.add(lblFull_Address);
		
		txtFull_Address=new JTextArea();
		txtFull_Address.setBounds(150, 340, 670, 60);
		txtFull_Address.setFont(f);
		txtFull_Address.setToolTipText(getLabelText("Enter Your Full Address"));
		frm.add(txtFull_Address);
		
		lblEmailId=new JLabel("E-Mail ID");
		lblEmailId.setBounds(20, 420, 100, 30);
		lblEmailId.setFont(f);
		lblEmailId.setForeground(Color.BLUE );
		frm.add(lblEmailId);
		
		txtEmailId=new JTextField();
		txtEmailId.setBounds(150, 420, 670, 30);
		txtEmailId.setFont(f);
		txtEmailId.setToolTipText(getLabelText("Enter Your E-mail ID"));
		frm.add(txtEmailId);
		
		lblParents_Mob=new JLabel("PARENT'S MOB");
		lblParents_Mob.setBounds(20, 460, 100, 30);
		lblParents_Mob.setFont(f);
		lblParents_Mob.setForeground(Color.BLUE );
		frm.add(lblParents_Mob);
		
		try {
			mf2=new MaskFormatter("(+##) ##########");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		curdate.setForeground(Color.BLACK );
		curdate=new JFormattedTextField(mf2);
		curdate.setBounds(150, 460, 250, 30);
		curdate.setToolTipText(getLabelText("Your Parents Contact No"));
		curdate.setFont(f);
		frm.add(curdate);
		
				
		lblStudent_Mob=new JLabel("STUDENT MOB");
		lblStudent_Mob.setBounds(440, 460, 100, 30);
		lblStudent_Mob.setFont(f);
		lblStudent_Mob.setForeground(Color.BLUE );
		frm.add(lblStudent_Mob);
		
		try {
			mf2=new MaskFormatter("(+##) ##########");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		curdate.setForeground(Color.BLACK );
		curdate=new JFormattedTextField(mf2);
		curdate.setToolTipText(getLabelText("Your Contact No"));
		curdate.setBounds(580, 460, 240, 30);
		curdate.setFont(f);
		frm.add(curdate);
		
		lblMode=new JLabel("MODE");
		lblMode.setBounds(20, 500, 200, 30);
		lblMode.setFont(f);
		lblMode.setForeground(Color.BLUE );
		frm.add(lblMode);
		
		cmbMode=new JComboBox(arr2);
		cmbMode.setBounds(150, 500, 250, 30);
		cmbMode.setFont(f);
		cmbMode.setToolTipText(getLabelText("Select Study Mode"));
		frm.add(cmbMode);
		
		lblUniversity=new JLabel("UNIVERSITY");
		lblUniversity.setBounds(440, 500, 100, 30);
		lblUniversity.setFont(f);
		lblUniversity.setForeground(Color.BLUE );
		frm.add(lblUniversity);
		
		cmbUniversity=new JComboBox(arr3);
		cmbUniversity.setBounds(580, 500, 240, 30);
		cmbUniversity.setFont(f);
		cmbUniversity.setToolTipText(getLabelText("Select Your University"));
		frm.add(cmbUniversity);
		
		lblSource_of_Information=new JLabel("SOURCE OF INFO");
		lblSource_of_Information.setBounds(20, 540, 200, 30);
		lblSource_of_Information.setFont(f);
		lblSource_of_Information.setForeground(Color.BLUE );
		frm.add(lblSource_of_Information);
		
		cmbSource_of_Information=new JComboBox(arr4);
		cmbSource_of_Information.setBounds(150, 540, 250, 25);
		cmbSource_of_Information.setFont(f);
		//cmbSource_of_Information.setForeground(Color.WHITE );
		cmbSource_of_Information.setToolTipText(getLabelText("Select Refrence"));
		frm.add(cmbSource_of_Information);
		
	
		lblCourse_Interested=new JLabel("COURSE INTERESTED");
		lblCourse_Interested.setBounds(440, 540, 150, 30);
		lblCourse_Interested.setFont(f);
		lblCourse_Interested.setForeground(Color.BLUE );
		frm.add(lblCourse_Interested);
		
		txtCourse_Interested=new JTextField();
		txtCourse_Interested.setBounds(580, 540, 240, 30);
		txtCourse_Interested.setFont(f);
		txtCourse_Interested.setToolTipText(getLabelText("Select Your Course"));
		frm.add(txtCourse_Interested);
		
		btnNew=new JButton("NEW");
		btnNew.setBounds(150, 580, 120, 40);
		btnNew.setFont(f);
		btnNew.setForeground(Color.BLUE );
		frm.add(btnNew);
		btnNew.addActionListener(this);
		
		btnUpdate=new JButton("EDIT");
		btnUpdate.setBounds(320, 580, 120, 40);
		btnUpdate.setFont(f);
		btnUpdate.setForeground(Color.BLUE );
		frm.add(btnUpdate);
		btnUpdate.addActionListener(this);
		
		btnSearch=new JButton("SEARCH");
		btnSearch.setBounds(510, 580, 120, 40);
		btnSearch.setFont(f);
		frm.add(btnSearch);
		btnSearch.setForeground(Color.BLUE );
		btnSearch.addActionListener(this);
		
		btnClear=new JButton("CLEAR");
		btnClear.setBounds(700, 580, 120, 40);
		btnClear.setFont(f);
		frm.add(btnClear);
		btnClear.setForeground(Color.BLUE );
		btnClear.addActionListener(this);
		
		lbllogo=new JLabel();
		lbllogo.setBounds(20, 5, 850, 165);
		lbllogo.setIcon(new ImageIcon(img));
		frm.add(lbllogo);
				
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
		
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
new FrmEnquiry();

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
	
	clear();
	setNotEditable();
	DfrmEnqiery enq=new DfrmEnqiery();
	txtEnquiry_Id.setText(Integer.toString(enq.getenqnumber()));
	setEditable();
	txtEnquiry_Id.setEditable(false);
	btnNew.setText("SAVE");
	cmbGender.setEnabled(true);
	cmbMode.setEnabled(true);
	cmbSource_of_Information.setEnabled(true);
	cmbUniversity.setEnabled(true);
	cmbWorking.setEnabled(true);
	btnUpdate.setEnabled(false);
}
public void setNotEditable()
{
	txtStudent_Name.setEditable(false);
	txtFather_Name.setEditable(false);
	txtDate.setEditable(false);
	txtDOB.setEditable(false);
	txtAge.setEditable(false);
	txtQualifaction.setEditable(false);
	txtPercentage.setEditable(false);
	txtFull_Address.setEditable(false);
	txtEmailId.setEditable(false);
	txtParents_Mob.setEditable(false);
	txtStudent_Mob.setEditable(false);
	txtCourse_Interested.setEditable(false);
	cmbGender.setEnabled(false);
	cmbWorking.setEnabled(false);
	cmbMode.setEnabled(false);
	cmbUniversity.setEnabled(false);
	cmbSource_of_Information.setEnabled(false);
	
}
public void clear()
{
	txtStudent_Name.setText("");
	txtFather_Name.setText(null);
	txtDate.setText(null);
	txtDOB.setText(null);
	txtAge.setText(null);
	txtQualifaction.setText(null);
	txtPercentage.setText(null);
	txtFull_Address.setText(null);
	txtEmailId.setText(null);
	txtParents_Mob.setText(null);
	txtStudent_Mob.setText(null);
	txtCourse_Interested.setText(null);
	cmbGender.setSelectedIndex(-1);
	cmbWorking.setSelectedIndex(-1);
	cmbMode.setSelectedIndex(-1);
	cmbUniversity.setSelectedIndex(-1);
	cmbSource_of_Information.setSelectedIndex(-1);
	
}
public void setEditable()
{
	txtStudent_Name.setEditable(true);
	txtFather_Name.setEditable(true);
	txtDate.setEditable(true);
	txtDOB.setEditable(true);
	txtAge.setEditable(true);
	txtQualifaction.setEditable(true);
	txtPercentage.setEditable(true);
	txtFull_Address.setEditable(true);
	txtEmailId.setEditable(true);
	txtParents_Mob.setEditable(true);
	txtStudent_Mob.setEditable(true);
	txtCourse_Interested.setEditable(true);
	/*cmbGender.setSelectedIndex(-1);
	cmbWorking.setSelectedIndex(-1);
	cmbMode.setSelectedIndex(-1);
	cmbUniversity.setSelectedIndex(-1);
	cmbSource_of_Information.setSelectedIndex(-1);*/
	cmbGender.setEnabled(true);
	cmbWorking.setEnabled(true);
	cmbMode.setEnabled(true);
	cmbUniversity.setEnabled(true);
	cmbSource_of_Information.setEnabled(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource().equals(btnNew)){
		if(btnNew.getText().equals("NEW")){
			DfrmEnqiery enq=new DfrmEnqiery();
			txtEnquiry_Id.setText(Integer.toString(enq.getenqnumber()));
			setEditable();
			txtEnquiry_Id.setEditable(false);
			btnNew.setText("SAVE");
			cmbGender.setEnabled(true);
			cmbMode.setEnabled(true);
			cmbSource_of_Information.setEnabled(true);
			cmbUniversity.setEnabled(true);
			cmbWorking.setEnabled(true);
			btnSearch.setText("SEARCH");
		}else if(btnNew.getText().equals("SAVE")){
			DfrmEnqiery enq=new DfrmEnqiery();
			int s=enq.ins_record(Integer.parseInt(txtEnquiry_Id.getText()), txtStudent_Name.getText(), txtFather_Name.getText(), txtDOB.getText(), txtAge.getText(), txtQualifaction.getText(), Integer.parseInt(txtPercentage.getText()), cmbGender.getSelectedItem().toString(), cmbWorking.getSelectedItem().toString(),txtFull_Address.getText(), txtParents_Mob.getText(), txtStudent_Mob.getText(), cmbUniversity.getSelectedItem().toString(), txtEmailId.getText(), txtCourse_Interested.getText(), cmbMode.getSelectedItem().toString(), cmbSource_of_Information.getSelectedItem().toString(), txtDate.getText());
			if(s==1){
				JOptionPane.showMessageDialog(null, "SUCESSFULLY INSERTED");
				clear();
				txtEnquiry_Id.setText(Integer.toString(enq.getenqnumber()));
			}else{
				JOptionPane.showMessageDialog(null, "not INSERTED");
			}
		}
		
	}else if(e.getSource().equals(btnUpdate)){
		
		if(e.getActionCommand().equalsIgnoreCase("edit")){
			setEditable();
			btnUpdate.setText("UPDATE");
		}else if(e.getActionCommand().equalsIgnoreCase("UPDATE")){
			DfrmEnqiery enq=new DfrmEnqiery();
			int s=enq.update_record(Integer.parseInt(txtEnquiry_Id.getText()), txtStudent_Name.getText(), txtFather_Name.getText(), txtDOB.getText(), txtAge.getText(), txtQualifaction.getText(), Integer.parseInt(txtPercentage.getText()), cmbGender.getSelectedItem().toString(), cmbWorking.getSelectedItem().toString(),txtFull_Address.getText(), txtParents_Mob.getText(), txtStudent_Mob.getText(), cmbUniversity.getSelectedItem().toString(), txtEmailId.getText(), txtCourse_Interested.getText(), cmbMode.getSelectedItem().toString(), cmbSource_of_Information.getSelectedItem().toString(), txtDate.getText());
			if(s==1){
				JOptionPane.showMessageDialog(null, "SUCESSFULLY updated");
				clear();
				txtEnquiry_Id.setText(Integer.toString(enq.getenqnumber()));
			}else{
				JOptionPane.showMessageDialog(null, "NOT updated");
			}
			//JOptionPane.showMessageDialog(null, "UPDATE ");	
		}		
		
	}else if(e.getSource().equals(btnSearch)){
		if(e.getActionCommand().equalsIgnoreCase("search")){
			setNotEditable();
			//btnUpdate.setEnabled(true);
			btnSearch.setText("find");
			txtEnquiry_Id.setText("");
			txtEnquiry_Id.setEditable(true);
			txtEnquiry_Id.grabFocus();
			btnNew.setText("NEW");
			
		}else if(e.getActionCommand().equalsIgnoreCase("find")){
			btnUpdate.setEnabled(true);
			DfrmEnqiery enq=new DfrmEnqiery();
			ResultSet rs= enq.sec_record(Integer.parseInt(txtEnquiry_Id.getText()));
			try {
				if(rs.next()){
					txtStudent_Name.setText(rs.getString(1));
					txtFather_Name.setText(rs.getString(2));
					txtDOB.setText(rs.getString(3));
					txtAge.setText(rs.getString(4));
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
					txtCourse_Interested.setText(rs.getString(14));
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
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		}
		else if (e.getSource().equals(btnClear)){
		clear();
	}
		
}

}

