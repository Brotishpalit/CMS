

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class DChangePassword extends JFrame implements ActionListener,FocusListener {
	
	
	JFrame frm;
	JLabel lblusername,lblnewpassword,lblconfirmpassword,lblsecurityquestion,lblsecquestion,lblsqanswer;
	JTextField txtusername,txtsqanswer;
	JPasswordField txtnewpassword,txtconfirmnewpassword;
	JButton btnchangepassword;
	
	public DChangePassword(){
		frm=new JFrame();
		frm.setTitle("CHANGE PASSWORD");
		frm.setSize(360,300);
		frm.setLayout(null);
		frm.setLocation(500, 150);
		frm.setResizable(false);
		
		lblusername=new JLabel("User Name");
		lblusername.setBounds(20, 20, 120, 30);
		frm.add(lblusername);
		
		lblsecurityquestion=new JLabel("Seccurity Question");
		lblsecurityquestion.setBounds(20, 60, 120, 30);
		frm.add(lblsecurityquestion);
		
		lblsecquestion= new JLabel("");
		lblsecquestion.setBounds(170,60,170,30);
		frm.add(lblsecquestion);
		
		lblsqanswer= new JLabel("Security Answer");
		lblsqanswer.setBounds(20,100,120,30);
		frm.add(lblsqanswer);
		
		lblnewpassword=new JLabel("New Password");
		lblnewpassword.setBounds(20, 140, 120, 30);
		frm.add(lblnewpassword);
		
		lblconfirmpassword=new JLabel("Confirm Password");
		lblconfirmpassword.setBounds(20, 180, 120, 30);
		frm.add(lblconfirmpassword);
		
			
		txtusername=new JTextField();
		txtusername.setBounds(170, 20, 170, 30);
		frm.add(txtusername);
		txtusername.addFocusListener(this);
		
	   txtsqanswer=new JTextField();
	   txtsqanswer.setBounds(170, 100, 170, 30);
	   frm.add(txtsqanswer);
		
		txtnewpassword=new JPasswordField();
		txtnewpassword.setBounds(170, 140, 170, 30);
		frm.add(txtnewpassword);
		
		txtconfirmnewpassword=new JPasswordField();
		txtconfirmnewpassword.setBounds(170, 180, 170, 30);
		frm.add(txtconfirmnewpassword);
		
		btnchangepassword=new JButton("CHANGE PASSWORD");
		btnchangepassword.setBounds(170, 220, 170, 30);
		frm.add(btnchangepassword);
		btnchangepassword.addActionListener(this);
		
		frm.setVisible(true);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DChangePassword();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(frmValidate()){
			ChangePassword chpass=new ChangePassword(txtusername.getText(), txtsqanswer.getText(), txtconfirmnewpassword.getText());
			if(chpass.passwordValidate()){
				if(chpass.updatepasswd()){
					JOptionPane.showMessageDialog(null, "password updated");
					txtnewpassword.setText("");
					txtconfirmnewpassword.setText("");
					txtusername.setText("");
					txtsqanswer.setText("");
					lblsecquestion.setText("");
			}
						}else{
				JOptionPane.showMessageDialog(null, "security ans not matched");
			}
		}
		
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		if(txtusername.getText().equals("")){
		
		}else{
		if(e.getSource().equals(txtusername)){
			UserRegister ur =new UserRegister(txtusername.getText());
			if(ur.userValidate()){
				JOptionPane.showMessageDialog(null, "USER NOT EXIST");
			}else{
				ChangePassword chpwd = new ChangePassword(txtusername.getText());
			    lblsecquestion.setText(chpwd.getSecQuestion());
			}
		}
	}
}
	public Boolean frmValidate(){
		
		Boolean flag=true;
		
		if(txtusername.getText().equals("")){
			JOptionPane.showMessageDialog(null,"ENTER USER NAME");
			txtusername.grabFocus();
			flag=false;
		}
		else if(txtsqanswer.getText().equals("")){
			JOptionPane.showMessageDialog(null,"ENTER SECURITY ANSWER");
			txtsqanswer.grabFocus();
			flag=false;
		}
		else if(txtnewpassword.getText().equals("")){
			JOptionPane.showMessageDialog(null,"ENTER NEW PASSWORD");
			txtnewpassword.grabFocus();
			flag=false;
	}
		
		else if(txtconfirmnewpassword.getText().equals("")){
		JOptionPane.showMessageDialog(null,"ENTER CONFIRMATION NAME");
		txtconfirmnewpassword.grabFocus();
		flag=false;
	}else if(!(txtnewpassword.getText().equals(txtconfirmnewpassword.getText()))){
		JOptionPane.showMessageDialog(null,"password not matched");
		txtnewpassword.setText("");
		txtconfirmnewpassword.setText("");
		txtnewpassword.grabFocus();
		flag=false;
	}
	return flag;
	}
}
	
	

