import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	String activity = JOptionPane.showInputDialog("What activity did you do last summer");
	JOptionPane.showMessageDialog(null, "I know that you " + activity + " last summer, " + name+ " Muahahaha!");
}
}