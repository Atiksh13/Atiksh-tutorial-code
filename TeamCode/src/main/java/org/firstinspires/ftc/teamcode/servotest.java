package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class servotest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();

        Servo servo1 = hardwareMap.servo.get("S1");
        Servo servo2 = hardwareMap.servo.get("S2");
        Servo servo3 = hardwareMap.servo.get("S3");
        Servo servo4 = hardwareMap.servo.get("S4");
        Servo servo5 = hardwareMap.servo.get("S5");

        telemetry.addLine("initialization complete");
        while(opModeIsActive()){

            if (gamepad1.a){
                servo1.setPosition(1);

            } if (gamepad1.b){
                servo1.setPosition(1);

            } if (gamepad1.x){
                servo1.setPosition(1);

            } if (gamepad1.y){
                servo1.setPosition(1);

            } if (gamepad1.dpad_up){
                servo1.setPosition(1);

            }


        }
    }
}
