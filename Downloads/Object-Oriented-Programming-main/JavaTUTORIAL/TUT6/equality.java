class Point {
    private int x, y;

    public Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    @Override
    public boolean equals(Object o1) {
        if (o1 != null && getClass() == o1.getClass()) {
            Point o = (Point) o1; 
            return (x == o.x && y == o.y);
        } else {
            return false;
        }
    }
}


// Subclass of Point
class Point3D extends Point {
    private int z;

    public Point3D(int _x, int _y, int _z) {
        super(_x, _y); 
        z = _z;
    }

    @Override
    public boolean equals(Object o1) {
        if (o1 != null && getClass() == o1.getClass()) {
            Point3D o = (Point3D) o1;
            return (super.equals(o1) && z == o.z);
        } else {
            return false;
        }
    }
}

public class equality{
    public static void main(String[] args) {
        // Creating 2D points
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        Point point3 = new Point(3, 4);

        // Comparing 2D points
        System.out.println("Comparing 2D points:");
        System.out.println("point1 equals point2: " + point1.equals(point2)); 
        System.out.println("point1 equals point3: " + point1.equals(point3)); 

        // Creating 3D points
        Point3D point3D1 = new Point3D(1, 2, 3);
        Point3D point3D2 = new Point3D(1, 2, 3);
        Point3D point3D3 = new Point3D(3, 4, 5);

        // Comparing 3D points
        System.out.println("\nComparing 3D points:");
        System.out.println("point3D1 equals point3D2: " + point3D1.equals(point3D2)); 
        System.out.println("point3D1 equals point3D3: " + point3D1.equals(point1)); 
    }
}