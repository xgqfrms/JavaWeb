package com.henau.studentmanager.Service;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.henau.studentmanager.Dao.StudentDao;
import com.henau.studentmanager.model.Student;

public class QueryStuent extends JFrame {

	private static final long serialVersionUID = -6338298897555399193L;
	private JPanel contentPane;
	private JTextField txtNum;
	private JRadioButton rbtnMan;
	private JRadioButton rbtnWoman;
	private ButtonGroup buttonGroup;
	private JTextArea txtaInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QueryStuent frame = new QueryStuent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QueryStuent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNum = new JTextField();
		txtNum.setText("001");
		txtNum.setBounds(163, 10, 147, 21);
		contentPane.add(txtNum);
		txtNum.setColumns(10);

		JLabel label = new JLabel(
				"\u8BF7\u8F93\u5165\u5B66\u751F\u7684\u5B66\u53F7\u67E5\u8BE2\uFF1A");
		label.setBounds(10, 13, 155, 15);
		contentPane.add(label);

		JButton btnQuery = new JButton("\u67E5   \u8BE2");
		btnQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numString = txtNum.getText();
				StudentDao std = new StudentDao();
				Student student = std.getStudentByNum(numString);
				String sResult = "";
				sResult += "姓名\t年龄\t性别\t学号\t用户名\t密码\tE-mail\t\t电话\tQQ\t班级\n";
				if (student == null) {
					txtaInfo.setText("对不起，没有该学号的学生信息");
				} else {

					txtaInfo.setText(sResult + student.getName() + "\t"
							+ student.getAge() + "\t" + student.getSex() + "\t"
							+ student.getNum() + "\t" + student.getUsername()
							+ "\t" + student.getPwd() + "\t"
							+ student.getEmail() + "\t" + student.getPhone()
							+ "\t" + student.getQq() + "\t"
							+ student.getGrade());
				}
				List<Student> students = null;
				if (rbtnMan.isSelected()) {
					students = std.getMans();
				} else if (rbtnWoman.isSelected()) {
					students = std.getWomen();
				}
				if (students != null && students.size() > 0) {
					for (Student stu : students) {
						sResult += stu.getName() + "\t" + stu.getAge() + "\t"
								+ stu.getSex() + "\t" + stu.getNum() + "\t"
								+ stu.getUsername() + "\t" + stu.getPwd()
								+ "\t" + stu.getEmail() + "\t" + stu.getPhone()
								+ "\t" + stu.getQq() + "\t" + stu.getGrade()
								+ "\n";
					}
					txtaInfo.setText(sResult);
				}
			}
		});
		btnQuery.setBounds(915, 10, 75, 48);
		contentPane.add(btnQuery);

		rbtnMan = new JRadioButton("\u7537");
		rbtnMan.setBounds(10, 34, 53, 23);
		contentPane.add(rbtnMan);

		txtaInfo = new JTextArea();
		txtaInfo.setBounds(10, 68, 980, 487);
		contentPane.add(txtaInfo);

		rbtnWoman = new JRadioButton("\u5973");
		rbtnWoman.setBounds(80, 35, 53, 23);
		contentPane.add(rbtnWoman);
		// 把两个单选按钮编为一组，实现男和女只能选择一个效果
		buttonGroup = new ButtonGroup();
		buttonGroup.add(rbtnMan);
		buttonGroup.add(rbtnWoman);
	}
}
