package jpanel;

import java.awt.Container;
//import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Jpanel03 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome TO MLDN") ; // ʵ�����������
		Container cont = frame.getContentPane() ;
		JTabbedPane tab = null ;
		tab = new JTabbedPane(JTabbedPane.TOP) ;// ���ñ�ǩ�ڶ�����ʾ
		JPanel pan1 = new JPanel() ;
		JPanel pan2 = new JPanel() ;
		JButton but = new JButton("��ť") ;
		JLabel lab = new JLabel("��ǩ") ;
		pan1.add(but) ;
		pan2.add(lab) ;
		String picPath = "x.png" ;
		tab.addTab("ͼƬѡ��",new ImageIcon(picPath),pan1,"ͼ��") ;
		tab.addTab("����ѡ��",pan2) ;	
		cont.add(tab) ;
		frame.setSize(500,400) ;// ��������Զ�������С
		frame.setLocation(200,100) ;
		frame.setVisible(true) ;

	}

}
