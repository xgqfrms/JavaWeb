package jbutton;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Jbutton01 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN") ;	// ʵ�����������
		JButton but = new JButton("����") ;	 
		Font fnt = new Font("Serief",Font.BOLD,28);
		but.setFont(fnt) ;
		but.setBounds(50, 40, 100, 60);
		frame.add(but) ;
		frame.setSize(200,100) ;
		frame.setLocation(200,100) ;
		frame.setVisible(true) ;
		//���֣���

	}

}
