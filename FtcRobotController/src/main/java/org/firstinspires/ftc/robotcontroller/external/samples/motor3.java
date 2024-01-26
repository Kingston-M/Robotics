package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class motor3 extends OpMode {
    DcMotor motor;
    DcMotor mottor;
    public Servo servo4;



    public void init() {
        motor = hardwareMap.get(DcMotor.class, "motor");
        mottor = hardwareMap.get(DcMotor.class, "mottor");
        servo4 = hardwareMap.get(Servo.class, "servotree");
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
        if (gamepad1.right_bumper){
            mottor.setPower(1);
            mottor.setDirection(DcMotorSimple.Direction.REVERSE);
        } else {
            mottor.setPower(0);
            mottor.setDirection(DcMotorSimple.Direction.REVERSE);
        }
        if (gamepad1.left_bumper){
            mottor.setPower(1);
            mottor.setDirection(DcMotorSimple.Direction.REVERSE);
        } else {
            mottor.setPower(0);
            mottor.setDirection(DcMotorSimple.Direction.REVERSE);
        }
        if (gamepad1.y) {

            servo4.setPosition(3);
        }
        if (gamepad1.x) {
            servo4.setPosition(-3);
//            servo.setPower(-1);
        }
        motor.setPower(0);
    }
}
