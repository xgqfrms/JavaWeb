package jframe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class Jframe02 {

	public static void main(String[] args) {
		JFrame f = new JFrame("第一个Swing窗体") ;
		Dimension d = new Dimension() ;
		d.setSize(500,400) ;
		f.setSize(d) ;	// 设置组件的大小
		f.setBackground(Color.WHITE) ;	// 将背景设置成白色
		Point p = new Point(200,100) ;	// 指定组件的显示位置
		f.setLocation(p) ;	// 设置组件的显示位置
		f.setVisible(true) ;	// 让组件可见

	}

}
