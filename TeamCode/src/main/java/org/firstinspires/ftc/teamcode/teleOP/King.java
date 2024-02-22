package org.firstinspires.ftc.teamcode.teleOP;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;



import org.firstinspires.ftc.teamcode.subsystems.Extension;
import org.firstinspires.ftc.teamcode.subsystems.UPandDOWN;
import org.firstinspires.ftc.teamcode.subsystems.claw;
import org.firstinspires.ftc.teamcode.subsystems.plane;
import org.firstinspires.ftc.teamcode.subsystems.rotate;

@TeleOp
public class King extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        //Drive runOpMode = new Drive(hardwareMap);
        claw claws = new claw(hardwareMap);
        UPandDOWN Up = new UPandDOWN(hardwareMap);
        rotate rrotate = new rotate(hardwareMap);
        Extension eextension = new Extension(hardwareMap);
        plane planes = new plane(hardwareMap);

        waitForStart();

        if (isStopRequested()) return;

        while (opModeIsActive()) {

            claws.claws(gamepad1.b, gamepad1.a);
            Up.ups(gamepad1.right_trigger, gamepad1.left_trigger);
            rrotate.rrotate(gamepad1.y, gamepad1.x);
            eextension.eextension(gamepad1.right_bumper, gamepad1.left_bumper);
            planes.planes(gamepad1.dpad_up);


        }
    }
}
