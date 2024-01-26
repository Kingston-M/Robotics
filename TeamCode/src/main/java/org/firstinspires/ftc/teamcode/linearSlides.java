package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "motor")
class motor extends OpMode {

    DcMotor motor;

    @Override
    public void init() {

        motor = hardwareMap.get(DcMotor.class, "motor");
        telemetry.addData("Hardware: ", "Initialized");



    }

    @Override
    public void loop() {

        float x = gamepad1.left_stick_y;
        if(gamepad1.left_stick_y > 0){
            motor.setDirection(DcMotor.Direction.REVERSE);
            motor.setPower(x);
        } else if (gamepad1.left_stick_y > 0) {
            motor.setDirection(DcMotor.Direction.FORWARD);
            motor.setPower(x);
        }
    }

}