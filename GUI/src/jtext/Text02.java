package jtext;

import javax.swing.JFrame ;
import javax.swing.JTextField ;
import javax.swing.JLabel ;
public class Text02{
	public static void main(String args[]){
		JFrame frame = new JFrame("Welcome To MLDN") ;
		JTextField name = new JTextField(30) ;
		JTextField noed = new JTextField("MLDN",10) ;
		JLabel nameLab = new JLabel("�����û�������") ;
		JLabel noedLab = new JLabel("���ɱ༭�ı���") ;
		name.setColumns(30) ;
		noed.setColumns(10) ;
		noed.setEnabled(false) ;	// ��ʾ���ɱ༭
		name.setBounds(110,10,80,20) ;
		noed.setBounds(110,40,50,20) ;
		//
		nameLab.setBounds(10,10,100,20) ;
		noedLab.setBounds(10,40,100,20) ;

		frame.add(nameLab) ;
		frame.add(name) ;
		frame.add(noedLab) ;
		frame.add(noed) ;
		frame.setLayout(null) ;
		frame.setSize(300,100) ;
		frame.setLocation(300,200) ;
		frame.setVisible(true) ;
	}
};