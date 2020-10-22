package id.ac.sgu;

public class RandomConditions {
	SmartHomeController shc = new SmartHomeController();
	
	public void firstCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(false);
		shc.cameraCtrl(false);
		shc.tempCtrl(23);
		shc.voiceCtrl(false, false);
		shc.weightCtrl(0);
	}
	
	public void secondCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(true);
		shc.cameraCtrl(false);
		shc.tempCtrl(23);
		shc.voiceCtrl(false, false);
		shc.weightCtrl(0);
	}
	
	public void thirdCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(true);
		shc.cameraCtrl(true);
		shc.tempCtrl(23);
		shc.voiceCtrl(false, false);
		shc.weightCtrl(0);
	}
	
	public void fourthCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(true);
		shc.cameraCtrl(true);
		shc.tempCtrl(31);
		shc.voiceCtrl(false, false);
		shc.weightCtrl(0);
	}
	
	public void fifthCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(true);
		shc.cameraCtrl(true);
		shc.tempCtrl(31);
		shc.voiceCtrl(true, false);
		shc.weightCtrl(0);
	}
	
	public void sixthCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(true);
		shc.cameraCtrl(true);
		shc.tempCtrl(31);
		shc.voiceCtrl(true, true);
		shc.weightCtrl(0);
	}
	
	public void seventhCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(true);
		shc.cameraCtrl(true);
		shc.tempCtrl(31);
		shc.voiceCtrl(true, true);
		shc.weightCtrl(4);
	}
	
	public void eigthCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(false);
		shc.cameraCtrl(true);
		shc.tempCtrl(31);
		shc.voiceCtrl(true, true);
		shc.weightCtrl(4);
	}
}
