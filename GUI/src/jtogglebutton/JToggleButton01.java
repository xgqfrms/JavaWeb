package jtogglebutton;


import javax.swing.JButton;
import javax.swing.JFrame ;
import javax.swing.JToggleButton ;

import java.awt.GridLayout ;

public class JToggleButton01{
	public static void main(String args[]){
		JFrame frame = new JFrame("������ť") ;
		JToggleButton but1 = new JToggleButton("��ѡ��",true) ;	 // Ĭ��ѡ��
		JToggleButton but2 = new JToggleButton("δѡ��") ;
		JToggleButton but3 = new JToggleButton("����") ;
		JButton but4 = new JButton("������ť") ;
		
		frame.add(but1) ;
		frame.add(but2) ;
		frame.add(but3) ;
		frame.add(but4);
				
		frame.setLayout(new GridLayout(4,1)) ;	// �����Ű���ʽ
		frame.setSize(400,300) ;
		frame.setLocation(100,100) ;
		frame.setVisible(true) ;
	}
};