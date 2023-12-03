import java.util.Objects;

public class Fraction {
    
        
    
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    private void reduce() {
        int divisor = gcd(numerator, denominator);
        numerator /= divisor;
        denominator /= divisor;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public Fraction add(Fraction other) {
        int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    public static void main(String[] args) {
        Fraction f= new Fraction(8, 10);
        Fraction g =new Fraction(12, 4);
        System.out.println(f.add(g));
        System.out.println(f.multiply(g));

    }

}