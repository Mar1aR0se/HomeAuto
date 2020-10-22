package id.ac.sgu;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Lamp extends JPanel {
	
	LampOnOff light = new LampOnOff();
	
	public Lamp() {
		JButton changeButton = new JButton("POWER");
		light.setPreferredSize(new Dimension(160, 260));
		
		buttonListener l = new buttonListener();
		changeButton.addActionListener(l);
	
		
		add(light);
		add(changeButton);
	}
	
	class buttonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			light.changeColor();
			
		}
		
	}
}
