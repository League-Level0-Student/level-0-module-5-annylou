package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		
		//2. Set the speed to 100
		j.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "color", "", JOptionPane.INFORMATION_MESSAGE, 
		JOptionPane.DEFAULT_OPTION, null, new String[]{"red","black","grey"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice==0) {
			j.setPenColor(215,77,67);
		}
		if(colorChoice==1) {
			j.setPenColor(0,0,0);
		}
		if(colorChoice==2) {
			j.setPenColor(127,127,127);
		}
		//4. Ask the use how many polygons they want to be drawn.
		int shapes=JOptionPane.showOptionDialog(null, "amount of shapes", "",
		JOptionPane.INFORMATION_MESSAGE,JOptionPane.DEFAULT_OPTION, null, new String[]{"3","4","1"}, 0);
		//5. Use the robot to draw the number of polygons the user requested.
		if(shapes==0) {
			shapes();
			j.penUp();
			j.turn(90);
			j.move(100);
			shapes();
			j.penUp();
			j.turn(90);
			j.move(100);
			shapes();
		}
		if(shapes==1) {
			shapes();
			j.penUp();
			j.turn(90);
			j.move(100);
			shapes();
			j.penUp();
			j.turn(90);
			j.move(100);
			shapes();
			j.penUp();
			j.turn(90);
			j.move(100);
			shapes();
		}
		if(shapes==2) {
			shapes();
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
	
	static Robot j = new Robot();
	static void shapes() {
		for(int i=0; i<4; i++) {
			j.penDown();
			j.move(50);
			j.turn(90);
		}
	}
}

