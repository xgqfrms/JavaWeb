package jtext;

import java.awt.GridLayout ;

import javax.swing.JFrame ;
import javax.swing.JTextArea ;
import javax.swing.JScrollPane ;
import javax.swing.JLabel ;

public class JTextArea02{
	public static void main(String args[]){
		//����frame
		JFrame frame = new JFrame("Welcome To MLDN") ;
		//����Label
		JLabel lab = new JLabel("�����ı���") ;
		//�����ı���
		JTextArea jta = new JTextArea(10,10) ;	// ����???��С??
		//�������ı���Ĺ�����,
		JScrollPane scr = new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS ) ;
		//������
		frame.add(lab) ;//��ǩ��
		frame.add(scr) ;
		//��������
		frame.setLayout(new GridLayout(2,1)) ;	// ���񲼾ֹ�����
		
		frame.setSize(400,300) ;
		frame.setLocation(100,100) ;
		frame.setVisible(true) ;
	}
};