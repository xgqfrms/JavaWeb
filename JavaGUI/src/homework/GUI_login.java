package homework;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.rmi.registry.Registry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import dragAndDrop.D1;

public class GUI_login {
	private JFrame frame1;
	private JTextField textField1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private Font font;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_login window = new GUI_login();// 调用 创建new
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.setResizable(false);// 锁定frame大小
		frame1.getContentPane().setFont(new Font("宋体", Font.BOLD, 18));
		frame1.getContentPane().setBackground(Color.GREEN);
		frame1.setBackground(Color.GREEN);
		frame1.setTitle("登陆页" + "***Made by Xgqfrms***");
		frame1.setBounds(120, 120, 500, 370);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);

		JLabel label = new JLabel("\u7528\u6237\u540D:");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label.setBounds(40, 48, 69, 50);
		frame1.getContentPane().add(label);

		JLabel label_1 = new JLabel("\u5BC6\u7801:");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label_1.setBounds(40, 121, 57, 42);
		frame1.getContentPane().add(label_1);

		font = new Font("微软雅黑", Font.BOLD, 12);

		textField1 = new JTextField();
		textField1.setFont(font);
		textField1.setForeground(Color.GREEN);
		textField1.setBounds(131, 58, 227, 34);
		frame1.getContentPane().add(textField1);
		textField1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setFont(font);
		textField_2.setEditable(false);
		textField_2.setForeground(Color.RED);
		textField_2.setText("\u4EC5\u652F\u6301\u5B57\u6BCD,\u6570\u5B57");
		textField_2.setBounds(368, 64, 106, 21);
		frame1.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setFont(font);
		textField_3.setEditable(false);
		textField_3.setForeground(Color.RED);
		textField_3.setText("\u4EC5\u652F\u6301\u5B57\u6BCD,\u6570\u5B57");
		textField_3.setColumns(10);
		textField_3.setBounds(368, 133, 106, 21);
		frame1.getContentPane().add(textField_3);

		passwordField = new JPasswordField();
		passwordField.setFont(font);
		passwordField.setForeground(Color.GREEN);
		passwordField.setBounds(131, 127, 227, 34);
		frame1.getContentPane().add(passwordField);
		passwordField.setEchoChar('@');
//		passwordField.setEchoChar(' ');//不显示密码长度.(geek 专用)
		Cursor cursor = new Cursor(12);// <11,是<--> =12,是小手 =13,是<-|-> >13 无法运行?
										// 怎么回事????
		passwordField.setCursor(cursor);
		passwordField.setColumns(10);

		final JButton button = new JButton("\u767B\u9646");
		button.setToolTipText("This is a Button!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 判断是否是按钮
				String str1 = null, str2 = null;
				str1 = textField1.getText().trim();
				str2 = passwordField.getText().trim();
				// str2 = passwordField.toString().trim();
				boolean b = Pattern.matches("^[A-Za-z0-9]+$", str1);
				boolean a = Pattern.matches("^[A-Za-z0-9]+$", str2);
				if (e.getSource() == button) {
					if (b && a) {

						JOptionPane.showMessageDialog(null, str1.toUpperCase()
								+",\n"+ "Welcome to My Java Application!",
								"登陆成功!", 0);

					} else {

						JOptionPane.showMessageDialog(null,
								"请输入用户名和密码!\n用户名和密码仅有数字和字母组成!",
								"Sorry,登陆失败!", 0);

					}

				}
			}
		});
		button.setBackground(Color.LIGHT_GRAY);
		button.setForeground(Color.CYAN);
		button.setFont(new Font("微软雅黑", Font.BOLD, 18));
		button.setBounds(87, 223, 101, 50);
		frame1.getContentPane().add(button);

		final JButton button1 = new JButton("\u53D6\u6D88");
		button1.setToolTipText("This is a Button!");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 判断是否是按钮
				if (e.getSource() == button1) {
					JOptionPane.showMessageDialog(null, "清除所有信息!");
					textField1.setText("");
					passwordField.setText("");
				}
			}
		});
		frame1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
		button1.setBackground(Color.CYAN);
		button1.setForeground(Color.RED);
		button1.setFont(new Font("微软雅黑", Font.BOLD, 18));
		button1.setBounds(280, 223, 101, 50);
		frame1.getContentPane().add(button1);
	}
}