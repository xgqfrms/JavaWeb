package jtogglebutton;


import javax.swing.JButton;
import javax.swing.JFrame ;
import javax.swing.JToggleButton ;

import java.awt.GridLayout ;

public class JToggleButton01{
	public static void main(String args[]){
		JFrame frame = new JFrame("不弹起按钮") ;
		JToggleButton but1 = new JToggleButton("已选中",true) ;	 // 默认选中
		JToggleButton but2 = new JToggleButton("未选中") ;
		JToggleButton but3 = new JToggleButton("按我") ;
		JButton but4 = new JButton("正常按钮") ;
		
		frame.add(but1) ;
		frame.add(but2) ;
		frame.add(but3) ;
		frame.add(but4);
				
		frame.setLayout(new GridLayout(4,1)) ;	// 设置排版样式
		frame.setSize(400,300) ;
		frame.setLocation(100,100) ;
		frame.setVisible(true) ;
	}
};