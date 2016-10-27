package layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout03 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN") ; 
		frame.setLayout(new GridLayout(3,5,3,3)) ;
		JButton but = null ;
		for(int i=0;i<13;i++){
			but = new JButton(" °´Å¥ "+ i) ;
			frame.add(but) ;
		}
		frame.pack() ;
		frame.setSize(500, 400);
		frame.setLocation(200, 100);
		frame.setVisible(true) ;

	}

}
