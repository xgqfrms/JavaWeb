package layout;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Layout04 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN") ; 
		CardLayout card = new CardLayout() ;
		frame.setLayout(card) ;
		Container con = frame.getContentPane() ;
		con.add(new JLabel("��ǩ-A",JLabel.CENTER),"first") ;
		con.add(new JLabel("��ǩ-B",JLabel.CENTER),"second") ;
		con.add(new JLabel("��ǩ-C",JLabel.CENTER),"thrid") ;
		con.add(new JLabel("��ǩ-D",JLabel.CENTER),"fourth") ;
		con.add(new JLabel("��ǩ-E",JLabel.CENTER),"fifth") ;
		frame.pack() ;
		frame.setSize(500, 400);
		frame.setLocation(200, 100);
		frame.setVisible(true) ;
		card.show(con,"thrid") ;
		for(int i=0;i<5;i++){
			try{
				Thread.sleep(1000) ;
			}catch(InterruptedException e){}
			card.next(con) ;
		}

	}

}
