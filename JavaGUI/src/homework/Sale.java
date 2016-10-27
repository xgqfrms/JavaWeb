package homework;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Sale {

	// GUI
	String str1 = null, str2 = null, str3 = null, str4 = null;
	// 定义boolean
	boolean t1 = false, t2 = false, t3 = false;
	// 创建窗体
	JFrame frame1 = new JFrame("Sale profit:"+"Made by xgqfrms");

	// 创建面板
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JLabel label1 = new JLabel("白酒销量:", JLabel.CENTER);
	JLabel label2 = new JLabel("红酒销量:", JLabel.CENTER);
	JLabel label3 = new JLabel("啤酒销量:", JLabel.CENTER);
	JLabel label4 = new JLabel("结果:", JLabel.CENTER);

	// 创建按钮
	JButton button1 = new JButton("计算奖金");
	JButton button2 = new JButton("清除输入内容");
	// 创建字体
	Font font1 = new Font("Arial", Font.BOLD, 36);
	Font font2 = new Font("Arial", Font.CENTER_BASELINE, 36);

	Font f2 = new Font("华文行楷", Font.BOLD, 18);
    int x1 = 168, x2 = 120, x3 = 5;// 白酒、红酒和啤酒的单价分别为168元/瓶、 120元/瓶、5元/瓶。

	 int a1 = 5000, a2 = 3000, a3 = 30000;// 每月的最高供应量:白酒为5000瓶，红酒为3000瓶，啤酒为30000瓶。
	 int b1 = 50, b2 = 30, b3 = 300;// 各销售员每月至少需售出白酒50瓶，红酒30瓶，啤酒300瓶。

	 int c1 = 0, c2 = 0, c3 = 0, c4 = 0;// 实际销售额
	// 创建输入框
	JTextField text1 = new JTextField(12);// 白酒
	JTextField text2 = new JTextField(12);// 红酒
	JTextField text3 = new JTextField(12);// 啤酒
	JTextArea ta1 =new JTextArea();
	JTextArea ta2 =new JTextArea();
	//JTextField text4 = new JTextField(12);//

	public Sale() {

		// 计算销售公司的总销售额和各销售员的佣金。

		// 设置字体
		button1.setFont(f2);
		button1.setBounds(350, 50, 150, 50);
		button2.setFont(f2);
		button2.setBounds(550, 50, 150, 50);
		text1.setText("00");
		text2.setText("00");
		text3.setText("00");
		ta1.setLocation(20, 20);
		ta1.setSize(300, 200);
		ta1.setText(" 输出结果！");
		ta1.setVisible(true);
		//text4.setEditable(false);
		ta1.setEnabled(false);
		ta2.setLocation(20, 20);
		ta2.setSize(300, 200);
		ta2.setText("各销售员每月至少需售出白酒50瓶，红酒30瓶，啤酒300瓶。\n每月的最高供应量:白酒为5000瓶，红酒为3000瓶，啤酒为30000瓶。\n白酒、红酒和啤酒的单价分别为168元/瓶、 120元/瓶、5元/瓶。");
		ta2.setVisible(true);
		//text4.setEditable(false);
		ta2.setEnabled(false);

		// 确定
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 判断是否是按钮
				if (e.getSource() == button1) {
					// 添加正则表达式 验证输入数据是否满足 XXXX-XX-XX的日期格式
					// 字符转整形??
					text1.setText(text1.getText());
					text2.setText(text2.getText());
					text3.setText(text3.getText());
					str1 = text1.getText();
					str2 = text2.getText();
					str3 = text3.getText();

					ta1.setText(ta1.getText());
					str4 = ta1.getText();

					if (((Integer.parseInt(str1) >= b1) && (Integer
							.parseInt(str1) <= a1))
							&& ((Integer.parseInt(str2) >= b2) && (Integer
									.parseInt(str2) <= a2))
							&& ((Integer.parseInt(str3) >= b3) && (Integer
									.parseInt(str3) <= a3))) {
						
							c1 = Integer.parseInt(str1) * x1;
							c2 = Integer.parseInt(str2) * x2;
							c3 = Integer.parseInt(str3) * x3;
							c4 = c1 + c2 + c3;
							str4 = ":" + c4;
							ta1.setFont(f2);
							ta1.setText("利润结果统计表:"+"\n\t白酒利润:"+c1+"\n\t红酒利润:"+c2+"\n\t啤酒利润:"+c3+"\n总利润"+str4);
						
					}else{
						str4="出錯了！";
						text1.setText(str4);
						text2.setText(str4);
						text3.setText(str4);
						ta1.setText(str4);
					}

				}

			}
		});
		// 确定
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 判断是否是按钮
				if (e.getSource() == button2) {
					// 添加正则表达式 验证输入数据是否满足 XXXX-XX-XX的日期格式
					// 字符转整形??

					text1.setText("");
					text2.setText("");
					text3.setText("");
					ta1.setText("请输入数据!");

				}

			}
		});
		frame1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});

		// 创建布局
		// GridLayout gl1 = new GridLayout(2, 3);// 设置网格布局(h,v)
		FlowLayout fl1 = new FlowLayout(FlowLayout.CENTER, 20, 12);// 对齐,H间距,V间距{设置流式布局(panel默认布局)从左到右
																	// 依次}
		// 现在所有的内容都加入到了JPanel1之中
		panel1.add(label1);
		panel1.add(text1);
		panel1.add(label2);
		panel1.add(text2);
		panel1.add(label3);
		panel1.add(text3);
		panel1.add(ta2);

		panel1.setSize(770, 300);// panel1.setBounds(0, 0, 200, 100);
		panel1.setLocation(10, 10);
		panel1.setBackground(Color.green);
		panel1.setLayout(fl1);

		panel2.add(label4);
		panel2.add(ta1);
		panel2.add(button1);
		panel2.add(button2);

		panel2.setSize(770, 300);
		panel2.setLayout(null);
		panel2.setLocation(10, 320);//
		panel2.setBackground(Color.blue);
//		panel2.setLayout(fl1);
		frame1.setResizable(false);
		frame1.add(panel1);// 将面板加入到窗体之上
		frame1.add(panel2);// 将面板加入到窗体之上
		// 设置属性
		frame1.setLayout(null);// 参数null可以取消frame布局,使用绝对布局
		frame1.setBounds(200, 30, 800, 670);// 绝对布局
		frame1.setFont(font2);
		frame1.setBackground(Color.RED); // 设置窗体的背景颜色？//frame1.setForeground(Color.BLUE);将前景色设置成蓝色
		frame1.setVisible(true); // 让组件可见

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Sale();
	}

}
