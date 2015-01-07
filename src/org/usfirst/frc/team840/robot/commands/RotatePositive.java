package org.usfirst.frc.team840.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team840.robot.Robot;

/**
 *	Command to rotate the attached motor in the positive direction. Begins by starting the rotation, and ends by stopping the
 *	motor. Never registers as finished, as it should be continuous.
 */
public class RotatePositive extends Command {

    public RotatePositive() {
        requires(Robot.motor);
        setTimeout(1);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.motor.rotatePositive();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.motor.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
