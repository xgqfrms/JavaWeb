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
		JLabel lab = new JLabel("MLDN",JLabel.CENTER) ;	// ʵ������ǩ����
		Font f = new Font("Arial",Font.BOLD,36);
		lab.setFont(f);
		lab.setForeground(Color.RED);
		frame.add(lab) ;	// ��������뵽���֮��(Ĭ�ϲ����Ǳ߽粼�֣���ָ��ʱ��Ĭ��ȫ���)
		Dimension dim = new Dimension(500,400) ;
		//dim.setSize(500,400) ;
		frame.setSize(dim) ;
		frame.setBackground(Color.BLUE) ;//���ô���ı�����ɫ����
		Point point = new Point(200,100) ;	// �������Ͻ�����
		frame.setLocation(point) ;
		frame.setVisible(true) ;
	}

}
