package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import java.util.Timer;

@TeleOp(name = "pid")
public abstract class Basepid extends LinearOpMode {


    public void armtopositiom(DcMotor arm , int target, double kp, double ki, double kd, OpMode opMode){


        ElapsedTime timer = new ElapsedTime();
        int Moe=3;
        double previousTime=0,previousError=0;
        double p=0,i=0,d=0;
        double max_i=   0.2,min_i=-0.2;
        double power;

        while (Math.abs(target - arm.getCurrentPosition()) > 3 && ((LinearOpMode)opMode).opModeIsActive()){

     double currentTime= timer.milliseconds();
     double error=target-arm.getCurrentPosition();

     //propotional error
            p=kp*error;

            //integralerror
            i+=ki*(error*currentTime-i);

            if (i>max_i){

                i=max_i;

            } else if (i<min_i) {
                i=min_i;
                
            }


            //deriative error
            d=kd*(error-previousError)/(currentTime-previousTime);

            power=p+i+d;
            arm.setPower(power);

            previousError=error;
            previousTime=currentTime;



        }

        //arm.setpower(p+i+d);
    }
}
