import java.util.Scanner;

abstract class Polynomial<T> {
    int degree;
    T[] coefficients;

    public abstract void takeInput(Scanner scanner);

    public abstract void printPolynomial();

    public abstract void setCoefficients(T[] coefficients);

    public abstract T[] getCoefficients();

    public abstract Polynomial<T> addPolynomial(Polynomial<T> other);

    public abstract Polynomial<T> subtractPolynomial(Polynomial<T> other);

    public abstract Polynomial<T> getPolynomialGradient();
}

class DoublePolynomial extends Polynomial<Double> {
    public DoublePolynomial() {
        super();
    }

    public void takeInput(Scanner scanner) {
        System.out.println("Enter the degree of the polynomial:");
        degree = scanner.nextInt();
        coefficients = new Double[degree + 1];
        System.out.println("Enter the coefficients:");
        for (int i = 0; i <= degree; i++) {
            coefficients[i] = scanner.nextDouble();
        }
    }

    public void printPolynomial() {
        System.out.print("Polynomial: ");
        for (int i = 0; i <= degree; i++) {
            System.out.print(coefficients[i] + "x^" + i);
            if (i < degree) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }

    public void setCoefficients(Double[] coefficients) {
        this.coefficients = coefficients;
    }

    public Double[] getCoefficients() {
        return coefficients;
    }

    public Polynomial<Double> addPolynomial(Polynomial<Double> other) {
        if (other instanceof DoublePolynomial) {
            DoublePolynomial otherDoublePoly = (DoublePolynomial) other;
            Double[] resultCoefficients = new Double[Math.max(degree, otherDoublePoly.degree) + 1];
            for (int i = 0; i <= degree; i++) {
                resultCoefficients[i] = coefficients[i];
            }
            for (int i = 0; i <= otherDoublePoly.degree; i++) {
                resultCoefficients[i] += otherDoublePoly.coefficients[i];
            }
            DoublePolynomial result = new DoublePolynomial();
            result.setCoefficients(resultCoefficients);
            return result;
        }
        return null;
    }

    public Polynomial<Double> subtractPolynomial(Polynomial<Double> other) {
        if (other instanceof DoublePolynomial) {
            DoublePolynomial otherDoublePoly = (DoublePolynomial) other;
            Double[] resultCoefficients = new Double[Math.max(degree, otherDoublePoly.degree) + 1];
            for (int i = 0; i <= degree; i++) {
                resultCoefficients[i] = coefficients[i];
            }
            for (int i = 0; i <= otherDoublePoly.degree; i++) {
                resultCoefficients[i] -= otherDoublePoly.coefficients[i];
            }
            DoublePolynomial result = new DoublePolynomial();
            result.setCoefficients(resultCoefficients);
            return result;
        }
        return null;
    }

    public Polynomial<Double> getPolynomialGradient() {
        Double[] resultCoefficients = new Double[degree];
        for (int i = 1; i <= degree; i++) {
            resultCoefficients[i - 1] = coefficients[i] * i;
        }
        DoublePolynomial result = new DoublePolynomial();
        result.setCoefficients(resultCoefficients);
        return result;
    }
}

public class polynomial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublePolynomial polynomial = new DoublePolynomial();
        polynomial.takeInput(scanner);
        polynomial.printPolynomial();
        DoublePolynomial otherPolynomial = new DoublePolynomial();
        otherPolynomial.takeInput(scanner);
        Polynomial<Double> sum = polynomial.addPolynomial(otherPolynomial);
        if (sum != null) {
            sum.printPolynomial();
        } else {
            System.out.println("Cannot add polynomials with different data types.");
        }
        Polynomial<Double> gradient = polynomial.getPolynomialGradient();
        gradient.printPolynomial();
    }
}
