package _02_code_flow._1_robot_square;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {

	public static void main(String[] args) {

		// This code makes a new Robot
		Robot rob = new Robot();

		// PEN. Put the robot's pen down so it can draw, Use this command:
		/** rob.penDown(); **/
		rob.penDown();

		// SPEED. Make the robot move quickly. Use this command:
		/** rob.setSpeed(<speed>); **/
		rob.setSpeed(500);

		// COUNT. Create an int variable that will count how many sides of the square we
		// have drawn.
		// The start value will be zero because no sides have yet been drawn. Use this
		// code:
		/** int count = 0; **/
		int count = 0;

		// Run the program. Did the Robot draw a line and turn?

		// LOOP. Make a while loop and move the DRAW, TURN, and INCREASE COUNT code
		// so it is between the curly braces like the example below.
		// The code in the loop will now repeat 4 times to draw a square.

		/**
		 * while ( count < 4 ) {
		 * DRAW
		 * TURN
		 * INCREASE COUNT
		 * }
		 **/
		while(count < 4) {
			rob.move(109);
			rob.turn(90);
			count ++;
		}
	

		// Run the program again. Did your Robot draw a square?

	}
}
