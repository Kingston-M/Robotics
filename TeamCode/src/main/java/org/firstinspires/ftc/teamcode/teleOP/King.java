package org.firstinspires.ftc.teamcode.teleOP;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.MecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.Extension;
import org.firstinspires.ftc.teamcode.subsystems.UPandDOWN;
import org.firstinspires.ftc.teamcode.subsystems.claw;
import org.firstinspires.ftc.teamcode.subsystems.rotate;

@TeleOp
public class King extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        MecanumDrive driver = new MecanumDrive(hardwareMap);
        claw claws = new claw(hardwareMap);
        UPandDOWN Up = new UPandDOWN(hardwareMap);
        rotate rrotate = new rotate(hardwareMap);
        Extension eextension = new Extension(hardwareMap);

        waitForStart();

        if (isStopRequested()) return;

        while (opModeIsActive()) {
            double y = -gamepad1.left_stick_y; // Remember, Y stick value is reversed
            double x = gamepad1.left_stick_x * 1.1; // Counteract imperfect strafing
            double rx = gamepad1.right_stick_x;
            driver.drive(x,y,rx);
            claws.claws(gamepad1.b, gamepad1.a);
            Up.ups(gamepad1.right_trigger, gamepad1.left_trigger);
            rrotate.rrotate(gamepad1.y, gamepad1.x);
            eextension.eextension(gamepad1.right_bumper, gamepad1.left_bumper);


        }
    }
}
