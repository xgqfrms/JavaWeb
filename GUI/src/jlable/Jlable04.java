package jlable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
//import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jlable04 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN") ;
		//Image a=this.getToolkit().getImage("x.ico");//加载ico
		String picPath = "x.png" ;
		//String picPath = File.separator + "x.png" ;
		//String picPath = "d:" + File.separator + "x.png" ;//???不支持.ico 文件
		Icon icon = new ImageIcon(picPath) ;
		JLabel lab = new JLabel("MLDN",icon,JLabel.CENTER) ;	// 实例化标签对象
		Font fnt = new Font("Arial",Font.ITALIC + Font.BOLD,28) ;
		lab.setFont(fnt) ;
		lab.setForeground(Color.RED) ;
		lab.setBackground(Color.YELLOW) ;//设置窗体的背景颜色
		frame.add(lab) ;	// 将组件件入到面板之中
		Dimension dim = new Dimension() ;
		frame.setBackground(Color.WHITE) ;//设置窗体的背景颜色
		dim.setSize(500,400) ;
		frame.setSize(dim) ;
		Point point = new Point(200,100) ;	// 设置坐标
		frame.setLocation(point) ;
		frame.setVisible(true) ;

	}

}
