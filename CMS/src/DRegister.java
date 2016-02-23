
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Color;
import java.awt.event.*;

public class DRegister extends JFrame implements ActionListener,ListSelectionListener {

	JFrame frm;
	JLabel lblusername,lbluserpassword,lblsecurityquestion,lblsecurityanswer;
	JTextField txtusername,txtsecurityanswer;
	JPasswordField txtpassword;
	JButton btnregister,btnlogin;
	JList lstquest;
	String strquest[]={" Nick Name"," Favourite Color"," Favourite Food"," Favourite Place"};
	String strgetquest;
	
	
	public DRegister(){
		
      frm=new JFrame();
      frm.setTitle("REGISTRATION");
      frm.setSize(430,350);
      frm.setLocation(450,200);
      frm.setLayout(null);
      frm.setResizable(false);
     
     
      lblusername=new JLabel("User Name");
      lblusername.setBounds(20,10,120, 30);
      lblusername.setForeground(Color.BLUE);
      frm.add(lblusername);
      
      txtusername=new JTextField();
      txtusername.setBounds(200,10,200,30);
      frm.add(txtusername);
 
            
      lbluserpassword = new JLabel("Password");
      lbluserpassword.setBounds(20,50,120,30);
      lbluserpassword.setForeground(Color.BLUE);
      frm.add(lbluserpassword);
      
      txtpassword=new JPasswordField();
      txtpassword.setBounds(200,50,200,30);
      frm.add(txtpassword);
      
      lblsecurityquestion=new JLabel("Security Question");
	  lblsecurityquestion.setBounds(20,90,120,30);
     lblsecurityquestion.setForeground(Color.BLUE);
	  frm.add(lblsecurityquestion);
      
      lstquest=new JList(strquest);
      lstquest.setBounds(200, 90, 200,120);
      lstquest.addListSelectionListener(this);
      frm.add(lstquest);
      
      lblsecurityanswer=new JLabel("Securuty Answer");
      lblsecurityanswer.setBounds(20, 230, 120, 30);
      lblsecurityanswer.setForeground(Color.BLUE);
      frm.add(lblsecurityanswer);
       
      txtsecurityanswer=new JTextField();
      txtsecurityanswer.setBounds(200, 220, 200, 30);
      frm.add(txtsecurityanswer);
      
      btnregister=new JButton("Register");
      btnregister.setBounds(200,270,100,40);
      frm.add(btnregister);
      btnregister.setForeground(Color.BLUE);
      btnregister.addActionListener(this);
      
      btnlogin=new JButton("Login");
      btnlogin.setBounds(310, 270, 100, 40);
      frm.add(btnlogin);
      btnlogin.setForeground(Color.BLUE);
      btnlogin.addActionListener(this);
    
      frm.setVisible(true);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DRegister();
		

}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(btnregister)){
			UserRegister ur=new UserRegister(txtusername.getText(),txtpassword.getText(), strgetquest, txtsecurityanswer.getText());
		if(frmValidate()){
			
			if(ur.userValidate()){
			if(ur.insertRegrecord()==1){
					JOptionPane.showMessageDialog(null, "USER REGISTERED");
					txtusername.setText(null);
					txtpassword.setText(null);
					txtsecurityanswer.setText(null);
				}
		}else{
				JOptionPane.showMessageDialog(null, "USER ALREADY EXIST");
			}
		}
	}else if(e.getSource().equals(btnlogin)){
		new DLogin();
		frm.hide();
	}
}
		public Boolean frmValidate(){
			Boolean flag=true;
			if(txtusername.getText().length()==0){
				JOptionPane.showMessageDialog(null,"ENTER USER NAME");
				txtusername.grabFocus();
				flag=false;
			}else if(txtpassword.getText().length()==0){
				JOptionPane.showMessageDialog(null, "ENTER PASSWORD");
				txtpassword.grabFocus();
				flag =false;
			}else if(lstquest.getSelectedIndex()==-1 ){
				JOptionPane.showMessageDialog(null, "SELECT SECURITY QUESTION");
				lstquest.grabFocus();
				lstquest.setSelectedIndex(0);
				flag=false;
			}else if(txtsecurityanswer.getText().length()==0){
				JOptionPane.showMessageDialog(null, "ENTER SECURITY ANSWER");
				txtsecurityanswer.grabFocus();
				flag=false;
			}
			return flag;
		}

	@Override
	public void valueChanged(ListSelectionEvent e) {
	//	// TODO Auto-generated method stub
	strgetquest=lstquest.getSelectedValue().toString();
		
	}

}
