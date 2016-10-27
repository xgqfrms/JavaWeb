package event;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowEventHandle implements WindowListener {

	public void windowActivated(WindowEvent e){
		System.out.println("windowActivated --> ���ڱ�ѡ��") ;
	}
	public void windowClosed(WindowEvent e){
		System.out.println("windowClosed --> ���ڱ��ر�") ;
	}
	public void windowClosing(WindowEvent e){
		System.out.println("windowClosing --> ���ڹر�") ;
		System.exit(1) ;
	}
	public void windowDeactivated(WindowEvent e){
		System.out.println("windowDeactivated --> ȡ������ѡ��") ;
	}
	public void windowDeiconified(WindowEvent e){
		System.out.println("windowDeiconified --> ���ڴ���С���ָ�") ;
	}
	public void windowIconified(WindowEvent e){
		System.out.println("windowIconified --> ������С��") ;
	}
	public void windowOpened(WindowEvent arg0) {
		System.out.println("windowOpened --> ���ڱ���") ;

	}

}
