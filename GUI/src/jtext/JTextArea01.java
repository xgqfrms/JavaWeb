package jtext;

import javax.swing.JFrame ;
import javax.swing.JTextArea ;
import javax.swing.JLabel ;
public class JTextArea01{
	public static void main(String args[]){
		JFrame frame = new JFrame("Welcome To MLDN") ;
		JTextArea jta = new JTextArea(3,10) ;	// ���ô�С
		JLabel lab = new JLabel("�����ı���") ;
		lab.setBounds(10,10,120,20) ; 
		jta.setBounds(130,10,150,100) ; 
		frame.setLayout(null) ;	// ȡ�����ֹ�����
		frame.add(lab) ;
		frame.add(jta) ;
		frame.setSize(300,150) ;
		frame.setLocation(300,200) ;
		frame.setVisible(true) ;
	}
};
