package jpanel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jpanel01 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome TO MLDN") ; // ʵ�����������
		JPanel pan = new JPanel() ;	// ׼������һ�����
		// �������е����ݶ����뵽��JPanel֮��
		pan.add(new JLabel("��ǩ-A")) ;
		pan.add(new JLabel("��ǩ-B")) ;
		pan.add(new JLabel("��ǩ-C")) ;
		pan.add(new JButton("��ť-X")) ;
		pan.add(new JButton("��ť-Y")) ;
		pan.add(new JButton("��ť-Z")) ;
		pan.setSize(300, 200);
		pan.setLocation(50, 100);
		frame.add(pan) ;// �������뵽����֮��
		//frame.pack() ;// ��������Զ�������С
		frame.setSize(500, 400);
		frame.setLocation(200,100) ;
		frame.setVisible(true) ;

	}

}
