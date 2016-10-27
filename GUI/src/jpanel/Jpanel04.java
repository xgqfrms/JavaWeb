package jpanel;

import java.awt.Container;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Jpanel04 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome TO MLDN") ; // 实例化窗体对象
		Container cont = frame.getContentPane() ;
		String picPath = "nba.gif" ;
		//String picPath = "d:" + File.separator + "mldn.gif" ;
		Icon icon = new ImageIcon(picPath) ;	// 实例化Icon对象
		JPanel pan = new JPanel() ;
		JLabel lab = new JLabel(icon) ;
		JScrollPane scr1 = null ;
		// 设置垂直和水平的滚动条一直显示
		scr1 = new JScrollPane(pan,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS) ;
		pan.add(lab) ;
		cont.add(scr1) ;
		frame.setSize(250,220) ;// 根据组件自动调整大小
		frame.setLocation(200,100) ;
		frame.setVisible(true) ;

	}

}
