import java.util.Random;
import java.util.Scanner;

public class Rock{
    public static void main(String[] args) {
        Random random = new Random();
        int computerChoice = random.nextInt(3);
        System.out.println("Computer's choice: " + computerChoice);

        int rock = 0;
        int paper = 1;
        int scissors = 2;

        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        
        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid input. Please enter 0, 1, or 2.");
        } else if (userChoice == computerChoice) {
            System.out.println("It's a Tie!");
        } else if ((userChoice == rock && computerChoice == scissors) ||
                   (userChoice == paper && computerChoice == rock) ||
                   (userChoice == scissors && computerChoice == paper)) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Wins!");
        }
    }
}
