package homework;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ActionHandle {
	// ����string
	String str1 = null, str2 = null;
	// ��������
	JFrame frame1 = new JFrame("�ɼ��ȼ� ������");

	// �������
	JPanel panel1 = new JPanel();
	JLabel label1 = new JLabel("�������:", JLabel.CENTER);
	JLabel label2 = new JLabel("�ɼ��ȼ�:", JLabel.CENTER);
	// ������ť
	JButton button1 = new JButton("����");
	Font font1 = new Font("Arial", Font.BOLD, 36);

	public ActionHandle() {
		// ���������
		final JTextField text1 = new JTextField(12);
		final JTextField text2 = new JTextField(12);
		// ����label��ɫRGB
		label1.setOpaque(true);// �˾����Ҫ����JLabel���Ը��ı�����ɫ
		label1.setBackground(new Color(255, 0, 255));
		label2.setOpaque(true);// �˾����Ҫ����JLabel���Ը��ı�����ɫ
		label2.setBackground(new Color(255, 255, 0));
		button1.setOpaque(true);// �˾����Ҫ����JLabel���Ը��ı�����ɫ
		button1.setBackground(new Color(127, 255,127));
//		// ��������
//		button1.setFont(font1);

		text1.setText("00");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ж��Ƿ��ǰ�ť
				if (e.getSource() == button1) {
					text1.setText(text1.getText());
					str1 = text1.getText();
					if ((Integer.parseInt(str1) >= 90)
							&& (Integer.parseInt(str1) <= 100)) {
						str2 = "A";
						text2.setText(str2);
					} else if ((Integer.parseInt(str1) >= 80)
							&& (Integer.parseInt(str1) <= 89)) {
						str2 = "B";
						text2.setText(str2);
					} else if ((Integer.parseInt(str1) >= 70)
							&& (Integer.parseInt(str1) <= 79)) {
						str2 = "C";
						text2.setText(str2);
					} else if ((Integer.parseInt(str1) >= 60)
							&& (Integer.parseInt(str1) <= 69)) {
						str2 = "D";
						text2.setText(str2);
					} else if ((Integer.parseInt(str1) >= 0)
							&& (Integer.parseInt(str1) <= 59)) {
						str1 = "E";
						text2.setText(str1);
					} else {
						text1.setText("������Χ����!");
						text2.setText("?");
					}

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

public class A1 {
	public static void main(String[] args) {
		new ActionHandle();
	}

}
