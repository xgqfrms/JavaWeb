package command_2;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AirconditionOnBtn extends JButton implements Command {
    public AirconditionOnBtn(String name){
         super(name);
    }
    public void execute(JPanel panel){
        GAircondition Aircondition = new GAircondition(panel);
        Aircondition.startRotate();
    }
}