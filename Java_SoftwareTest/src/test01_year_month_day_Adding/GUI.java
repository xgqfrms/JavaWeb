package test01_year_month_day_Adding;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//import event.ActionHandle;

public class GUI {

	public static void main(String[] args) {
		
		// 创建窗体
		JFrame frame1 = new JFrame("NextDay");
		
		// 创建面板
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		// 创建标签
		JLabel labela = new JLabel("请输入今天的日期:"+'\n'+"                                                                                                                                                                                                                    ",JLabel.LEFT);
		JLabel labelb = new JLabel("明天的日期为:"+'\n'+"                                                                                                                                                 ",JLabel.LEFT);
		JLabel label1 = new JLabel("年",JLabel.CENTER);
		JLabel label2 = new JLabel("月",JLabel.CENTER);
		JLabel label3 = new JLabel("日",JLabel.CENTER);
		
		// 创建按钮
		JButton button1 = new JButton("确认");
		JButton button2 = new JButton("取消");
		JButton button3 = new JButton("计算");
		JButton button4 = new JButton("清除输入");
		// 创建字体
		Font font1 = new Font("Arial", Font.BOLD, 36);
		Font f2 = new Font("华文行楷",Font.BOLD,18);
		//设置字体
		button1.setFont(f2);
		button2.setFont(f2);
		button3.setFont(f2);
		button4.setFont(f2);
		//创建输入框
		JTextField text1 = new JTextField(12);
		JTextField text2 = new JTextField(12);
		JTextField text3 = new JTextField(12);
		JTextField text4 = new JTextField(60);
		//消息框
		//JOptionPane jop1 = new JOptionPane();
		//jop1.showMessageDialog(arg0, arg1);
		// 创建布局
		GridLayout gl1 = new GridLayout(2,3);// 设置网格布局(h,v)
		FlowLayout fl1 = new FlowLayout(FlowLayout.CENTER,20,12);//对齐,H间距,V间距
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
		
		//panel1.setSize(200, 100);
		//panel1.setLocation(0, 0);
		panel1.setBackground(Color.blue);
		panel1.setBounds(0, 0, 200, 100);
		panel1.setLayout(fl1);
		frame1.add(panel1);// 将面板加入到窗体之上
		
		// 现在所有的内容都加入到了JPanel2之中
		panel2.add(labelb);
		//text4.setEditable(false);
		text4.setEnabled(false);
		panel2.add(text4);//显示消息框(只读)
		panel2.add(button3);
		panel2.add(button4);
		
		//panel2.setSize(200, 100);
		//panel2.setLocation(0, 0);
		panel2.setBackground(Color.red);
		panel2.setBounds(0, 0, 200, 100);
		panel2.setLayout(fl1);
		frame1.add(panel2);// 将面板加入到窗体之上
		// 设置属性
		frame1.setLayout(gl1);//参数null可以取消frame布局,使用绝对布局
		frame1.setBounds(50, 50, 770, 400);//绝对布局
		frame1.setFont(font1);
		frame1.setForeground(Color.BLUE); // 将背景设置成蓝色
		frame1.setBackground(Color.RED); // 设置窗体的背景颜色？
		frame1.setVisible(true); // 让组件可见
	}

}
