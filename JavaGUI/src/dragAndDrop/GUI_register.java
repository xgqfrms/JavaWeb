package dragAndDrop;

import java.awt.Button;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.naming.Binding;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import javax.swing.Action;
import javax.swing.text.JTextComponent;

public class GUI_register {

	private JFrame frmDrag;
	private JTextField textField;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	String str1 = null, str2 = null, str3 = null, str4 = null;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private Font font1 = new Font("微软雅黑", Font.CENTER_BASELINE, 12);
	private FileWriter fw;
	private FileReader fw0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_register window = new GUI_register();
					window.frmDrag.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDrag = new JFrame();
		frmDrag.setResizable(false);
		frmDrag.getContentPane().setBackground(new Color(0, 204, 0));
		frmDrag.setBackground(new Color(0, 255, 0));
		frmDrag.setForeground(Color.MAGENTA);
		frmDrag.setTitle("\u6CE8\u518C\u754C\u9762,Made by Xgqfrms");
		frmDrag.setBounds(10, 10, 562, 498);
		frmDrag.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDrag.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 204));
		panel.setBounds(0, 0, 553, 349);
		frmDrag.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("\u59D3\u540D:");
		label.setFont(new Font("宋体", Font.BOLD, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(41, 27, 114, 37);
		panel.add(label);

		JLabel label_1 = new JLabel("\u6027\u522B:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("宋体", Font.BOLD, 16));
		label_1.setBounds(41, 74, 114, 37);
		panel.add(label_1);

		JLabel label_2 = new JLabel("\u5E74\u9F84:");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("宋体", Font.BOLD, 16));
		label_2.setBounds(41, 121, 114, 42);
		panel.add(label_2);

		JLabel label_3 = new JLabel("\u5BC6\u7801:");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("宋体", Font.BOLD, 16));
		label_3.setBounds(41, 173, 114, 37);
		panel.add(label_3);

		JLabel label_4 = new JLabel("\u786E\u8BA4\u5BC6\u7801:");
		label_4.setFont(new Font("宋体", Font.BOLD, 16));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(41, 226, 114, 42);
		panel.add(label_4);

		textField = new JTextField();
		textField.setBounds(189, 36, 140, 28);
		panel.add(textField);
		textField.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(189, 133, 140, 28);
		panel.add(textField_2);

		JRadioButton radioButton = new JRadioButton("\u7537");
		buttonGroup.add(radioButton);// 单选按钮生效
		// radioButton.setSelected(true);
		radioButton.setSelected(false);
		radioButton.setBounds(192, 88, 50, 23);
		panel.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("\u5973");
		buttonGroup.add(radioButton_1);
		radioButton.setSelected(false);
		radioButton_1.setBounds(279, 88, 50, 23);
		panel.add(radioButton_1);

		passwordField = new JPasswordField();
		Cursor cursor = new Cursor(12);// 光标样式
		passwordField.setCursor(cursor);
		passwordField.setEchoChar('#');
		passwordField.setBounds(189, 181, 140, 29);
		panel.add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setCursor(cursor);
		passwordField_1.setEchoChar('*');
		passwordField_1.setBounds(189, 234, 140, 29);
		panel.add(passwordField_1);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(font1);
		textField_1.setForeground(Color.RED);
		textField_1.setText("\u4EC5\u652F\u6301\u5B57\u6BCD\u548C\u6570\u5B57");
		textField_1.setBounds(361, 39, 114, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(font1);
		textField_3.setForeground(Color.RED);
		textField_3.setText("\u4EC5\u652F\u6301\u6570\u5B57");
		textField_3.setColumns(10);
		textField_3.setBounds(361, 133, 66, 21);
		panel.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(font1);
		textField_4.setForeground(Color.RED);
		textField_4.setText("\u4EC5\u652F\u6301\u5B57\u6BCD\u548C\u6570\u5B57");
		textField_4.setColumns(10);
		textField_4.setBounds(361, 189, 114, 21);
		panel.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setFont(font1);
		textField_5.setForeground(Color.RED);
		textField_5.setText("\u4E8C\u9009\u4E00");
		textField_5.setBounds(361, 90, 50, 21);
		panel.add(textField_5);
		textField_5.setColumns(10);

		JButton button = new JButton();// button
		button.setAction(action);
		button.setBounds(108, 375, 93, 36);
		frmDrag.getContentPane().add(button);

		JButton button_1 = new JButton();
		button_1.setAction(action_1);
		button_1.setBounds(313, 375, 93, 36);
		frmDrag.getContentPane().add(button_1);
	}

	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public SwingAction() {
			putValue(NAME, "\u63D0\u4EA4");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			// 获取所有输入内容,并写入一个文件user.txt
			// Writer.
			str1 = textField.getText().trim();
			str2 = textField_2.getText().trim();
			str3 = passwordField.getText().trim();
			str4 = passwordField_1.getText().trim();

			boolean a = Pattern.matches("^[A-Za-z0-9]+$", str1);
			boolean b = Pattern.matches("^[0-9]+$", str2);
			boolean c = Pattern.matches("^[A-Za-z0-9]+$", str3);
			boolean d = Pattern.matches("^[A-Za-z0-9]+$", str4);
			boolean x = false;

			BufferedReader br = null;
			String s = null;
			ArrayList<String> arr = new ArrayList<String>();
			try {

				br = new BufferedReader(new FileReader("D:\\admin.csv"));
				while ((s = br.readLine()) != null) {
					StringTokenizer tt = new StringTokenizer(s, ",");

					while (tt.hasMoreTokens()) {
						arr.add(s);//
						// x=true;
						break;//

					}
				}

				for (String i : arr) {// 遍历
					if (str1.equals(i)) {
						br.close();
						JOptionPane.showMessageDialog(null, "用户名已存在,请重新输入!",
								"注册失败!", 0);
						textField.setText("");
					} else {
						br.close();
						JOptionPane.showMessageDialog(null,
								"你提交的信息,正在处理中......", "注意!提交后的信息不可修改!", 0);
						if (a && b && c && d) {// 所有内容不空

							try {
								fw = new FileWriter("D:\\admin.csv", true);// true追加。
								fw.write(str1 + "," + str2 + "," + str3 + ","
										+ str4 + "\n");// 写入
								fw.close();// 关闭
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							JOptionPane.showMessageDialog(null,
									"欢迎, " + str1.toUpperCase()
											+ " 加入 X.site团队 !", "注册成功!", 0);
						} else {
							JOptionPane.showMessageDialog(null, "请重新输入!",
									"Sorry,注册失败!", 0);
						}
					}
				}
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			// } catch (IOException e1) {
			// e1.printStackTrace();
			// } finally {
			// try {
			// br.close();
			// } catch (IOException e1) {
			// e1.printStackTrace();
			// }
			// }

		}
	}

	private class SwingAction_1 extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * 
		 */

		public SwingAction_1() {
			putValue(NAME, "\u91CD\u7F6E");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			// 清除所有输入内容
			JOptionPane.showMessageDialog(null, "清除所有信息!");
			textField.setText("");
			textField_2.setText("");
			buttonGroup.clearSelection();
			// 单选按钮 归位 ???
			passwordField.setText("");
			passwordField_1.setText("");
		}
	}
}