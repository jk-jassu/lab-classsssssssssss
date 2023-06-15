import java.util.Scanner;

public class jassu {
    public static void main(String[] args) {
        final int MAX_GUESSES = 14;
        final int MAX_NUMBER = 9999;

        int targetNumber = (int) (Math.random() * (MAX_NUMBER + 1));
        int numGuesses = 0;
        boolean hasWon = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 0 and 9999.");

        while (numGuesses < MAX_GUESSES) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess > targetNumber) {
                System.out.println("The number is smaller.");
            } else if (guess < targetNumber) {
                System.out.println("The number is bigger.");
            } else {
                hasWon = true;
                break;
            }

            numGuesses++;
        }

        if (hasWon) {
            System.out.println("Congratulations! You guessed the number in " + numGuesses + " attempts.");
        } else {
            System.out.println("Sorry, you didn't guess the number within 14 attempts.");
            System.out.println("The number was: " + targetNumber);
        }

        scanner.close();
    }
}
