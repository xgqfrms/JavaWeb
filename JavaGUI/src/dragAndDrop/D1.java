package dragAndDrop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class D1 {

	private JFrame frmDragAndDrop;
	private JTextField textField;
	private JTextField textField_1;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D1 window = new D1();
					window.frmDragAndDrop.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public D1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDragAndDrop = new JFrame();
//		frmDragAndDrop.setIconImage(Toolkit.getDefaultToolkit().getImage(D1.class.getResource("/X.png")));
		frmDragAndDrop.getContentPane().setFont(new Font("ÀŒÃÂ", Font.BOLD, 18));
		frmDragAndDrop.getContentPane().setBackground(Color.GREEN);
		frmDragAndDrop.setBackground(Color.GREEN);
		frmDragAndDrop.setTitle("\u767B\u9646\u754C\u9762");
		frmDragAndDrop.setBounds(100, 100, 500, 370);
		frmDragAndDrop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDragAndDrop.getContentPane().setLayout(null);

		JLabel label = new JLabel("\u7528\u6237\u540D:");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 16));
		label.setBounds(40, 48, 69, 50);
		frmDragAndDrop.getContentPane().add(label);

		JLabel label_1 = new JLabel("\u5BC6\u7801:");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 16));
		label_1.setBounds(40, 121, 57, 42);
		frmDragAndDrop.getContentPane().add(label_1);

		textField = new JTextField();
		textField.setBounds(131, 58, 227, 34);
		frmDragAndDrop.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(131, 127, 227, 34);
		frmDragAndDrop.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		final JButton button = new JButton();
		button.setAction(action_1);
		button.setToolTipText("Hello");
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				// ≈–∂œ «∑Ò «∞¥≈•
//				if (e.getSource() == button) {
//					
//				}
//			}
//		});
		
		button.setBackground(new Color(255, 0, 204));
		button.setForeground(Color.CYAN);
		button.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.BOLD, 18));
		button.setBounds(87, 223, 107, 50);
		frmDragAndDrop.getContentPane().add(button);

		final JButton button_1 = new JButton();
		button_1.setAction(action);
		button_1.setToolTipText("world !");
//		button_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				// ≈–∂œ «∑Ò «∞¥≈•
//				if (e.getSource() == button_1) {
//					
//				}
//			}
//		});
//		frmDragAndDrop.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				System.exit(1);
//			}
//		});
		button_1.setBackground(Color.CYAN);
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.BOLD, 18));
		button_1.setBounds(280, 223, 101, 50);
		frmDragAndDrop.getContentPane().add(button_1);
		
		textField_2 = new JTextField();
		textField_2.setText("\u4EC5\u652F\u6301\u5B57\u6BCD,\u6570\u5B57");
		textField_2.setBounds(368, 64, 106, 21);
		frmDragAndDrop.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("\u4EC5\u652F\u6301\u5B57\u6BCD,\u6570\u5B57");
		textField_3.setColumns(10);
		textField_3.setBounds(368, 133, 106, 21);
		frmDragAndDrop.getContentPane().add(textField_3);
	}
	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "\u53D6\u6D88");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			//«Â≥˝À˘”– ‰»Îƒ⁄»›
			textField.setText("");
			textField_1.setText("");
		}
	}
	private class SwingAction_1 extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_1() {
			putValue(NAME,"\u767B\u9646" );
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
