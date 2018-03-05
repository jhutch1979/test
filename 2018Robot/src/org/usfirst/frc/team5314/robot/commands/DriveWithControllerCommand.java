/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5314.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5314.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class DriveWithControllerCommand extends Command {
	public DriveWithControllerCommand() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.driveTrain);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		double ySpeed = Robot.m_oi.getY();
		double xSpeed = Robot.m_oi.getX();
		double zRotation = Robot.m_oi.getZ();
		double gyroAngle =0;
		Robot.driveTrain.drive(ySpeed, xSpeed, zRotation, gyroAngle);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
