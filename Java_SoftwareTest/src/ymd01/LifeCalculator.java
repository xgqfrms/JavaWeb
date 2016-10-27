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
 * �������������� ����ʵ�֣�����������������˴ӳ�����Ŀǰ���������������GUI����еĲ��ֹ��������в��֣���ʹ�����ڴ������������ڡ�
 * 
 * @=================
 * @Date:2014-4-17
 * @author ����
 * @QQ��471628912
 * @since Lyloou@GaoSi
 * @=================
 */

public class LifeCalculator extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JLabel labelTop = new JLabel("�������������������������", JLabel.CENTER);
	JLabel labelBottom = new JLabel("�����ť�����ѯ���", JLabel.CENTER);
	JLabel label1 = new JLabel("��"), label2 = new JLabel("   ��"),
			label3 = new JLabel("   ��");
	JPanel panel, panel1, panel2, panel3, panel21, panel22, panel23, panel221,
			panel222, panel223;
	JTextField yearInput, monthInput, dayInput;
	JLabel todayLabel, birthdayLabel, lifeLabel;
	JButton button1, button2;
	boolean flag = true;
	int finalYear, finalMonth, finalDay;// checkTime��ֵ��������������������һ��doFinalCalc();

	public LifeCalculator() {
		this.setSize(800, 325);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		labelTop.setFont(new Font("Kaiti", Font.BOLD, 28));
		labelTop.setOpaque(true);// �˾����Ҫ����JLabel���Ը��ı�����ɫ
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
		this.setVisible(true); // ���ÿɼ���
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

		panel2.setLayout(null);// ע��panel2�Ĳ������õȱ�������

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
		button1 = new JButton("ũ����ѯ���");
		button1.setFont(new Font("Kaiti", Font.BOLD, 25));
		panel21.setLayout(new GridLayout(1, 1));// ��һ����ť��䵽һ��panel����
		panel21.add(button1);
		panel21.setBackground(Color.yellow);
		button1.addActionListener(this);

	}

	public void panel23Layout() {
		button2 = new JButton("������ѯ���");
		button2.setFont(new Font("Kaiti", Font.BOLD, 25));
		panel23.setLayout(new GridLayout(1, 1));
		panel23.add(button2);
		panel23.setBackground(Color.yellow);
		// button2.setOpaque(true); //��Щ��button�Ĵ�����ʱ�����ã�ԭ���Ժ��
		// button2.setBackground(Color.YELLOW);
		// button2.setForeground(Color.black);
		button2.addActionListener(this);
	}

	public void panel22Layout() {

		panel22.setBackground(Color.yellow);
		// ����panel222����
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
		todayLabel = new JLabel("���������������", JLabel.CENTER);
		todayLabel.setFont(new Font("Kaiti", Font.BOLD, 30));

		todayLabel.setOpaque(true);// һ��Ҫ����label����ɫ�ɱ��������ܶ�label�ı���ɫ���и���
		todayLabel.setBackground(Color.LIGHT_GRAY);

		panel221.add(todayLabel);

	}

	private void panel222Layout() {
		panel222.setLayout(new GridLayout(1, 1));
		birthdayLabel = new JLabel("������ɺ�,�밴'��ѯ'��ť", JLabel.CENTER);
		birthdayLabel.setFont(new Font("Kaiti", Font.BOLD, 30));

		birthdayLabel.setOpaque(true);
		birthdayLabel.setBackground(Color.lightGray);

		panel222.add(birthdayLabel);
	}

	private void panel223Layout() {
		panel223.setLayout(new GridLayout(1, 1));
		lifeLabel = new JLabel("����,���԰�", JLabel.CENTER);
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
		// ũ��ʱ�䴦��Ӧ�����������ڴ�����
		if (e.getSource() == button1) {
			birthdayLabel.setBackground(new Color(205, 173, 0));
			todayLabel.setBackground(new Color(205, 173, 0));
			lifeLabel.setBackground(new Color(205, 173, 0));
			doBirthdayCalc();
		}
	}

	// ========================================================
	public void doBirthdayCalc() {
		try { // try�����ֻ��ȡ���֣��������������ôdoError();
			int year = Integer.parseInt(yearInput.getText());
			int month = Integer.parseInt(monthInput.getText());
			int day = Integer.parseInt(dayInput.getText());
			checkTime(year, month, day);
		} catch (Exception e) {
			doError();
		}// doerror����
	} // һ��Ҫ���������쳣����ͨ���׳��쳣ʡ���˴���check���룡��
		// ====================================================

	public void checkTime(int year, int month, int day) {
		checkMonth(month);
		checkDay(day, month, year);
		if (flag)
			doFinalCalc(year, finalMonth, finalDay); // CheckTime�����ն�Ҫִ��doFinalCalc()?�����γ��أ�
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
		todayLabel.setText("��������ȷ�ĸ�ʽ!");
		birthdayLabel.setText("�뱣֤����ȷ��ʱ��!");
		lifeLabel.setText("лл����!");
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
				.setText(("��������: " + new SimpleDateFormat(("yyyy-MM-dd"))
						.format(today.getTime())));
		this.birthdayLabel.setText(("��������: " + new SimpleDateFormat(
				("yyyy-MM-dd")).format(birthday.getTime())));
		this.lifeLabel.setText(("�Ѿ�����: \"" + age + "\"��, \"" + a + "\"��"));
	}

	// �������
	public static void main(String args[]) {
		new LifeCalculator();
	}
}