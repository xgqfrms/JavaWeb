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
		JLabel lab = new JLabel("MLDN",JLabel.CENTER) ;	// ʵ������ǩ����
		Font fnt = new Font("Arial Unicode MS",Font.ITALIC + Font.BOLD,28) ;
		lab.setFont(fnt) ;
		lab.setForeground(Color.RED);
		frame.add(lab) ;	// ��������뵽���֮��
		Dimension dim = new Dimension() ;
		dim.setSize(500,400) ;
		frame.setSize(dim) ;
		
		Color bgColor = new Color(0, 0, 0);
		frame.setBackground(bgColor);
		//frame.setBackground(Color.BLUE) ;//���ô���ı�����ɫ  ???
		Point point = new Point(200,100) ;	// ��������
		frame.setLocation(point) ;
		frame.setVisible(true) ;

	}

}
