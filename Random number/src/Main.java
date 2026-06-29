import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);
        int firstSelection;
        int tries = 0;
        int guess;
        int playAgain = 1;

        while(playAgain == 1) {

            int randomint = rand.nextInt(101);

            System.out.println("Welcome to the Number Guessing Game!\n" +
                    "I'm thinking of a number between 1 and 100.");

            System.out.println("Please select the difficulty level:\n" +
                    "1. Easy (10 chances)\n" +
                    "2. Medium (5 chances)\n" +
                    "3. Hard (3 chances));");

            System.out.println("Please enter your difficulty level:(1, 2, 3)");
            firstSelection = scnr.nextInt();

            if (firstSelection == 1) {
                tries = 10;
            } else if (firstSelection == 2) {
                tries = 5;
            } else if (firstSelection == 3) {
                tries = 3;
            }

            while (tries > 0) {
                System.out.println("Please enter a guess between 1 and 100: ");
                guess = scnr.nextInt();

                if (guess == randomint) {
                    System.out.println("You guessed it right!");
                    break;
                } else if (guess > randomint) {
                    System.out.println("Try again. The number is lower than that!");
                    tries--;
                } else if (guess < randomint) {
                    System.out.println("Try again. The number is higher than that!");
                    tries--;
                }
            }
            if (tries == 0) {
                System.out.println("Sorry you got it wrong. the number was " + randomint + ". Good luck in the next game!");
            }
            System.out.println("Would you like to play again?");
            System.out.println("1. Yes \n2. No");
            playAgain = scnr.nextInt();
        }
        System.out.println("Thank you for playing!");
    }
}
