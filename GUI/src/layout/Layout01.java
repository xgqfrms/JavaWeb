package layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout01 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN") ; 
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,3,3)) ;
		JButton but = null ;
		for(int i=0;i<12;i++){
			but = new JButton("°´Å¥-"+ i) ;
			frame.add(but) ;
		}
		frame.setSize(500, 400);
		frame.setLocation(200, 100);
		frame.setVisible(true) ;

	}

}
