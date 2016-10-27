package command_2;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AirconditionOffBtn extends JButton implements Command {
	public AirconditionOffBtn(String name){
        super(name);
   }
    public void execute(JPanel panel){
        GAircondition Aircondition = new GAircondition(panel);
        Aircondition.stopRotate();
    }
}