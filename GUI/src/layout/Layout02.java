package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout02 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN") ; 
		frame.setLayout(new BorderLayout(3,3)) ;
		frame.add(new JButton("东（EAST）"),BorderLayout.EAST) ;
		frame.add(new JButton("西（WEST）"),BorderLayout.WEST) ;
		frame.add(new JButton("南（SOUTH）"),BorderLayout.SOUTH) ;
		frame.add(new JButton("北（NORTH）"),BorderLayout.NORTH) ;
		frame.add(new JButton("中（CENTER）"),BorderLayout.CENTER) ;
		frame.setSize(500,300) ;
		frame.setLocation(200, 100);
		frame.setVisible(true) ;

	}

}
