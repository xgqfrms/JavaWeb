package test01_year_month_day_Adding;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//import event.ActionHandle;

public class GUI {

	public static void main(String[] args) {
		
		// ��������
		JFrame frame1 = new JFrame("NextDay");
		
		// �������
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		// ������ǩ
		JLabel labela = new JLabel("��������������:"+'\n'+"                                                                                                                                                                                                                    ",JLabel.LEFT);
		JLabel labelb = new JLabel("���������Ϊ:"+'\n'+"                                                                                                                                                 ",JLabel.LEFT);
		JLabel label1 = new JLabel("��",JLabel.CENTER);
		JLabel label2 = new JLabel("��",JLabel.CENTER);
		JLabel label3 = new JLabel("��",JLabel.CENTER);
		
		// ������ť
		JButton button1 = new JButton("ȷ��");
		JButton button2 = new JButton("ȡ��");
		JButton button3 = new JButton("����");
		JButton button4 = new JButton("�������");
		// ��������
		Font font1 = new Font("Arial", Font.BOLD, 36);
		Font f2 = new Font("�����п�",Font.BOLD,18);
		//��������
		button1.setFont(f2);
		button2.setFont(f2);
		button3.setFont(f2);
		button4.setFont(f2);
		//���������
		JTextField text1 = new JTextField(12);
		JTextField text2 = new JTextField(12);
		JTextField text3 = new JTextField(12);
		JTextField text4 = new JTextField(60);
		//��Ϣ��
		//JOptionPane jop1 = new JOptionPane();
		//jop1.showMessageDialog(arg0, arg1);
		// ��������
		GridLayout gl1 = new GridLayout(2,3);// �������񲼾�(h,v)
		FlowLayout fl1 = new FlowLayout(FlowLayout.CENTER,20,12);//����,H���,V���
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
		
		//panel1.setSize(200, 100);
		//panel1.setLocation(0, 0);
		panel1.setBackground(Color.blue);
		panel1.setBounds(0, 0, 200, 100);
		panel1.setLayout(fl1);
		frame1.add(panel1);// �������뵽����֮��
		
		// �������е����ݶ����뵽��JPanel2֮��
		panel2.add(labelb);
		//text4.setEditable(false);
		text4.setEnabled(false);
		panel2.add(text4);//��ʾ��Ϣ��(ֻ��)
		panel2.add(button3);
		panel2.add(button4);
		
		//panel2.setSize(200, 100);
		//panel2.setLocation(0, 0);
		panel2.setBackground(Color.red);
		panel2.setBounds(0, 0, 200, 100);
		panel2.setLayout(fl1);
		frame1.add(panel2);// �������뵽����֮��
		// ��������
		frame1.setLayout(gl1);//����null����ȡ��frame����,ʹ�þ��Բ���
		frame1.setBounds(50, 50, 770, 400);//���Բ���
		frame1.setFont(font1);
		frame1.setForeground(Color.BLUE); // ���������ó���ɫ
		frame1.setBackground(Color.RED); // ���ô���ı�����ɫ��
		frame1.setVisible(true); // ������ɼ�
	}

}
