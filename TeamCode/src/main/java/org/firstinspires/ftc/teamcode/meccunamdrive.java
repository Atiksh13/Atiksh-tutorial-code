package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = " mecanumm drive")
public class meccunamdrive extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        // Variables for mechanic wheel drive - power

        double fleftpower,frightpower,bleftpower,brightpower;
        double drive,turn,strafe;

        DcMotor frontright = hardwareMap.get(DcMotor.class, "frontright");
        DcMotor frontleft =   hardwareMap.get(DcMotor.class,"frontleft");
        DcMotor backright = hardwareMap.get(DcMotor.class, "backright");
        DcMotor backleft =   hardwareMap.get(DcMotor.class,"backleft");

        backright.setDirection(DcMotorSimple.Direction.REVERSE);
        frontleft.setDirection(DcMotorSimple.Direction.REVERSE);


        waitForStart();

        while (opModeIsActive()){
            drive=gamepad1.left_stick_y;
            turn=-gamepad1.left_stick_x;
            strafe= gamepad1.right_stick_x;

            fleftpower= drive+turn+strafe;
            frightpower=drive-turn-strafe ;
            bleftpower=drive+turn -strafe;
            brightpower=drive-turn +strafe;

            backleft.setPower(bleftpower);
            backright.setPower(brightpower);
            frontright.setPower(frightpower);
            frontleft.setPower(fleftpower);


        }
    }
}
