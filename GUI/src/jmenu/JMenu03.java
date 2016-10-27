package jmenu;

import java.awt.event.WindowAdapter ;
import java.awt.event.WindowEvent ;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;
import java.awt.Container ;
import java.io.File ;
import javax.swing.JFrame ;
import javax.swing.ImageIcon ;
import javax.swing.JTextArea ;
import javax.swing.JScrollPane ;
import javax.swing.JMenu ;
import javax.swing.KeyStroke ;
import javax.swing.JMenuBar ;
import javax.swing.JMenuItem ;

public class JMenu03{
	public static void main(String args[]){
		JFrame frame = new JFrame("Welcome To MLDN") ;
		final JTextArea text = new JTextArea() ;
		text.setEditable(true) ;	// �ɱ༭
		frame.getContentPane().add(new JScrollPane(text)) ;	// ���������
		JMenu menuFile = new JMenu("�ļ�") ;
		menuFile.setIcon(new ImageIcon("icons"+File.separator+"file.gif")) ;
		JMenuBar menuBar = new JMenuBar() ;
		menuBar.add(menuFile) ;

		JMenuItem newItem = new JMenuItem("�½�",new ImageIcon("icons"+File.separator+"new.gif")) ;
		JMenuItem openItem = new JMenuItem("��",new ImageIcon("icons"+File.separator+"open.gif")) ;
		JMenuItem closeItem = new JMenuItem("�ر�",new ImageIcon("icons"+File.separator+"close.gif")) ;
		JMenuItem exitItem = new JMenuItem("�˳�",new ImageIcon("icons"+File.separator+"exit.gif")) ;

		// ��ʱ���������ĸ��˵���ѡ��������֮�����ӿ�ݼ�
		newItem.setMnemonic('N') ;
		openItem.setMnemonic('O') ;
		closeItem.setMnemonic('C') ;
		exitItem.setMnemonic('E') ;

		newItem.setAccelerator(KeyStroke.getKeyStroke('N',java.awt.Event.CTRL_MASK)) ;
		openItem.setAccelerator(KeyStroke.getKeyStroke('O',java.awt.Event.CTRL_MASK)) ;
		closeItem.setAccelerator(KeyStroke.getKeyStroke('C',java.awt.Event.ALT_MASK)) ;
		exitItem.setAccelerator(KeyStroke.getKeyStroke('E',java.awt.Event.ALT_MASK)) ;

		newItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text.append("=== ѡ���ˡ��½����˵���\n") ;
			}
		}) ;

		openItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text.append("=== ѡ���ˡ��򿪡��˵���\n") ;
			}
		}) ;

		closeItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text.append("=== ѡ���ˡ��رա��˵���\n") ;
			}
		}) ;

		exitItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text.append("=== ѡ���ˡ��˳����˵���\n") ;
			}
		}) ;

		menuFile.add(newItem) ;
		menuFile.add(openItem) ;
		menuFile.add(closeItem) ;
		menuFile.add(exitItem) ;

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