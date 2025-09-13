package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "ServoButtonTestV1")
public class ServoTestButton extends OpMode {
    private Servo servo1;
    double position=0;
    @Override
    public void init() {

        servo1=hardwareMap.get(Servo.class,"S1");

        telemetry.addLine("A is position 0");
        telemetry.addLine("B is position 0.5");
        telemetry.addLine("X is position 1");
    }

    @Override
    public void loop() {

        telemetry.addLine("A is position 0");
        telemetry.addLine("B is position 0.5");
        telemetry.addLine("X is position 1");
        if (gamepad1.a){
            position=0;
            servo1.setPosition(position);
        }
        if (gamepad1.b){
            position=0.5;
            servo1.setPosition(position);
        }
        if (gamepad1.x){
            position=1;
            servo1.setPosition(position);
        }

        telemetry.addData("servo position",position);

    }
}
