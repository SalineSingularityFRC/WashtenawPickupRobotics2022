package org.frcteam5066.mk3;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

public class ArmPneumatics{

	DoubleSolenoid leftDoubleSolenoid;
	DoubleSolenoid rightDoubleSolenoid;
	//left and right looking at the robot from the back 

    public ArmPneumatics(int leftArmForwardChannel, int leftArmreverseChannel, int rightArmForwardChannel, int rightArmreverseChannel){
        leftDoubleSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, leftArmForwardChannel, leftArmreverseChannel);
		leftDoubleSolenoid.set(DoubleSolenoid.Value.kReverse);

		rightDoubleSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, rightArmForwardChannel, rightArmreverseChannel);
		rightDoubleSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
	
	public void setLeftHigh() {
		leftDoubleSolenoid.set(DoubleSolenoid.Value.kForward);
	}
	
	public void setLeftLow() {
		leftDoubleSolenoid.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void setLeftOff() {
		leftDoubleSolenoid.set(DoubleSolenoid.Value.kOff);
	}

	public void setRightHigh() {
		rightDoubleSolenoid.set(DoubleSolenoid.Value.kForward);

	}
	
	public void setRightLow() {
		rightDoubleSolenoid.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void setRightOff() {
		rightDoubleSolenoid.set(DoubleSolenoid.Value.kOff);
	}

}