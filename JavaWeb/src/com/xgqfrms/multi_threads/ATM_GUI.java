package com.xgqfrms.multi_threads;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ATM_GUI {

//	private JFrame frame;
	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public ATM_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//exit
		frame.setTitle("ATM service item ***Made by xgqfrms***");
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setForeground(Color.GREEN);
		frame.getContentPane().setFont(new Font("宋体", Font.BOLD, 18));
		frame.setResizable(false);
		frame.setBounds(200, 100, 656, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.GREEN);
		textField.setFont(new Font("宋体", Font.BOLD, 18));
		textField.setText("\u4F59\u989D\u67E5\u8BE2\uFF1A");
		textField.setBounds(62, 56, 160, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("宋体", Font.BOLD, 18));
		textField_1.setForeground(Color.GREEN);
		textField_1.setText("\u53D6\u6B3E\uFF1A");
		textField_1.setBounds(62, 139, 160, 42);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setText("\u5B58\u6B3E\uFF1A");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("宋体", Font.BOLD, 18));
		textField_2.setForeground(Color.GREEN);
		textField_2.setBounds(62, 223, 160, 40);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setText("\u4FEE\u6539\u5BC6\u7801:");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(Color.GREEN);
		textField_3.setFont(new Font("宋体", Font.BOLD, 18));
		textField_3.setBounds(62, 302, 158, 42);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JButton btnNewButton = new JButton("cheek");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//重定向
				frame.setVisible(false);
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
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton.setBounds(294, 48, 149, 57);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("withdraw");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//重定向
				frame.setVisible(false);
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
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton_1.setBounds(294, 128, 151, 63);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnSave = new JButton("save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//重定向
				frame.setVisible(false);
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
		});
		btnSave.setBackground(Color.GREEN);
		btnSave.setFont(new Font("宋体", Font.PLAIN, 18));
		btnSave.setForeground(Color.BLUE);
		btnSave.setBounds(294, 214, 149, 57);
		frame.getContentPane().add(btnSave);

		JButton btnModify = new JButton("modify");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//重定向
				frame.setVisible(false);
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
		});
		btnModify.setBackground(Color.GREEN);
		btnModify.setFont(new Font("宋体", Font.PLAIN, 18));
		btnModify.setForeground(Color.BLUE);
		btnModify.setBounds(294, 287, 149, 63);
		frame.getContentPane().add(btnModify);
		
		JButton btnNewButton_2 = new JButton("\u9000\u51FAATM");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "请取出你的银行卡!",
						"退出ATM!", 0);
				if(e.getSource()==btnNewButton_2){
					
					System.exit(0);
				}
				
			}
		});
		btnNewButton_2.setForeground(Color.black);
		btnNewButton_2.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setBounds(512, 10, 116, 42);
		frame.getContentPane().add(btnNewButton_2);
	}
}
