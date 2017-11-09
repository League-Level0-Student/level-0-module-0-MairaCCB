
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	public static void main(String[] args) throws Exception {

		// 1. Make a new Robot
		Robot m = new Robot();

		// 3. Put the robot's pen down
		m.penDown();
		m.miniaturize();
		// 6. Make the robot move as fast as possible

		// 5. Do everything below here 4 times
		for (int i = 1; i < 5; i++) {
			// 2. Move your robot 200 pixels
			m.setSpeed(10000);
			m.move(200);

			// 4. Turn the robot 90 degrees to the right (90 degrees)
			m.turn(90);

		}
	}
}
