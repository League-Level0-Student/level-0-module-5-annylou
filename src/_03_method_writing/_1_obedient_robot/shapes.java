package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;
import javax.swing.JOptionPane;

public class shapes {

	public static void main(String[] args) {
		
		Robot q = new Robot();
		
		int shape = JOptionPane.showOptionDialog(null, "what shape do you want", " ", 0,
		JOptionPane.INFORMATION_MESSAGE, null, new String[] { "square", "triangle", "circle"}, null);
		
		int color =JOptionPane.showOptionDialog(null, "what color do you want", " ", 0,
		JOptionPane.INFORMATION_MESSAGE, null, new String[] { "red", "blue", "yellow", "green"}, null);
		
		if(shape==0) {
			drawSquare();
		}
		if(shape==1) {
			drawTriangle();
		}
		if(shape==2) {
			drawCircle();
		}
		if(color==0) {
			q.setPenColor(215, 129, 21);
		}
		if(color==1) {
			
		}
		if(color==2) {
	
		}
		if(color==3) {
	
		}
	} 
	
	static Robot q = new Robot();
	
	static void drawSquare() {
		q.penDown();
		q.setSpeed(10);
		for(int i = 0; i<4; i++ ) {
			q.move(75);
			q.turn(90);
		}
	}
	
	static void drawTriangle() {
		q.penDown();
		q.setSpeed(10);
		for(int i = 0; i<3; i++ ) {
			q.move(75);
			q.turn(120);
		}
	}
	
	static void drawCircle() {
		q.penDown();
		q.setSpeed(50);
		for(int i = 0; i<360; i++ ) {
			q.move(1);
			q.turn(1);
		}
	}
	
	
}
