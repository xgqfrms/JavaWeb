package test_JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabel01 {
	public static void main(String args[]){
		JFrame f = new JFrame("Swing �������");
		//IconͼƬ��
		JLabel lab = new JLabel("�Ĺ�Ǭ",JLabel.CENTER);
		//����
		Container c = f.getContentPane();
		c.add(lab);
		
		Dimension d = new Dimension();
		d.setSize(700, 400);
		f.setSize(d);
		f.setBackground(Color.BLUE);
		Point p = new Point();
		p.setLocation(300, 90);
		f.setLocation(p);
		f.setVisible(true);
	}

}