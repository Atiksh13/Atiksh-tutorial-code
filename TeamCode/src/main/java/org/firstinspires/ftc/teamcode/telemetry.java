package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp(name = "Telemetrytestv1")
public class telemetry extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        DcMotor left = hardwareMap.dcMotor.get("left");

        telemetry.addData("status","intialized");
        telemetry.update();
        telemetry.setMsTransmissionInterval(150);

        waitForStart();

        while (opModeIsActive())

            left.setPower(-0.5);

        telemetry.addData("motor1 position",left.getCurrentPosition());

           // telemetry.addLine("Info");
            //telemetry.addData("positon",3);

            telemetry.update();
    }
}
