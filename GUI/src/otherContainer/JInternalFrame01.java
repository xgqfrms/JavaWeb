package otherContainer;

import java.io.File;
import java.awt.Container;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;

public class JInternalFrame01 {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Welcome TO MLDN"); // 实例化窗体对象
		Container cont = frame.getContentPane();
		JDesktopPane desk = new JDesktopPane(); // 定义窗体的容器
		cont.add(desk, BorderLayout.CENTER); // 设置显示样式
		cont.add(new JLabel("内部窗体"), BorderLayout.SOUTH);
		JInternalFrame jif = null;
		String picPath = File.separator + "nba.gif";
		Icon icon = new ImageIcon(picPath); // 实例化Icon对象
		JPanel pan = null;
		for (int i = 0; i < 3; i++) {
			jif = new JInternalFrame("MLDN-" + i, true, true, true, true);
			pan = new JPanel();
			pan.add(new JLabel(icon)); // 加入标签
			jif.setLocation(35 - i * 10, 35 - i * 10); // 设置显示位置
			jif.add(pan);
			jif.pack();
			jif.setVisible(true);
			desk.add(jif);
		}

		frame.setSize(700, 400);// 根据组件自动调整大小
		frame.setLocation(100, 100);
		frame.setVisible(true);
	}
};