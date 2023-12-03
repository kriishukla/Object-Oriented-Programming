public class Student {
    private String name;
    private int rollNumber;
    private int age;

    // Parameterized constructor
    public Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNumber=" + rollNumber + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        // Create a Student object using the parameterized constructor
        Student student1 = new Student("John Doe", 101, 20);

        // Access and print the student's details
        System.out.println("Student Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Roll Number: " + student1.getRollNumber());
        System.out.println("Age: " + student1.getAge());

        // You can also use the toString() method to print the details
        System.out.println(student1);
    }
}
