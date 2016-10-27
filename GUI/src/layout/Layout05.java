package layout;


import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Layout05 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN") ; 
		frame.setLayout(null) ;
		JLabel title = new JLabel("xgqfrms") ;
		JButton enter = new JButton("进入") ;
		JButton help = new JButton("帮助") ;
		Font f1 = new Font("Serif",Font.ITALIC+Font.BOLD,36);
		Font f2 = new Font("华文行楷",Font.BOLD,26);
		title.setFont(f1);
		enter.setFont(f2);
		help.setFont(f2);
		title.setBounds(183,50,250,80) ;
		enter.setBounds(50,230,180,80) ;
		help.setBounds(250,230,180,80) ;
		
		//frame.setSize(500, 400);
		//frame.setLocation(200, 100);
		frame.setBounds(200, 100, 500, 400);
		frame.add(title) ;
		frame.add(enter) ;
		frame.add(help) ;
		frame.setVisible(true) ;

	}

}
