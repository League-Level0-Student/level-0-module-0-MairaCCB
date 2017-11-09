import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
	public static void main(String[] args) {

		String n = JOptionPane.showInputDialog("What is your favorite color?");
		JOptionPane.showMessageDialog(null, n + " is also my favorite color too.");

		Robot m = new Robot();
		m.penDown();
		m.miniaturize();
		m.setSpeed(100);
		m.turn(120);
		m.move(100);
		m.turn(120);
		m.move(100);
		m.turn(120);
		m.move(100);
	}
}
