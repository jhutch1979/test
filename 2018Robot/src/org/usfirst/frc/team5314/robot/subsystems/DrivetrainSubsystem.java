/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5314.robot.subsystems;

import org.usfirst.frc.team5314.robot.RobotMap;
import org.usfirst.frc.team5314.robot.commands.DriveWithControllerCommand;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DrivetrainSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	private WPI_TalonSRX frontLeftMotor = new WPI_TalonSRX(RobotMap.LeftFrontMotor);
	private WPI_TalonSRX frontRightMotor = new WPI_TalonSRX(RobotMap.RightFrontMotor);
	private WPI_TalonSRX rearLeftMotor = new WPI_TalonSRX(RobotMap.LeftRearMotor);
	private WPI_TalonSRX rearRightMotor = new WPI_TalonSRX(RobotMap.RightRearMotor);
	private MecanumDrive driveTrain = new MecanumDrive(frontLeftMotor, 
													   rearLeftMotor, 
													   frontRightMotor, 
													   rearRightMotor);
	

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new DriveWithControllerCommand());
	}
	
	public void drive(double ySpeed, double xSpeed, double zRotation, double gyroAngle) {
		driveTrain.driveCartesian(ySpeed, xSpeed, zRotation, gyroAngle);
	}
}
