import java.util.Random;
import java.util.Scanner;

public class Game {
    private int randomNumber;
    private int userGuess;
    private int noOfGuesses;

    public Game() {
        // Generate a random number between 1 and 100 (inclusive)
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1;
        noOfGuesses = 0;
    }

    public void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess (1-100): ");
        userGuess = scanner.nextInt();
        noOfGuesses++;
    }

    public boolean isCorrectNumber() {
        return userGuess == randomNumber;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            game.takeUserInput();
            if (game.isCorrectNumber()) {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Number of guesses: " + game.getNoOfGuesses());
                break;
            } else {
                System.out.println("Try again. Incorrect guess.");
            }
        }

        scanner.close();
    }
}
