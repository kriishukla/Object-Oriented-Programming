class Sq {
    private int l;
    private int b;

    public Sq(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int getL() {
        return this.l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int area() {
        return l * b;
    }

    public int perimeter() {
        return 2 * (l + b);
    }

    @Override
    public String toString() {
        return "{" +
                " l='" + getL() + "'" +
                ", b='" + getB() + "'" +
                "}";
    }
}

public class Square {
    public static void main(String[] args) {
        // Create a Sq object with length 5 and breadth 5
        Sq sq = new Sq(5, 5);

        // Get and print the length and breadth
        int length = sq.getL();
        int breadth = sq.getB();
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);

        // Calculate and print the area
        int area = sq.area();
        System.out.println("Area: " + area);

        // Calculate and print the perimeter
        int perimeter = sq.perimeter(); 
        System.out.println("Perimeter: " + perimeter);

        // Update the length and breadth
        sq.setL(8);
        sq.setB(8);

        // Recalculate and print the area and perimeter
        area = sq.area();
        perimeter = sq.perimeter();
        System.out.println("Updated Area: " + area);
        System.out.println("Updated Perimeter: " + perimeter);

        // Print the Sq object using toString()
        System.out.println(sq);
    }
}
