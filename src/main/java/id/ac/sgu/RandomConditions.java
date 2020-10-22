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
}
