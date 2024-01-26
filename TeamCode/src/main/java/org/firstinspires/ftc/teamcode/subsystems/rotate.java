package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class rotate {
    public Servo servo4;

    public rotate(HardwareMap hardwareMap) {
        servo4 = hardwareMap.get(Servo.class, "servotree");
    }

    public void rrotate(boolean open, boolean close) {
        if (open) {

            servo4.setPosition(3);
        }
        if (close) {
            servo4.setPosition(-3);
//            servo.setPower(-1);
        }
    }
}