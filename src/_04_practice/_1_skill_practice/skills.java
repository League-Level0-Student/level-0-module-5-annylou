package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;
import java.util.Random;

public class skills {
	public static void main(String[] args) {

		skills skills = new skills();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		}

		void skill1() {
			
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
			String d = JOptionPane.showInputDialog("how many dimes do you have");
		// Tell them how many cents they have (hint multiply by 10)
			int dime = Integer.parseInt(d);
			dime*=10;
			JOptionPane.showMessageDialog(null, "you have " +dime +" cents");
		// Ask the user how tall they are (inches)
			String h = JOptionPane.showInputDialog("How tall are you in inches");
			// If they are shorter than 36 inches, tell them to eat their Wheaties
			int height = Integer.parseInt(h);
			if(height<=36) {
				JOptionPane.showMessageDialog(null, "eat your wheaties");
			}
			else {
				JOptionPane.showMessageDialog(null, "don't eat your wheaties");
			}
		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console
			for(int i=1; i<30; i+=3) {
				System.out.println(i);
			}
		}
		
		void skill3() { // Get a random number that is less than 20 and print it to the console
			System.out.println("");
			Random r = new Random();
			int a = r.nextInt(20);
			System.out.println(a);
		// Get another random number that is less than 10 and print it to the console
			int n = r.nextInt(10);
			System.out.println(n);
		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
			JOptionPane.showMessageDialog(null, a-n);
		}

		void skill4() { // In a pop-up, ask the user for the city they live in
			String city = JOptionPane.showInputDialog("what city do you live in");
		// If they answered "San Diego", tell them they live in America's Finest City
			if(city.equals("San Diego")) {
				JOptionPane.showMessageDialog(null, "you live in america's finest city");
			}
			else if(city.equals("san diego")) {
				JOptionPane.showMessageDialog(null, "you live in america's finest city");
			}
			else {
				JOptionPane.showMessageDialog(null, "move to san diego");
			}
		// Otherwise, tell them to move to San Diego
		
		// Create a variable - cars - and initialize it to the number of cars your family has. 
			int cars = 2;
		// If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
			
		// If there is 1 car, use a pop-up to display the make/model of the car

		// If there is more than 1 car, use a pop-up to display how many wheels the cars have between them.

		}

		void skill5() { // In a pop-up, ask the user for the name of their school
			String s = JOptionPane.showInputDialog("what school do you go to");
			int school = Integer.parseInt(s);
		// In another pop-up, tell the user, that their school is a fantastic school. 
			JOptionPane.showMessageDialog(null, school);
		// You must include the name of the school in the message.

		}
}
