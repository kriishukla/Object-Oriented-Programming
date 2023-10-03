abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

class Triangle extends Shape {
    private float a, b, c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float x) {
        this.a = x;
    }

    public float getB() {
        return b;
    }

    public void setB(float x) {
        this.b = x;
    }

    public float getC() {
        return c;
    }

    public void setC(float x) {
        this.c = x;
    }

    public double area() {
        double s = (a + b + c) / 2;
        double x = s * (s - a) * (s - b) * (s - c);
        return Math.sqrt(x);
    }

    public double perimeter() {
        return a + b + c;
    }

    public String getType() {
        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || a == c || b == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}

public class Polygon {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0f, 4.0f, 5.0f);

        System.out.println("Triangle Type: " + triangle.getType());
        System.out.println("Area: " + triangle.area());
        System.out.println("Perimeter: " + triangle.perimeter());
    }
}
