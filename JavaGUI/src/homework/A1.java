package homework;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ActionHandle {
	// 定义string
	String str1 = null, str2 = null;
	// 创建窗体
	JFrame frame1 = new JFrame("成绩等级 计算器");

	// 创建面板
	JPanel panel1 = new JPanel();
	JLabel label1 = new JLabel("输入分数:", JLabel.CENTER);
	JLabel label2 = new JLabel("成绩等级:", JLabel.CENTER);
	// 创建按钮
	JButton button1 = new JButton("计算");
	Font font1 = new Font("Arial", Font.BOLD, 36);

	public ActionHandle() {
		// 创建输入框
		final JTextField text1 = new JTextField(12);
		final JTextField text2 = new JTextField(12);
		// 设置label颜色RGB
		label1.setOpaque(true);// 此句很重要设置JLabel可以更改背景颜色
		label1.setBackground(new Color(255, 0, 255));
		label2.setOpaque(true);// 此句很重要设置JLabel可以更改背景颜色
		label2.setBackground(new Color(255, 255, 0));
		button1.setOpaque(true);// 此句很重要设置JLabel可以更改背景颜色
		button1.setBackground(new Color(127, 255,127));
//		// 设置字体
//		button1.setFont(font1);

		text1.setText("00");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 判断是否是按钮
				if (e.getSource() == button1) {
					text1.setText(text1.getText());
					str1 = text1.getText();
					if ((Integer.parseInt(str1) >= 90)
							&& (Integer.parseInt(str1) <= 100)) {
						str2 = "A";
						text2.setText(str2);
					} else if ((Integer.parseInt(str1) >= 80)
							&& (Integer.parseInt(str1) <= 89)) {
						str2 = "B";
						text2.setText(str2);
					} else if ((Integer.parseInt(str1) >= 70)
							&& (Integer.parseInt(str1) <= 79)) {
						str2 = "C";
						text2.setText(str2);
					} else if ((Integer.parseInt(str1) >= 60)
							&& (Integer.parseInt(str1) <= 69)) {
						str2 = "D";
						text2.setText(str2);
					} else if ((Integer.parseInt(str1) >= 0)
							&& (Integer.parseInt(str1) <= 59)) {
						str1 = "E";
						text2.setText(str1);
					} else {
						text1.setText("分数范围错误!");
						text2.setText("?");
					}

				}
			}
		});
		frame1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
		// 创建布局
		FlowLayout fl1 = new FlowLayout(FlowLayout.CENTER, 20, 12);// 对齐,H间距,V间距
		// 现在所有的内容都加入到了JPanel1之中
		panel1.add(label1);
		panel1.add(text1);
		panel1.add(label2);
		panel1.add(text2);
		panel1.add(button1);
		panel1.setBackground(Color.blue);
		panel1.setBounds(0, 0, 200, 100);
		panel1.setLayout(fl1);
		frame1.add(panel1);// 将面板加入到窗体之上
		// 设置属性
		frame1.setLayout(fl1);// 参数null可以取消frame布局,使用绝对布局
		frame1.setBounds(50, 50, 700, 300);// 绝对布局
		frame1.setForeground(Color.BLUE); // 将背景设置成蓝色
		frame1.setBackground(Color.RED); // 设置窗体的背景颜色????????????????????
		frame1.setVisible(true); // 让组件可见
	}
}

public class A1 {
	public static void main(String[] args) {
		new ActionHandle();
	}

}
