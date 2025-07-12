package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name="Arm v1")
public class arm extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        double Drive = 0;
        double turn;
        double reverse = 0;
        double armm;
        double wristm;;
        double rightsidepower, leftsidepower;
        
        DcMotor wrist = hardwareMap.get(DcMotor.class,"wrist");


        DcMotor right = hardwareMap.get(DcMotor.class, "right");
        DcMotor left = hardwareMap.get(DcMotor.class, "left");
        DcMotor arm = hardwareMap.get(DcMotor.class, "arm");

        arm.setDirection(DcMotorSimple.Direction.REVERSE);
        wrist.setDirection(DcMotorSimple.Direction.REVERSE);

        left.setDirection(DcMotorSimple.Direction.REVERSE);
        //right.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        //left.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        //arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        waitForStart();

        while (opModeIsActive()) {


            //Drive = gamepad1.right_trigger;
            //reverse = gamepad1.left_trigger;
            turn = gamepad1.right_stick_x;
            armm = gamepad1.right_trigger;
            wristm= gamepad1.left_trigger;

            rightsidepower = Drive - reverse - turn;
            leftsidepower = Drive - reverse + turn;


            rightsidepower = Math.max(-1.0, Math.min(1.0, rightsidepower));
            leftsidepower = Math.max(-1.0, Math.min(1.0, leftsidepower));

            right.setPower(rightsidepower);
            left.setPower(leftsidepower);
            arm.setPower(armm);
            wrist.setPower(wristm);

        }

    }
}












