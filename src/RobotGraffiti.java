import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
	Robot m = new Robot();
	m.miniaturize();
	m.setSpeed(20);
	m.penDown();
	m.move(100);
	m.turn(143);
	m.move(50);
	m.turn(-120);
	m.move(50);
	m.turn(157);
	m.move(105);
	m.penUp();
	m.move(10);
	m.turn(-90);
	m.move(50);
	m.penDown();
	m.turn(-90);
	m.move(20);
	
	
}
}