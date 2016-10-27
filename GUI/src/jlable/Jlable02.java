package jlable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jlable02 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN") ;
		JLabel lab = new JLabel("MLDN",JLabel.CENTER) ;	// 实例化标签对象
		Font fnt = new Font("Arial Unicode MS",Font.ITALIC + Font.BOLD,28) ;
		lab.setFont(fnt) ;
		lab.setForeground(Color.RED);
		frame.add(lab) ;	// 将组件件入到面板之中
		Dimension dim = new Dimension() ;
		dim.setSize(500,400) ;
		frame.setSize(dim) ;
		
		Color bgColor = new Color(0, 0, 0);
		frame.setBackground(bgColor);
		//frame.setBackground(Color.BLUE) ;//设置窗体的背景颜色  ???
		Point point = new Point(200,100) ;	// 设置坐标
		frame.setLocation(point) ;
		frame.setVisible(true) ;

	}

}
