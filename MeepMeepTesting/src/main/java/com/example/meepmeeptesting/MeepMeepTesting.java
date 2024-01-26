package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeBlueDark;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeBlueLight;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeRedDark;

import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeRedLight;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);

        // Declare our first bot
        RoadRunnerBotEntity myFirstBot = new DefaultBotBuilder(meepMeep)
                // We set this bot to be blue
                .setColorScheme(new ColorSchemeBlueLight())
                .setConstraints(60, 70, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(12, 58, Math.toRadians(-90)))
                                .forward(22)
                                .turn(Math.toRadians(90))
                                .strafeRight(24)
                                .forward(45)
                                .build()
                );
        RoadRunnerBotEntity mySecondBot = new DefaultBotBuilder(meepMeep)
                // We set this bot to be blue
                .setColorScheme(new ColorSchemeBlueDark())
                .setConstraints(60, 70, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(12, 58, Math.toRadians(-90)))

                                .turn(Math.toRadians(-90))

                                .build()
                );
        RoadRunnerBotEntity myThirdBot = new DefaultBotBuilder(meepMeep)
                // We set this bot to be blue
                .setColorScheme(new ColorSchemeBlueDark())
                .setConstraints(60, 70, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(12, 58, Math.toRadians(-90)))
                                .forward(22)
                                .strafeLeft(30)
                                .back(24)
                                .strafeLeft(15)
                                .build()
                );
        RoadRunnerBotEntity myForthBot = new DefaultBotBuilder(meepMeep)
                // We set this bot to be blue
                .setColorScheme(new ColorSchemeRedLight())
                .setConstraints(60, 70, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(12, -58, Math.toRadians(90)))
                                .forward(23)
                                .turn(Math.toRadians(-90))
                                .strafeLeft(24)
                                .forward(45)
                                .build()
                );
        RoadRunnerBotEntity myFithBot = new DefaultBotBuilder(meepMeep)
                // We set this bot to be blue
                .setColorScheme(new ColorSchemeRedLight())
                .setConstraints(60, 70, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(12, -58, Math.toRadians(90)))
                                .forward(23)
                                .turn(Math.toRadians(90))
                                .strafeRight(24)
                                .back(45)
                                .build()
                );

        RoadRunnerBotEntity mysixBot = new DefaultBotBuilder(meepMeep)
                // We set this bot to be blue
                .setColorScheme(new ColorSchemeRedLight())
                .setConstraints(60, 70, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(12, -58, Math.toRadians(90)))
                                .forward(23)
                                .back(23)
                                .strafeRight(45)
                                .build()
                );
        RoadRunnerBotEntity myseventhBot = new DefaultBotBuilder(meepMeep)
                // We set this bot to be blue
                .setColorScheme(new ColorSchemeRedLight())
                .setConstraints(60, 70, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-36, -58, Math.toRadians(90)))
                                .forward(23)
                                .back(23)
                                .strafeRight(90)
                                .build()
                );
        RoadRunnerBotEntity myeightBot = new DefaultBotBuilder(meepMeep)
                // We set this bot to be blue
                .setColorScheme(new ColorSchemeRedLight())
                .setConstraints(60, 70, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-36, -58, Math.toRadians(90)))
                                .forward(23)
                                .turn(Math.toRadians(90))
                                .strafeRight(24)
                                .back(90)
                                .build()
                );
        RoadRunnerBotEntity mynineBot = new DefaultBotBuilder(meepMeep)
                // We set this bot to be blue
                .setColorScheme(new ColorSchemeRedLight())
                .setConstraints(60, 70, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-36, -58, Math.toRadians(90)))
                                .forward(23)
                                .turn(Math.toRadians(-90))
                                .strafeLeft(24)
                                .forward(90)
                                .build()
                );
        RoadRunnerBotEntity mytenthBot = new DefaultBotBuilder(meepMeep)
                // We set this bot to be blue
                .setColorScheme(new ColorSchemeRedLight())
                .setConstraints(60, 70, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-36, -58, Math.toRadians(90)))
                                .forward(23)
                                .turn(Math.toRadians(-90))
                                .strafeLeft(24)
                                .forward(90)
                                .build()
                );

        meepMeep.setBackground(MeepMeep.Background.FIELD_CENTERSTAGE_OFFICIAL)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)

                // Add both of our declared bot entities
                .addEntity(myFirstBot)
                .addEntity(mySecondBot)
                .addEntity(myThirdBot)
                .addEntity(myForthBot)
                .addEntity(myFithBot)
                .addEntity(mysixBot)
                .addEntity(myseventhBot)
                .addEntity(myeightBot)
                .addEntity(mynineBot)
                .addEntity(mytenthBot)
                .start();
    }
}