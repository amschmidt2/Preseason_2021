// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  Jaguar left; 
  Jaguar right; 
  SpeedControllerGroup leftMotors; 
  SpeedControllerGroup rightMotors;
  DifferentialDrive drive; 


  /** Creates a new DriveTrain. */
  public DriveTrain() {
    left = new Jaguar(Constants.Left);
    left.setInverted(false);
    right = new Jaguar(Constants.Right);
    right.setInverted(false);
    //leftMotors = new SpeedControllerGroup(leftFront, leftBack);
    //rightMotors = new SpeedControllerGroup(rightFront, rightBack);


    drive = new DifferentialDrive(left, right);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void driveWithJoysticks(XboxController controller, double speed)
  {
    drive.arcadeDrive(controller.getRawAxis(Constants.XBOX_lEFT_Y_AXIS)*speed, controller.getRawAxis(Constants.XBOX_LEFT_X_AXIS));
  }
  public void driveForward(double speed)
  {
    drive.tankDrive(speed, speed);
  }

  public void stop()
  {
  drive.stopMotor();  
  }

}
