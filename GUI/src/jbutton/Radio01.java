package jbutton;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class MyRadio{
	private JFrame frame = new JFrame("Welcome TO MLDN") ;
	private Container cont = frame.getContentPane() ;
	private JRadioButton jrb1 = new JRadioButton("MLDN") ;
	private JRadioButton jrb2 = new JRadioButton("MLDNJAVA") ;
	private JRadioButton jrb3 = new JRadioButton("������") ;
	private JPanel pan = new JPanel() ;
	public MyRadio(){
		pan.setBorder(BorderFactory.createTitledBorder("��ѡ����ϲ������վ")) ;	// ����һ���߿����ʾ��
		pan.setLayout(new GridLayout(1,3)) ;
		pan.add(this.jrb1) ;
		pan.add(this.jrb2) ;
		pan.add(this.jrb3) ;
		cont.add(pan) ;
		this.frame.setSize(300,80) ;
		this.frame.setVisible(true) ;
		this.frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent obj){
				System.exit(1) ;
			}
		}) ;
	}
};
public class Radio01 {

	public static void main(String[] args) {
		new MyRadio() ;

	}

}
