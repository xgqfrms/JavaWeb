package jframe;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

public class Jframe01 {

	public static void main(String[] args) {
		JFrame f = new JFrame("��һ��Swing����") ;
		Font f1 = new Font("Arial",Font.BOLD,36);
		//f.setForeground(Color.BLUE);
		f.setFont(f1);
		f.setSize(500,400) ;	// ��������Ĵ�С
		f.setLocation(200,100) ;	// �����������ʾλ��
		f.setBackground(Color.RED) ;	// ���������óɰ�ɫ
		f.setVisible(true) ;	// ������ɼ�
	}

}
