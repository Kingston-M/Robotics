package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class motor extends OpMode {
    DcMotor motor;
    DcMotor mottor;
    @Override
    public void init() {
        motor = hardwareMap.get(DcMotor.class, "motor");
        mottor = hardwareMap.get(DcMotor.class, "mottor");
        telemetry.addData("Hardware: ", "Initialized");
    }
    @Override
    public void loop() {
        if(gamepad1.right_trigger > 0){
            motor.setPower(1);
            motor.setDirection(DcMotorSimple.Direction.REVERSE);
        } else if (gamepad1.left_trigger > 0) {
            motor.setPower(1);
            motor.setDirection(DcMotorSimple.Direction.FORWARD);
        }
        motor.setPower(0);
    }
}