package com.henau.studentmanager.Service;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.henau.studentmanager.Dao.StudentDao;
import com.henau.studentmanager.model.Student;

public class Reg extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3730147556801272944L;
	private JPanel			contentPane;
	private JTextField		txtNum;
	private JTextField		txtName;
	private ButtonGroup		buttonGroup;
	private JTextField		txtEmail;
	private JTextField		txtTel;
	private JTextField		txtGrade;
	private JTextField		txtAge;
	private JTextField		txtQQ;
	private JRadioButton	rdbSex;
	private JRadioButton	rdbGril;
	private JTextField		txtUserName;
	private JPasswordField txtPwd;
	private JPasswordField txtPwd2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Reg frame = new Reg();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Reg()
	{
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Reg.class.getResource("/iconpng.png")));
		setTitle("\u5B66\u751F\u6CE8\u518C");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//this.setLocation(GUITools.getCenter(this));
		
		JLabel label = new JLabel("\u5B66\u53F7\uFF1A");
		label.setBounds(48, 51, 53, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u6CE8\u518C\u5B66\u751F");
		label_1.setForeground(new Color(210, 105, 30));
		label_1.setFont(new Font("ËÎÌו", Font.BOLD, 20));
		label_1.setBounds(122, 10, 130, 32);
		contentPane.add(label_1);
		
		txtNum = new JTextField();
		txtNum.setBounds(122, 48, 212, 21);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		JLabel label_2 = new JLabel("\u59D3\u540D\uFF1A");
		label_2.setBounds(48, 82, 53, 15);
		contentPane.add(label_2);
		
		txtName = new JTextField();
		txtName.setBounds(122, 79, 212, 21);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel label_3 = new JLabel("\u6027\u522B\uFF1A");
		label_3.setBounds(48, 116, 53, 15);
		contentPane.add(label_3);
		
		 rdbSex = new JRadioButton("\u7537");
		rdbSex.setSelected(true);
		rdbSex.setBounds(121, 113, 45, 21);
		contentPane.add(rdbSex);
		
		 rdbGril = new JRadioButton("\u5973");
		rdbGril.setBounds(199, 112, 53, 23);
		contentPane.add(rdbGril);
		//
		buttonGroup=new ButtonGroup();
		buttonGroup.add(rdbSex);
		buttonGroup.add(rdbGril);
		
		JLabel label_4 = new JLabel("\u5BC6\u7801\uFF1A");
		label_4.setBounds(49, 203, 54, 15);
		
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u786E\u8BA4\u5BC6\u7801:");
		label_5.setBounds(48, 234, 65, 15);
		contentPane.add(label_5);
		
		JLabel lblEmail = new JLabel("E-mail\uFF1A");
		lblEmail.setBounds(48, 265, 54, 15);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(123, 262, 211, 21);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel label_6 = new JLabel("\u7535\u8BDD\uFF1A");
		label_6.setBounds(48, 296, 54, 15);
		contentPane.add(label_6);
		
		txtTel = new JTextField();
		txtTel.setBounds(123, 293, 211, 21);
		contentPane.add(txtTel);
		txtTel.setColumns(10);
		
		JLabel label_7 = new JLabel("\u73ED\u7EA7\uFF1A");
		label_7.setBounds(48, 358, 54, 15);
		contentPane.add(label_7);
		
		txtGrade = new JTextField();
		txtGrade.setBounds(122, 355, 212, 21);
		contentPane.add(txtGrade);
		txtGrade.setColumns(10);
		
		JButton btnOK = new JButton("\u6CE8   \u518C");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student student=new Student();
//				String nameString=txtName.getText();
//				System.out.println(nameString);
				student.setName(txtName.getText());
				student.setNum(txtNum.getText());
				student.setAge(Integer.parseInt(txtAge.getText()));
				student.setEmail(txtEmail.getText());
				student.setGrade(txtGrade.getText());
				student.setPhone(txtTel.getText());
				student.setPwd(new String(txtPwd.getPassword()));
				student.setQq(txtQQ.getText());
				if(rdbGril.isSelected())
					student.setSex(rdbGril.getText());
				if(rdbSex.isSelected())
					student.setSex(rdbSex.getText());
				student.setUsername(txtUserName.getText());
				StudentDao.createStudent(student);
			}
		});
		btnOK.setBounds(48, 409, 93, 23);
		contentPane.add(btnOK);
		
		JButton btnCancel = new JButton("\u53D6   \u6D88");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(177, 409, 93, 23);
		contentPane.add(btnCancel);
		
		JLabel label_8 = new JLabel("\u5E74\u9F84\uFF1A");
		label_8.setBounds(48, 144, 54, 15);
		contentPane.add(label_8);
		
		txtAge = new JTextField();
		txtAge.setBounds(123, 141, 211, 21);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		JLabel lblQq = new JLabel("QQ\uFF1A");
		lblQq.setBounds(48, 327, 54, 15);
		contentPane.add(lblQq);
		
		txtQQ = new JTextField();
		txtQQ.setBounds(122, 324, 212, 21);
		contentPane.add(txtQQ);
		txtQQ.setColumns(10);
		
		JLabel label_9 = new JLabel("\u7528\u6237\u540D\uFF1A");
		label_9.setBounds(48, 175, 54, 15);
		contentPane.add(label_9);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(122, 172, 212, 21);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(122, 200, 212, 21);
		contentPane.add(txtPwd);
		
		txtPwd2 = new JPasswordField();
		txtPwd2.setBounds(122, 231, 212, 21);
		contentPane.add(txtPwd2);
		
	}
}
