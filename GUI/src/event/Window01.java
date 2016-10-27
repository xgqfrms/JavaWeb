package event;

import java.awt.Color;

import javax.swing.JFrame;

public class Window01 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN") ; 
		frame.addWindowListener(new MyWindowEventHandle()) ;	// 加入事件
		frame.setSize(500,400) ;
		frame.setBackground(Color.WHITE) ;
		frame.setLocation(200,100) ;
		frame.setVisible(true) ;

	}

}
