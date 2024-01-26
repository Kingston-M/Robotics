package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
public class Extension {

    DcMotor mottor;

    public Extension(HardwareMap hardwareMap) {
        mottor = hardwareMap.get(DcMotor.class, "mottor");
    }

    public void eextension(boolean right_bumper, boolean left_bumper) {

        if (right_bumper) {
            mottor.setPower(1);
            mottor.setDirection(DcMotorSimple.Direction.REVERSE);
        } else {
            mottor.setPower(0);
            mottor.setDirection(DcMotorSimple.Direction.REVERSE);
        }
        if (left_bumper) {
            mottor.setPower(1);
            mottor.setDirection(DcMotorSimple.Direction.REVERSE);
        } else {
            mottor.setPower(0);
            mottor.setDirection(DcMotorSimple.Direction.REVERSE);
        }
    }
}
