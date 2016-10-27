package command_2;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ClientUI extends JFrame {
  private JPanel btnPanel;
  private JPanel panel;

  public static final String WINDOWOPEN = "Open Window";
  public static final String WINDOWCLOSE = "Close Window";
  public static final String FANON = "FanOn";
  public static final String FANOFF = "FanOff";
  //Ìí¼Ó°´Å¥
  public static final String AIRCONDITIONON = "AirconditionOn";
  public static final String AIRCONDITIONOFF = "AirconditionOff";
  
  public static final String EXIT = "Exit";
  

  public ClientUI() {
        super("Command Pattern- Air Conditioning ");
        setUpChoicePanel();
        setUpScrollPanes();
   }
  private void setUpChoicePanel() {
	    //Create button objects
	    FanOnBtn btnFanOn = new FanOnBtn(FANON);
	    FanOffBtn btnFanOff = new FanOffBtn(FANOFF);
	    WindowOpenBtn btnWindowOpen = new WindowOpenBtn(WINDOWOPEN);
		WindowCloseBtn btnWindowClose = new WindowCloseBtn(WINDOWCLOSE);
		
		//
		AirconditionOnBtn btnAirconditionOn = new AirconditionOnBtn(AIRCONDITIONON);
		AirconditionOffBtn btnAirconditionOff = new AirconditionOffBtn(AIRCONDITIONOFF);

		ExitButton btnExit = new ExitButton(EXIT);
		
		btnFanOn.setMnemonic(KeyEvent.VK_D);
		btnFanOff.setMnemonic(KeyEvent.VK_D);
		btnWindowOpen.setMnemonic(KeyEvent.VK_D);
		btnWindowClose.setMnemonic(KeyEvent.VK_D);
		
		btnAirconditionOn.setMnemonic(KeyEvent.VK_D);
		btnAirconditionOff.setMnemonic(KeyEvent.VK_D);
		
		
		btnExit.setMnemonic(KeyEvent.VK_X);

        panel = new JPanel();
	    ListenerInvoker bh = new ListenerInvoker(panel );
	    btnFanOn.addActionListener(bh);
	    btnFanOff.addActionListener(bh);
	    btnWindowOpen.addActionListener(bh);
	    btnWindowClose.addActionListener(bh);
	    btnWindowClose.addActionListener(bh);
	    //
	    btnAirconditionOn.addActionListener(bh);
	    btnAirconditionOff.addActionListener(bh);
	    
	    btnExit.addActionListener(bh);

	    btnPanel = new JPanel();
	    btnPanel.setLayout(new FlowLayout());
	    btnPanel.add(btnFanOn);
		btnPanel.add(btnFanOff);
		btnPanel.add(btnWindowOpen);
		btnPanel.add(btnWindowClose);
		//
		btnPanel.add(btnAirconditionOn);
		btnPanel.add(btnAirconditionOff);
		
        btnPanel.add(btnExit);
   }
   private void setUpScrollPanes() {
  	    JScrollPane showInfoPane = new JScrollPane( panel);
  	    JSplitPane bigSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, showInfoPane, btnPanel);
  	    bigSplitPane.setDividerLocation(420);

        getContentPane().add(bigSplitPane);
  	    setSize(new Dimension(800, 500));
        setVisible(true);
   }
   public static void main(String args[]) {
      try { UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
      } catch (Exception evt) {}

      ClientUI frame = new ClientUI();
      frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) { System.exit(0);   }} );
      frame.setSize(800, 500);
      frame.setVisible(true);
   }
}

