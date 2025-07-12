package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "button test")
public class motorbuttontest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        DcMotor frontright = hardwareMap.get(DcMotor.class, "rightFront");
        DcMotor frontleft =   hardwareMap.get(DcMotor.class,"leftFront");
        DcMotor backright = hardwareMap.get(DcMotor.class, "rightBack");
        DcMotor backleft =   hardwareMap.get(DcMotor.class,"leftBack");



        waitForStart();




        while (opModeIsActive()){
            telemetry.addData("button A","frontright");
            telemetry.addData("button B","backright");
            telemetry.addData("button X","frontleft");
            telemetry.addData("button Y","backleft");


            telemetry.update();
            telemetry.setMsTransmissionInterval(150);
            if (gamepad1.left_bumper){
                frontright.setPower(0);
                frontleft.setPower(0);
                backleft.setPower(0);
                backright.setPower(0);

            }

            if (gamepad1.a){
                frontright.setPower(1);

                backright.setPower(1);

                frontleft.setPower(1);

                backleft.setPower(1);

            }




        }
    }
}
