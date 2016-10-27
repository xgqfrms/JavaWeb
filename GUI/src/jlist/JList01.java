package jlist;

import javax.swing.JFrame ;
import javax.swing.JList ;
import java.util.Vector ;
import javax.swing.BorderFactory ;
import javax.swing.ListSelectionModel ;
import javax.swing.JScrollPane ;
import java.awt.Container ;
import java.awt.GridLayout ;
import java.awt.event.WindowAdapter ;
import java.awt.event.WindowEvent ;
class MyList{
	private JFrame frame = new JFrame("Welcome To MLDN") ;
	private Container cont = frame.getContentPane() ;	// �õ���������
	private JList list1 = null ;
	private JList list2 = null ;

	public MyList(){
		this.frame.setLayout(new GridLayout(1,3)) ;	// �����Ű�
		String nations[] = {"�й�","����","����","����","�����","����"} ;
		Vector<String> v = new Vector<String>() ;
		v.add("MLDN") ;
		v.add("MLDNJAVA") ;
		v.add("������") ;
		this.list1 = new JList(nations) ;
		this.list2 = new JList(v) ;

		this.list1.setBorder(BorderFactory.createTitledBorder("��ϲ��ȥ�Ǹ��������Σ�")) ;
		this.list2.setBorder(BorderFactory.createTitledBorder("��ϲ����վ��")) ;

		this.list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION) ;// ��ѡ
		this.list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION) ;// ��ѡ

		this.cont.add(new JScrollPane(this.list1)) ;
		this.cont.add(this.list2) ;

		this.frame.setSize(500,300) ;
		this.frame.setLocation(100, 100);
		this.frame.setVisible(true) ;



		this.frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent a){
				System.exit(1) ;
			}
		}) ;
	}

}

public class JList01{
	public static void main(String args[]){
		new MyList() ;
	}
}
