package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
@TeleOp(name = "crservotestV1")
public class crservotest extends OpMode {

   private CRServo crs1;
    double lt;
    double rt;
    double power;

    public void init() {
        crs1=hardwareMap.get(CRServo.class,"crs1");
    }

    @Override
    public void loop() {
        telemetry.addLine("left trigger for back");
        telemetry.addLine("right trigger for front");
        telemetry.addData("Left value",-power);
        telemetry.addData("right value",power);

        lt=gamepad1.left_trigger;
        rt=gamepad1.right_trigger;
   if (lt>0.1){
      power=-lt;
   }
   else if (rt>0.1){
       power=rt;
   }
      else power=0;

      telemetry.addData("power",power);

        crs1.setPower(power);

    }
}
