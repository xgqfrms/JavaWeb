package event;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Window03 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN") ; 
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				//System.out.println("windowClosing --> ���ڹر�") ;
				System.exit(1) ;
			}
		}) ;	// �����¼�
		frame.setSize(500,400) ;
		frame.setBackground(Color.WHITE) ;
		frame.setLocation(200,100) ;
		frame.setVisible(true) ;

	}

}
