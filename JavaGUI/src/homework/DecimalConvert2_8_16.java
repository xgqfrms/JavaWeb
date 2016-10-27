package homework;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.im.InputContext;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class DecimalConvert {
	JFrame frame1 = new JFrame("进制转换器");
	JPanel panel1 = new JPanel();
	JLabel label1 = new JLabel("输入:", JLabel.CENTER);
	JLabel label2 = new JLabel("结果:", JLabel.CENTER);
	JButton button1 = new JButton("计算2");
	JButton button2 = new JButton("计算8");
	JButton button3 = new JButton("计算16");
	Font font1 = new Font("Arial", Font.BOLD, 36);
	String str1 = null, str2 = null;
	JTextField text1 = new JTextField(8);
	JTextField text2 = new JTextField(16);

	// 转为2进制

	static void Binary(int n) {// 9
		if (n >= 2)
			Binary(n / 2);// 求整
		System.out.print(n % 2);// 取余
	}

	// 转为8进制
	static void Octal(int n) {// n=19;
		if (n >= 8) {
			Octal(n / 8);
			System.out.print(n % 8);
		} else
			System.out.print(n);
	}

	// 转为16进制
	static void Hexadecimal(int n) {// 27
		if (n >= 16)
			Hexadecimal(n / 16);// 求整
		if (n % 16 < 10)// 取余数
			System.out.print(n % 16);
		else
			System.out.print((char) (n % 16 + 55));// 97='A'
	}

//	public String Hexadecimal(int n) {
//		int z = 0, a = 0;
//		if (n >= 16) {
//			Hexadecimal(n / 16);
//		} else if (n % 6 < 10) {
//			z = (n % 16);
//			// System.out.println(z);
//		} else {
//			a = (n % 16);
//			z = ((char) (a + 55));
//		}
//		return String.valueOf(z);
//	}

	public DecimalConvert() {

		// 设置label颜色RGB
		label1.setOpaque(true);// 此句很重要设置JLabel可以更改背景颜色
		label1.setBackground(new Color(255, 127, 255));
		label2.setOpaque(true);// 此句很重要设置JLabel可以更改背景颜色
		label2.setBackground(new Color(80, 255, 80));
		button1.setOpaque(true);// 此句很重要设置JLabel可以更改背景颜色
		button1.setBackground(new Color(127, 255, 127));
		button2.setOpaque(true);// 此句很重要设置JLabel可以更改背景颜色
		button2.setBackground(new Color(127, 255, 127));
		button3.setOpaque(true);// 此句很重要设置JLabel可以更改背景颜色
		button3.setBackground(new Color(127, 255, 127));

		text1.setText("00");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 判断是否是按钮
				if (e.getSource() == button1) {
					int n = 0;
					text1.setText(text1.getText());
					str1 = text1.getText();
					n = Integer.parseInt(str1);
					System.out.println("Binary: ");
					Binary(n);// static 无返回值 console输出
//					text2.setText("Binary(n)");
					text2.setForeground(Color.RED);
					text2.setText("\n请查看console的输出结果!");
				}
			}
		});
		text1.setText("00");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 判断是否是按钮
				if (e.getSource() == button2) {
					int n = 0;
					text1.setText(text1.getText());
					str1 = text1.getText();
					n = Integer.parseInt(str1);
					System.out.println("\nOctal: ");
					Octal(n);
//					text2.setText("Octal(n)");
					text2.setForeground(Color.GREEN);
					text2.setText("请查看console的输出结果!");
				}
			}
		});
		text1.setText("00");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 判断是否是按钮
				if (e.getSource() == button3) {
					int n = 0;
					text1.setText(text1.getText());
					str1 = text1.getText();
					n = Integer.parseInt(str1);
//					str2 = Hexadecimal(n);
					System.out.println("\nHexadecimal: ");
					Hexadecimal(n);
//					text2.setText("Hexadecimal(n)");
					text2.setForeground(Color.BLUE);
					text2.setText("请查看console的输出结果!");
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
		panel1.add(button2);
		panel1.add(button3);
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

public class DecimalConvert2_8_16 {
	public static void main(String[] args) {
		new DecimalConvert();
	}

}