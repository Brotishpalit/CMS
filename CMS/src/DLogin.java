
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class DLogin extends JFrame implements ActionListener {

	JFrame frm;
	JLabel lbluname,lblpassword;
    JTextField txtuname;
	JPasswordField txtpassword;
	JButton btnlogin,btnregister;
	Boolean flag;
	
	Font f=new Font("Consolas",Font.BOLD,14);
	
	public DLogin()
	{
		frm=new JFrame();
		frm.setTitle("Login");
		frm.setSize(400,250);
		frm.setLocation(400, 250);
		frm.setLayout(null);
		frm.setResizable(false);
		
		lbluname=new JLabel("User Name");
		lbluname.setBounds(50, 20, 100, 30);
		frm.add(lbluname);
		lbluname.setForeground(Color.BLUE);
		lbluname.setFont(f);
		
		txtuname=new JTextField();
		txtuname.setBounds(180, 20, 170, 30);
		txtuname.setFont(f);
		frm.add(txtuname);
		
		lblpassword=new JLabel("Password");
		lblpassword.setBounds(50, 80, 100, 30);
		lblpassword.setFont(f);
		lblpassword.setForeground(Color.BLUE);
		frm.add(lblpassword);
		
		txtpassword=new JPasswordField();
		txtpassword.setBounds(180,80, 170, 30);
		txtpassword.setFont(f);
		frm.add(txtpassword);
		
		btnlogin=new JButton("Login");
		btnlogin.setBounds(50, 140, 130, 40);
		frm.add(btnlogin);
		btnlogin.setForeground(Color.BLUE);
		btnlogin.setFont(f);
		btnlogin.addActionListener(this);
		
		btnregister=new JButton("REGISTER");
		btnregister.setBounds(220,140,130,40);
		frm.add(btnregister);
		btnregister.setForeground(Color.BLUE);
		btnregister.setFont(f);
		btnregister.addActionListener(this);
		
		frm.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
              new DLogin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(btnlogin)){
			
			if(frmvalidate()){
				
				UserLogin ul=new UserLogin(txtuname.getText(), txtpassword.getText());
				
					if(ul.validateLogin())
					{
						JOptionPane.showMessageDialog(null, "Login Successfull");
						txtuname.setText("");
						txtpassword.setText("");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Login UnSuccessfull");
						txtuname.setText("");
						txtpassword.setText("");
						txtuname.grabFocus();
					}
				}	
			}else if(e.getSource().equals(btnregister)){
				new DRegister();
				frm.hide();
			}

  }

	public boolean frmvalidate() {
		// TODO Auto-generated method stub
		flag=true;
		
		if(txtuname.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"ENTER USER NAME");
			txtuname.grabFocus();
			flag=false;
		}
		else if(txtpassword.getText().equals("")){
			JOptionPane.showMessageDialog(null, "ENTER USER PASSWORD");
			txtpassword.grabFocus();
			flag=false;
		}
		return flag;
	}
}