package jtext;

import java.awt.GridLayout ;

import javax.swing.JFrame ;
import javax.swing.JTextArea ;
import javax.swing.JScrollPane ;
import javax.swing.JLabel ;

public class JTextArea02{
	public static void main(String args[]){
		//创建frame
		JFrame frame = new JFrame("Welcome To MLDN") ;
		//创建Label
		JLabel lab = new JLabel("多行文本域：") ;
		//创建文本框
		JTextArea jta = new JTextArea(10,10) ;	// 设置???大小??
		//创建带文本框的滚动条,
		JScrollPane scr = new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS ) ;
		//添加组件
		frame.add(lab) ;//标签名
		frame.add(scr) ;
		//设置属性
		frame.setLayout(new GridLayout(2,1)) ;	// 网格布局管理器
		
		frame.setSize(400,300) ;
		frame.setLocation(100,100) ;
		frame.setVisible(true) ;
	}
};