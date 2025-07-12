package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp(name = "buttonTestV1")
public class motorTestButton extends OpMode {
    private DcMotor motor1;
    @Override
    public void init() {
        DcMotor motor1 = hardwareMap.get(DcMotor.class,"motor1");

    }

    @Override
    public void loop() {

    motor1.setPower(gamepad1.left_stick_y);


    }
}
