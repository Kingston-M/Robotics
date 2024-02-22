package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class plane {
    public Servo servo5;

    public plane(HardwareMap hardwareMap) {
        servo5 = hardwareMap.get(Servo.class, "servofive");
    }

    public void planes(boolean open) {
        if (open) {

            servo5.setPosition(3);
        }

    }
}
