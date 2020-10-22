package de.commsult.SmartHomeProject.src.de.commsult.SmartHomeProject.src;

import java.util.*;

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
			System.out.println("brightness = " + sensors.getLightSensor());
		} else {
			sensors.setLightSensor(false);
			System.out.println("brightness = " + sensors.getLightSensor());
		}
	}
	
	public void weightCtrl(double weight) {
		for(double y = 0; y <= weight; y++) { //do
			weight += 0.01;
			System.out.println("Weight detected");
		}
		
//		System.out.println("Nothing in the Package received box");
	}
	
	public void tempCtrl(double temperature) {
		if(temperature >= 23) {
			System.out.println("Phone notif: The temperature is hot, activating AC..");
			//ac.setOn
		} else if(temperature < 23 ) {
			System.out.println("Phone notif: The temperature is cold, turning off the AC to save energy..");
			//ac.setOff
		}
	}
	
	public void voiceCtrl(boolean vcTv, boolean vcRad) {
		voiceCommandTv = vcTv;
		voiceCommandRad = vcRad;
		if(vcTv == true && vcRad == false) {
			tvCtrl.setTvPower(true);
			radCtrl.setRadPower(false);
			System.out.println("TV switched on.");
		} else if(vcTv == false && vcRad == true) {
			tvCtrl.setTvPower(false);
			radCtrl.setRadPower(true);
			System.out.println("Radio switched on.");
		}
	}
	
	public void cameraCtrl(boolean movement) {
		if(movement == true) {
			System.out.println("Phone notif: There is intruders outside detected. Calling the police..");
		} else {
			System.out.println("Phone notif: everything safe");
		}
	}
}