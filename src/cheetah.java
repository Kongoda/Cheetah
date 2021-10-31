/*
 * Read Integers and Doubles from Keyboard with Scanner.
 * The creator of java have created a powerful class called the scanner class this line "import java.until.scanner" 
 * imports the scanner class into our file so we can use it.
 * 
 */
import java.util.Scanner;                                	//Add this line when using scanner
															//importing a scanner class

public class cheetah {

	public static void main(String[] args) {
		
		Scanner keyboardInput = new Scanner(System.in);  	//Declaring and Creating a new scanner class
		
		int test;											//create an integer variable called test
		
		System.out.println("Enter any integer: ");			//create a print out
		test = keyboardInput.nextInt();					   //variable test is assigned to store next available integer from the keyboard
		
		System.out.println("You entered the number: " + test);
	
		
	}

}
