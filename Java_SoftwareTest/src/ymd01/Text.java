package ymd01;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.security.auth.x500.X500Principal;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.filechooser.FileSystemView;
import javax.swing.plaf.IconUIResource;

import java.awt.Toolkit;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class Text {

	private JFrame frame;

	// Icon a = new ImageIcon("x.png","hello");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Text window = new Text();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Text() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u8BB0\u4E8B\u672C!");
		frame.setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						Text.class
								.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 584, 32);
		frame.getContentPane().add(menuBar);

		JMenu mnNewMenu = new JMenu("\u6587\u4EF6(F)");
		menuBar.add(mnNewMenu);

		JMenuItem mntmoCtrln = new JMenuItem("\u65B0\u5EFA(N)     Ctrl+N");
		mntmoCtrln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path1 = "D:" + File.separator + "new.txt";
				File f1 = new File(path1);
				try {
                    f1.createNewFile();
				} catch (IOException e2) {
					e2.printStackTrace();
				}

			}

		});
		mnNewMenu.add(mntmoCtrln);

		JMenuItem mntmNewMenuItem = new JMenuItem("\u6253\u5F00(O)     Ctrl+O");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File f2= new File("D:"+File.separator);
				File fl[]= f2.listFiles();
				

			}
		});
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmnCtrls = new JMenuItem("\u4FDD\u5B58(S)     Ctrl+S");
		mnNewMenu.add(mntmnCtrls);

		JMenuItem mntms = new JMenuItem("\u53E6\u5B58\u4E3A(A)     ");
		mnNewMenu.add(mntms);

		JMenu mne = new JMenu("\u7F16\u8F91(E)");
		menuBar.add(mne);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem(
				"\u5220\u9664(D)     Ctrl+N\"");
		mne.add(mntmNewMenuItem_1);

		JMenuItem mntmdCtrln = new JMenuItem("\u5220\u9664(D)     Ctrl+N");
		mne.add(mntmdCtrln);

		JMenuItem mntmdCtrln_1 = new JMenuItem("\u5220\u9664(D)     Ctrl+N");
		mne.add(mntmdCtrln_1);

		JMenu mnNewMenu_1 = new JMenu("\u683C\u5F0F(O)");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmdCtrln_2 = new JMenuItem("\u5220\u9664(D)     Ctrl+N");
		mnNewMenu_1.add(mntmdCtrln_2);

		JMenuItem mntmdCtrln_3 = new JMenuItem("\u5220\u9664(D)     Ctrl+N");
		mnNewMenu_1.add(mntmdCtrln_3);

		JMenuItem mntmdCtrln_4 = new JMenuItem("\u5220\u9664(D)     Ctrl+N");
		mnNewMenu_1.add(mntmdCtrln_4);

		JMenu mnNewMenu_2 = new JMenu("\u67E5\u770B(V)");
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmdCtrln_5 = new JMenuItem("\u5220\u9664(D)     Ctrl+N");
		mnNewMenu_2.add(mntmdCtrln_5);

		JMenuItem mntmdCtrln_6 = new JMenuItem("\u5220\u9664(D)     Ctrl+N");
		mnNewMenu_2.add(mntmdCtrln_6);

		JMenu mnNewMenu_3 = new JMenu("\u5E2E\u52A9(H)");
		menuBar.add(mnNewMenu_3);

		JMenuItem mntmdCtrln_7 = new JMenuItem("\u5220\u9664(D)     Ctrl+N");
		mnNewMenu_3.add(mntmdCtrln_7);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 30, 584, 331);
		frame.getContentPane().add(textArea);

	}
}
