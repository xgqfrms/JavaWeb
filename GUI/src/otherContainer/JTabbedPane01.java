package otherContainer;

import java.io.File ;
import java.awt.Container ;
import javax.swing.JPanel ;
import javax.swing.JButton ;
import javax.swing.ImageIcon ;
import javax.swing.JLabel ;
import javax.swing.JFrame ;
import javax.swing.JTabbedPane ;
public class JTabbedPane01 {
	public static void main(String args[]){
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
		String picPath = File.separator + "nba.gif" ;
		tab.addTab("ͼƬѡ��",new ImageIcon(picPath),pan1,"ͼ��") ;
		tab.addTab("����ѡ��",pan2) ;	
		cont.add(tab) ;
		frame.setSize(330,120) ;// ��������Զ�������С
		frame.setLocation(300,200) ;
		frame.setVisible(true) ;
	}
};