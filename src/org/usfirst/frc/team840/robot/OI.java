package org.usfirst.frc.team840.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team840.robot.commands.RotatePositive;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	private Joystick joy = new Joystick(0);
	
	public OI() {
		JoystickButton trigger = new JoystickButton(joy, 1);
		
		trigger.whenPressed(new RotatePositive());
	}
}

