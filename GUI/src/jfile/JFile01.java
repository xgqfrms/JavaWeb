package jfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;

class Note implements ActionListener {
	private JTextArea area = new JTextArea(8, 10); // �����ı���
	private JFrame frame = new JFrame("Welcome To MLDN");
	private JButton open = new JButton("���ļ�");
	private JButton save = new JButton("�����ļ�");
	private JLabel label = new JLabel("����û�д򿪵��ļ�");
	private JPanel butPan = new JPanel();

	public Note() {
		this.butPan.add(open); // ������м��밴ť
		this.butPan.add(save); // ������м��밴ť
		this.frame.setLayout(new BorderLayout(3, 3));
		this.frame.add(this.label, BorderLayout.NORTH);
		this.frame.add(this.butPan, BorderLayout.SOUTH);
		this.frame.add(new JScrollPane(this.area), BorderLayout.CENTER);
		this.frame.setSize(600, 400);
		this.frame.setLocation(100,100);
		this.frame.setVisible(true);
		this.frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
		this.open.addActionListener(this);
		this.save.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		File file = null; // �����ļ�
		int result = 0; // ���ղ���״̬
		JFileChooser fileChooser = new JFileChooser(); // �ļ�ѡ���
		if (e.getSource() == this.open) { // ��ʾִ�е��Ǵ򿪲���
			this.area.setText(""); // �򿪽�����������������
			fileChooser.setApproveButtonText("ȷ��");
			fileChooser.setDialogTitle("���ļ�");
			result = fileChooser.showOpenDialog(this.frame);
			if (result == JFileChooser.APPROVE_OPTION) { // ѡ�����ȷ����ť
				file = fileChooser.getSelectedFile(); // �õ�ѡ����ļ�
				this.label.setText("�򿪵��ļ�����Ϊ��" + file.getName());
			} else if (result == JFileChooser.CANCEL_OPTION) {
				this.label.setText("û��ѡ���κ��ļ�");
			} else {
				this.label.setText("�������ִ���");
			}
			if (file != null) {
				try {
					Scanner scan = new Scanner(new FileInputStream(file));
					scan.useDelimiter("\n");
					while (scan.hasNext()) {
						this.area.append(scan.next());
						this.area.append("\n");
					}
					scan.close();
				} catch (Exception e1) {
				}
			}
		}
		if (e.getSource() == this.save) { // �ж��Ƿ��Ǳ������
			result = fileChooser.showSaveDialog(this.frame); // ��ʾ�����
			if (result == JFileChooser.APPROVE_OPTION) { // ѡ�����ȷ����ť
				file = fileChooser.getSelectedFile(); // �õ�ѡ����ļ�
				this.label.setText("ѡ��Ĵ洢�ļ�����Ϊ��" + file.getName());
			} else if (result == JFileChooser.CANCEL_OPTION) {
				this.label.setText("û��ѡ���κ��ļ�");
			} else {
				this.label.setText("�������ִ���");
			}
			if (file != null) {
				try {
					PrintStream out = new PrintStream(
							new FileOutputStream(file));
					out.print(this.area.getText());
					out.close();
				} catch (Exception e1) {
				}
			}
		}
	}
}

public class JFile01 {
	public static void main(String args[]) {
		new Note();
	}
}