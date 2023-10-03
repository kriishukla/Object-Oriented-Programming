import java.util.Scanner;

class vector {
    private float x;
    private float y;
    private float z;

    public vector(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float dot_product(vector otherVector) {
        return (this.x * otherVector.getX()) + (this.y * otherVector.getY()) + (this.z * otherVector.getZ());
    }

    public vector add(vector otherVector) {
        float newX = this.x + otherVector.getX();
        float newY = this.y + otherVector.getY();
        float newZ = this.z + otherVector.getZ();
        return new vector(newX, newY, newZ);
    }
}

public class vector_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first vector
        float a = getInput(sc, "Enter x coordinate for the first vector:");
        float b = getInput(sc, "Enter y coordinate for the first vector:");
        float c = getInput(sc, "Enter z coordinate for the first vector:");
        
        // Input for the second vector
        float p = getInput(sc, "Enter x coordinate for the second vector:");
        float q = getInput(sc, "Enter y coordinate for the second vector:");
        float r = getInput(sc, "Enter z coordinate for the second vector:");

        vector vec1 = new vector(a, b, c);
        vector vec2 = new vector(p, q, r);

        System.out.println("Vector first coordinates: x=" + vec1.getX() + ", y=" + vec1.getY() + ", z=" + vec1.getZ());
        System.out.println("Vector second coordinates: x=" + vec2.getX() + ", y=" + vec2.getY() + ", z=" + vec2.getZ());

        // Calculate and print dot product
        float dotProduct = vec1.dot_product(vec2);
        System.out.println("The dot product is: " + dotProduct);

        // Calculate and print the sum of two vectors
        vector sumVector = vec1.add(vec2);
        System.out.println("The sum of two vectors is: x=" + sumVector.getX() + ", y=" + sumVector.getY() + ", z=" + sumVector.getZ());
    }

    public static float getInput(Scanner sc, String message) {
        float value = 0;
        while (true) {
            System.out.println(message);
            if (sc.hasNextFloat()) {
                value = sc.nextFloat();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid float value.");
                sc.next(); 
            }
        }
        return value;
    }
}