class Fraction {
    public int num;
    public int den;
    public Fraction(int num, int den) {
        int gcd = gcd(num, den);
        this.num = num / gcd;
        this.den = den / gcd;
    }
    public Fraction add(Fraction other) {
        return new Fraction(this.num * other.den + other.num * this.den, this.den * other.den);
    }
    public Fraction subtract(Fraction other) { 
        return new Fraction(this.num * other.den - other.num * this.den, this.den * other.den);
    }
    public Fraction multiply(Fraction other) {
        return new Fraction(this.num * other.num, this.den * other.den);
    }
    public Fraction divide(Fraction other) {
        return new Fraction(this.num * other.den, this.den * other.num);
    }  
    public String toString() {
        return num + "/" + den;
    }
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
abstract class Complex<T> {
    public T real;
    public T imaginary;
    public abstract Complex<T> add(Complex<T> other);

    public abstract Complex<T> multiply(Complex<T> other);

    public abstract void argument();

    public abstract double magnitude();
}
class new_int extends Complex<Integer> {
    public new_int(Integer real, Integer imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }   
    public Complex<Integer> add(Complex<Integer> other) {
        return new new_int(this.real + other.real, this.imaginary + other.imaginary);
    }  
    public Complex<Integer> multiply(Complex<Integer> other) {
        return new new_int(this.real * other.real - this.imaginary * other.imaginary, this.real * other.imaginary + this.imaginary * other.real);
    }    
    public void argument() {
        System.out.println("Tan inverse of " + imaginary + "/" + real);          
        }       
        public double magnitude() {
            return Math.pow(real * real + imaginary * imaginary,0.5);
        }
    }

class new_frac extends Complex<Fraction> {
    public new_frac(Fraction real, Fraction imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    } 
    public Complex<Fraction> add(Complex<Fraction> other) {
        return new new_frac(this.real.add(other.real), this.imaginary.add(other.imaginary));
    }  
    public Complex<Fraction> multiply(Complex<Fraction> other) {
        return new new_frac(this.real.multiply(other.real).subtract(this.imaginary.multiply(other.imaginary)), this.real.multiply(other.imaginary).add(this.imaginary.multiply(other.real)));
    }   
    public void argument() {
        System.out.println("Tan inverse of " + imaginary + "/" + real);
    }  
    public double magnitude() {
        return Math.sqrt(Math.pow((double) real.num / real.den, 2) + Math.pow((double) imaginary.num / imaginary.den, 2));
    }
}

public class Main {
    public static void main(String[] args) {
 
        // Complex<Fraction> complexFraction1 = new new_frac(new Fraction(1, 2), new Fraction(3, 4));
        // Complex<Fraction> complexFraction2 = new new_frac(new Fraction(2, 5), new Fraction(1, 3));

        // Complex<Fraction> sumOfComplexFractions = complexFraction1.add(complexFraction2);
        // System.out.println("Sum of Complex Fractions: " + sumOfComplexFractions.real + " + " + "i("+sumOfComplexFractions.imaginary+")" );
    }
}
