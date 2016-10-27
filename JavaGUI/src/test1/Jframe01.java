package test1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Jframe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Frame f = new Frame("frame 标题");
    f.setBounds(300, 200, 500, 400);
    f.setLayout(new FlowLayout());
    Button b = new Button("button name");
    f.add(b);
    f.addWindowListener( new WindowAdapter(){
    	@Override//覆盖
    	public void windowClosing(WindowEvent e){
          //System.out.println("事件"+e);
    		System.exit(0);
    	}
    });
    f.setVisible(true);
    
	}

}
