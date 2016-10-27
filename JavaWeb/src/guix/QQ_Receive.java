package guix;

import java.awt.TextArea;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import javax.swing.JTextField;

public class QQ_Receive implements Runnable {
	private JTextField tf_port;
	private TextArea textArea;
	public QQ_Receive(JTextField tf_port) {
		this.tf_port = tf_port;
	}

	public QQ_Receive(JTextField tf_port, TextArea textArea) {
		this.tf_port = tf_port;
		this.textArea = textArea;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		
		try {		
			while (true) {
				int port = Integer.parseInt(tf_port.getText());
				DatagramSocket ds = new DatagramSocket(port);
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				String msg = new String(dp.getData(), 0, dp.getLength());
				textArea.append(msg);
				System.out.println(msg);
				ds.close();
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

