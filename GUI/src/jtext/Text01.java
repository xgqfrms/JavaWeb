package jtext;

import java.awt.GridLayout ;
import javax.swing.JFrame ;
import javax.swing.JTextField ;
import javax.swing.JLabel ;
public class Text01{
	public static void main(String args[]){
		JFrame frame = new JFrame("Welcome To MLDN") ;
		//
		JTextField name = new JTextField("xgqfrms",30) ;
		JTextField noed = new JTextField("MLDN",10) ;
		name.setColumns(30) ;
		noed.setColumns(10) ;
		noed.setEnabled(false) ;	// ��ʾ���ɱ༭
		//
		JLabel nameLab = new JLabel("�����û�������") ;
		JLabel noedLab = new JLabel("���ɱ༭�ı���") ;
		
		frame.add(nameLab) ;
		frame.add(name) ;
		frame.add(noedLab) ;
		frame.add(noed) ;
		
		frame.setLayout(new GridLayout(2,2)) ;
		frame.setSize(600,400) ;
		frame.setLocation(100,100) ;
		frame.setVisible(true) ;
	}
};