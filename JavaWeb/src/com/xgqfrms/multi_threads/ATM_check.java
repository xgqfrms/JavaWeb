package com.xgqfrms.multi_threads;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;

public class ATM_check {

	public JFrame frame;
	private JTextField textField_1;
	private String userName = null, password = null, money = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_check window = new ATM_check();
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
	public ATM_check() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("ATM service item ***Made by xgqfrms***");
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 539, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		TextField textField = new TextField();
		textField.setBounds(171, 37, 322, 162);
		frame.getContentPane().add(textField);

		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("宋体", Font.BOLD, 18));
		textField_1.setText("\u67E5\u8BE2\u7ED3\u679C\uFF1A");
		textField_1.setBounds(10, 82, 126, 47);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// cheek
				try {
					FileReader fr = new FileReader("user.txt");
					BufferedReader br = new BufferedReader(fr);
					String strUser = null;
					boolean flag = false;
					while ((strUser = br.readLine()) != null) {
						String[] userInfo = strUser.split("[\\s]+");
						 userName = userInfo[0];
						 password = userInfo[1];
						 money = userInfo[2];
						flag = true;
					}
					if (flag) { // 登录用户存在
						textField.setText("用户名：" +userName+"\t用户可用余额："  + money+"\n");
					}
					br.readLine();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton.setBounds(58, 258, 126, 47);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
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
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setBounds(328, 258, 126, 47);
		frame.getContentPane().add(btnNewButton_1);
	}
}
