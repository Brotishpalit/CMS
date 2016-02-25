import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;


public class FrmAdmit implements WindowListener {

		JFrame frm;
	
		
		{
			
		frm=new JFrame();
		frm.setSize(850,700);
		frm.setLocation(250,10);
		frm.setResizable(false);
		frm.setLayout(null);
		Color hexa=Color.decode("#F7AC8F");
		frm.getContentPane().setBackground(hexa);
	
	
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
}
