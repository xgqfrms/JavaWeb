package jframe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class Jframe02 {

	public static void main(String[] args) {
		JFrame f = new JFrame("��һ��Swing����") ;
		Dimension d = new Dimension() ;
		d.setSize(500,400) ;
		f.setSize(d) ;	// ��������Ĵ�С
		f.setBackground(Color.WHITE) ;	// ���������óɰ�ɫ
		Point p = new Point(200,100) ;	// ָ���������ʾλ��
		f.setLocation(p) ;	// �����������ʾλ��
		f.setVisible(true) ;	// ������ɼ�

	}

}
