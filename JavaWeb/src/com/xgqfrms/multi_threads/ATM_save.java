package com.xgqfrms.multi_threads;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;

public class ATM_save {

	public JFrame frmAtmSavemade;
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
					ATM_save window = new ATM_save();
					window.frmAtmSavemade.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATM_save() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAtmSavemade = new JFrame();
		frmAtmSavemade.setTitle("ATM save ***Made by xgqfrms***");
		frmAtmSavemade.getContentPane().setBackground(Color.CYAN);
		frmAtmSavemade.setResizable(false);
		frmAtmSavemade.setBounds(100, 100, 569, 445);
		frmAtmSavemade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAtmSavemade.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setForeground(Color.GREEN);
		textField.setFont(new Font("宋体", Font.BOLD, 18));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\u5B58\u5165\u91D1\u989D");
		textField.setBounds(43, 66, 119, 36);
		frmAtmSavemade.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setForeground(Color.GREEN);
		textField_1.setFont(new Font("宋体", Font.BOLD, 18));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("\u603B\u4F59\u989D");
		textField_1.setBounds(43, 130, 119, 36);
		frmAtmSavemade.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("宋体", Font.BOLD, 18));
		textField_2.setBounds(216, 68, 150, 36);
		frmAtmSavemade.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("宋体", Font.BOLD, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(216, 132, 150, 36);
		frmAtmSavemade.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//save
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
						 m = Integer.parseInt(money)+Integer.parseInt(x);
						 
						flag = true;
					}
					if (flag) { // 登录用户存在
						textField_3.setText("$"+m);
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
		btnNewButton.setBounds(36, 263, 126, 53);
		frmAtmSavemade.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\u91CD\u7F6E");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("宋体", Font.BOLD, 18));
		button.setBounds(218, 263, 126, 53);
		frmAtmSavemade.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//重定向
				frmAtmSavemade.setVisible(false);
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
		button_1.setBounds(411, 263, 126, 53);
		frmAtmSavemade.getContentPane().add(button_1);
	}

}
