package frc.robot.commands;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.SwerveSubsystem;
import swervelib.SwerveDrive;
import swervelib.parser.SwerveParser;

public class TeleopSwerve extends CommandBase {
        private final SwerveSubsystem swerveSubsystem;
        public TeleopSwerve(SwerveSubsystem swerveSubsystem) {
                this.swerveSubsystem = swerveSubsystem;
                addRequirements(this.swerveSubsystem);
        }

        @Override
        public void execute() {
                swerveSubsystem.getSwerveDrive().drive(
                        new Translation2d(-RobotContainer.driverController.getRawAxis(Constants.DriverConstants.forwardAxis) * Constants.DriverConstants.speedMetersPerSecond,
                        -RobotContainer.driverController.getRawAxis(Constants.DriverConstants.strafeAxis) * Constants.DriverConstants.speedMetersPerSecond),
                        RobotContainer.driverController.getRawAxis(Constants.DriverConstants.turnAxis) * Constants.DriverConstants.speedRadiansPerSecond,
                        false,
                        false
                );
        }
}
