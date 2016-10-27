package dragAndDrop;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.List;

import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;

public class D5 {

	private static final Cursor cursor = null;
	private JFrame frmX;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private ButtonGroup buttonGroup;
	private String str0 = null, str1 = null, str2 = null, str3 = null,
			str4 = null, str5 = null, str6 = null, str7 = null, str8 = null,
			str9 = null, strreader = null;
	private int ita = 0, itb = 0, itc = 0, itd = 0, ite = 0, itf = 0, itg = 0,
			ith = 0, iti = 0, itj = 0;
	private boolean b0 = false, b1 = false, b2 = false, b3 = false, b4 = false,
			b5 = false, b6 = false, b7 = false, b8 = false, b9 = false,
			breader = false;
	static FileReader fw0;
	static FileWriter fw;
	private Font font1;
	private JTextField textField_10;
	private JPasswordField passwordField;

	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D5 window = new D5();
					window.frmX.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public D5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmX = new JFrame();
		frmX.setTitle("\u7528\u6237\u6CE8\u518C\u9875\u9762***made by xgqfrms***");
		frmX.setBounds(100, 100, 634, 468);
		frmX.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmX.getContentPane().setLayout(null);
		frmX.setResizable(false);
		font1 = new Font("宋体", Font.BOLD, 16);
		buttonGroup = new ButtonGroup();

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.GREEN);
		panel.setBounds(0, 0, 618, 429);
		frmX.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u5B66\u53F7(ID):");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 12));
		lblNewLabel.setBounds(118, 13, 78, 21);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 12));
		lblNewLabel_1.setBounds(118, 44, 54, 15);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\u6027\u522B:");
		lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 12));
		lblNewLabel_2.setBounds(118, 80, 54, 15);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\u5E74\u9F84\uFF1A");// 学号
		lblNewLabel_3.setFont(new Font("宋体", Font.BOLD, 12));
		// lblNewLabel_3
		lblNewLabel_3.setBounds(118, 117, 78, 15);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("\u7528\u6237\u540D:");
		lblNewLabel_4.setFont(new Font("宋体", Font.BOLD, 12));
		lblNewLabel_4.setBounds(118, 153, 54, 15);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("\u5BC6\u7801:");
		lblNewLabel_5.setFont(new Font("宋体", Font.BOLD, 12));
		lblNewLabel_5.setBounds(118, 182, 54, 15);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("\u90AE\u7BB1:");
		lblNewLabel_6.setFont(new Font("宋体", Font.BOLD, 12));
		lblNewLabel_6.setBounds(118, 212, 54, 15);
		panel.add(lblNewLabel_6);

		textField = new JTextField();
		textField.setForeground(Color.GREEN);
		// textField.setBackground(Color.RED);
		textField.setBounds(279, 10, 152, 21);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setForeground(Color.GREEN);
		textField_1.setBounds(279, 41, 152, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setForeground(Color.GREEN);
		textField_3.setBounds(279, 114, 152, 21);
		panel.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setForeground(Color.GREEN);
		textField_4.setBounds(279, 150, 152, 21);
		panel.add(textField_4);
		textField_4.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setForeground(Color.GREEN);
		textField_6.setBounds(279, 209, 152, 21);
		panel.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("QQ:");
		lblNewLabel_7.setFont(new Font("宋体", Font.BOLD, 12));
		lblNewLabel_7.setBounds(118, 243, 54, 15);
		panel.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("\u7535\u8BDD:");
		lblNewLabel_8.setFont(new Font("宋体", Font.BOLD, 12));
		lblNewLabel_8.setBounds(118, 276, 54, 15);
		panel.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("\u5E74\u7EA7:");
		lblNewLabel_9.setFont(new Font("宋体", Font.BOLD, 12));
		lblNewLabel_9.setBounds(118, 306, 54, 15);
		panel.add(lblNewLabel_9);

		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setForeground(Color.RED);
		textField_10
				.setText("\u5FC5\u586B\u9879\uFF1A\u4EE515\u5F00\u5934\u7684\u6570\u5B57\u5E8F\u5217");
		textField_10.setBounds(441, 10, 167, 21);
		panel.add(textField_10);
		textField_10.setColumns(10);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u7537");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(297, 76, 42, 23);
		panel.add(rdbtnNewRadioButton);

		JRadioButton radioButton = new JRadioButton("\u5973");
		buttonGroup.add(radioButton);
		radioButton.setBounds(371, 76, 42, 23);
		panel.add(radioButton);

		passwordField = new JPasswordField();
		passwordField.setEchoChar('$');
		passwordField.setForeground(Color.blue);

		passwordField.setBounds(279, 179, 152, 21);
		panel.add(passwordField);

		textField_7 = new JTextField();
		textField_7.setForeground(Color.GREEN);
		textField_7.setBounds(279, 240, 152, 21);
		panel.add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setForeground(Color.GREEN);
		textField_8.setBounds(279, 273, 152, 21);
		panel.add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setForeground(Color.GREEN);
		textField_9.setBounds(279, 303, 152, 21);
		panel.add(textField_9);
		textField_9.setColumns(10);

		// File file2 = new File("D:\\" + File.separator + "test.csv");

		// final JButton btnNewButton = new JButton("\u6CE8\u518C");
		btnNewButton = new JButton("\u6CE8\u518C");
		btnNewButton.setFont(font1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				str1 = textField_1.getText().trim();
				str3 = textField_3.getText().trim();
				str6 = textField_6.getText().trim();
				str7 = textField_7.getText().trim();
				str8 = textField_8.getText().trim();
				str9 = textField_9.getText().trim();
				// 写入数据
				str0 = textField.getText().trim();// ID不可以为空。
				b0 = Pattern.matches("^[0-9]+$", str0);
				str4 = textField_4.getText().trim();// 不可以为空。
				b4 = Pattern.matches("^[a-zA-Z0-9]+$", str4);
				str5 = passwordField.getText().trim();// 不可以为空。
//				str5 = passwordField.getPassword().toString();
				b5 = Pattern.matches("^[a-zA-Z0-9]+$", str5);
				if (b0 && b4 && b5) {
					// 写入数据
					JOptionPane.showMessageDialog(null, "你提交的信息,正在处理中......",
							"注意!提交后的信息不可修改!", 0);
					// cheek
					try {
						fw0 = new FileReader("Test.csv");
						BufferedReader bur = new BufferedReader(fw0);
						
						String line = null;
						try {
							while ((line = bur.readLine()) != null) {
								String item[] = line.split(",");// 根据逗号切分
								if (str0.equals(item[0])) {
									// 用户已存在!
									JOptionPane.showMessageDialog(null,
											" 用户已存在", "Error！", 0);
									break;
								} else {
									// 查询不存在，插入
									try {
										fw = new FileWriter("Test.csv", true);// true追加。
										fw.write(str0 + "," + str1 + "," + str3
												+ "," + str4 + "," + str5 + ","
												+ str6 + "," + str7 + str8
												+ "," + str9 + "\n");
										fw.close();
										JOptionPane.showMessageDialog(null,
												"欢迎进入，MY web site,"+str0+"\n注册成功！", "Congratulations！", 0);
										break;
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
								}
							}
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					//
				} else {
					JOptionPane.showMessageDialog(null, "注意!提交信息为空或输入格式有误!",
							"Error！", 0);
				}

			}
		});
		// 读取数据

		btnNewButton.setBounds(118, 373, 121, 23);
		panel.add(btnNewButton);

		btnNewButton_1 = new JButton("\u91CD\u7F6E\u6240\u6709");
		btnNewButton_1.setFont(font1);
		btnNewButton_1.setBounds(345, 373, 127, 23);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 清空数据
				JOptionPane.showMessageDialog(null, "清除所有信息!");
				textField.setText(null);
				textField_1.setText(null);
				btnNewButton.setSelected(true);
				textField_3.setText(null);
				textField_4.setText(null);
				passwordField.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
			}
		});

	}
}
