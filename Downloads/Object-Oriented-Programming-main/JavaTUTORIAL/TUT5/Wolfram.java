import java.lang.Math;

class Arithmetic {
    float addition(float a, float b) {
        return (a + b);
    }

    float multiplication(float a, float b) {
        return a * b;
    }

    float subtraction(float a, float b) {
        return (a - b);
    }

    float divide(float a, float b) {
        return a / b;
    }
}

class Compute {
    double power(int a, int x) {
        return Math.pow(a, x);
    }

    double log(int x) {
        return Math.log(x);
    }

    int constant(int a) {
        return a;
    }
}

class Integration {
    static double integrate(String operation, int a, int b) {
        if (operation.equals("power")) {
            return (Math.pow(b, 2) - Math.pow(a, 2)) / Math.log(b / a);
        } else if (operation.equals("log")) {
            return (b * Math.log(b) - a * Math.log(a)) - (b - a);
        } else if (operation.equals("constant")) {
            return a * (b - a);
        } else {
            return 0.0;
        }
    }
}

class Differentiation {
    static double differentiate(String operation, int a, int x) {
        if (operation.equals("power")) {
            return Math.pow(a, x) * Math.log(a);
        } else if (operation.equals("log")) {
            return 1.0 / x;
        } else if (operation.equals("constant")) {
            return 0.0;
        } else {
            return 0.0;
        }
    }
}
public class Wolfram {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        float result1 = arithmetic.addition(5.0f, 3.0f);
        float result2 = arithmetic.multiplication(5.0f, 3.0f);
        float result3 = arithmetic.subtraction(5.0f, 3.0f);
        float result4 = arithmetic.divide(5.0f, 3.0f);

        System.out.println("Addition: " + result1);
        System.out.println("Multiplication: " + result2);
        System.out.println("Subtraction: " + result3);
        System.out.println("Division: " + result4);

        Compute compute = new Compute();
        double powerResult = compute.power(2, 3);
        double logResult = compute.log(10);
        int constantResult = compute.constant(7);

        System.out.println("Power: " + powerResult);
        System.out.println("Log: " + logResult);
        System.out.println("Constant: " + constantResult);

        String integrationOperation = "power";
        int a = 2;
        int b = 4;
        double integrationResult = Integration.integrate(integrationOperation, a, b);

        System.out.println("Integration (" + integrationOperation + "): " + integrationResult);

        String differentiationOperation = "log";
        int x = 5;
        double differentiationResult = Differentiation.differentiate(differentiationOperation, a, x);

        System.out.println("Differentiation (" + differentiationOperation + "): " + differentiationResult);
    }
}
