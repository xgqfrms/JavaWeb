package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout02 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN") ; 
		frame.setLayout(new BorderLayout(3,3)) ;
		frame.add(new JButton("����EAST��"),BorderLayout.EAST) ;
		frame.add(new JButton("����WEST��"),BorderLayout.WEST) ;
		frame.add(new JButton("�ϣ�SOUTH��"),BorderLayout.SOUTH) ;
		frame.add(new JButton("����NORTH��"),BorderLayout.NORTH) ;
		frame.add(new JButton("�У�CENTER��"),BorderLayout.CENTER) ;
		frame.setSize(500,300) ;
		frame.setLocation(200, 100);
		frame.setVisible(true) ;

	}

}
