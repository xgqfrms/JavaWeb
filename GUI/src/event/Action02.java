package event;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class ActionHandle02{
	private JFrame frame = new JFrame("Welcome To MLDN") ; 
	private JButton but = new JButton("显示");
	private JLabel lab = new JLabel() ;
	private JTextField text = new JTextField(10) ;
	private JPanel pan = new JPanel() ;
	public ActionHandle02(){
		Font fnt = new Font("Serief",Font.ITALIC + Font.BOLD,28) ;
		lab.setFont(fnt) ;	// 设置标签的显示文字
		lab.setText("等待用户输入信息！") ;
		but.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource() instanceof JButton){
					lab.setText(text.getText()) ;
				}	// 判断是否是按钮
			}
		}) ;
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(1) ;
			}
		}) ;	// 加入事件
		frame.setLayout(new GridLayout(2,1)) ;
		pan.setLayout(new GridLayout(1,2)) ;
		pan.add(text);
		pan.add(but) ;
		frame.add(pan) ;
		frame.add(lab) ;
		frame.pack() ;
		frame.setBackground(Color.WHITE) ;
		frame.setLocation(300,200) ;
		frame.setVisible(true) ;

	}
};
public class Action02 {

	public static void main(String[] args) {
		 new ActionHandle02() ;

	}

}
