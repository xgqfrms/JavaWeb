package jpanel;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Jpanel02 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome TO MLDN") ; // ʵ�����������
		Container cont = frame.getContentPane() ;
		//JPanel pan = new JPanel() ;	// ׼������һ�����
		JSplitPane lfsplit = null ;	// ���ҷָ�
		JSplitPane tpsplit = null ;	// ���·ָ�

		lfsplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,new JLabel("���ǩ"),new JLabel("�ұ�ǩ")) ;
		lfsplit.setDividerSize(15) ;	// �������ҷָ����ķָ��ߴ�С
		lfsplit.setOneTouchExpandable(true);//�����۵�/չ�� ��ť
		tpsplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT,lfsplit,new JLabel("�±�ǩ")) ;
		tpsplit.setDividerSize(15) ;	// �������ҷָ����ķָ��ߴ�С
		tpsplit.setOneTouchExpandable(true) ;
		cont.add(tpsplit) ;
		frame.pack() ;// ��������Զ�������С
		frame.setSize(500, 400);
		frame.setLocation(200,100) ;
		frame.setVisible(true) ;

	}

}
