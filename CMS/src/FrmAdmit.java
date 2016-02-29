import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class FrmAdmit implements WindowListener, ActionListener {

		JFrame frm;
		JButton btnSave,btnPrint;
		
		JLabel lblPhoto,lblbanner,lblAdmission_No,lblForm_No,lblCourse_Name,lblIdentification_Mark,lblName,
		lblFull_address,lblcandidate_sign,lblTo_be,lblcybo_Reg,lblDate_of_Exm,lblTime,lblVenu;
		
		JTextField txtcourse_Name,txtAdmission_No,txtForm_No,txtIdentification_Mark,txtName,txtcandidate_sign,
		txtcybo_Reg,txtDate_of_Exm,txtTime,txtVenu;
		
		JTextArea txtFull_address;
		
		public String getLabelText(String message){
			return "<html><p bgcolor=\"25948F\"><font color=\"ffffff\" style=\"font-size: 12px;\" face=\"Calibri\">&nbsp;&nbsp; " + message + " &nbsp;&nbsp; " + "</font></p></html>";
		}	
		
		{
		Image img=new ImageIcon(this.getClass().getResource("/admit1.jpg")).getImage();
		Image img1=new ImageIcon(this.getClass().getResource("/banner1.jpg")).getImage();
		
		Font f=new Font("Consolas",Font.BOLD,13);
		frm=new JFrame();
		frm.setSize(800,750);
		frm.setLocation(350,5);
		frm.setResizable(false);
		frm.setLayout(null);
		Color hexa=Color.decode("#74FFA5");
		frm.getContentPane().setBackground(hexa);
	
		lblbanner=new JLabel();
		lblbanner.setBounds(0,1,800,150 );
		lblbanner.setIcon(new ImageIcon(img));
		frm.add(lblbanner);
		
		lblPhoto=new JLabel();
		lblPhoto.setBounds(630, 300,150,200 );
		lblPhoto.setIcon(new ImageIcon(img1));
		frm.add(lblPhoto);
				
		
		lblCourse_Name=new JLabel ("COURSE NAME");
		lblCourse_Name.setBounds(20, 180, 150,30);
		lblCourse_Name.setFont(f);
		lblCourse_Name.setForeground(Color.BLUE);
		frm.add(lblCourse_Name);
		
		txtcourse_Name=new JTextField();
		txtcourse_Name.setBounds(180, 180,400,30);
		txtcourse_Name.setFont(f);
		txtcourse_Name.setForeground(Color.BLACK );
		frm.add(txtcourse_Name);
		
		lblIdentification_Mark=new JLabel ("IDENTIFICATION MARK");
		lblIdentification_Mark.setBounds(20, 220, 150,30);
		lblIdentification_Mark.setFont(f);
		lblIdentification_Mark.setForeground(Color.BLUE);
		frm.add(lblIdentification_Mark);
		
		txtIdentification_Mark=new JTextField();
		txtIdentification_Mark.setBounds(180, 220,400,30);
		txtIdentification_Mark.setFont(f);
		txtIdentification_Mark.setForeground(Color.BLACK );
		frm.add(txtIdentification_Mark);
		
		lblAdmission_No=new JLabel ("ADMISSION No");
		lblAdmission_No.setBounds(660, 160, 150,30);
		lblAdmission_No.setFont(f);
		lblAdmission_No.setForeground(Color.BLUE);
		frm.add(lblAdmission_No);
		
		txtAdmission_No=new JTextField();
		txtAdmission_No.setBounds(630, 190,150,30);
		txtAdmission_No.setFont(f);
		txtAdmission_No.setForeground(Color.BLACK );
		frm.add(txtAdmission_No);
		
		lblForm_No=new JLabel ("FORM No");
		lblForm_No.setBounds(670,220, 150,30);
		lblForm_No.setFont(f);
		lblForm_No.setForeground(Color.BLUE);
		frm.add(lblForm_No);
		
		txtForm_No=new JTextField();
		txtForm_No.setBounds(630,250,150,30);
		txtForm_No.setFont(f);
		txtForm_No.setForeground(Color.BLACK );
		frm.add(txtForm_No);
		
		
		lblName=new JLabel ("NAME");
		lblName.setBounds(20, 260, 150,30);
		lblName.setFont(f);
		lblName.setForeground(Color.BLUE);
		frm.add(lblName);
		
		txtName=new JTextField();
		txtName.setBounds(180, 260,400,30);
		txtName.setFont(f);
		txtName.setForeground(Color.BLACK );
		frm.add(txtName);
		
		
		lblFull_address=new JLabel ("POSTAL ADDRESS");
		lblFull_address.setBounds(20,300, 150,30);
		lblFull_address.setFont(f);
		lblFull_address.setForeground(Color.BLUE);
		frm.add(lblFull_address);
		
		txtFull_address=new JTextArea();
		txtFull_address.setBounds(180,300,400,70);
		txtFull_address.setFont(f);
		txtFull_address.setForeground(Color.BLACK );
		frm.add(txtFull_address);
		
		lblcandidate_sign=new JLabel ("CANDIDATE SIGNATURE");
		lblcandidate_sign.setBounds(150,440, 250,30);
		Font f2=new Font("Consolas",Font.BOLD,15);
		lblcandidate_sign.setFont(f2);
		lblcandidate_sign.setForeground(Color.BLUE);
		frm.add(lblcandidate_sign);
		
		txtcandidate_sign=new JTextField();
		txtcandidate_sign.setBounds(350,420,230,80);
		txtcandidate_sign.setFont(f);
		txtcandidate_sign.setForeground(Color.BLACK );
		frm.add(txtcandidate_sign);
		
		lblTo_be=new JLabel ("TO BE FILLED BY THE OFFICE ONLY");
		lblTo_be.setBounds(180,510, 400,30);
		Font f1=new Font("Copperplate Gothic Bold",Font.BOLD,15);
		lblTo_be.setFont(f1);
		lblTo_be.setForeground(Color.BLUE);
		frm.add(lblTo_be);
		
		lblcybo_Reg=new JLabel ("CYBOTECH REGESTRATION NO");
		lblcybo_Reg.setBounds(20,550,250,30);
		lblcybo_Reg.setFont(f);
		lblcybo_Reg.setForeground(Color.BLUE);
		frm.add(lblcybo_Reg);
		
		txtcybo_Reg=new JTextField();
		txtcybo_Reg.setBounds(220,550,560,30);
		txtcybo_Reg.setFont(f);
		txtcybo_Reg.setForeground(Color.BLACK );
		frm.add(txtcybo_Reg);
		
		lblDate_of_Exm=new JLabel ("DATE OF EXAMINATION");
		lblDate_of_Exm.setBounds(20,590,250,30);
		lblDate_of_Exm.setFont(f);
		lblDate_of_Exm.setForeground(Color.BLUE);
		frm.add(lblDate_of_Exm);
		
		txtDate_of_Exm=new JTextField();
		txtDate_of_Exm.setBounds(220,590,200,30);
		txtDate_of_Exm.setFont(f);
		txtDate_of_Exm.setForeground(Color.BLACK );
		frm.add(txtDate_of_Exm);
		
		lblTime=new JLabel ("TIME OF EXAMINATION");
		lblTime.setBounds(430,590,250,30);
		lblTime.setFont(f);
		lblTime.setForeground(Color.BLUE);
		frm.add(lblTime);
		
		txtTime=new JTextField();
		txtTime.setBounds(580,590,200,30);
		txtTime.setFont(f);
		txtTime.setForeground(Color.BLACK );
		frm.add(txtTime);
		
		lblVenu=new JLabel ("VENUE");
		lblVenu.setBounds(20,630,250,30);
		lblVenu.setFont(f);
		lblVenu.setForeground(Color.BLUE);
		frm.add(lblVenu);
		
		txtVenu=new JTextField();
		txtVenu.setBounds(220,630,560,30);
		txtVenu.setFont(f);
		txtVenu.setForeground(Color.BLACK );
		frm.add(txtVenu);
		
		btnSave=new JButton("SAVE");
		btnSave.setBounds(150, 680, 150, 40);
		btnSave.setFont(f);
		btnSave.setForeground(Color.BLUE );
		frm.add(btnSave);
		btnSave.addActionListener(this);

		btnPrint=new JButton("PRINT");
		btnPrint.setBounds(450, 680, 150, 40);
		btnPrint.setFont(f);
		btnPrint.setForeground(Color.BLUE );
		frm.add(btnPrint);
		btnPrint.addActionListener(this);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.addWindowListener(this);
		frm.setVisible(true);
	
}


		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		public static void main(String[] args) {
			new FrmAdmit();
		}


		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
}
