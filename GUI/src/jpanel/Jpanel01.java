package jpanel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jpanel01 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome TO MLDN") ; // 实例化窗体对象
		JPanel pan = new JPanel() ;	// 准备好了一个面板
		// 现在所有的内容都加入到了JPanel之中
		pan.add(new JLabel("标签-A")) ;
		pan.add(new JLabel("标签-B")) ;
		pan.add(new JLabel("标签-C")) ;
		pan.add(new JButton("按钮-X")) ;
		pan.add(new JButton("按钮-Y")) ;
		pan.add(new JButton("按钮-Z")) ;
		pan.setSize(300, 200);
		pan.setLocation(50, 100);
		frame.add(pan) ;// 将面板加入到窗体之上
		//frame.pack() ;// 根据组件自动调整大小
		frame.setSize(500, 400);
		frame.setLocation(200,100) ;
		frame.setVisible(true) ;

	}

}
