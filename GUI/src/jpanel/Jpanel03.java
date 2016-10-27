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
		JFrame frame = new JFrame("Welcome TO MLDN") ; // 实例化窗体对象
		Container cont = frame.getContentPane() ;
		JTabbedPane tab = null ;
		tab = new JTabbedPane(JTabbedPane.TOP) ;// 设置标签在顶部显示
		JPanel pan1 = new JPanel() ;
		JPanel pan2 = new JPanel() ;
		JButton but = new JButton("按钮") ;
		JLabel lab = new JLabel("标签") ;
		pan1.add(but) ;
		pan2.add(lab) ;
		String picPath = "x.png" ;
		tab.addTab("图片选项",new ImageIcon(picPath),pan1,"图象") ;
		tab.addTab("文字选项",pan2) ;	
		cont.add(tab) ;
		frame.setSize(500,400) ;// 根据组件自动调整大小
		frame.setLocation(200,100) ;
		frame.setVisible(true) ;

	}

}
