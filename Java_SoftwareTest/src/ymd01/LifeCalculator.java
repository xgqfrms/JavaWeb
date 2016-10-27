package ymd01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 【生命计算器】 功能实现：本程序用来计算个人从出生至目前的天数，充分利用GUI编程中的布局管理器进行布局，并使用日期处理技术计算日期。
 * 
 * @=================
 * @Date:2014-4-17
 * @author 何龙
 * @QQ：471628912
 * @since Lyloou@GaoSi
 * @=================
 */

public class LifeCalculator extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JLabel labelTop = new JLabel("本程序用来计算个人生存天数", JLabel.CENTER);
	JLabel labelBottom = new JLabel("点击按钮进入查询入口", JLabel.CENTER);
	JLabel label1 = new JLabel("年"), label2 = new JLabel("   月"),
			label3 = new JLabel("   日");
	JPanel panel, panel1, panel2, panel3, panel21, panel22, panel23, panel221,
			panel222, panel223;
	JTextField yearInput, monthInput, dayInput;
	JLabel todayLabel, birthdayLabel, lifeLabel;
	JButton button1, button2;
	boolean flag = true;
	int finalYear, finalMonth, finalDay;// checkTime后值传给这三个变量，并进一步doFinalCalc();

	public LifeCalculator() {
		this.setSize(800, 325);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		labelTop.setFont(new Font("Kaiti", Font.BOLD, 28));
		labelTop.setOpaque(true);// 此句很重要设置JLabel可以更改背景颜色
		labelTop.setBackground(new Color(135, 206, 250));
		labelBottom.setFont(new Font("Kaiti", Font.BOLD, 30));
		labelBottom.setOpaque(true);
		labelBottom.setBackground(new Color(135, 206, 250));

		this.add(labelTop, BorderLayout.NORTH);
		this.add(labelBottom, BorderLayout.SOUTH);

		panel = new JPanel();
		this.add(panel, BorderLayout.CENTER);
		panelLayout();
		this.setResizable(false);
		this.setVisible(true); // 设置可见性
	}

	public void panelLayout() {
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel.setLayout(null);
		panel1.setBounds(0, 0, this.getWidth(), 38);
		panel2.setBounds(0, 38, this.getWidth(), 174);
		panel3.setBounds(0, 212, this.getWidth(), 25);

		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		panel1Layout();
		panel2Layout();
		panel3Layout();
	}

	public void panel1Layout() {
		label1.setFont(new Font("Kaiti", Font.BOLD, 28));
		label2.setFont(new Font("Kaiti", Font.BOLD, 28));
		label3.setFont(new Font("Kaiti", Font.BOLD, 28));

		panel1.setBackground(Color.yellow);
		yearInput = new JTextField(6);
		monthInput = new JTextField(6);
		dayInput = new JTextField(6);

		panel1.add(label1);
		panel1.add(yearInput);
		panel1.add(label2);
		panel1.add(monthInput);
		panel1.add(label3);
		panel1.add(dayInput);

	}

	public void panel3Layout() {
		panel3.setBackground(Color.yellow);
	}

	public void panel2Layout() {
		panel21 = new JPanel();
		panel22 = new JPanel();
		panel23 = new JPanel();

		panel2.setLayout(null);// 注意panel2的布局运用等比例划分

		panel21.setBounds(0, 0, (int) (panel2.getWidth() * 0.2),
				panel2.getHeight());
		panel22.setBounds((int) (this.getWidth() * 0.2), 0,
				(int) (this.getWidth() * 0.6), panel2.getHeight());
		panel23.setBounds((int) (this.getWidth() * 0.8), 0,
				(int) (this.getWidth() * 0.2), panel2.getHeight());

		panel2.add(panel21);
		panel2.add(panel22);
		panel2.add(panel23);

		panel21Layout();
		panel22Layout();
		panel23Layout();

	}

	public void panel21Layout() {
		button1 = new JButton("农历查询入口");
		button1.setFont(new Font("Kaiti", Font.BOLD, 25));
		panel21.setLayout(new GridLayout(1, 1));// 让一个按钮填充到一个panel里面
		panel21.add(button1);
		panel21.setBackground(Color.yellow);
		button1.addActionListener(this);

	}

	public void panel23Layout() {
		button2 = new JButton("公历查询入口");
		button2.setFont(new Font("Kaiti", Font.BOLD, 25));
		panel23.setLayout(new GridLayout(1, 1));
		panel23.add(button2);
		panel23.setBackground(Color.yellow);
		// button2.setOpaque(true); //这些对button的处理暂时不能用，原因以后深究
		// button2.setBackground(Color.YELLOW);
		// button2.setForeground(Color.black);
		button2.addActionListener(this);
	}

	public void panel22Layout() {

		panel22.setBackground(Color.yellow);
		// 设置panel222布局
		panel22.setLayout(null);

		panel221 = new JPanel();
		panel222 = new JPanel();
		panel223 = new JPanel();

		panel221.setBounds(7, 9, panel22.getWidth() - 14,
				(int) (panel22.getHeight() * (1 / 3.0)) - 11);
		panel222.setBounds(7, (int) (panel22.getHeight() * (1 / 3.0)) + 4,
				panel22.getWidth() - 14,
				(int) (panel22.getHeight() * (1 / 3.0)) - 11);
		panel223.setBounds(7, (int) (panel22.getHeight() * (2 / 3.0)),
				panel22.getWidth() - 14,
				(int) (panel22.getHeight() * (1 / 3.0)) - 11);
		panel22.add(panel221);
		panel22.add(panel222);
		panel22.add(panel223);

		panel221Layout();
		panel222Layout();
		panel223Layout();

	}

	public void panel221Layout() {
		panel221.setLayout(new GridLayout(1, 1));
		todayLabel = new JLabel("请输入出生年月日", JLabel.CENTER);
		todayLabel.setFont(new Font("Kaiti", Font.BOLD, 30));

		todayLabel.setOpaque(true);// 一定要设置label的颜色可被操作才能对label的背景色进行更改
		todayLabel.setBackground(Color.LIGHT_GRAY);

		panel221.add(todayLabel);

	}

	private void panel222Layout() {
		panel222.setLayout(new GridLayout(1, 1));
		birthdayLabel = new JLabel("输入完成后,请按'查询'按钮", JLabel.CENTER);
		birthdayLabel.setFont(new Font("Kaiti", Font.BOLD, 30));

		birthdayLabel.setOpaque(true);
		birthdayLabel.setBackground(Color.lightGray);

		panel222.add(birthdayLabel);
	}

	private void panel223Layout() {
		panel223.setLayout(new GridLayout(1, 1));
		lifeLabel = new JLabel("来吧,试试吧", JLabel.CENTER);
		lifeLabel.setFont(new Font("Kaiti", Font.BOLD, 30));

		lifeLabel.setOpaque(true);
		lifeLabel.setBackground(Color.LIGHT_GRAY);

		panel223.add(lifeLabel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button2) {
			birthdayLabel.setBackground(Color.pink);
			todayLabel.setBackground(Color.pink);
			lifeLabel.setBackground(Color.pink);
			doBirthdayCalc();
		}
		// 农历时间处理，应熟练掌握日期处理技术
		if (e.getSource() == button1) {
			birthdayLabel.setBackground(new Color(205, 173, 0));
			todayLabel.setBackground(new Color(205, 173, 0));
			lifeLabel.setBackground(new Color(205, 173, 0));
			doBirthdayCalc();
		}
	}

	// ========================================================
	public void doBirthdayCalc() {
		try { // try语句中只获取数字，如果不是数字那么doError();
			int year = Integer.parseInt(yearInput.getText());
			int month = Integer.parseInt(monthInput.getText());
			int day = Integer.parseInt(dayInput.getText());
			checkTime(year, month, day);
		} catch (Exception e) {
			doError();
		}// doerror代码
	} // 一定要熟练掌握异常处理，通过抛出异常省略了大量check代码！！
		// ====================================================

	public void checkTime(int year, int month, int day) {
		checkMonth(month);
		checkDay(day, month, year);
		if (flag)
			doFinalCalc(year, finalMonth, finalDay); // CheckTime后最终都要执行doFinalCalc()?这句如何超控？
	}

	private void checkDay(int theDay, int theMonth, int theYear) {

		int daysPerMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,
				31 };
		if (theDay > 0 && (theDay <= daysPerMonth[theMonth])) {
			finalDay = theDay;
			flag = true;
		} else if (theDay == 29
				&& (theYear % 400 == 0 || (theYear % 4 == 0 && theYear % 100 != 0))) {
			finalDay = theDay;
			flag = true;
		} else {
			doError();
			flag = false;
		}
	}

	private void checkMonth(int theMonth) {

		if (theMonth > 0 && theMonth <= 12) {
			finalMonth = theMonth;
			flag = true;
		} else {
			doError();
			flag = false;
		}
	}

	public void doError() {
		todayLabel.setText("请输入正确的格式!");
		birthdayLabel.setText("请保证是正确的时间!");
		lifeLabel.setText("谢谢合作!");
		birthdayLabel.setBackground(new Color(165, 42, 42));
		todayLabel.setBackground(new Color(165, 42, 42));
		lifeLabel.setBackground(new Color(165, 42, 42));
	}

	public void doFinalCalc(int year, int month, int day) {
		Calendar birthday = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		birthday.set(year, month - 1, day);
		long a = (today.getTimeInMillis() - birthday.getTimeInMillis())
				/ (60 * 60 * 24 * 1000);
		int age = (int) (a / (365));
		this.todayLabel
				.setText(("今天日期: " + new SimpleDateFormat(("yyyy-MM-dd"))
						.format(today.getTime())));
		this.birthdayLabel.setText(("出生日期: " + new SimpleDateFormat(
				("yyyy-MM-dd")).format(birthday.getTime())));
		this.lifeLabel.setText(("已经生存: \"" + age + "\"年, \"" + a + "\"天"));
	}

	// 测试入口
	public static void main(String args[]) {
		new LifeCalculator();
	}
}