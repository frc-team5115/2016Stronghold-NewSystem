package com.team5115.statemachines;

import com.team5115.robot.Robot;

public class Gate2 extends StateMachineBase {
	
	public void update() {
		switch (state) {		
		default:
			System.out.println("Gate 2");
			state = 2;

			break;
			
		//Go in straight line under low bar
		case 2:
			Robot.sl.setVar(10, 0.4);
			Robot.sl.setState(1);
			state = 3;
			break;
		
		//Turn to face goal
		case 3:    
			Robot.t.setVar(-140);
			Robot.t.setState(1);
			state = 4;
			break;
		
		//Go straight towards goal
		case 4:	   
			Robot.sl.setVar(4,  0.4);
			Robot.sl.setState(1);
			state = 5;
			break;
			
		case 5: 
			/* 
			 * Aim code
			 */
			//Robot.t.setVar();
			Robot.sl.setState(1);
			state = 6;
			break;
			
		//Straight line thing
		case 6:
			Robot.sl.setVar(4, 0.4);
			Robot.sl.setState(1);
			state = 7;
			break;
			
		//Stop fondling
		case 7: 
			Robot.f.setState(3);
			break;
		}
	}
}