package jmenu;

import java.awt.event.WindowAdapter ;
import java.awt.event.WindowEvent ;
import java.awt.Container ;
import java.io.File ;
import javax.swing.JFrame ;
import javax.swing.ImageIcon ;
import javax.swing.JTextArea ;
import javax.swing.JScrollPane ;
import javax.swing.JMenu ;
import javax.swing.JMenuBar ;

public class JMenu01{
	public static void main(String args[]){
		JFrame frame = new JFrame("Welcome To MLDN") ;
		JTextArea text = new JTextArea() ;
		text.setEditable(true) ;	// �ɱ༭
		frame.getContentPane().add(new JScrollPane(text)) ;	// ���������
		JMenu menuFile = new JMenu("�ļ�") ;
		menuFile.setIcon(new ImageIcon("icons"+File.separator+"file.gif")) ;
		JMenuBar menuBar = new JMenuBar() ;
		menuBar.add(menuFile) ;
		frame.setJMenuBar(menuBar) ;	// �˵�����Ҫͨ���˷������ӵ�
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(1) ;
			}
		}) ;
		frame.setVisible(true) ;
		frame.setSize(300,100) ;
		frame.setLocation(300,200) ;
	}
}