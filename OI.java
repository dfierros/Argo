
package org.team484.argo;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    Joystick driveStickLeft = new Joystick(RobotMap.driveStickLeft);
    Joystick driveStickRight = new Joystick(RobotMap.driveSickRight);
    
    //Accessors for left joystick
    //========================================
    public double getDriveLX() {
        return driveStickLeft.getX();
    }
    public double getDriveLZ() {
        return driveStickLeft.getZ();
    }
    public double getDriveLY() {
        return driveStickLeft.getY();
    }
    //========================================
    
    //Accessors for right joystick
    //========================================
    public double getDriveRX() {
        return driveStickRight.getX();
    }
    public double getDriveRZ() {
        return driveStickRight.getZ();
    }
    public double getDriveRY() {
        return driveStickRight.getY();
    }
    //========================================));
}

