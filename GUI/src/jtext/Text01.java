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
		noed.setEnabled(false) ;	// 表示不可编辑
		//
		JLabel nameLab = new JLabel("输入用户姓名：") ;
		JLabel noedLab = new JLabel("不可编辑文本：") ;
		
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