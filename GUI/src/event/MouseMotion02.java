package event;


import java.awt.event.WindowAdapter ;
import java.awt.event.MouseMotionAdapter ;
import java.awt.event.WindowEvent ;
import java.awt.event.MouseEvent ;
import javax.swing.JFrame ;


class MyMouseMotionHandle extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyMouseMotionHandle(){
		super.setTitle("Welcome To MLDN") ;
		super.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				System.out.println("鼠标拖拽到：X = " + e.getX() + "，Y = " + e.getY()) ;
			}
		}) ;
		super.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(1) ;
			}
		}) ;	// 加入事件
		super.setSize(310,210) ;
		super.setVisible(true) ;
	}
};


public class MouseMotion02{
	public static void main(String args[]){
		new MyMouseMotionHandle() ;
	}
};