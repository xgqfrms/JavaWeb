package jlist;

import javax.swing.JFrame;
import javax.swing.JList;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

class MyListModel extends AbstractListModel {
	private String nations[] = { "�й�", "����", "����", "����", "�����", "����" };

	public Object getElementAt(int index) {
		if (index < this.nations.length) {
			return this.nations[index];
		} else {
			return null;
		}
	}

	public int getSize() {
		return this.nations.length;
	}
}

class MyList implements ListSelectionListener {
	private JFrame frame = new JFrame("Welcome To MLDN");
	private Container cont = frame.getContentPane(); // �õ���������
	private JList list1 = null;

	public MyList() {
		this.frame.setLayout(new GridLayout(1, 3)); // �����Ű�
		String nations[] = { "�й�", "����", "����", "����", "�����", "����" };
		Vector<String> v = new Vector<String>();
		v.add("MLDN");
		v.add("MLDNJAVA");
		v.add("������");
		this.list1 = new JList(new MyListModel());

		this.list1.setBorder(BorderFactory.createTitledBorder("��ϲ��ȥ�Ǹ��������Σ�"));

		this.list1
				.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);// ��ѡ

		this.cont.add(new JScrollPane(this.list1));

		this.frame.setSize(330, 180);
		this.frame.setVisible(true);
		this.list1.addListSelectionListener(this);

		this.frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent a) {
				System.exit(1);
			}
		});
	}

	public void valueChanged(ListSelectionEvent e) { // �¼�����
		int temp[] = list1.getSelectedIndices();
		System.out.print("ѡ�������ݣ�");
		for (int i = 0; i < temp.length; i++) {
			System.out.print(list1.getModel().getElementAt(i) + "��");
		}
		System.out.println();
	}

}

public class JList03 {
	public static void main(String args[]) {
		new MyList();
	}
}
