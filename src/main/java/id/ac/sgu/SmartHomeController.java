package id.ac.sgu;

class SmartHomeController {
	//buat nanti baca sensors and what action should each things would do
	TvControl tvCtrl = new TvControl();
	RadioControl radCtrl = new RadioControl(0);
	CurtainControl cCtrl = new CurtainControl();
	CameraControl camCtrl = new CameraControl();
	Sensors sensors = new Sensors();
	
	boolean bright = true;
	boolean voiceCommandTv = true;
	boolean voiceCommandRad = true;
	
	public void brightCtrl(boolean b) {
		if(bright == b) {
			sensors.setLightSensor(true);
			System.out.println("Package's Box Brightness = " + sensors.getLightSensor());
		} else {
			sensors.setLightSensor(false);
			System.out.println("Package's Box Brightness = " + sensors.getLightSensor());
		}
	}
	
	public void weightCtrl(double weight) {
		for(double y = 0; y <= weight; y++) { //do
			weight += 0.01;
			System.out.println("Phone notif: Weight detected in package receiver box. Incoming package..");
		}
		
//		System.out.println("Nothing in the Package received box");
	}
	
	public void tempCtrl(double temperature) {
		if(temperature > 27) {
			System.out.println("Phone notif: The temperature is hot, activating AC..");
			//ac.setOn
		} else if(temperature < 23 ) {
			System.out.println("Phone notif: The temperature is cold, turning off the AC to save energy..");
			//ac.setOff
		} else if(temperature == 23 ) {
			System.out.println("Phone notif: The temperature is normal, no need to turn on the AC to save energy..");
			//ac.setOff
		} else if(temperature == 24 ) {
			System.out.println("Phone notif: The temperature is normal, no need to turn on the AC to save energy..");
			//ac.setOff
		} else if(temperature == 25 ) {
			System.out.println("Phone notif: The temperature is normal, no need to turn on the AC to save energy..");
			//ac.setOff
		} else if(temperature == 26 ) {
			System.out.println("Phone notif: The temperature is normal, no need to turn on the AC to save energy..");
			//ac.setOff
		} else if(temperature == 27 ) {
			System.out.println("Phone notif: The temperature is normal, no need to turn on the AC to save energy..");
			//ac.setOff
		} else {
			
		}
	}
	
	public void voiceCtrl(boolean vcTv, boolean vcRad) {
		voiceCommandTv = vcTv;
		voiceCommandRad = vcRad;
		if(vcTv == true && vcRad == false) {
			tvCtrl.setTvPower(true);
			radCtrl.setRadPower(false);
			System.out.println("Phone notif: TV switched on.");
		} else if(vcTv == false && vcRad == true) {
			tvCtrl.setTvPower(false);
			radCtrl.setRadPower(true);
			System.out.println("Phone notif: Radio switched on.");
		} else if(vcTv == false && vcRad == false) {
			tvCtrl.setTvPower(false);
			radCtrl.setRadPower(false);
			System.out.println("Phone notif: TV and Radio switched off.");
		} else if(vcTv == true && vcRad == true) {
			tvCtrl.setTvPower(true);
			radCtrl.setRadPower(true);
			System.out.println("Phone notif: TV and Radio switched on.");
		} else {
			System.out.println("Phone notif: TV and Radio didn't change state.");
		}
	}
	
	public void cameraCtrl(boolean movement) {
		if(movement == true) {
			System.out.println("Phone notif: There is/are intruder(s) outside detected. Calling the police..");
		} else {
			System.out.println("Phone notif: Everything safe. No intruder(s) detected outside..");
		}
	}
	
	public void AnemometerCtrl(boolean anemometer) {
		if(anemometer == true) {
			cCtrl.setCover(true);
			System.out.println("Phone notif: Wind speed is faster than normal. Cover the curtain..");
		} else {
			cCtrl.setCover(false);
			System.out.println("Phone notif: Wind speed is normal. No need to cover the curtain for now..");
		}
	}
}