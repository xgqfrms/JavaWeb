package jlable;

import java.awt.Color;
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

public class Jlable03 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN") ;
		String picPath = "nba.gif" ;//���·��
		//String picPath = File.separator + "nba.gif" ;
		//String picPath = "d:" + File.separator + "nba.gif" ;����·��//???��֧��.ico �ļ�
		File file = new File(picPath) ;	// ʵ����File��Ķ���
		InputStream input = null ;
		byte b[] = new byte[(int)file.length()] ;
		try{
			input = new FileInputStream(file) ;
			input.read(b) ;
			input.close() ;
		}catch(Exception e){
			e.printStackTrace() ;
		}
		Icon icon = new ImageIcon(b) ;
		JLabel lab = new JLabel("MLDN",icon,JLabel.CENTER) ;	// ʵ������ǩ����
		Font fnt = new Font("Arial",Font.ITALIC + Font.BOLD,28) ;
		lab.setFont(fnt) ;
		lab.setForeground(Color.RED) ;
		lab.setBackground(Color.YELLOW) ;//���ô���ı�����ɫ???
		frame.add(lab) ;	// ��������뵽���֮��
		Dimension dim = new Dimension() ;
		dim.setSize(500,400) ;
		frame.setSize(dim) ;
		Point point = new Point(200,100) ;	// ��������
		frame.setBackground(Color.GREEN) ;//���ô���ı�����ɫ???
		frame.setLocation(point) ;
		frame.setVisible(true) ;

	}

}
