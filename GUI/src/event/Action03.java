package event;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


	class LoginCheck {
		private String name;
		private String password;

		public LoginCheck(String name, String password) {
			this.name = name;
			this.password = password;
		}

		public boolean validate() {
			if ("xgqfrms".equals(name) && "12345".equals(password)) {
				return true;
			}
			else if("xgq".equals(name) && "1234".equals(password)){
				return true;
			}
			else if("x".equals(name) && "123".equals(password)){
				return true;
			}
			else {
				return false;
			}
		}
	};

	class ActionHandle03{
		private JFrame frame = new JFrame("Welcome To MLDN");
		private JButton submit = new JButton("��½");
		private JButton reset = new JButton("����");
		private JLabel nameLab = new JLabel("�û�����");
		private JLabel passLab = new JLabel("��   �룺");
		private JLabel infoLab = new JLabel("�û���½ϵͳ");
		private JTextField nameText = new JTextField(10);
		private JPasswordField passText = new JPasswordField();
		//private JPanel pan = new JPanel();

		public ActionHandle03() {
			Font fnt = new Font("Serief", Font.ITALIC + Font.BOLD, 12);
			infoLab.setFont(fnt); // ���ñ�ǩ����ʾ����
			submit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == submit) {
						String tname = nameText.getText();
						String tpass = new String(passText.getPassword());
						LoginCheck log = new LoginCheck(tname, tpass);
						if (log.validate()) {
							infoLab.setText("��½�ɹ�����ӭ���٣�");
						} else {
							infoLab.setText("��½ʧ�ܣ�������û��������룡");
						}
					}
				}
			});
			reset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == reset) {
						nameText.setText("");
						passText.setText("");
						infoLab.setText("�û���½ϵͳ");
					}
				}
			});

			frame.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(1);
				}
			}); // �����¼�
			frame.setLayout(null);
			nameLab.setBounds(5, 5, 60, 20);
			passLab.setBounds(5, 30, 60, 20);
			infoLab.setBounds(5, 65, 220, 30);
			nameText.setBounds(65, 5, 100, 20);
			passText.setBounds(65, 30, 100, 20);
			submit.setBounds(165, 5, 60, 20);
			reset.setBounds(165, 30, 60, 20);
			frame.add(nameLab);
			frame.add(passLab);
			frame.add(infoLab);
			frame.add(nameText);
			frame.add(passText);
			frame.add(submit);
			frame.add(reset);
			frame.setSize(500, 400);
			frame.setBackground(Color.WHITE);
			frame.setLocation(200, 100);
			frame.setVisible(true);

		}
	};
public class Action03 {
	public static void main(String[] args) {
		new ActionHandle03();

	}

}
