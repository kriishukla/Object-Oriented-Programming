import java.util.Scanner;

public class Earthquake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the earthquake: ");
        String earthquakeName = sc.nextLine();

        System.out.print("Enter the intensity of the earthquake: ");
        System.out.println("");
        if (sc.hasNextFloat()) {
            float intensity = sc.nextFloat();
            if (intensity > 8) {
                System.out.println("Greater than the required value");
            } else if (intensity < 2) {
                System.out.println("Less than the required value");
            } else {
                System.out.println("The name of the earthquake is " + earthquakeName);
                System.out.println("The intensity of the earthquake is " + intensity);
            }
        } else {
            System.out.println("Invalid input. Please enter a valid intensity.");
        }

        sc.close();
    }
}
