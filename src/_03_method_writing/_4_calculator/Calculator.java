package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		// 3) Call the correct method depending on what option the user chooses
		if(task==0) {
			divide();
		}
		if(task==1) {
			multiply();
		}
		if(task==2) {
			subtract();
		}
		if(task==3) {
			add();
		}
		// 4) Call the result() method and put the answer in a pop-up
		result();
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	static String input1 = JOptionPane.showInputDialog("Enter a number");
	static String input2 = JOptionPane.showInputDialog("Enter another number");
	static double number1 = Double.parseDouble(input1);
	static double number2 = Double.parseDouble(input2);
	static double answer;
	
	 static void add() {
		answer = number1+=number2;
	 }
	 static void subtract() { 
		answer = number1-=number2;
	 }
	 static void multiply() {
		answer = number1*=number2;
	 }
	 static void divide() {
		answer = number1/=number2;
	 }
	
	// 2) Make a static method called "result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;
	 static void result() {
		 JOptionPane.showMessageDialog(null, "the answer is " +answer);
	 }
	
}
