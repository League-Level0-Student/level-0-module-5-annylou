package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable

		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
		// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
		//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
		//    Make sure to customize the title and question too.
		while(points<20) {
		int task = JOptionPane.showOptionDialog(null, "make it happy", " ", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "play with it", "give it food", "hug it / pet it" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
		if(task==0) {
			play();
		}
		if(task==1) {
			feed();
		}
		if(task==2) {
			hug();
		}
		if(points>=20) {
			JOptionPane.showMessageDialog(null, "your pet is happy");
			}
		}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static int pet = JOptionPane.showOptionDialog(null, "what pet", " ", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "cat", "dog"}, null);
	static int points=0;
	
	
	static void play() {
		if(pet==0) {
			JOptionPane.showMessageDialog(null, "it's really happy");
			points+=7;
		}
		if(pet==1) {
			JOptionPane.showMessageDialog(null, "it's excited");
			points+=10;
		}
	}
	
	
	static void feed() {
		if(pet==0) {
			JOptionPane.showMessageDialog(null, "it's sleepy");
			points+=3;
		}
		if(pet==1) {
			JOptionPane.showMessageDialog(null, "it's hungry");
			points+=7;
		}
	}
	
	
	static void hug() {
		if(pet==0) {
			JOptionPane.showMessageDialog(null, "it's super relaxed");
			points+=10;
		}
		if(pet==1) {
			JOptionPane.showMessageDialog(null, "it wants to play");
			points+=3;
		}
	}
	
	
}
