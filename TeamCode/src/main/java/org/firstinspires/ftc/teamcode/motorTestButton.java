package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp(name = "buttonTestV1")
public class motorTestButton extends OpMode {
    private DcMotor motor1;
    double speed= 0;
    @Override
    public void init() {
        motor1 = hardwareMap.get(DcMotor.class,"motor1");

        telemetry.addLine("press A for clockwise");
        telemetry.addLine("press B for Anti-clockwise");
        telemetry.addLine("press nothing for stop");
    }

    @Override
    public void loop() {
        telemetry.addLine("press A for clockwise");
        telemetry.addLine("press B for Anti-clockwise");
        telemetry.addLine("press nothing for stop");

    motor1.setPower(speed);
    if (gamepad1.a){
        speed = 1;
        motor1.setPower(speed);

    }
    if (gamepad1.b){
        speed = -1;
        motor1.setPower(speed);
    }

        telemetry.addData("motor position", speed);
    }
}
