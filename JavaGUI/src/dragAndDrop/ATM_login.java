package dragAndDrop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class ATM_login {

	private JFrame frmAtmLoginmadeBy;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField txtazaz;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_login window = new ATM_login();
					window.frmAtmLoginmadeBy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATM_login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAtmLoginmadeBy = new JFrame();
		frmAtmLoginmadeBy.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//exit 按钮 功能
		frmAtmLoginmadeBy.getContentPane().setBackground(Color.GREEN);
		frmAtmLoginmadeBy.getContentPane().setForeground(Color.GREEN);
		frmAtmLoginmadeBy.getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsername.setEnabled(true);
		txtUsername.setEditable(false);
		txtUsername.setFont(new Font("Dialog", Font.BOLD, 18));
		txtUsername.setText("username:");
		txtUsername.setBounds(76, 66, 119, 33);
		frmAtmLoginmadeBy.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setEditable(false);
		txtPassword.setText("Password:");
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setFont(new Font("Dialog", Font.BOLD, 18));
		txtPassword.setBounds(76, 139, 119, 33);
		frmAtmLoginmadeBy.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnLogin = new JButton("login");
		btnLogin.setBackground(Color.CYAN);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setForeground(Color.GREEN);
		btnLogin.setFont(new Font("Dialog", Font.BOLD, 18));
		btnLogin.setBounds(76, 304, 144, 60);
		frmAtmLoginmadeBy.getContentPane().add(btnLogin);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(310, 304, 144, 60);
		frmAtmLoginmadeBy.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("SimSun-ExtB", Font.PLAIN, 16));
		textField.setForeground(Color.GREEN);
		textField.setBounds(233, 66, 206, 33);
		frmAtmLoginmadeBy.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("宋体", Font.PLAIN, 16));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setForeground(Color.BLUE);
		passwordField.setEchoChar('*');
		passwordField.setBounds(233, 139, 206, 33);
		frmAtmLoginmadeBy.getContentPane().add(passwordField);
		
		txtazaz = new JTextField();
		txtazaz.setEditable(false);
		txtazaz.setForeground(Color.RED);
		txtazaz.setText("^[A-Za-z0-9]+$");
		txtazaz.setBounds(449, 73, 90, 21);
		frmAtmLoginmadeBy.getContentPane().add(txtazaz);
		txtazaz.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setForeground(Color.RED);
		textField_1.setText("^[0-9]+$");
		textField_1.setBounds(449, 146, 60, 21);
		frmAtmLoginmadeBy.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		frmAtmLoginmadeBy.setTitle("ATM Login***Made by xgqfrms***");
		frmAtmLoginmadeBy.setResizable(false);
		frmAtmLoginmadeBy.setBounds(100, 100, 555, 455);
	}
}
