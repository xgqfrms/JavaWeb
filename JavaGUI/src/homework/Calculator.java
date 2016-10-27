package homework;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator{

	private  Font font1 = new Font("宋体", Font.ROMAN_BASELINE, 22);
	private  Font font = new Font("宋体", Font.BOLD, 22);
	private JFrame frmJavagui;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmJavagui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavagui = new JFrame();
		frmJavagui.setResizable(false);// 锁定frame大小
		frmJavagui.setTitle("JavaGUI \u8BA1\u7B97\u5668 ***Made by Xgqfrms***");
		frmJavagui.setBounds(50, 10, 700, 500);
		frmJavagui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.RED);
		frmJavagui.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("\u67E5\u770B(V)");
		menuBar.add(mnNewMenu);// 编辑(E)

		JMenuItem mntmNewMenuItem = new JMenuItem(
				"\u6807\u51C6\u578B(T)                  Alt+1");
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmsAlt = new JMenuItem(
				"\u79D1\u5B66\u578B(S)                 Alt+2");
		mnNewMenu.add(mntmsAlt);

		JMenuItem mntmpAlt = new JMenuItem(
				"\u7A0B\u5E8F\u5458(P)                 Alt+3");
		mnNewMenu.add(mntmpAlt);

		JMenuItem mntmbCtrlf = new JMenuItem(
				"\u57FA\u672C(B)                     Ctrl+F4");
		mnNewMenu.add(mntmbCtrlf);

		JMenuItem mntmuCtrlu = new JMenuItem(
				"\u5355\u4F4D\u8F6C\u6362(U)            Ctrl+U");
		mnNewMenu.add(mntmuCtrlu);

		JMenuItem mntmdCtrlf = new JMenuItem(
				"\u65E5\u671F\u8BA1\u7B97(D)            Ctrl+E");
		mnNewMenu.add(mntmdCtrlf);

		JMenu mnNewMenu2 = new JMenu("\u7F16\u8F91(E)");
		menuBar.add(mnNewMenu2);// 编辑(E)
		JMenuItem mntmcCtrlc = new JMenuItem(
				"\u590D\u5236(C)                   Ctrl+C");
		mnNewMenu2.add(mntmcCtrlc);
		JMenuItem mntmpCtrlv = new JMenuItem(
				"\u7C98\u8D34(P)                   Ctrl+V");
		mnNewMenu2.add(mntmpCtrlv);
		JMenu mnNewMenu3 = new JMenu("\u5E2E\u52A9(H)");
		menuBar.add(mnNewMenu3);// 编辑(E)
		JMenuItem mntmvf1 = new JMenuItem(
				"\u67E5\u770B\u5E2E\u52A9(V)                   F1");
		mnNewMenu3.add(mntmvf1);
		JMenuItem mntma = new JMenuItem(
				"\u5173\u4E8E\u8BA1\u7B97\u5668(A)                   ");
		mnNewMenu3.add(mntma);
		frmJavagui.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(7, 10, 669, 100);
		panel.setBackground(Color.BLUE);
		frmJavagui.getContentPane().add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("微软雅黑 Light", Font.BOLD | Font.ITALIC, 18));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField);
		textField.setBounds(118, 18, 426, 67);
		textField.setForeground(Color.GREEN);
		textField.setText("这里是(输入/结果)显示框 !");
		textField.setColumns(55);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(7, 120, 669, 310);
		panel_1.setBackground(Color.WHITE);
		frmJavagui.getContentPane().add(panel_1);

		JButton btnNewButton = new JButton("MC");
		JButton btnNewButton1 = new JButton("MR");
		JButton btnNewButton2 = new JButton("MS");
		JButton btnNewButton3 = new JButton("M+");
		JButton btnNewButton4 = new JButton("M-");
		JButton btnNewButton5 = new JButton("<--");
		JButton btnNewButton6 = new JButton("CE");
		JButton btnNewButton7 = new JButton("C");
		JButton btnNewButton8 = new JButton("+-");
		JButton btnNewButton9 = new JButton("_/");
		final JButton btnNewButton10 = new JButton("7");
		btnNewButton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton10){
					textField.setText("7");
				}
			}
		});
		
		final JButton btnNewButton11 = new JButton("8");
		btnNewButton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton11){
					textField.setText("8");
				}
			}
		});
		final JButton btnNewButton12 = new JButton("9");
		btnNewButton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton12){
					textField.setText("9");
				}
			}
		});
		JButton btnNewButton13 = new JButton("/");
		JButton btnNewButton14 = new JButton("%");
		JButton btnNewButton15 = new JButton("4");
		btnNewButton15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton10){
					textField.setText("4");
				}
			}
		});
		final JButton btnNewButton16 = new JButton("5");
		btnNewButton16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton16){
					textField.setText("5");
				}
			}
		});
		final JButton btnNewButton17 = new JButton("6");
		btnNewButton17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton17){
					textField.setText("6");
				}
			}
		});
		JButton btnNewButton18 = new JButton("*");
		JButton btnNewButton19 = new JButton("1/x");

		final JButton btnNewButton22 = new JButton("1");
		btnNewButton22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton22){
					textField.setText("1");
				}
			}
		});
		final JButton btnNewButton23 = new JButton("2");
		btnNewButton23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton23){
					textField.setText("2");
				}
			}
		});
		final JButton btnNewButton24 = new JButton("3");
		btnNewButton24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton24){
					textField.setText("3");
				}
			}
			
		});
		JButton btnNewButton25 = new JButton("-");
		JButton btnNewButton26 = new JButton("+");
		final JButton btnNewButton27 = new JButton("0");
		btnNewButton27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton27){
					textField.setText("0");
				}
			}
		});
		JButton btnNewButton28 = new JButton(".");
		JButton btnNewButton29 = new JButton("=");

		final JButton btnNewButton20 = new JButton("计算");//
		btnNewButton20.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton20) {
					if (true) {
						JOptionPane.showMessageDialog(null, "正在计算中...", "成功了!",
								0);
						textField.setText("Hello World !");
					} else {
						textField.setText("");
						JOptionPane.showMessageDialog(null, "对不起,请重新输入!",
								"出错了!", 0);
					}
				}
			}
		});
		final JButton btnNewButton21 = new JButton("清零");//
		btnNewButton21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton21) {
					textField.setText("");
				}
			}
		});

		panel_1.setLayout(new GridLayout(6, 5, 10, 10));// ***计算:一定要按照按钮的数目进行计算(Z=x*y)例如:<按钮15=3*5>***
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton1.setBackground(Color.YELLOW);
		btnNewButton2.setBackground(Color.BLUE);
		btnNewButton3.setBackground(Color.ORANGE);
		btnNewButton4.setBackground(Color.MAGENTA);
		btnNewButton5.setBackground(Color.GREEN);
		btnNewButton6.setBackground(Color.YELLOW);
		btnNewButton7.setBackground(Color.BLUE);
		btnNewButton8.setBackground(Color.ORANGE);
		btnNewButton9.setBackground(Color.MAGENTA);
		btnNewButton10.setForeground(Color.GREEN);
		btnNewButton11.setForeground(Color.GREEN);
		btnNewButton12.setForeground(Color.GREEN);
		btnNewButton13.setBackground(Color.ORANGE);
		btnNewButton14.setBackground(Color.MAGENTA);
		btnNewButton16.setForeground(Color.GREEN);
		btnNewButton17.setForeground(Color.GREEN);
		btnNewButton15.setForeground(Color.GREEN);
		btnNewButton18.setBackground(Color.ORANGE);
		btnNewButton19.setBackground(Color.MAGENTA);
		btnNewButton22.setForeground(Color.GREEN);
		btnNewButton23.setForeground(Color.GREEN);
		btnNewButton24.setForeground(Color.GREEN);
		btnNewButton25.setBackground(Color.ORANGE);
		btnNewButton26.setBackground(Color.MAGENTA);
		btnNewButton27.setForeground(Color.GREEN);
		btnNewButton28.setBackground(Color.YELLOW);
		btnNewButton29.setBackground(Color.BLUE);
		btnNewButton20.setBackground(Color.GREEN);
		btnNewButton21.setBackground(Color.RED);
		//
		btnNewButton.setFont(font);
		btnNewButton1.setFont(font);
		btnNewButton2.setFont(font);
		btnNewButton3.setFont(font);
		btnNewButton4.setFont(font);
		btnNewButton5.setFont(font);
		btnNewButton6.setFont(font);
		btnNewButton7.setFont(font);
		btnNewButton8.setFont(font);
		btnNewButton9.setFont(font);
		btnNewButton10.setFont(font1);
		btnNewButton11.setFont(font1);
		btnNewButton12.setFont(font1);
		btnNewButton13.setFont(font);
		btnNewButton14.setFont(font);
		btnNewButton15.setFont(font1);
		btnNewButton16.setFont(font1);
		btnNewButton17.setFont(font1);
		btnNewButton18.setFont(font);
		btnNewButton19.setFont(font);
		btnNewButton22.setFont(font1);
		btnNewButton23.setFont(font1);
		btnNewButton24.setFont(font1);
		btnNewButton25.setFont(font);
		btnNewButton26.setFont(font);
		btnNewButton27.setFont(font1);
		btnNewButton28.setFont(font);
		btnNewButton29.setFont(font);
		btnNewButton20.setFont(font1);
		btnNewButton21.setFont(font1);
		//
		panel_1.add(btnNewButton);
		panel_1.add(btnNewButton1);
		panel_1.add(btnNewButton2);
		panel_1.add(btnNewButton3);
		panel_1.add(btnNewButton4);
		panel_1.add(btnNewButton5);
		panel_1.add(btnNewButton6);
		panel_1.add(btnNewButton7);
		panel_1.add(btnNewButton8);
		panel_1.add(btnNewButton9);
		panel_1.add(btnNewButton10);
		panel_1.add(btnNewButton11);
		panel_1.add(btnNewButton12);
		panel_1.add(btnNewButton13);
		panel_1.add(btnNewButton14);
		panel_1.add(btnNewButton15);
		panel_1.add(btnNewButton16);
		panel_1.add(btnNewButton17);
		panel_1.add(btnNewButton18);
		panel_1.add(btnNewButton19);
		panel_1.add(btnNewButton22);
		panel_1.add(btnNewButton23);
		panel_1.add(btnNewButton24);
		panel_1.add(btnNewButton25);
		panel_1.add(btnNewButton26);
		panel_1.add(btnNewButton27);
		panel_1.add(btnNewButton28);
		panel_1.add(btnNewButton29);

		panel_1.add(btnNewButton20);
		panel_1.add(btnNewButton21);
		// panel_1.add(btnNewButton);
	}
}
