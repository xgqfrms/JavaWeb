package dragAndDrop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

import java.awt.Toolkit;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.DropMode;
import javax.swing.JEditorPane;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.awt.TextArea;

public class D6 {

	private JFrame frmmadeByXgqfrms;
	private JTextField textField;
	private String str1 = null;
	private static TextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D6 window = new D6();
					window.frmmadeByXgqfrms.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 递归查询   文件，文件夹
	 */
//public	static void GetFileName( File file1){
//		File[] file2=file1.listFiles();
//		
//		for( File file:file2){
//			//增强的for循环。
//			if(file.isDirectory()){
//				
//				
//				textArea.append(file.getName());
//				textArea.append("\n这是一个目录\n");
//				System.out.println(file.getName());
//				System.out.println("这是目录分界线");
//				
//				GetFileName(file);
//				
//			}else if(file.isFile()){
//				textArea.append(file.getName());
//			}
//		}
//	}
	static void GetFileName(File file1){
		//递归f(n)=f(n-1)+f(n-2)费波拉契数列
		
		File[] file2=file1.listFiles();
		
		for( File file:file2){
			//增强的for循环。
			if(file.isDirectory()){
				textArea.append(file.getName());
				textArea.append("\n这是一个目录\n"); 
				System.out.println(file.getName());
				System.out.println("这是目录分界线");
				GetFileName(file);
				
				
			}else if(file.isFile()){
				textArea.append(file.getName()+"\n");
//				textArea.append("\n\n"); 
			}
		}
	}
	
	
	
	
	
	public D6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmmadeByXgqfrms = new JFrame();
		frmmadeByXgqfrms.getContentPane().setBackground(Color.CYAN);
		frmmadeByXgqfrms
				.setTitle("\u8BFB\u53D6\u6587\u4EF6\u76EE\u5F55\uFF1Amade by xgqfrms");
		frmmadeByXgqfrms.setIconImage(Toolkit.getDefaultToolkit().getImage(
				"D:\\x.ico"));
		frmmadeByXgqfrms.setBounds(100, 100, 519, 454);
		frmmadeByXgqfrms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmmadeByXgqfrms.getContentPane().setLayout(null);
		frmmadeByXgqfrms.setResizable(false);

		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 503, 415);
		frmmadeByXgqfrms.getContentPane().add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setBackground(Color.MAGENTA);
		textField.setBounds(10, 38, 110, 36);
		textField.setForeground(Color.GREEN);
		textField.setEditable(false);
		textField.setText("\u8F93\u51FA\u76EE\u5F55\u67E5\u8BE2\u7ED3\u679C");
		panel.add(textField);
		textField.setColumns(10);
		textArea = new TextArea();
		textArea.setBackground(Color.DARK_GRAY);
		textArea.setForeground(Color.GREEN);
		textArea.setBounds(133, 10, 360, 278);
		panel.add(textArea);

		final JButton btnNewButton = new JButton("\u5F00\u59CB\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton) {
					// 开始遍历指定路径下的文件夹
					File file1 =new File("D:\\Jquery");
					
					GetFileName(file1);
					
				}
			}
		});
		
		
		
		
		btnNewButton.setBounds(53, 316, 125, 45);
		panel.add(btnNewButton);

		final JButton btnNewButton_1 = new JButton("\u91CD\u7F6E\u6240\u6709");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_1) {
					JOptionPane.showMessageDialog(null, "清空查询结果", "Attention!",
							0);
					textArea.setText(null);
				
				}
			}
		});
		btnNewButton_1.setBounds(290, 316, 119, 45);
		panel.add(btnNewButton_1);

	}
	
}



