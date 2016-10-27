package guix;
import java.awt.TextArea;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class QQ_Send implements Runnable {
	private String url;
	private int port;
	private TextArea textArea;
	public QQ_Send(String url, int port) {
		this.url = url;
		this.port = port;
	}
	
	public QQ_Send(String url, int port, TextArea textArea) {
		this.url = url;
		this.port = port;
		this.textArea = textArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String send(String msg) {
		DatagramSocket ds;
		try {
			ds = new DatagramSocket();

			InetAddress address = InetAddress.getByName(url);
			byte[] buf = msg.getBytes();
			DatagramPacket dp = new DatagramPacket(buf, 0,
					buf.length, address, port);
			ds.send(dp);
			textArea.append(msg);
			ds.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public void run() {
		try {

			while (true) {
				DatagramSocket ds_send = new DatagramSocket();
				InetAddress address = InetAddress.getByName(url);
				byte[] buf_send = "hello world!".getBytes();
				DatagramPacket dp_send = new DatagramPacket(buf_send, 0,
						buf_send.length, address, port);
				ds_send.send(dp_send);
				ds_send.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
