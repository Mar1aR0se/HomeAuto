package id.ac.sgu;

import javax.swing.*;

public class SmartHomeProjectMain {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		LampOnOff panel = new LampOnOff();
		
		frame.add(panel);
		frame.setSize(250, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}