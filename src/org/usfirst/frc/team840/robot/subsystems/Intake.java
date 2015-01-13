package org.usfirst.frc.team840.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;

//some pseudocode for the intake system (2 wheels that spin in opposite directions to intake a tote)
public class Intake extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private Talon lWheel;
    private Talon rWheel;

    public Intake() {
        lWheel = new Talon(RobotMap.lWheel);
        rWheel = new Talon(RobotMap.rWheel)
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void lSpin(boolean dir) {
        if (dir) lWheel.set(1);
        else lWheel.set(-1);
    }
    public void rSpin(boolean dir) {
        if (dir) rWheel.set(1);
        else rWheel.set(-1);
    }
    public void stop() {
        lWheel.set(0);
        rWheel.set(0);
    }
}
