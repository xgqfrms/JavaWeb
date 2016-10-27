package softwaretesting;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ActionHandle {
	// 定义常变量 const
	int y1 = 1800, y2 = 2050;
	int m1 = 1, m2 = 12;
	int d1 = 1, d2 = 31;
	int i1 = 0, i2 = 0, i3 = 0;
	int array1[] = { 1, 3, 5, 7, 8, 10, 12 };// 31days
	int array2[] = { 4, 6, 9, 11 };// 30days
	int[]  i=new int[3];
	
	// 定义string
	String str1 = null, str2 = null, str3 = null;
	// 定义boolean
	boolean t1 = false, t2 = false, t3 = false;
	// 创建窗体
	JFrame frame1 = new JFrame("NextDay: 可以输入范围:1800-00-00~2050-00-00");

	// 创建面板
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	// 创建标签
	JLabel labela = new JLabel(
			"请输入今天的日期:"
					+ '\n'
					+ "                                                                                                                                                                                                                    ",
			JLabel.LEFT);
	JLabel labelb = new JLabel(
			"明天的日期为:"
					+ '\n'
					+ "                                                                                                                                                 ",
			JLabel.LEFT);

	JLabel label1 = new JLabel("年", JLabel.CENTER);
	JLabel label2 = new JLabel("月", JLabel.CENTER);
	JLabel label3 = new JLabel("日", JLabel.CENTER);

	// 创建按钮
	JButton button1 = new JButton("确认");
	JButton button2 = new JButton("取消");
	JButton button3 = new JButton("计算");
	JButton button4 = new JButton("清除输入");
	// 创建字体
	Font font1 = new Font("Arial", Font.BOLD, 36);
	Font font2 = new Font("Arial", Font.CENTER_BASELINE, 36);

	Font f2 = new Font("华文行楷", Font.BOLD, 18);

	// leap year handle function
	public boolean funcLeapYear(int year) {
		if (((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0))) {
			// 29days
			return true;
		} else {
			// 28days
			return false;
		}
	}

	// day adding handle function
	public int[] funAddingDay(int year, int month, int day) {
		int y = year;
		int m = month;
		int d = day;

		// 31days
		if ((m == array1[0] && day != 31) || (m == array1[1] && day != 31)
				|| (m == array1[2] && day != 31)
				|| (m == array1[3] && day != 31)
				|| (m == array1[4] && day != 31)
				|| (m == array1[5] && day != 31)
				|| (m == array1[6] && day != 31)
				|| (month == 2 && day != 29 && funcLeapYear(year))
				|| (month == 2 && day != 28 && !funcLeapYear(year))
				|| (month == array2[0] && day != 30)
				|| (month == array2[1] && day != 30)
				|| (month == array2[2] && day != 30)
				|| (month == array2[3] && day != 30)) {
			d = d + 1;
		} else if ((m == array1[0] && day == 31)
				|| (m == array1[1] && day == 31)
				|| (m == array1[2] && day == 31)
				|| (m == array1[3] && day == 31)
				|| (m == array1[4] && day == 31)
				|| (m == array1[5] && day == 31)
				|| (month == 2 && day == 29 && funcLeapYear(year))
				|| (month == 2 && day == 28 && !funcLeapYear(year))
				|| (month == array2[0] && day == 30)
				|| (month == array2[1] && day == 30)
				|| (month == array2[2] && day == 30)
				|| (month == array2[3] && day == 30)) {
			d = 1;
			m = m + 1;
		} else if ((month == array1[6] && day == 31)) {
			d = 1;
			m = 1;
			y = y + 1;
		}
//返回字符串
//		return y+""+m+""+d+"";
		int i[]=new int[3];
		i[0]=y;
		i[1]=m;
		i[2]=d;
		return i;
	}

	public ActionHandle() {
		// 设置label颜色RGB
		labela.setOpaque(true);// 此句很重要设置JLabel可以更改背景颜色
		labela.setBackground(new Color(255, 0, 255));
		labelb.setOpaque(true);// 此句很重要设置JLabel可以更改背景颜色
		labelb.setBackground(new Color(255, 255, 0));
		// 设置字体
		button1.setFont(f2);
		button2.setFont(f2);
		button3.setFont(f2);
		button4.setFont(f2);
		// 创建输入框
		JTextField text1 = new JTextField(12);
		JTextField text2 = new JTextField(12);
		JTextField text3 = new JTextField(12);
		JTextField text4 = new JTextField(60);
		// text4.setForeground(Color.RED);

		// 确定事件监听器(年/月/日)
		// text1.setText("年份范围为[1800-2050]");
		// text2.setText("月份范围为[1-12]");
		// text3.setText("日范围为[1-31]");
		text1.setText("0000");
		text2.setText("00");
		text3.setText("00");
		// 确定
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 判断是否是按钮
				if (e.getSource() == button1) {
					// 添加正则表达式 验证输入数据是否满足 XXXX-XX-XX的日期格式
					// 正则表达式[1][8-9][0-9][0-9]/[2][0][0-4][0-9]/[2][0][5][0]
					// 字符转整形方法 Integer.parseInt(str1);
					text1.setText(text1.getText());
					text2.setText(text2.getText());
					text3.setText(text3.getText());

					str1 = text1.getText();
					str2 = text2.getText();
					str3 = text3.getText();

					if ((Integer.parseInt(str1) >= y1)
							&& (Integer.parseInt(str1) <= y2)
							&& (Integer.parseInt(str2) >= m1)
							&& (Integer.parseInt(str2) <= m2)
							&& (Integer.parseInt(str3) >= d1)
							&& (Integer.parseInt(str3) <= d2)) {
						// flag 旗标
						t1 = true;
						text1.setFont(f2);
						text2.setFont(f2);
						text3.setFont(f2);
						// 判断处理,进位吗?

						if (t1) {
							t2 = true;
//							funAddingDay(Integer.parseInt(str1),
//									Integer.parseInt(str2),
//									Integer.parseInt(str3));
							i1 =funAddingDay(Integer.parseInt(str1),
									Integer.parseInt(str2),
									Integer.parseInt(str3))[0] ;
							i2 =funAddingDay(Integer.parseInt(str1),
									Integer.parseInt(str2),
									Integer.parseInt(str3))[1];
							i3 = funAddingDay(Integer.parseInt(str1),
									Integer.parseInt(str2),
									Integer.parseInt(str3))[2];
						}

					} else {
						text1.setForeground(Color.RED);
						text1.setText("格式错误,请重新输入!");
					}

				}

				else
					Error();
			}
		});

		// 添加事件监听器_取消
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 判断按钮
				if (e.getSource() == button2) {
					// 清空所有内容
					text1.setText("");
					text2.setText("");
					text3.setText("");
				} else
					Error();
			}
		});
		// 添加事件监听器_计算
		text4.setText("用户输入信息显示处！");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 判断是否是按钮
				if (e.getSource() == button3) {
					// 添加正则表达式 验证输入数据是否满足 XXXX-XX-XX的日期格式
					// 字符转整形??
					if (t1&&t2) {
						text4.setText(i1 + "-" + i2 + "-" + i3);
					} else {
						text4.setForeground(Color.RED);
						text4.setText("Error !");
					}

				} else
					Error();
			}
		});
		// 添加事件监听器_清除输入
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 判断按钮
				if (e.getSource() == button4) {
					// 清空所有内容
					text1.setText("");
					text2.setText("");
					text3.setText("");
					text4.setText("");
				}
			}
		});
		frame1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
		// 创建布局
		GridLayout gl1 = new GridLayout(2, 3);// 设置网格布局(h,v)
		FlowLayout fl1 = new FlowLayout(FlowLayout.CENTER, 20, 12);// 对齐,H间距,V间距
		// 设置流式布局(panel默认布局)从左到右 依次

		// 现在所有的内容都加入到了JPanel1之中
		panel1.add(labela);
		panel1.add(label1);
		panel1.add(text1);
		panel1.add(label2);
		panel1.add(text2);
		panel1.add(label3);
		panel1.add(text3);
		panel1.add(button1);
		panel1.add(button2);

		// panel1.setSize(200, 100);
		// panel1.setLocation(0, 0);
		panel1.setBackground(Color.blue);
		panel1.setBounds(0, 0, 200, 100);
		panel1.setLayout(fl1);
		// panel1.setLayout(null);//设置绝对布局
		frame1.add(panel1);// 将面板加入到窗体之上

		// 现在所有的内容都加入到了JPanel2之中
		panel2.add(labelb);
		// text4.setEditable(false);
		text4.setEnabled(false);
		text4.setForeground(Color.RED);// 前景色
		panel2.add(text4);// 显示消息框(只读)
		panel2.add(button3);
		panel2.add(button4);

		// panel2.setSize(200, 100);
		// panel2.setLocation(0, 0);
		panel2.setBackground(Color.green);
		panel2.setBounds(0, 0, 200, 100);
		panel2.setLayout(fl1);
		frame1.add(panel2);// 将面板加入到窗体之上
		// 设置属性

		frame1.setLayout(gl1);// 参数null可以取消frame布局,使用绝对布局
		frame1.setBounds(50, 50, 770, 400);// 绝对布局
		frame1.setFont(font2);
		// frame1.setForeground(Color.BLUE); // 将前景色设置成蓝色
		frame1.setBackground(Color.RED); // 设置窗体的背景颜色？
		frame1.setVisible(true); // 让组件可见
	}

	protected void Error() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "sorry，有异常正在处理中......");// 异常处理

	}
}

public class NextDay {
	public static void main(String[] args) {
		new ActionHandle();

	}

}
