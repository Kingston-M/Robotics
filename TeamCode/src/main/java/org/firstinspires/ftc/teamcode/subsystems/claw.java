package org.firstinspires.ftc.teamcode.subsystems;




import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;




public class claw {
    public Servo servo2;
    public Servo servo3;

    public claw(HardwareMap hardwareMap) {
        servo2 = hardwareMap.get(Servo.class, "servo");
        servo3 = hardwareMap.get(Servo.class, "servotwo");
    }

    public void claws(boolean open, boolean close) {

        if (open) {

            servo2.setPosition(3);
            servo3.setPosition(3);
        }
        if (close) {
            servo2.setPosition(-3);
            servo3.setPosition(-3);
        }
    }

}