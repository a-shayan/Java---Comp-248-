
//Import Scanner utility
import java.util.Scanner;

public class A3_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Activite Scanner
		Scanner myKey = new Scanner (System.in);
		
		//Declare variables
		int userInput = 0;
		boolean validInput = false;
		char [][] squares;
		int row=0, col=0;
		
		//Header and introduction to program
		System.out.println("|-----****-----****-----****-----****-----****-----****-----|");
		System.out.println("|      Welcome to the Decorated Square Drawing Program!     |");
		System.out.println("|-----****-----****-----****-----****-----****-----****-----|");
		System.out.println();
		
		//Provide options for user to chose 
		System.out.println("What Type of Square would you like?");
		System.out.println("\t 1 - Full square");
		System.out.println("\t 2 - Hollow square");
		System.out.println("\t 3 - An X");
		System.out.println("\t 4 - Horizontal Bars");
		System.out.println("\t 5 - Vertical Bars");
		System.out.println("\t 6 - Diagonal Bars");
		System.out.println("\t 7 - Integer Filled Square");
		System.out.println("\t 8 - Checkered (must be a multiple of 4)");
		System.out.println("\t 9 - Quit");
		System.out.println("Enter your choice (1 to 9)");
		
		//Validate user input, loop until user provides a valid input
		do {
			userInput = myKey.nextInt();
			if (userInput <1 || userInput > 9)
				System.out.println("Sorry! that is an illegal choice.");
			else 
				validInput = true;
			
		} while (validInput == false);
		
		validInput = false;
		
		System.out.println();
		
		//Switch statement to identify what program to execute
		do {
		switch (userInput) {
		case 1:
			
			break;
			
		case 2:
			
			break;
		
		case 3:
			
			break;
		
		case 4:
			
			break;
		
		case 5:
			
			break;
			
		case 6:
			
			break;
			
		case 7:
			
			break;
			
		case 8:
			
			break;
			
		case 9:
			System.exit(0);
		}
		
		if (row )
		
		
		} while (validInput == false);
		
		//initialize 2d array
		squares = new char[row][col];
		
		
		
		
	}

}
