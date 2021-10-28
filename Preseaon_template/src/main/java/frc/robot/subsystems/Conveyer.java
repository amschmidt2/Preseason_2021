// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode; 

public class Conveyer extends SubsystemBase {
    VictorSPX conveyer1; 
    VictorSPX conveyer2;
  
    public Conveyer() {
      conveyer1 = new VictorSPX(3);
      conveyer1.setInverted(false);
      conveyer2 = new VictorSPX(5);
      conveyer2.setInverted(true);
      //rightShooter = new Spark(Constants.RIGHTSHOOTER);
    }
  
    @Override
    public void periodic() {
      // This method will be called once per scheduler run
    }
    
    public void moveBall(double speed){
      conveyer2.set(ControlMode.PercentOutput, Constants.CONVEYER1);
      conveyer1.set(ControlMode.PercentOutput, Constants.CONVEYER2);
    }
  
    public void stop(){
      conveyer2.set(ControlMode.PercentOutput, 0);
      conveyer1.set(ControlMode.PercentOutput, 0);
    }
  }
  