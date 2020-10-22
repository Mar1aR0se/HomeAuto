package id.ac.sgu;

import javax.swing.*;
import java.util.*;

public class SmartHomeProjectMain {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		LampOnOff panel = new LampOnOff();
		
		frame.add(panel);
		frame.setSize(250, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		RandomConditions rc = new RandomConditions();
		int input;
		
		System.out.println("==================================================\n");
		System.out.println("=============== Smart Home Project ===============\n");
		System.out.println("==================================================\n");
		System.out.println("Select one menu: \n");
		System.out.println("1. 1st Condition.\n");
		System.out.println("2. 2nd Condition.\n");
		System.out.println("3. 3rd Condition.\n");
		System.out.println("4. 4th Condition.\n");
		System.out.println("5. 5th Condition.\n");
		System.out.println("6. 6th Condition.\n");
		System.out.println("7. 7th Condition.\n");
		System.out.println("8. 8th Condition.\n");
		System.out.println("9. 9th Condition.\n");
		System.out.println("10. 10th Condition.\n");
		System.out.println("11. 11th Condition.\n");
		System.out.println("12. 12th Condition.\n");
		System.out.println("==================================================\n");
		System.out.println("Your choice (1-12): ");
		Scanner choice = new Scanner(System.in);
		input = choice.nextInt();
		
		switch(input) {
			case 1:
				rc.firstCondition();
				break;
			case 2:
				rc.secondCondition();
				break;
			case 3:
				rc.thirdCondition();
				break;
			case 4:
				rc.fourthCondition();
				break;
			case 5:
				rc.fifthCondition();
				break;
			case 6:
				rc.sixthCondition();
				break;
			case 7:
				rc.seventhCondition();
				break;
			case 8:
				rc.eigthCondition();
				break;
			case 9:
				rc.ninthCondition();
				break;
			case 10:
				rc.tenthCondition();
				break;
			case 11:
				rc.eleventhCondition();
				break;
			case 12:
				rc.twelfthCondition();
				break;
			default:
				System.out.println("Choose from 1 to 12 ONLY!!!\n");
		}
		
	}
	
}