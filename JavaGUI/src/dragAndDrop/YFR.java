package dragAndDrop;

import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;
import java.awt.TextArea;

public class YFR {

	private JFrame frmMadeBy;

	private TextArea textArea;
	String str1="结果如下：";
	/**
	 * Launch the application. 
	 * 年终奖活动抽奖app 
	 * 1.随机生成1-100
	 * 2.每次访问后,自动减一,直至完成(减完/设置停止时间) 
	 * 3.随机生成一个一等奖,两个二等奖,三个三等奖.
	 *  
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YFR window = new YFR();
					window.frmMadeBy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public YFR() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMadeBy = new JFrame();
		frmMadeBy.getContentPane().setBackground(Color.GREEN);
		frmMadeBy.setOpacity(1.0f);
		frmMadeBy.setForeground(Color.GREEN);
		frmMadeBy.setResizable(false);
		frmMadeBy
				.setTitle("\u5E74\u7EC8\u5956-\u62BD\u5956\u795E\u5668 made by xgqfrms 2015");
		frmMadeBy.setBounds(100, 100, 657, 466);
		frmMadeBy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMadeBy.getContentPane().setLayout(null);

		JLabel label = new JLabel("\u62BD\u5956\u7ED3\u679C\uFF1A");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLUE);
		label.setFont(new Font("宋体", Font.BOLD, 16));
		label.setBackground(Color.CYAN);
		label.setBounds(75, 125, 96, 46);
		frmMadeBy.getContentPane().add(label);
		


		textArea = new TextArea();
		textArea.setFont(new Font("宋体", Font.PLAIN, 18));
		textArea.setBackground(Color.WHITE);
		textArea.setText("\u4F60\u51C6\u5907\u597D\u4E86\u5417\uFF1F");
		textArea.setForeground(Color.GREEN);
		textArea.setBounds(185, 51, 324, 192);
		frmMadeBy.getContentPane().add(textArea);
		textArea.setColumns(10);

		final JButton btnNewButton = new JButton("\u5F00\u59CB\u62BD\u5956");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton) {

                	int  k=0;
                	ArrayList<Integer> list=new ArrayList<Integer>(100);  
					for (int i = 100; i >= 0; i--) {
                	k=(int)(i*Math.random()+1);
                	if(!list.contains(k)){
                		list.add(k);
                    	str1=str1+"\n"+Integer.toString(k);
                    	//查找k,并且剔除k
                    	//设定中奖号。	
                    	textArea.setText(str1);
                	}
                	//textArea.setText("*\n");
                 }
				}

			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBounds(125, 321, 138, 64);
		frmMadeBy.getContentPane().add(btnNewButton);

		final JButton btnNewButton_1 = new JButton("\u6E05\u7A7A\u5185\u5BB9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_1) {
					textArea.setText("");
				}

			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_1.setBounds(406, 322, 139, 63);
		frmMadeBy.getContentPane().add(btnNewButton_1);
		
		
	}
}
