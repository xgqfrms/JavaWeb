package jlable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jlable01 {

	public static void main(String args[]){
		JFrame frame = new JFrame("Welcome To MLDN") ;
		JLabel lab = new JLabel("MLDN",JLabel.CENTER) ;	// 实例化标签对象
		Font f = new Font("Arial",Font.BOLD,36);
		lab.setFont(f);
		lab.setForeground(Color.RED);
		frame.add(lab) ;	// 将组件件入到面板之中(默认布局是边界布局，不指定时，默认全填充)
		Dimension dim = new Dimension(500,400) ;
		//dim.setSize(500,400) ;
		frame.setSize(dim) ;
		frame.setBackground(Color.BLUE) ;//设置窗体的背景颜色？？
		Point point = new Point(200,100) ;	// 设置左上角坐标
		frame.setLocation(point) ;
		frame.setVisible(true) ;
	}

}
