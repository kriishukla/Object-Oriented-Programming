import java.util.Scanner;

class IncorrectPincodeException extends Exception {
    public IncorrectPincodeException(String message) {
        super(message);
    }
}

class Pincode {
    int pincode;

    public Pincode(int pincode) {
        this.pincode = pincode;
    }

    public void checkPincode(int x) throws IncorrectPincodeException {
        String pincodeString = Integer.toString(pincode);
        if (pincodeString.length() != 6 || pincodeString.charAt(0) == '0') {
            throw new IncorrectPincodeException("Incorrect Pincode Exception");
        } else {
            System.out.println("Pincode is valid");
        }
    }
}

public class question3 {
    public static void main(String[] args) {
        int y = 0;
        boolean flag =true;
        while (y == 0) {
            Scanner sc = new Scanner(System.in);
            int x;
            if (sc.hasNextInt()) {
                flag=false;

                x = sc.nextInt();
            } else {
                flag =true;
                System.out.println("Incorrect Pincode Exception");
                continue;
            }
            Pincode p1 = new Pincode(x);
            try {
                flag =true;
                p1.checkPincode(x);

                y = 1;
            } catch (IncorrectPincodeException e) {
                flag =false;
                System.out.println(e.getMessage());
            }
        }
    }
}
