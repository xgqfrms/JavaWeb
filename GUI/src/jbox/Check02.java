package jbox;
import java.awt.Container ;
import java.awt.GridLayout ;
import java.awt.event.WindowAdapter ;
import java.awt.event.WindowEvent ;
import javax.swing.JFrame ;
import javax.swing.JPanel ;
import javax.swing.JCheckBox ;
import javax.swing.BorderFactory ;
class MyCheckBox2{
	private JFrame frame = new JFrame("Welcome To MLDN") ;	// ���崰��
	private Container cont = frame.getContentPane() ;	// �õ���������
	private JCheckBox jcb1 = new JCheckBox("MLDN") ;	// ����һ����ѡ��
	private JCheckBox jcb2 = new JCheckBox("MLDNJAVA") ;	// ����һ����ѡ��
	private JCheckBox jcb3 = new JCheckBox("������") ;	// ����һ����ѡ��
	private JPanel pan = new JPanel() ;
	public MyCheckBox2(){
		pan.setBorder(BorderFactory.createTitledBorder("��ѡ����ϲ������վ")) ;
		pan.setLayout(new GridLayout(1,3)) ;	// ����������Ű� 
		pan.add(this.jcb1) ;	// �������
		pan.add(this.jcb2) ;	// �������
		pan.add(this.jcb3) ;	// �������
		cont.add(pan) ;	// �������뵽����֮��
		this.frame.setSize(330,80) ;
		this.frame.setVisible(true) ;	// ���ÿ���ʾ
		this.frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg){
				System.exit(1) ;
			}
		}) ;
	}

}

public class Check02 {

	public static void main(String[] args) {
		new MyCheckBox2() ;

	}

}
