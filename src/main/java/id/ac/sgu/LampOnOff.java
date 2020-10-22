package id.ac.sgu;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class LampOnOff extends JComponent{
		
	Color on = Color.yellow;
	Color off = Color.black;
	
	Color defaultColor = off;
	
	public void paintComponent(Graphics g) {
			
		g.setColor(Color.gray);
		g.fillRect(0, 0, 150, 250);
		
		g.setColor(defaultColor);
		g.fillOval(50, 30, 50, 50);
		
		//g.setColor(off);
		//g.fillOval(50, 30, 50, 50);
	}
	
	public void changeColor(boolean switchOn) {
		if(switchOn) {
			defaultColor = Color.yellow ;
		}
		else {
			defaultColor = Color.black;
		}
		
		repaint();
	}
}
