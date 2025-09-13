package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name = "rev bot test")
public class decoderev2 extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        double drive = 0;
        double turn;

        DcMotor backright = hardwareMap.get(DcMotor.class,"backright ");
        DcMotor backleft = hardwareMap.get(DcMotor.class,"backleft");
        DcMotor shoot = hardwareMap.get(DcMotor.class,"shoot");
        DcMotor intake = hardwareMap.get(DcMotor.class,"intake");
        telemetry.addData("Status","initialized");

        backleft. setDirection(DcMotorSimple.Direction.REVERSE);
        double rightsidepower,leftsidepower;

        waitForStart();

        while (opModeIsActive())

            drive = gamepad1.left_stick_y*-1;
        turn = gamepad1.right_stick_x;

        rightsidepower= Range.clip(drive+turn,-1,1);
        leftsidepower=Range.clip(drive-turn,-1,1);

        backleft.setPower(leftsidepower);
        backright.setPower(rightsidepower);


    }
}
