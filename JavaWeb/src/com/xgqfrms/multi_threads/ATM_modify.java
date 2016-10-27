package com.xgqfrms.multi_threads;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;

public class ATM_modify {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private String[] userInfo;
	private String  password = null, y = null,x = null;
	private boolean m = false,n=false,flag1 = false,flag2 = false;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_modify window = new ATM_modify();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATM_modify() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("ATM service item ***Made by xgqfrms***");
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 538, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.BOLD, 18));
		textField.setForeground(Color.GREEN);
		textField.setText("\u539F\u59CB\u5BC6\u7801\uFF1A");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setBounds(41, 52, 112, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setForeground(Color.GREEN);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("宋体", Font.BOLD, 18));
		textField_1.setText("\u65B0\u5BC6\u7801\uFF1A");
		textField_1.setBounds(41, 124, 112, 37);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setForeground(Color.GREEN);
		textField_2.setEditable(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("宋体", Font.BOLD, 18));
		textField_2.setText("\u65B0\u5BC6\u7801\u786E\u8BA4\uFF1A");
		textField_2.setBounds(41, 196, 135, 37);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("宋体", Font.BOLD, 18));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setEchoChar('*');
		passwordField.setBounds(193, 52, 215, 37);
		frame.getContentPane().add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("宋体", Font.BOLD, 18));
		passwordField_1.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_1.setEchoChar('*');
		passwordField_1.setBounds(193, 124, 215, 37);
		frame.getContentPane().add(passwordField_1);

		passwordField_2 = new JPasswordField();
		passwordField_2.setFont(new Font("宋体", Font.BOLD, 18));
		passwordField_2.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_2.setEchoChar('*');
		passwordField_2.setBounds(193, 198, 215, 37);
		frame.getContentPane().add(passwordField_2);

		JButton btnNewButton = new JButton("\u786E\u8BA4\u66F4\u6539");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 修改
				try {
					FileReader fr = new FileReader("user.txt");
					BufferedReader br = new BufferedReader(fr);
					String strUser = null;
					boolean flag1 = false;
					while ((strUser = br.readLine()) != null) {
						userInfo = strUser.split("[\\s]+");
						 
						 password = userInfo[1];
						 if(password.equals(passwordField.getText().toString())){
							x=passwordField_1.getText().toString(); 
							y=passwordField_2.getText().toString();
							flag1 = true;
							if(x.equals(y)){
								m=true;
								userInfo[1]=x;
							}else{
								n=true;
							}
						 }
						 else{						 
						 flag2 = true;	
						 }
						 
					}
					if (m&&flag1) { 
						userInfo[1]=x;
						JOptionPane.showMessageDialog(null, "密码修改成功!",
								"ATM modify password!", 0);			
					}
					if (n) { 
						JOptionPane.showMessageDialog(null, "两次输入密码不一致!",
								"ATM modify password!", 0);			
					}
					if (flag2) { 
						JOptionPane.showMessageDialog(null, "密码错误!",
								"ATM modify password!", 0);			
					}
					
					br.readLine();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				

			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBounds(43, 298, 112, 50);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText("");
				passwordField_1.setText("");
				passwordField_2.setText("");
			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_1.setBounds(203, 298, 120, 50);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\u8FD4\u56DE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 重定向
				frame.setVisible(false);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ATM_GUI window = new ATM_GUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_2.setBounds(361, 298, 112, 50);
		frame.getContentPane().add(btnNewButton_2);
	}
}