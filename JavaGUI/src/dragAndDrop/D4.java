package dragAndDrop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.regex.Pattern;
import java.awt.Color;

public class D4 {

	private JFrame frmTriangleidentifyMade;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private String str1 = null, str2 = null, str3 = null;
	private int a = 0, b = 0, c = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D4 window = new D4();
					window.frmTriangleidentifyMade.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public D4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTriangleidentifyMade = new JFrame();
		frmTriangleidentifyMade.setTitle("TriangleIdentify  ******* made by xgqfrms*******");
		frmTriangleidentifyMade.setResizable(false);
		frmTriangleidentifyMade.setBounds(100, 100, 538, 500);
		frmTriangleidentifyMade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTriangleidentifyMade.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 524, 471);
		frmTriangleidentifyMade.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel(
				"\u53EF\u4EE5\u8F93\u5165\u7684\u6574\u6570\u6570\u636E\u8303\u56F4:1-200");
		lblNewLabel.setBounds(107, 22, 308, 32);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);

		JLabel lblA = new JLabel("\u8FB9A:");
		lblA.setBounds(107, 91, 66, 44);
		panel.add(lblA);

		JLabel lblb = new JLabel("\u8FB9B:");
		lblb.setBounds(107, 153, 45, 32);
		panel.add(lblb);

		JLabel lblc = new JLabel("\u8FB9C:");
		lblc.setBounds(107, 211, 35, 30);
		panel.add(lblc);

		textField = new JTextField();
		textField.setForeground(Color.BLUE);
		textField.setBounds(217, 97, 114, 33);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLUE);
		textField_1.setBounds(217, 153, 114, 33);
		panel.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLUE);
		textField_2.setBounds(217, 210, 114, 33);
		panel.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setForeground(Color.GREEN);
		textField_3.setBackground(Color.PINK);
		// textField_3.setEnabled(false);
		textField_3.setEditable(false);
		textField_3.setBounds(217, 273, 114, 33);
		panel.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel(
				"\u4E09\u89D2\u5F62\u5224\u65AD\u7ED3\u679C:");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setBounds(42, 273, 104, 33);
		panel.add(lblNewLabel_1);

		final JButton button = new JButton("\u5224\u65AD\u5F62\u72B6");
		button.setForeground(Color.GREEN);
		
		
		

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					str1 = textField.getText();
					str2 = textField_1.getText();
					str3 = textField_2.getText();
					final boolean x = Pattern.matches("^[0-9]+$", str1);
					final boolean y = Pattern.matches("^[0-9]+$", str2);
					final boolean z = Pattern.matches("^[0-9]+$", str3);
					if(x&&y&&z){
						a = Integer.parseInt(str1);
						b = Integer.parseInt(str2);
						c = Integer.parseInt(str3);
						if ((a + b > c) && (a + c > b) && (b + c > a)) {
							if ((a == b) || (b == c) || (a == c)) {
								textField_3.setText("这是一个等腰三角形");
								if ((a == b) && (b == c)) {
									textField_3.setText("这是一个等边三角形");
								} else if ((a * a + b * b == c * c)
										|| (c * c + b * b == a * a)
										|| (a * a + c * c == b * b)) {
									textField_3.setText("这是一个等边直角三角形");
								}
							} else if ((a * a + b * b == c * c)
									|| (c * c + b * b == a * a)
									|| (a * a + c * c == b * b)) {
								textField_3.setText("这是一个直角三角形");
							} else {
								textField_3.setText("这是一个普通三角形");
							}

						} else {
							textField_3.setText("这不是一个三角形!");
						}
					}else {
								textField.setText("请输入一个数字!");
								textField_1.setText("请输入一个数字!");
								textField_2.setText("请输入一个数字!");
					}
					
				}//
			}
		});
		button.setBounds(110, 366, 93, 23);
		panel.add(button);

		final JButton btnNewButton = new JButton("\u6E05\u9664\u8F93\u5165");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				if (e.getSource() == btnNewButton) {
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("请重新输入!");
				}
			}
		});
		btnNewButton.setBounds(322, 366, 93, 23);
		panel.add(btnNewButton);
	}
}
