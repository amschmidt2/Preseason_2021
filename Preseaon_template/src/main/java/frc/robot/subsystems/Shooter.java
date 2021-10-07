// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
  Spark Shooter; 
  Spark rightShooter;
 // Spark rightShooter; 

  /** Creates a new Shooter. */
  public Shooter() {
    Shooter = new Spark(Constants.SHOOTER);
    Shooter.setInverted(false);
    rightShooter = new Spark(Constants.RIGHTSHOOTER);
    rightShooter.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  
  public void shootBall(double speed){
    Shooter.set(speed);
    rightShooter.set(speed);
  }

  public void stop(){
  Shooter.set(0); 
  rightShooter.set(0);
  }
}
