package homework;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.im.InputContext;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class DecimalConvert {
	JFrame frame1 = new JFrame("����ת����");
	JPanel panel1 = new JPanel();
	JLabel label1 = new JLabel("����:", JLabel.CENTER);
	JLabel label2 = new JLabel("���:", JLabel.CENTER);
	JButton button1 = new JButton("����2");
	JButton button2 = new JButton("����8");
	JButton button3 = new JButton("����16");
	Font font1 = new Font("Arial", Font.BOLD, 36);
	String str1 = null, str2 = null;
	JTextField text1 = new JTextField(8);
	JTextField text2 = new JTextField(16);

	// תΪ2����

	static void Binary(int n) {// 9
		if (n >= 2)
			Binary(n / 2);// ����
		System.out.print(n % 2);// ȡ��
	}

	// תΪ8����
	static void Octal(int n) {// n=19;
		if (n >= 8) {
			Octal(n / 8);
			System.out.print(n % 8);
		} else
			System.out.print(n);
	}

	// תΪ16����
	static void Hexadecimal(int n) {// 27
		if (n >= 16)
			Hexadecimal(n / 16);// ����
		if (n % 16 < 10)// ȡ����
			System.out.print(n % 16);
		else
			System.out.print((char) (n % 16 + 55));// 97='A'
	}

//	public String Hexadecimal(int n) {
//		int z = 0, a = 0;
//		if (n >= 16) {
//			Hexadecimal(n / 16);
//		} else if (n % 6 < 10) {
//			z = (n % 16);
//			// System.out.println(z);
//		} else {
//			a = (n % 16);
//			z = ((char) (a + 55));
//		}
//		return String.valueOf(z);
//	}

	public DecimalConvert() {

		// ����label��ɫRGB
		label1.setOpaque(true);// �˾����Ҫ����JLabel���Ը��ı�����ɫ
		label1.setBackground(new Color(255, 127, 255));
		label2.setOpaque(true);// �˾����Ҫ����JLabel���Ը��ı�����ɫ
		label2.setBackground(new Color(80, 255, 80));
		button1.setOpaque(true);// �˾����Ҫ����JLabel���Ը��ı�����ɫ
		button1.setBackground(new Color(127, 255, 127));
		button2.setOpaque(true);// �˾����Ҫ����JLabel���Ը��ı�����ɫ
		button2.setBackground(new Color(127, 255, 127));
		button3.setOpaque(true);// �˾����Ҫ����JLabel���Ը��ı�����ɫ
		button3.setBackground(new Color(127, 255, 127));

		text1.setText("00");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ж��Ƿ��ǰ�ť
				if (e.getSource() == button1) {
					int n = 0;
					text1.setText(text1.getText());
					str1 = text1.getText();
					n = Integer.parseInt(str1);
					System.out.println("Binary: ");
					Binary(n);// static �޷���ֵ console���
//					text2.setText("Binary(n)");
					text2.setForeground(Color.RED);
					text2.setText("\n��鿴console��������!");
				}
			}
		});
		text1.setText("00");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ж��Ƿ��ǰ�ť
				if (e.getSource() == button2) {
					int n = 0;
					text1.setText(text1.getText());
					str1 = text1.getText();
					n = Integer.parseInt(str1);
					System.out.println("\nOctal: ");
					Octal(n);
//					text2.setText("Octal(n)");
					text2.setForeground(Color.GREEN);
					text2.setText("��鿴console��������!");
				}
			}
		});
		text1.setText("00");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ж��Ƿ��ǰ�ť
				if (e.getSource() == button3) {
					int n = 0;
					text1.setText(text1.getText());
					str1 = text1.getText();
					n = Integer.parseInt(str1);
//					str2 = Hexadecimal(n);
					System.out.println("\nHexadecimal: ");
					Hexadecimal(n);
//					text2.setText("Hexadecimal(n)");
					text2.setForeground(Color.BLUE);
					text2.setText("��鿴console��������!");
				}
			}
		});
		frame1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
		// ��������
		FlowLayout fl1 = new FlowLayout(FlowLayout.CENTER, 20, 12);// ����,H���,V���
		// �������е����ݶ����뵽��JPanel1֮��
		panel1.add(label1);
		panel1.add(text1);
		panel1.add(label2);
		panel1.add(text2);
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.setBackground(Color.blue);
		panel1.setBounds(0, 0, 200, 100);
		panel1.setLayout(fl1);
		frame1.add(panel1);// �������뵽����֮��
		// ��������
		frame1.setLayout(fl1);// ����null����ȡ��frame����,ʹ�þ��Բ���
		frame1.setBounds(50, 50, 700, 300);// ���Բ���
		frame1.setForeground(Color.BLUE); // ���������ó���ɫ
		frame1.setBackground(Color.RED); // ���ô���ı�����ɫ????????????????????
		frame1.setVisible(true); // ������ɼ�
	}
}

public class DecimalConvert2_8_16 {
	public static void main(String[] args) {
		new DecimalConvert();
	}

}