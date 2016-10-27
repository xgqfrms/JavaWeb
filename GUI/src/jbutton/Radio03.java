package jbutton;
//import java.io.File ;
import java.awt.Container ;
import java.awt.GridLayout ;
import java.awt.event.WindowAdapter ;
import java.awt.event.ItemListener ;
import java.awt.event.ItemEvent  ;
import java.awt.event.WindowEvent ;
import javax.swing.JFrame ;
import javax.swing.JPanel ;
import javax.swing.JRadioButton ;
import javax.swing.ButtonGroup ;
import javax.swing.BorderFactory ;
import javax.swing.ImageIcon ;
class MyRadio3 implements ItemListener{
	private String right =  "r.png" ;
	private String wrong =  "w.png" ;
	//private String wrong = "d:" + File.separator + "wrong.gif" ;
	private JFrame frame = new JFrame("Welcome TO MLDN") ;
	private Container cont = frame.getContentPane() ;
	private JRadioButton jrb1 = new JRadioButton("��",new ImageIcon(right),true) ;
	private JRadioButton jrb2 = new JRadioButton("Ů",new ImageIcon(wrong),false) ;
	private JPanel pan = new JPanel() ;
	public MyRadio3(){
		pan.setBorder(BorderFactory.createTitledBorder("ѡ���Ա�")) ;	// ����һ���߿����ʾ��
		pan.setLayout(new GridLayout(1,3)) ;
		pan.add(this.jrb1) ;
		pan.add(this.jrb2) ;
		
		ButtonGroup group = new ButtonGroup() ;
		group.add(this.jrb1) ;
		group.add(this.jrb2) ;
		
		jrb1.addItemListener(this) ;
		jrb2.addItemListener(this) ;

		cont.add(pan) ;
		this.frame.setSize(500,400) ;
		this.frame.setVisible(true) ;
		this.frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent obj){
				System.exit(1) ;
			}
		}) ;
	}
	public void itemStateChanged(ItemEvent e){
		if(e.getSource()==jrb1){
			jrb1.setIcon(new ImageIcon(right)) ;
			jrb2.setIcon(new ImageIcon(wrong)) ;
		}else{
			jrb1.setIcon(new ImageIcon(wrong)) ;
			jrb2.setIcon(new ImageIcon(right)) ;
		
		}
	}
};

public class Radio03 {

	public static void main(String[] args) {
		new MyRadio3() ;
	}

}
