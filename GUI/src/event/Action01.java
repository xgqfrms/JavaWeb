package event;

import java.awt.Color;
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
import javax.swing.JTextField;

class ActionHandle {
	private JFrame frame = new JFrame("Welcome To MLDN");
	private JButton but = new JButton("��ʾ");
	private JLabel lab = new JLabel();
	private JTextField text = new JTextField(10);
	private JPanel pan = new JPanel();

	public ActionHandle() {
		Font fnt = new Font("Serief", Font.ITALIC + Font.BOLD, 28);
		lab.setFont(fnt); // ���ñ�ǩ����ʾ����
		lab.setText("�ȴ��û�������Ϣ��");
		but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// if(e.getSource() instanceof JButton){} // �ж��Ƿ��ǰ�ť
				if (e.getSource() == but) {
					lab.setText(text.getText());
				}
			}
		});
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		}); // �����¼�
		frame.setLayout(new GridLayout(2, 1));
		pan.setLayout(new GridLayout(1, 2));
		pan.add(text);
		pan.add(but);
		frame.add(pan);
		frame.add(lab);
		frame.pack();
		frame.setBackground(Color.WHITE);
		//frame.setSize(500, 400);
		frame.setLocation(200, 100);
		frame.setVisible(true);

	}
};

public class Action01 {
	public static void main(String[] args) {
		new ActionHandle();
	}

}
