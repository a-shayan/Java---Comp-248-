
//Import Scanner utility
import java.util.Scanner;

public class A3_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Activite Scanner
		Scanner myKey = new Scanner (System.in);
		
		//Declare variables
		int userInput = 0;
		int numRows = 0;
		boolean validInput = false;
		char [][] squares;
		int row=0, col=0;
		String inputX, inputY;
		
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
		System.out.print("Enter your choice (1 to 9) ");
		
		//Validate user input, loop until user provides a valid input
		do {
			userInput = myKey.nextInt();
			if (userInput <1 || userInput > 9)
				System.out.println("Sorry! that is an illegal choice.");
			else 
				validInput = true;
			
		} while (validInput == false);
		
		validInput = false;
		
		do {
			System.out.print("How many rows and columns (min 4 & max 20)? ");
			row = myKey.nextInt();
			if (row >=4 && row <=20 ) {
				validInput = true;
				col = row;
			}
			
		} while (validInput == false);
		
		validInput = false;
		
		System.out.println();
		
		//Switch statement to identify what program to execute
		do {
		switch (userInput) {
		case 1:

			System.out.println("Which character do you want to fill your square with? ");
			inputX = myKey.nextLine();
			break;
			
		case 2:

			System.out.println("Which character do you want to fill your square with? ");
			inputX = myKey.nextLine();
			break;
		
		case 3:

			System.out.println("Which character do you want for the X? ");
			inputX = myKey.nextLine();
			System.out.println("Which character do you want around the X? ");
			inputY = myKey.nextLine();
			break;
		
		case 4:

			System.out.println("Which character do you want for the even rows? ");
			inputX = myKey.nextLine();
			System.out.println("Which character do you want for the odd rows? ");
			inputY = myKey.nextLine();
			break;
		
		case 5:

			System.out.println("Which character do you want for the even columns? ");
			inputX = myKey.nextLine();
			System.out.println("Which character do you want for the odd columns? ");
			inputY = myKey.nextLine();
			break;
			
		case 6:

			System.out.println("Which character do you want for the even diagonals? ");
			inputX = myKey.nextLine();
			System.out.println("Which character do you want for the odd diagonals? ");
			inputY = myKey.nextLine();
			break;
			
		case 7:
	
			System.out.println("What is the starting number for your integer filled square (between 0 and 50 inclusive): ");
			inputX = myKey.nextLine();
			break;
			
		case 8:

			System.out.println("Which character do you want for the 1st checker? ");
			inputX = myKey.nextLine();
			System.out.println("Which character do you want for the 2nd checker? ");
			inputY = myKey.nextLine();
			break;
			
		case 9:
			System.exit(0);
		}
		
		
		
		
		} while (validInput == false);
		
		//initialize 2d array
		squares = new char[row][col];
		
		
		
		
	}

}
