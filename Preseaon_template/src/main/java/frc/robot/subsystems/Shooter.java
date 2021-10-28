// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Shooter extends SubsystemBase {
  PWMSparkMax leftShooter; 
  PWMSparkMax rightShooter;
 // Spark rightShooter; 

  /** Creates a new Shooter. */
  public Shooter() {
    leftShooter = new PWMSparkMax(Constants.LEFTSHOOTER);
    leftShooter.setInverted(false);
    rightShooter = new PWMSparkMax(Constants.RIGHTSHOOTER);
    rightShooter.setInverted(true);
    //rightShooter = new Spark(Constants.RIGHTSHOOTER);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  
  public void shootBall(double speed){
    leftShooter.set(speed);
    rightShooter.set(speed);
  }

  public void stop(){
  leftShooter.set(0); 
  rightShooter.set(0);
  }
}
