package test1;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.FileWriter;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Pic {
	
	private JFrame frmDrag;
	private JPanel panel,panel1,panel2;	
	private JRadioButton radioButton,radioButton_1;
	private JTextField textField;
	private JLabel label_0,label_a,label_2;
//	private final ButtonGroup buttonGroup1 = new ButtonGroup(); 
	//常量
	private ButtonGroup buttonGroup;
	//定义，初始化、实例化
	String str1 = null, str2 = null;
//	private JTextField textField_1;
//	private final Action action = new SwingAction();
	private Font font1 =new Font("Microsoft YaHei", Font.CENTER_BASELINE, 12);
	private Font font2 =new Font("Microsoft YaHei", Font.BOLD, 16);
	static FileWriter fw ;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pic window = new  Pic();
					window.frmDrag.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public Pic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		initFrame();
		initPanel();
		initButtonGroup();
		initButton();
		initComboBox();
		initList();
		
		//Cursor cursor = new Cursor(12);// 光标样式
	}
	
    private void initFrame(){
    	frmDrag = new JFrame();
		frmDrag.setResizable(false);
//		frmDrag.setResizable(true);
//		frmDrag.getContentPane().setBackground(new Color(0, 255, 0));
		frmDrag.getContentPane().setBackground(Color.GREEN);
		//windows green background 
		//? error 被panel 设置的颜色覆盖
		
//		frmDrag.setBackground(new Color(0, 0, 255));
//		frmDrag.setForeground(Color.BLUE);
		frmDrag.setTitle("拼图游戏：Made by Xgqfrms");
		frmDrag.setFont(font1);
		frmDrag.setBounds(10, 10, 1000, 700);
		frmDrag.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDrag.getContentPane().setLayout(null);
    }
	
    private void initPanel(){
    	panel1 = new JPanel();
//		panel1.setBackground(new Color(125, 125, 125));
		panel1.setBackground(Color.PINK);
		panel1.setBounds(0, 0, 520, 75);
		frmDrag.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		panel2 = new JPanel();
//		panel1.setBackground(new Color(125, 125, 125));
//		panel2.setBackground(Color.PINK);
		panel2.setBackground(Color.RED);
		panel2.setBounds(520, 0, 480, 75);//coordinate
		frmDrag.getContentPane().add(panel2);
		panel2.setLayout(null);
		
		label_a = new JLabel("状态区");
		label_a.setHorizontalAlignment(SwingConstants.CENTER);
		label_a.setFont(font2);
		label_a.setBounds(0, 0, 50, 30);
		label_a.setForeground(Color.BLACK);
		panel2.add(label_a);
		
		label_0 = new JLabel("按钮区");
		label_0.setHorizontalAlignment(SwingConstants.CENTER);
		label_0.setFont(font2);
		label_0.setBounds(0, 0, 50, 30);
		label_0.setForeground(Color.BLACK);
		panel1.add(label_0);
		
//		JLabel label = new JLabel("\u59D3\u540D:");
		JLabel label = new JLabel("数字提示");
		label.setHorizontalAlignment(SwingConstants.CENTER);
//		label.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		label.setFont(font2);		
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(41, 35, 80, 30);//坐标(x,y,width,length)
		label.setForeground(Color.BLACK);
		panel1.add(label);

		JLabel label_1 = new JLabel("清除提示");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(font2);
		label_1.setBounds(141, 35, 80, 30);
		label_1.setForeground(Color.BLACK);
		panel1.add(label_1);
		
	    label_2 = new JLabel("选择图片:");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(font2);
		label_2.setBounds(250, 35, 80, 30);
		label_2.setForeground(Color.BLACK);
		panel1.add(label_2);
    }
    
    private void initButtonGroup(){
       buttonGroup = new ButtonGroup();
    }
    
    private void initButton(){
    	JRadioButton radioButton = new JRadioButton("");
		buttonGroup.add(radioButton);// 按钮组
		radioButton.setSelected(true);
//		radioButton.setSelected(false);
		radioButton.setBounds(130, 38, 20, 20);
		radioButton.setBackground(Color.PINK);
		panel1.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("");
		buttonGroup.add(radioButton_1);
		radioButton_1.setSelected(false);
		radioButton_1.setBounds(30, 38, 20, 20);
		radioButton_1.setBackground(Color.PINK);
		panel1.add(radioButton_1);
		
		radioButton = new JRadioButton("");
		buttonGroup.add(radioButton);// 按钮组
		radioButton.setSelected(true);
//		radioButton.setSelected(false);
		radioButton.setBounds(130, 38, 20, 20);
		radioButton.setBackground(Color.PINK);
		panel1.add(radioButton);

	    radioButton_1 = new JRadioButton("");
		buttonGroup.add(radioButton_1);
		radioButton_1.setSelected(false);
		radioButton_1.setBounds(30, 38, 20, 20);
		radioButton_1.setBackground(Color.PINK);
		panel1.add(radioButton_1);
		
//
//		textField = new JTextField();
//		textField.setBounds(330, 38, 100, 30);
//		textField.setForeground(Color.red);
//		textField.setBackground(Color.green);
//		panel1.add(textField);
//		textField.setColumns(8);
		
//通过改写 原始对象的paint 方法，来设置对象的border颜色
		JButton button = new JButton("Start"){
			public void paint(Graphics g) {
				 super.paint(g);
				 Rectangle rect = this.getBounds();
				 int width = (int) rect.getWidth() - 1;
				 int height = (int) rect.getHeight() - 1;
				 g.setColor(Color.GREEN);
				 g.drawRect(0, 0, width, height);
				 }
		};
//		button.setAction(action);
		button.setBounds(435, 38, 70, 30);
		button.setBorderPainted(true);//没什么效果呀
//		button.setName("Start");
		button.setFont(font1);
//		Border border1;
//		button.setBorder(border1.paintBorder(c, g, 0, 0, 70, 30));
//		void javax.swing.border.Border.paintBorder(Component c, Graphics g, int x, int y, int width, int height)
		panel1.add(button);
		
    }
    private void initComboBox(){
    	String str1[]= {"item1","item2","item3"};
		JComboBox jbox = new JComboBox(str1);//下拉框
		jbox.setBounds(329, 38, 100, 30);
		panel1.add(jbox);
    }
    private void initList(){
//		String str2[]= {"item1","item2","item3"};		
//		JList list = new JList(str1);
//		list.setVisible(true);
//		
//		list.setBounds(50, 15, 100, 50);
//		list.setBackground(Color.green);
//		panel2.add(list);
		
    }
    
}

