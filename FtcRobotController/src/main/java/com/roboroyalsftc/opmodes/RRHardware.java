package com.roboroyalsftc.opmodes;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by todd on 9/12/15.
 */
public class RRHardware {
    private static final String MOTOR_LEFT = "LeftMotor";
    private static final String MOTOR_RIGHT = "RightMotor";

    protected DcMotor leftMotor;
    protected DcMotor rightMotor;

    public RRHardware(final HardwareMap hardwareMap) {
        // Load in the configured hardware
        leftMotor = hardwareMap.dcMotor.get(MOTOR_LEFT);
        rightMotor = hardwareMap.dcMotor.get(MOTOR_RIGHT);

        // Correct the direction of the RightMotor
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
    }
}
