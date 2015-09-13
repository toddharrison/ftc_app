package com.roboroyalsftc.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by todd on 9/12/15.
 */
public class RRTest extends OpMode {
    private RRHardware hardware;

    @Override
    public void init() {
        hardware = new RRHardware(hardwareMap);
    }

    @Override
    public void loop() {
        // this.gamepad1;
        // this.gamepad2;
        // this.telemetry;
        // this.time;

        // Clipping
        double input = 1.5;
        double result = Range.clip(input, 0.0, 1.0);

        hardware.leftMotor.setPower(1.0);
        hardware.rightMotor.setPower(1.0);
    }
}
