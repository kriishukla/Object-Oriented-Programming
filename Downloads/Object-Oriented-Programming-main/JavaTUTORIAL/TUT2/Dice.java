import java.util.Random;
import java.util.Scanner;

class dice {
    private final int sides;
    private int faces;

    public dice(int numSides) {
        sides = numSides;
    }

    public void roll() {
        Random random = new Random();
        faces = random.nextInt(sides) + 1;
    }

    public int number() {
        return faces;
    }

}

public class Dice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSides = 6; // Default to 6 sides if no valid input is provided

        if (sc.hasNextInt()) {
            numSides = sc.nextInt();
        } else {
            System.out.println("Invalid input. Using default value of 6 sides.");
        }

        dice dice = new dice(numSides);

        // Roll the dice multiple times for testing
        for (int i = 1; i <= 10; i++) {
            dice.roll();
            System.out.println("Roll " + i + ": " + dice.number());
        }
    }
}