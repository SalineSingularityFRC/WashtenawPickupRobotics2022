package org.frcteam5066.mk3.subsystems.controllers.controlSchemes;

//import javax.swing.text.Position;

//import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;




public class Auton {

    SendableChooser<Integer> startingPositions = new SendableChooser<>();
    
    public Auton(){
        startingPositions.setDefaultOption("Left", 1); // from the POV of drivers station
        startingPositions.addOption("Right", 2);
    }
        


    
}