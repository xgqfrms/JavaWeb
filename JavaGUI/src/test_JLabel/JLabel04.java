package test_JLabel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabel04 {
	public static void main(String args[]){
		JFrame fra = new JFrame("Swing �������");
		//ͼƬ
		String picPath = "D:"+File.separator+"x.ico";
		File file = new File(picPath);
		InputStream input = null;
		byte b[]= new byte[(int)file.length()];
		try{
			input = new FileInputStream(file);
			input.read(b);
			input.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		Icon icon = new ImageIcon(b);//Where my Icon ?
		
		
		JLabel lab = new JLabel("�Ĺ�Ǭ\n-�������",icon,JLabel.CENTER);//Where my \n ?
		//����
		Font fon = new Font("΢���ź�",Font.BOLD+Font.ITALIC,37);
		lab.setFont(fon);
		lab.setForeground(Color.RED);
		//����
		Container con = fra.getContentPane();
		con.add(lab);
		
		Dimension dim = new Dimension();
		dim.setSize(700, 400);
		fra.setSize(dim);
		fra.setBackground(Color.GREEN);//Where my Background Color?
		Point poi = new Point();
		poi.setLocation(300, 90);
		fra.setLocation(poi);
		fra.setVisible(true);
	}
}
