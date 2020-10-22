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
		shc.lampCtrl(true);
	}
	
	public void secondCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(true);
		shc.cameraCtrl(false);
		shc.tempCtrl(23);
		shc.voiceCtrl(false, false);
		shc.weightCtrl(0);
		shc.lampCtrl(false);//
	}
	
	public void thirdCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(true);
		shc.cameraCtrl(true);
		shc.tempCtrl(23);
		shc.voiceCtrl(false, false);
		shc.weightCtrl(0);
		shc.lampCtrl(false);
	}
	
	public void fourthCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(true);
		shc.cameraCtrl(true);
		shc.tempCtrl(31);
		shc.voiceCtrl(false, false);
		shc.weightCtrl(0);
		shc.lampCtrl(false);
	}
	
	public void fifthCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(true);
		shc.cameraCtrl(true);
		shc.tempCtrl(31);
		shc.voiceCtrl(true, false);
		shc.weightCtrl(0);
		shc.lampCtrl(true);
	}
	
	public void sixthCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(true);
		shc.cameraCtrl(true);
		shc.tempCtrl(31);
		shc.voiceCtrl(true, true);
		shc.weightCtrl(0);
		shc.lampCtrl(false);
	}
	
	public void seventhCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(true);
		shc.cameraCtrl(true);
		shc.tempCtrl(22);
		shc.voiceCtrl(true, true);
		shc.weightCtrl(4);
		shc.lampCtrl(true);
	}
	
	public void eigthCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(false);
		shc.cameraCtrl(true);
		shc.tempCtrl(31);
		shc.voiceCtrl(true, true);
		shc.weightCtrl(4);
		shc.lampCtrl(true);
	}
	
	public void ninthCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(false);
		shc.cameraCtrl(false);
		shc.tempCtrl(31);
		shc.voiceCtrl(true, true);
		shc.weightCtrl(4);
		shc.lampCtrl(true);
	}
	
	public void tenthCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(false);
		shc.cameraCtrl(false);
		shc.tempCtrl(23);
		shc.voiceCtrl(true, true);
		shc.weightCtrl(4);
		shc.lampCtrl(true);
	}
	
	public void eleventhCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(false);
		shc.cameraCtrl(false);
		shc.tempCtrl(23);
		shc.voiceCtrl(false, true);
		shc.weightCtrl(4);
		shc.lampCtrl(true);
	}
	
	public void twelfthCondition() {
		shc.AnemometerCtrl(true);
		shc.brightCtrl(false);
		shc.cameraCtrl(false);
		shc.tempCtrl(23);
		shc.voiceCtrl(false, true);
		shc.weightCtrl(0);
		shc.lampCtrl(true);
	}
}
