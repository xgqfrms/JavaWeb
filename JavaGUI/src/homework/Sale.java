package homework;
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
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Sale {

	// GUI
	String str1 = null, str2 = null, str3 = null, str4 = null;
	// ����boolean
	boolean t1 = false, t2 = false, t3 = false;
	// ��������
	JFrame frame1 = new JFrame("Sale profit:"+"Made by xgqfrms");

	// �������
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JLabel label1 = new JLabel("�׾�����:", JLabel.CENTER);
	JLabel label2 = new JLabel("�������:", JLabel.CENTER);
	JLabel label3 = new JLabel("ơ������:", JLabel.CENTER);
	JLabel label4 = new JLabel("���:", JLabel.CENTER);

	// ������ť
	JButton button1 = new JButton("���㽱��");
	JButton button2 = new JButton("�����������");
	// ��������
	Font font1 = new Font("Arial", Font.BOLD, 36);
	Font font2 = new Font("Arial", Font.CENTER_BASELINE, 36);

	Font f2 = new Font("�����п�", Font.BOLD, 18);
    int x1 = 168, x2 = 120, x3 = 5;// �׾ơ���ƺ�ơ�Ƶĵ��۷ֱ�Ϊ168Ԫ/ƿ�� 120Ԫ/ƿ��5Ԫ/ƿ��

	 int a1 = 5000, a2 = 3000, a3 = 30000;// ÿ�µ���߹�Ӧ��:�׾�Ϊ5000ƿ�����Ϊ3000ƿ��ơ��Ϊ30000ƿ��
	 int b1 = 50, b2 = 30, b3 = 300;// ������Աÿ���������۳��׾�50ƿ�����30ƿ��ơ��300ƿ��

	 int c1 = 0, c2 = 0, c3 = 0, c4 = 0;// ʵ�����۶�
	// ���������
	JTextField text1 = new JTextField(12);// �׾�
	JTextField text2 = new JTextField(12);// ���
	JTextField text3 = new JTextField(12);// ơ��
	JTextArea ta1 =new JTextArea();
	JTextArea ta2 =new JTextArea();
	//JTextField text4 = new JTextField(12);//

	public Sale() {

		// �������۹�˾�������۶�͸�����Ա��Ӷ��

		// ��������
		button1.setFont(f2);
		button1.setBounds(350, 50, 150, 50);
		button2.setFont(f2);
		button2.setBounds(550, 50, 150, 50);
		text1.setText("00");
		text2.setText("00");
		text3.setText("00");
		ta1.setLocation(20, 20);
		ta1.setSize(300, 200);
		ta1.setText(" ��������");
		ta1.setVisible(true);
		//text4.setEditable(false);
		ta1.setEnabled(false);
		ta2.setLocation(20, 20);
		ta2.setSize(300, 200);
		ta2.setText("������Աÿ���������۳��׾�50ƿ�����30ƿ��ơ��300ƿ��\nÿ�µ���߹�Ӧ��:�׾�Ϊ5000ƿ�����Ϊ3000ƿ��ơ��Ϊ30000ƿ��\n�׾ơ���ƺ�ơ�Ƶĵ��۷ֱ�Ϊ168Ԫ/ƿ�� 120Ԫ/ƿ��5Ԫ/ƿ��");
		ta2.setVisible(true);
		//text4.setEditable(false);
		ta2.setEnabled(false);

		// ȷ��
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ж��Ƿ��ǰ�ť
				if (e.getSource() == button1) {
					// ���������ʽ ��֤���������Ƿ����� XXXX-XX-XX�����ڸ�ʽ
					// �ַ�ת����??
					text1.setText(text1.getText());
					text2.setText(text2.getText());
					text3.setText(text3.getText());
					str1 = text1.getText();
					str2 = text2.getText();
					str3 = text3.getText();

					ta1.setText(ta1.getText());
					str4 = ta1.getText();

					if (((Integer.parseInt(str1) >= b1) && (Integer
							.parseInt(str1) <= a1))
							&& ((Integer.parseInt(str2) >= b2) && (Integer
									.parseInt(str2) <= a2))
							&& ((Integer.parseInt(str3) >= b3) && (Integer
									.parseInt(str3) <= a3))) {
						
							c1 = Integer.parseInt(str1) * x1;
							c2 = Integer.parseInt(str2) * x2;
							c3 = Integer.parseInt(str3) * x3;
							c4 = c1 + c2 + c3;
							str4 = ":" + c4;
							ta1.setFont(f2);
							ta1.setText("������ͳ�Ʊ�:"+"\n\t�׾�����:"+c1+"\n\t�������:"+c2+"\n\tơ������:"+c3+"\n������"+str4);
						
					}else{
						str4="���e�ˣ�";
						text1.setText(str4);
						text2.setText(str4);
						text3.setText(str4);
						ta1.setText(str4);
					}

				}

			}
		});
		// ȷ��
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ж��Ƿ��ǰ�ť
				if (e.getSource() == button2) {
					// ���������ʽ ��֤���������Ƿ����� XXXX-XX-XX�����ڸ�ʽ
					// �ַ�ת����??

					text1.setText("");
					text2.setText("");
					text3.setText("");
					ta1.setText("����������!");

				}

			}
		});
		frame1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});

		// ��������
		// GridLayout gl1 = new GridLayout(2, 3);// �������񲼾�(h,v)
		FlowLayout fl1 = new FlowLayout(FlowLayout.CENTER, 20, 12);// ����,H���,V���{������ʽ����(panelĬ�ϲ���)������
																	// ����}
		// �������е����ݶ����뵽��JPanel1֮��
		panel1.add(label1);
		panel1.add(text1);
		panel1.add(label2);
		panel1.add(text2);
		panel1.add(label3);
		panel1.add(text3);
		panel1.add(ta2);

		panel1.setSize(770, 300);// panel1.setBounds(0, 0, 200, 100);
		panel1.setLocation(10, 10);
		panel1.setBackground(Color.green);
		panel1.setLayout(fl1);

		panel2.add(label4);
		panel2.add(ta1);
		panel2.add(button1);
		panel2.add(button2);

		panel2.setSize(770, 300);
		panel2.setLayout(null);
		panel2.setLocation(10, 320);//
		panel2.setBackground(Color.blue);
//		panel2.setLayout(fl1);
		frame1.setResizable(false);
		frame1.add(panel1);// �������뵽����֮��
		frame1.add(panel2);// �������뵽����֮��
		// ��������
		frame1.setLayout(null);// ����null����ȡ��frame����,ʹ�þ��Բ���
		frame1.setBounds(200, 30, 800, 670);// ���Բ���
		frame1.setFont(font2);
		frame1.setBackground(Color.RED); // ���ô���ı�����ɫ��//frame1.setForeground(Color.BLUE);��ǰ��ɫ���ó���ɫ
		frame1.setVisible(true); // ������ɼ�

	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Sale();
	}

}
