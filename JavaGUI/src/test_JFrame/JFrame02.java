package test_JFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class JFrame02 {
	public static void main(String args[]){
		JFrame f = new JFrame("Swing ¥∞ÃÂ±ÍÃ‚");
		Dimension d = new Dimension();
		d.setSize(700, 400);
		f.setSize(d);
		f.setBackground(Color.BLUE);
		Point p = new Point();
		p.setLocation(300, 90);
		f.setLocation(p);
		f.setVisible(true);
	}

}