package de.commsult.SmartHomeProject.src;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class SmartHomeProjectMain {
	SmartHomeController shc = new SmartHomeController();
	
//	public void firstCondition() {
//		shc.AnemometerCtrl(false);
//		shc.brightCtrl(true);
//		shc.cameraCtrl(true);
//		shc.tempCtrl(40);
//		shc.voiceCtrl(true, false);
//		shc.weightCtrl(4);
//	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		LampOnOff panel = new LampOnOff();
		
		frame.add(panel);
		frame.setSize(250, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}