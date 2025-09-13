package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = " Atiksh rev bot ")
public class Decoderevbot extends OpMode {
    @Override
    public void init() {
        double drive;
        double turn;

        DcMotor backright = hardwareMap.get(DcMotor.class,"back right ");
        DcMotor backleft = hardwareMap.get(DcMotor.class,"back left");
        DcMotor shoot = hardwareMap.get(DcMotor.class,"shoot");
        DcMotor intake = hardwareMap.get(DcMotor.class,"intake");
        telemetry.addData("Status","initialized");
    }

    @Override
    public void loop(){



    }
}
