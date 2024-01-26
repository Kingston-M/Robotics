package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
public class UPandDOWN {

    DcMotor motor;

    public UPandDOWN(HardwareMap hardwareMap) {
        motor = hardwareMap.get(DcMotor.class, "motor");
    }

    public void ups(double right_trigger, double left_trigger) {
        if (right_trigger > 0) {
            motor.setPower(1);
            motor.setDirection(DcMotorSimple.Direction.REVERSE);
        } else if (left_trigger > 0) {
            motor.setPower(1);
            motor.setDirection(DcMotorSimple.Direction.FORWARD);
        }
        else {
            motor.setPower(0);
            motor.setDirection(DcMotorSimple.Direction.REVERSE);
        }
    }
}
