package test_JLabel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabel03 {
	public static void main(String args[]){
		JFrame fra = new JFrame("Swing �������");
		JLabel lab = new JLabel("�Ĺ�Ǭ\n-�������",JLabel.CENTER);//Where my \n ?
		//����
		Font fon = new Font("΢���ź�",Font.BOLD+Font.ITALIC,37);
		lab.setFont(fon);
		lab.setForeground(Color.RED);
		//����
		Container con = fra.getContentPane();
		con.add(lab);
		
		Dimension dim = new Dimension();
		dim.setSize(700, 400);
		fra.setSize(dim);
		fra.setBackground(Color.GREEN);//Where my Background Color?
		Point poi = new Point();
		poi.setLocation(300, 90);
		fra.setLocation(poi);
		fra.setVisible(true);
	}
}
