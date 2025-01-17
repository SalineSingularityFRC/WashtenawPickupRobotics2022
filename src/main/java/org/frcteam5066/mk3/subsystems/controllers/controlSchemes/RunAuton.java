package org.frcteam5066.mk3.subsystems.controllers.controlSchemes;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.frcteam5066.mk3.LimeLight;
import org.frcteam5066.mk3.subsystems.ColorSensor;
import org.frcteam5066.mk3.subsystems.DrivetrainSubsystem;
import org.frcteam5066.mk3.subsystems.Intake;
import org.frcteam5066.mk3.subsystems.Shooter;

import org.frcteam5066.mk3.ArmPneumatics;



public class RunAuton extends AutonControlScheme{
    
    SendableChooser<Boolean> doDrive = new SendableChooser<>();
    SendableChooser<Boolean> doShoot = new SendableChooser<>();
    SendableChooser<Boolean> doDriveReverse = new SendableChooser<>();
    SendableChooser<Boolean> doSearch = new SendableChooser<>();
    SendableChooser<Boolean> doShoot2 = new SendableChooser<>();
    SendableChooser<Boolean> testD = new SendableChooser<>();
    SendableChooser<Boolean> doFixedAuton = new SendableChooser<>();
    SendableChooser<Boolean> doMainModularAuton = new SendableChooser<>();

    

    



    public RunAuton(ArmPneumatics armPneumatics, LimeLight limeLight, DrivetrainSubsystem drive, String color){

        super(armPneumatics, limeLight, drive, color);

        // doDrive.setDefaultOption("Do Drive", true);
        // doDrive.addOption("Dont Drive", false);

        // doShoot.setDefaultOption("Do Shoot", true);
        // doShoot.addOption("Don't Shoot", false);

        // doDriveReverse.setDefaultOption("Do Reverse Drive", true);
        // doDriveReverse.addOption("Don't Reverse Drive", true);

        // doSearch.setDefaultOption("DO Search ", true);
        // doSearch.addOption("Don't Search", false);

        // doShoot2.setDefaultOption("DoShoot 2", true);
        // doShoot2.addOption("Don't Shoot 2", false);

        // testD.setDefaultOption("TestD", true);
        // testD.addOption("Don't TestD", false);

        // doFixedAuton.setDefaultOption("Do Fixed Auton", true);
        // doFixedAuton.addOption("Don't do Fixed Auton", false);

        // doMainModularAuton.setDefaultOption("Do Main Modular Auton", true);
        // doMainModularAuton.addOption("Don't do Main Modular Auton", false);

        // SmartDashboard.putData(doDrive);
        // SmartDashboard.putData(doShoot);
        // SmartDashboard.putData(doDriveReverse);
        // SmartDashboard.putData(doSearch);
        // SmartDashboard.putData(doShoot2);
        // SmartDashboard.putData(testD);
        // SmartDashboard.putData(doFixedAuton);
        // SmartDashboard.putData(doMainModularAuton);

    }

    public void actuallyRunAutonTheMethod(){
        
        super.driveDistance(100);
        super.driveReverseDistance(100);
        super.setLeftPneumaticsForward();
        super.setLeftPneumaticsOff();
        super.setLeftPneumaticsBackward();
        super.setRightPneumaticsForward();
        super.setRightPneumaticsOff();
        super.setRightPneumaticsBackward();
        
        // if( /*testD.getSelected()*/false  ) super.testD();

        
        // else if ( /*doFixedAuton.getSelected()*/false ){
            
        //     if( !drive1Done() ) super.driveAndSpin(1.204, 0.0, 0.0, 1);
        //     if( !aim1Done() ) super.fixedAim(-1);
        //     if( !shoot1Done() ) super.fixedShoot();
        //     if( !drive2Done() ) super.driveAndSpin(3.004, 122.275644, 67.0187843, 1);//needs deltaAngle
        //     if( !aim2Done() ) super.fixedAim(-1);
        //     if( !shoot2Done() ) super.fixedShoot();
        //     if( !drive3Done() ) super.driveAndSpin(4.068, 79.568889, 155.2916093, 1);//needs deltaAngle
        //     if( !drive4Done() ) super.driveAndSpin(4.068, 259.568889, 180, -1);
        //     if( !aim3Done() ) super.fixedAim(1);
        //     if( !shoot3Done() ) super.fixedShoot();

        // }

        // // **IMPORTANT** Somewhere else in the code, intake and conveyer are being set to Off while auton is running


        // else if ( /*doMainModularAuton.getSelected()*/false ){
        //     if( /*doDrive.getSelected()*/ true && !driveDone() ) super.drive();
        //     if( /*doShoot.getSelected()*/ true && !aimDone() && driveDone() ) super.aim();
        //     if( /*doShoot.getSelected()*/ false && !shootDone() && aimDone() ) super.shoot();
        //     if( /*doShoot.getSelected()*/false && !getBallDone() && shootDone() ) super.getBall();
        //     if( false && doShoot2.getSelected() ){       
        //         super.resetAimDone();
        //         super.resetShootDone();
        //     }
        // }

        // else if(false){
        //     if(!driveReverseDone() ) super.driveReverse();
        //     if(!shootDone() && driveReverseDone() ) super.shoot();
        // }

        // else{
        //     SmartDashboard.putNumber("Driving Done Here", driveDone()? 1:0);
        //     /*if (time < 1) {
        //         super.autonBarf();
        //     }*/
        //     if(!autonBarfDone() ) super.autonBarf();
        //     if(!driveReverseDone() && autonBarfDone() ) super.driveReverse();

        // }

    }

}