import java.util.Scanner;
import java.util.Random;

public class guess_the_number_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int targetNumber = random.nextInt(max - min + 1) + min;

        int numberOfGuesses = 0;
        int guessedNumber;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have selected a number between " + min + " and " + max + ". Try to guess it.");

        do {
            System.out.print("Enter your guess: ");
            guessedNumber = scanner.nextInt();
            numberOfGuesses++;

            if (guessedNumber < targetNumber) {
                System.out.println("Try a higher number.");
            } else if (guessedNumber > targetNumber) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + numberOfGuesses + " guesses.");
                break;
            }
        } while (true);

        scanner.close();
    }
}
