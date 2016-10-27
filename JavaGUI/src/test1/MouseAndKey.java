package test1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseAndKey {
	private Frame f;
	private TextField tf;
	private Button bt;
	
	public MouseAndKey(){
		init();
	}

	private void init() {
		f = new Frame("Êó±ê,¼üÅÌ ¼àÌý");
		f.setBounds(100, 100, 500, 400);
		f.setLayout(new FlowLayout());
		tf = new TextField(12);
	    bt = new Button();
		
		
		f.add(tf);
		//f.add(bt);
		myEvent();
		f.setVisible(true);
		
	}

	private void myEvent() {
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
			
		});
		
	}

	public static void main(String[] args) {
		new MouseAndKey();

	}

}
