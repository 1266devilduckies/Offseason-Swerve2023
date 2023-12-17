package frc.robot;

import edu.wpi.first.math.util.Units;

public final class Constants {
        public static class DriverConstants {
                public static final int portID = 0;
                public static final int forwardAxis = 1;
                public static final int strafeAxis = 0;
                public static final int turnAxis = 4;

                public static final double speedMetersPerSecond = Units.feetToMeters(4);
                public static double speedRadiansPerSecond = 0.5*Math.PI;
        }
}
