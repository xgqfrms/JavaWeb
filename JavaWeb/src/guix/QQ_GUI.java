package guix;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class QQ_GUI {

//	private JFrame frame;
	private JFrame frmqq;
	JTextField tf_userName;
	private JLabel lblIp;
	JTextField tf_ip;
	private JLabel label_1;
	JTextField tf_port;
	JTextField tf_msg;
	TextArea ta_msg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QQ_GUI window = new QQ_GUI();
					window.frmqq.setVisible(true);
					new Thread(new QQ_Receive(window.tf_port, window.ta_msg)).start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public QQ_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmqq = new JFrame();
		frmqq.setResizable(false);
	
		frmqq.getContentPane().setBackground(Color.MAGENTA);
		frmqq.setForeground(Color.GREEN);
		frmqq.setBackground(Color.GREEN);
		frmqq.setTitle("QQ send && receive" );
		frmqq.setBounds(100, 100, 618, 448);
		frmqq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmqq.getContentPane().setLayout(null);
		
		tf_userName = new JTextField();
		tf_userName.setText("xgqfrms");
		tf_userName.setBounds(95, 10, 84, 21);
		frmqq.getContentPane().add(tf_userName);
		tf_userName.setColumns(10);
		
		JLabel label = new JLabel("username");
		label.setForeground(Color.BLUE);
		label.setBounds(10, 13, 67, 15);
		frmqq.getContentPane().add(label);
		
		lblIp = new JLabel("IP address");
		lblIp.setForeground(Color.BLUE);
		lblIp.setBounds(194, 13, 76, 15);
		frmqq.getContentPane().add(lblIp);
		
		tf_ip = new JTextField();
		tf_ip.setText("127.0.0.1");
		tf_ip.setColumns(10);
		tf_ip.setBounds(287, 10, 84, 21);
		frmqq.getContentPane().add(tf_ip);
		
		label_1 = new JLabel("port:");
		label_1.setBounds(382, 13, 45, 15);
		frmqq.getContentPane().add(label_1);
		
		tf_port = new JTextField();
		tf_port.setEnabled(false);
		tf_port.setBackground(Color.WHITE);
		tf_port.setEditable(false);
		tf_port.setText("8888");
		tf_port.setColumns(10);
		tf_port.setBounds(458, 10, 84, 21);
		frmqq.getContentPane().add(tf_port);
		
		ta_msg = new TextArea();
		ta_msg.setForeground(Color.GREEN);
		ta_msg.setFont(new Font("宋体", Font.BOLD, 16));
		ta_msg.setBackground(Color.BLACK);
		ta_msg.setEditable(false);
		ta_msg.setBounds(95, 57, 426, 268);
		frmqq.getContentPane().add(ta_msg);
		
		tf_msg = new JTextField();
		tf_msg.setBackground(Color.YELLOW);
		tf_msg.setText("input field");
		tf_msg.setForeground(Color.GREEN);
		tf_msg.setFont(new Font("宋体", Font.BOLD, 16));
		tf_msg.setBounds(48, 354, 367, 28);
		frmqq.getContentPane().add(tf_msg);
		tf_msg.setColumns(10);
		
		JButton btn_send = new JButton("send");
		btn_send.setForeground(Color.BLUE);
		btn_send.setFont(new Font("宋体", Font.BOLD, 18));
		btn_send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ip = tf_ip.getText();
				int port = Integer.parseInt(tf_port.getText());
				String msg = tf_userName.getText()+":\n"+tf_msg.getText()+"\n";
				new QQ_Send(ip, port, ta_msg).send(msg);
				tf_msg.setText("");
			}
		});
		btn_send.setBackground(Color.GREEN);
		btn_send.setBounds(466, 351, 76, 35);
		frmqq.getContentPane().add(btn_send);
	}
}
