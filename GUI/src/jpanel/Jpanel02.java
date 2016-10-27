package jpanel;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Jpanel02 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome TO MLDN") ; // 实例化窗体对象
		Container cont = frame.getContentPane() ;
		//JPanel pan = new JPanel() ;	// 准备好了一个面板
		JSplitPane lfsplit = null ;	// 左右分割
		JSplitPane tpsplit = null ;	// 上下分割

		lfsplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,new JLabel("左标签"),new JLabel("右标签")) ;
		lfsplit.setDividerSize(15) ;	// 设置左右分割条的分割线大小
		lfsplit.setOneTouchExpandable(true);//快速折叠/展开 按钮
		tpsplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT,lfsplit,new JLabel("下标签")) ;
		tpsplit.setDividerSize(15) ;	// 设置左右分割条的分割线大小
		tpsplit.setOneTouchExpandable(true) ;
		cont.add(tpsplit) ;
		frame.pack() ;// 根据组件自动调整大小
		frame.setSize(500, 400);
		frame.setLocation(200,100) ;
		frame.setVisible(true) ;

	}

}
