package ymd01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ActionHandle {
	// ���峣���� const
	int y1 = 1800, y2 = 2050;
	int m1 = 1, m2 = 12;
	int d1 = 1, d2 = 31;
	int i1 = 0, i2 = 0, i3 = 0;
	// ����string
	String str1 = null, str2 = null, str3 = null;
	// ����boolean
	boolean t1 = false, t2 = false, t3 = false;
	// ��������
	JFrame frame1 = new JFrame("NextDay: �������뷶Χ:1800-00-00~2050-00-00");

	// �������
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	// ������ǩ
	JLabel labela = new JLabel(
			"��������������:"
					+ '\n'
					+ "                                                                                                                                                                                                                    ",
			JLabel.LEFT);
	JLabel labelb = new JLabel(
			"���������Ϊ:"
					+ '\n'
					+ "                                                                                                                                                 ",
			JLabel.LEFT);

	JLabel label1 = new JLabel("��", JLabel.CENTER);
	JLabel label2 = new JLabel("��", JLabel.CENTER);
	JLabel label3 = new JLabel("��", JLabel.CENTER);

	// ������ť
	JButton button1 = new JButton("ȷ��");
	JButton button2 = new JButton("ȡ��");
	JButton button3 = new JButton("����");
	JButton button4 = new JButton("�������");
	// ��������
	Font font1 = new Font("Arial", Font.BOLD, 36);
	Font font2 = new Font("Arial", Font.CENTER_BASELINE, 36);

	Font f2 = new Font("�����п�", Font.BOLD, 18);

	public ActionHandle() {
		// ����label��ɫRGB
		labela.setOpaque(true);// �˾����Ҫ����JLabel���Ը��ı�����ɫ
		labela.setBackground(new Color(255, 0, 255));
		labelb.setOpaque(true);// �˾����Ҫ����JLabel���Ը��ı�����ɫ
		labelb.setBackground(new Color(255, 255, 0));
		// ��������
		button1.setFont(f2);
		button2.setFont(f2);
		button3.setFont(f2);
		button4.setFont(f2);
		// ���������
		JTextField text1 = new JTextField(12);
		JTextField text2 = new JTextField(12);
		JTextField text3 = new JTextField(12);
		JTextField text4 = new JTextField(60);
		// text4.setForeground(Color.RED);// ������???

		// ȷ���¼�������(��/��/��)
		// ����¼�������_��
		text3.setText("00");
		// text3.setText("�շݷ�ΧΪ[01-31]");
		// ȷ��
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ж��Ƿ��ǰ�ť
				if (e.getSource() == button1) {
					// ���������ʽ ��֤���������Ƿ����� XXXX-XX-XX�����ڸ�ʽ
					// �ַ�ת����??
					text3.setText(text3.getText());
					str3 = text3.getText();
					if ((Integer.parseInt(str3) >= d1)
							&& (Integer.parseInt(str3) <= d2)) {
						t3 = true;
						text3.setFont(f2);
						// �жϴ���,��λ��?
						if (Integer.parseInt(str3) < d2) {
							i3 = Integer.parseInt(str3) + 1;
						} else
							i3 = 1;
					} else {
						text3.setForeground(Color.RED);//����������ɫ!
						text3.setText("��ʽ����,����������!");
					}

				}
			}
		});
//		frame1.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				System.exit(1);
//			}
//		});
		// ����¼�������_��
		// text2.setText("�·ݷ�ΧΪ[01-12]");
		text2.setText("00");
		// ȷ��
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ж��Ƿ��ǰ�ť
				if (e.getSource() == button1) {
					// ���������ʽ ��֤���������Ƿ����� XXXX-XX-XX�����ڸ�ʽ
					// �ַ�ת����??
					text2.setText(text2.getText());
					str2 = text2.getText();
					str3 = text3.getText();
					if ((Integer.parseInt(str2) >= m1)
							&& (Integer.parseInt(str2) <= m2)) {
						t2 = true;
						text2.setFont(f2);
						// �жϴ���,��λ��?
						if ((Integer.parseInt(str2) < m2)
								&& (Integer.parseInt(str3) == d2)) {
							i2 = Integer.parseInt(str2) + 1;
						} else if ((Integer.parseInt(str2) == m2)
								&& (Integer.parseInt(str3) == d2)) {
							i2 = 1;
						} else
							i2 = Integer.parseInt(str2);
					} else {
						text2.setForeground(Color.RED);
						text2.setText("��ʽ����,����������!");
					}

				}

			}
		});
