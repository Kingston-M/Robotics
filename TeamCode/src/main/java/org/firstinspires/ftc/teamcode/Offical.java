package org.firstinspires.ftc.teamcode;



import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;



@TeleOp
public class Offical extends OpMode {
    //    public CRServo servo;
    public Servo servo2;
    public Servo servo3;
    public Servo servo4;
    DcMotor motor;
    DcMotor mottor;
    DcMotor frontLeftMotor = hardwareMap.dcMotor.get("frontLeftMotor");
    DcMotor backLeftMotor = hardwareMap.dcMotor.get("backLeftMotor");
    DcMotor frontRightMotor = hardwareMap.dcMotor.get("frontRightMotor");
    DcMotor backRightMotor = hardwareMap.dcMotor.get("backRightMotor");




        @Override
        public void init() {
            servo2 = hardwareMap.get(Servo.class, "servo");
            servo3 = hardwareMap.get(Servo.class, "servotwo");
            servo4 = hardwareMap.get(Servo.class, "servotree");
            motor = hardwareMap.get(DcMotor.class, "motor");
            mottor = hardwareMap.get(DcMotor.class, "mottor");
            frontLeftMotor = hardwareMap.dcMotor.get("frontLeftMotor");
            backLeftMotor = hardwareMap.dcMotor.get("backLeftMotor");
            frontRightMotor = hardwareMap.dcMotor.get("frontRightMotor");
            backRightMotor = hardwareMap.dcMotor.get("backRightMotor");
            telemetry.addData("Hardware: ", "Initialized");


        }

        @Override
        public void loop() {


            if (gamepad1.a) {
                ;
                servo2.setPosition(3);
                servo3.setPosition(3);
            }
            if (gamepad1.b) {
                servo2.setPosition(-3);
                servo3.setPosition(-3);
            }
            if (gamepad1.y) {
                ;
                servo4.setPosition(3);
            }
            if (gamepad1.x) {
                servo4.setPosition(-3);
//            servo.setPower(-1);
            }
            if (gamepad1.right_trigger > 0) {
                motor.setPower(1);
                motor.setDirection(DcMotorSimple.Direction.REVERSE);
            } else if (gamepad1.left_trigger > 0) {
                motor.setPower(1);
                motor.setDirection(DcMotorSimple.Direction.FORWARD);
            }
            if (gamepad1.right_bumper) {
                mottor.setPower(1);
                mottor.setDirection(DcMotorSimple.Direction.REVERSE);
            } else {
                mottor.setPower(0);
                mottor.setDirection(DcMotorSimple.Direction.REVERSE);
            }
            if (gamepad1.left_bumper) {
                mottor.setPower(1);
                mottor.setDirection(DcMotorSimple.Direction.REVERSE);
            } else {
                mottor.setPower(0);
                mottor.setDirection(DcMotorSimple.Direction.REVERSE);
            }
            motor.setPower(0);
        }
    }

