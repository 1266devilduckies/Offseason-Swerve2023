// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandPS4Controller;
import frc.robot.subsystems.SwerveSubsystem;

public class RobotContainer {
        private final SwerveSubsystem swerveSubsystem;
        public final static CommandPS4Controller driverController = new CommandPS4Controller(Constants.DriverConstants.portID);

        public RobotContainer() {
                swerveSubsystem = new SwerveSubsystem();
                configureBindings();
        }

        private void configureBindings() {
        }

        public Command getAutonomousCommand() {
                return Commands.print("No autonomous command configured");
        }

        public SwerveSubsystem getSwerveSubsystem() {
                return swerveSubsystem;
        }
}
