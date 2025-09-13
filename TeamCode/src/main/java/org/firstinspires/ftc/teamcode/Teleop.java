package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;

@TeleOp(name="Atiksh rev starter bot ")
public class Teleop extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        double Drive;
        double turn;
       // double intakepower;
        double rightsidepower, leftsidepower;
       // double shootpower;


        DcMotor right = hardwareMap.get(DcMotor.class, "right");
        DcMotor left = hardwareMap.get(DcMotor.class, "left");
        //DcMotor intake = hardwareMap.get(DcMotor.class, "intake");
        //DcMotor shoot =hardwareMap.get(DcMotor.class,"shoot");
        telemetry.addData("Status","initialized");



        left.setDirection(DcMotorSimple.Direction.REVERSE);


        waitForStart();

        while (opModeIsActive()) {


            Drive = gamepad1.left_stick_y;

            turn = gamepad1.left_stick_x;
            //intakepower = gamepad1.left_trigger;
            //shootpower=gamepad1.right_trigger;



            rightsidepower = Drive - turn;
            leftsidepower = Drive  + turn;


            rightsidepower = Math.max(-1.0, Math.min(1.0, rightsidepower));
            leftsidepower = Math.max(-1.0, Math.min(1.0, leftsidepower));


            right.setPower(rightsidepower);
            left.setPower(leftsidepower);
            //intake.setPower(intakepower);
            //shoot.setPower(shootpower);

        }

    }
}












