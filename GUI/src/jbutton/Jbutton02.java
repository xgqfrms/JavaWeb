package jbutton;

//import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Jbutton02 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN") ;	// 实例化窗体对象
		String picPath = "nba.gif" ;
		//String picPath = "d:" + File.separator + "mldn.gif" ;
		Icon icon = new ImageIcon(picPath) ;
		JButton but = new JButton("xgqfrms",icon) ;
		but.setBounds(60, 40, 100, 80);
		
		frame.add(but) ;
		frame.setSize(500,400) ;
		frame.setLocation(200,100) ;
		frame.setVisible(true) ;

	}

}
