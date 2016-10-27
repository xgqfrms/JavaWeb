package jframe;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

public class Jframe01 {

	public static void main(String[] args) {
		JFrame f = new JFrame("第一个Swing窗体") ;
		Font f1 = new Font("Arial",Font.BOLD,36);
		//f.setForeground(Color.BLUE);
		f.setFont(f1);
		f.setSize(500,400) ;	// 设置组件的大小
		f.setLocation(200,100) ;	// 设置组件的显示位置
		f.setBackground(Color.RED) ;	// 将背景设置成白色
		f.setVisible(true) ;	// 让组件可见
	}

}
