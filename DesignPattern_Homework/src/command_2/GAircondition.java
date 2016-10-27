package command_2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class GAircondition extends Canvas {
	//需要修改Aircondition图形界面
	
	JPanel panel =null;
	  static final int DELAY = 500;
	  static final int X = 50;
	  static final int Y = 20;
	  Color COLOR[] = { Color.blue, Color.pink};
	  int NUM = COLOR.length;
	  int width, height;

	  GAircondition(JPanel panel) {
			this.panel = panel;
			setSize(720, 410);
		    width = getWidth()-30;
		    height = getHeight()-30;
	  }
	  public void paint(Graphics g) {
		    Graphics2D  g2 = (Graphics2D)g;
		    super.paint(g2);
          //Draw the original Rect
          synchronized (COLOR) {
				if( ){
				  	  g2.setColor(COLOR[0]);
					  g2.fillRect(X, Y, width, height);
				 }
				 else{
					 g2.setColor(COLOR[1]);
					 g2.fillRect(X, Y, width, height);
				 }
		   }
	  }
	  public void keepRunning1() {
	       TimerTask task = new TimerTask() {
	            public void run() {
					 shifColor1();
					 // repaint();
		        }
	       };
	       Timer timer = new Timer();
	       timer.schedule(task, 0, DELAY);
    }
	  public void keepRunning2() {
		  TimerTask task = new TimerTask() {
			  public void run() {
				  shifColor2();
				  // repaint();
			  }
		  };
		  Timer timer = new Timer();
		  timer.schedule(task, 1, DELAY);
	  }
    // shift color by 1 position
    private void shifColor1(){
		    Color c0 = COLOR[0];   
	  }
    private void shifColor2(){
    	Color c1 = COLOR[1];  	
    }
	  //*/
	  public void startRotate() {
		  setVisible(true);
		  keepRunning1();
		  panel.add(this);
		 // repaint();
	  }
	  public void stopRotate() {
		  setVisible(true);
		  keepRunning2();
		  panel.add(this);
		  //repaint();
	}	

}
