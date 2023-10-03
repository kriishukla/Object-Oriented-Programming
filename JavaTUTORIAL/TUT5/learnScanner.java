import java.util.Scanner;

public class learnScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println("You entered an integer: " + a);
        } else {
            System.out.println("No input provided.");
        }

        String b = sc.next();
        sc.nextLine();
        System.out.println("Next token: " + b);
        String c = sc.nextLine();
        System.out.println("Entire line: " + c);

        sc.close();
    }
}