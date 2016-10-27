package jbutton;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Jbutton01 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN") ;	// 实例化窗体对象
		JButton but = new JButton("按我") ;	 
		Font fnt = new Font("Serief",Font.BOLD,28);
		but.setFont(fnt) ;
		but.setBounds(50, 40, 100, 60);
		frame.add(but) ;
		frame.setSize(200,100) ;
		frame.setLocation(200,100) ;
		frame.setVisible(true) ;
		//布局？？

	}

}