//		frame1.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				System.exit(1);
//			}
//		});
		// ����¼�������_��
		// text1.setText("��ݷ�ΧΪ[1800-2050]");
		text1.setText("0000");
		// ȷ��
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ж��Ƿ��ǰ�ť
				if (e.getSource() == button1) {
					// ���������ʽ ��֤���������Ƿ����� XXXX-XX-XX�����ڸ�ʽ
					// ������ʽ[1][8-9][0-9][0-9]/[2][0][0-4][0-9]/[2][0][5][0]
					// �ַ�ת���η��� Integer.parseInt(str1);
					text1.setText(text1.getText());
					str1 = text1.getText();
					str2 = text2.getText();
					str3 = text3.getText();
					if ((Integer.parseInt(str1) >= y1)
							&& (Integer.parseInt(str1) <= y2)) {
						// flag ���
						t1 = true;
						text1.setFont(f2);
						// �жϴ���,��λ��?
						if ((Integer.parseInt(str1) < y2)
								&& (Integer.parseInt(str2) == m2)
								&& (Integer.parseInt(str3) == d2)) {
							i1 = Integer.parseInt(str1) + 1;
						} else
							{i1 = Integer.parseInt(str1);}
					} else {
						text1.setForeground(Color.RED);
						text1.setText("��ʽ����,����������!");
					}

				}

			}
		});
//		frame1.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				System.exit(1);
//			}
//		});

		// ����¼�������_ȡ��
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �жϰ�ť
				if (e.getSource() == button2) {
					// �����������
					text1.setText("");
					text2.setText("");
					text3.setText("");
				}

			}
		});
//		frame1.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				System.exit(1);
//			}
//		});
		// ����¼�������_����
		text4.setText("�û�������Ϣ��ʾ����");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ж��Ƿ��ǰ�ť
				if (e.getSource() == button3) {
					// ���������ʽ ��֤���������Ƿ����� XXXX-XX-XX�����ڸ�ʽ
					// �ַ�ת����??
					if ((t1 == true) && (t2 == true) && (t3 == true)) {
						text4.setText(i1 + "-" + i2 + "-" + i3);
					} else {
						text4.setForeground(Color.RED);// ����else{ }
						text4.setText("Error !");
					}

				}

			}
		});
//		frame1.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				System.exit(1);
//			}
//		});
		// ����¼�������_�������
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �жϰ�ť
				if (e.getSource() == button4) {
					// �����������
					text1.setText("");
					text2.setText("");
					text3.setText("");
					text4.setText("");
				}
			}
		});
		frame1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
		// ��������
		GridLayout gl1 = new GridLayout(2, 3);// �������񲼾�(h,v)
		FlowLayout fl1 = new FlowLayout(FlowLayout.CENTER, 20, 12);// ����,H���,V���
		// ������ʽ����(panelĬ�ϲ���)������ ����

		// �������е����ݶ����뵽��JPanel1֮��
		panel1.add(labela);
		panel1.add(label1);
		panel1.add(text1);
		panel1.add(label2);
		panel1.add(text2);
		panel1.add(label3);
		panel1.add(text3);
		panel1.add(button1);
		panel1.add(button2);

		// panel1.setSize(200, 100);
		// panel1.setLocation(0, 0);
		panel1.setBackground(Color.blue);
		panel1.setBounds(0, 0, 200, 100);
		panel1.setLayout(fl1);
		frame1.add(panel1);// �������뵽����֮��

		// �������е����ݶ����뵽��JPanel2֮��
		panel2.add(labelb);
		// text4.setEditable(false);
		text4.setEnabled(false);
		text4.setForeground(Color.RED);// ǰ��ɫ
		panel2.add(text4);// ��ʾ��Ϣ��(ֻ��)
		panel2.add(button3);
		panel2.add(button4);

		// panel2.setSize(200, 100);
		// panel2.setLocation(0, 0);
		panel2.setBackground(Color.green);
		panel2.setBounds(0, 0, 200, 100);
		panel2.setLayout(fl1);
		frame1.add(panel2);// �������뵽����֮��
		// ��������

		frame1.setLayout(gl1);// ����null����ȡ��frame����,ʹ�þ��Բ���
		frame1.setBounds(50, 50, 770, 400);// ���Բ���
		frame1.setFont(font2);
		// frame1.setForeground(Color.BLUE); // ��ǰ��ɫ���ó���ɫ
		frame1.setBackground(Color.RED); // ���ô���ı�����ɫ��
		frame1.setVisible(true); // ������ɼ�
	}

	public  void Error() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "hello world!");// �쳣����

	}
}

public class YMD {
	public static void main(String[] args) {
		new ActionHandle();

	}

}
