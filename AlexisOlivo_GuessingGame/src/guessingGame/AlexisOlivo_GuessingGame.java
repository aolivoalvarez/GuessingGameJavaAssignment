package guessingGame;
/*Alexis Olivo-Alvarez

	ITSE-2317 2801

	September 19th 2021

	Random Number Guessing Game */

import java.util.Scanner;
	
	public class GuessingGame{
		
		public static void main(String[]args) {
			//Initialization
			Scanner input = new Scanner(System.in); //to receive user input
			
			int min = 1; //minimum random number
			int max = 100; //maximum random number
			
			int guess = 0; // user guess
			int answer = (int)Math.floor(Math.random()*(max-min+1)+min); //random number generator
			
			System.out.printf("%s%n", "Welcome to the guessing game!"); //game welcome
			
			do { // loop to get guess + compare it to answer
			
			//getting user guess
			System.out.println("\n");
				
			System.out.print("Please enter your guess: ");
			guess = input.nextInt();
			
			//decision statement to determine how guess relates to answer
			if (guess > answer) { //too high
				System.out.printf("%s%n", "Oops, too high! Try again.");
			}
			else if (guess < answer) { //too low
				System.out.printf("%s%n", "Nope, too low! Try again.");
			}
			
			else if (guess != answer){ //any entry that isnt too high or low and also doesnt = answer
				System.out.printf("%s%n", "Invalid entry, please re-enter.");
			}
			
			
		} while (guess != answer);
			
		//congratulatory message
		System.out.printf("%s%n", "Congratulations! You guessed right!");
		
		}
	}

