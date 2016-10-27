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
import javax.swing.KeyStroke ;
import javax.swing.JMenuBar ;
import javax.swing.JMenuItem ;

public class JMenu02{
	public static void main(String args[]){
		JFrame frame = new JFrame("Welcome To MLDN") ;
		JTextArea text = new JTextArea() ;
		text.setEditable(true) ;	// 可编辑
		frame.getContentPane().add(new JScrollPane(text)) ;	// 加入滚动条
		JMenu menu1 = new JMenu("文件") ;
		//menuFile.setIcon(new ImageIcon("d:"+File.separator+"icons"+File.separator+"file.gif")) ;
		menu1.setIcon(new ImageIcon("icons"+File.separator+"file.gif")) ;
		//创建JMenuBar 容器
		JMenuBar menuBar = new JMenuBar() ;
		menuBar.add(menu1) ;
		// 此时定义完了四个菜单的选项
		JMenuItem newItem = new JMenuItem("新建",new ImageIcon("icons"+File.separator+"new.gif")) ;
		JMenuItem openItem = new JMenuItem("打开",new ImageIcon("icons"+File.separator+"open.gif")) ;
		JMenuItem closeItem = new JMenuItem("关闭",new ImageIcon("icons"+File.separator+"close.gif")) ;
		JMenuItem exitItem = new JMenuItem("退出",new ImageIcon("icons"+File.separator+"exit.gif")) ;

		//增加快捷键
		newItem.setMnemonic('N') ;
		openItem.setMnemonic('O') ;
		closeItem.setMnemonic('C') ;
		exitItem.setMnemonic('E') ;

		newItem.setAccelerator(KeyStroke.getKeyStroke('N',java.awt.Event.CTRL_MASK)) ;
		openItem.setAccelerator(KeyStroke.getKeyStroke('O',java.awt.Event.CTRL_MASK)) ;
		closeItem.setAccelerator(KeyStroke.getKeyStroke('C',java.awt.Event.ALT_MASK)) ;
		exitItem.setAccelerator(KeyStroke.getKeyStroke('E',java.awt.Event.ALT_MASK)) ;

		menu1.add(newItem) ;
		menu1.add(openItem) ;
		menu1.add(closeItem) ;
		menu1.add(exitItem) ;

		frame.setJMenuBar(menuBar) ;	// 菜单是需要通过此方法增加的
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
