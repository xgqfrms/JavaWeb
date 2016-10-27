package com.xgqfrms.multi_threads;


import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;

public class ATM_withdraw {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private String userName = null, password = null, money = null,x = null;
	private int m = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_withdraw window = new ATM_withdraw();
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
	public ATM_withdraw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("ATM service item ***Made by xgqfrms***");
		frame.getContentPane().setFont(new Font("宋体", Font.BOLD, 18));
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setResizable(false);
		frame.setBounds(100, 100, 571, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("\u53D6\u6B3E\u91D1\u989D");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.GREEN);
		textField.setFont(new Font("宋体", Font.BOLD, 18));
		textField.setBounds(55, 63, 117, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText("\u5269\u4F59\u91D1\u989D");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.GREEN);
		textField_1.setFont(new Font("宋体", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(55, 140, 117, 36);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("宋体", Font.BOLD, 18));
		textField_2.setBounds(232, 65, 167, 36);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("宋体", Font.BOLD, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(232, 140, 167, 36);
		frame.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//withdraw
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
						 x=textField_2.getText().toString();
						 m = Integer.parseInt(money)-Integer.parseInt(x);
						 
						 flag = true;
					}
					if (flag) { 
						if(m>=0){
							
							textField_3.setText("$"+m);
						}else{
							textField_3.setText("余额不足！");
							
						}
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
		btnNewButton.setBounds(55, 264, 141, 54);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\u91CD\u7F6E");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("宋体", Font.BOLD, 18));
		button.setBounds(279, 264, 141, 54);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//重定向
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
		button_1.setForeground(Color.GREEN);
		button_1.setFont(new Font("宋体", Font.BOLD, 18));
		button_1.setBounds(423, 346, 117, 45);
		frame.getContentPane().add(button_1);
	}

}
