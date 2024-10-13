import java.util.Random;
import java.util.Scanner;
public class numbergame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess;
        int numAttempts;
        int roundScore;
        boolean playAgain;

        do {
            roundScore = 0;
            numAttempts = 0;
            numberToGuess = random.nextInt(100) + 1;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 100.");

            do {
                numAttempts++;
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You've guessed the number in " + numAttempts + " attempts.");
                    roundScore++;
                }
            } while (numAttempts < 10 && !(numberToGuess == scanner.nextInt()));

            System.out.print("Do you want to play again? (yes/no): ");
            String input = scanner.next();
            playAgain = input.equalsIgnoreCase("yes");
        } while (playAgain);

        System.out.println("Your total score is: " + roundScore);
        scanner.close();
    }
}