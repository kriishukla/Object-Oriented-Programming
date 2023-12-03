import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class Person {
    String firstName;
    String lastName;
    int id;

    void goToWork() {
        System.out.println("Go to work");
    }

    class Address {
        String area;
        String city;
        String pincode;
        String state;
    }
}

class Student extends Person {
    double cgpa;  
    int startYear;
    String residentStatus;
    Address address;

    public Student(double cgpa, int startYear, String residentStatus) {
        this.cgpa = cgpa;
        this.startYear = startYear;
        this.residentStatus = residentStatus;
        this.address = new Address(); // Create an instance of Address
    }

    public Address getAddress() {
        return address;
    }
}

public class question2 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(8.5, 2019, "Day Scholar"));
        studentList.add(new Student(9.2, 2018, "Day Scholar"));
        studentList.add(new Student(9.8, 2020, "Day Scholar"));
        studentList.add(new Student(9.0, 2017, "On Campus"));
        studentList.add(new Student(8.7, 2016, "On Campus"));
        studentList.add(new Student(8.9, 2015, "On Campus"));

        // Sort the student list based on CGPA
        Collections.sort(studentList, Comparator.comparingDouble((Student s) -> s.cgpa).reversed());

        // Print the mode of transportation for each student
        for (Student student : studentList) {
            if (student.residentStatus.equals("On Campus")) {
                System.out.println("Student ID: " + student.id + ", Mode of transportation: Walk");
            } else {
                System.out.println("Student ID: " + student.id + ", Mode of transportation: Vehicle");
            }
        }

        // Change residential status based on distance - 6 * cgpa
        int basePincode = 110020;
        for (Student student : studentList) {
            int distance = Math.abs(Integer.parseInt(student.getAddress().pincode) - basePincode);
            if (distance <= 6 * student.cgpa) {
                student.residentStatus = "On Campus";
            }
        }

        // Sort the student list based on distance
        Collections.sort(studentList, Comparator.comparingInt((Student s) -> Math.abs(Integer.parseInt(s.getAddress().pincode) - basePincode)));

        // Print the sorted list based on distance
        System.out.println("Sorted list based on distance:");
        for (Student student : studentList) {
            System.out.println("Student ID: " + student.id + ", Distance: " + Math.abs(Integer.parseInt(student.getAddress().pincode) - basePincode));
        }

        // Sort the student list based on CGPA
        Collections.sort(studentList, Comparator.comparingDouble((Student s) -> s.cgpa).reversed());

        // Print the sorted list based on CGPA
        System.out.println("Sorted list based on CGPA:");
        for (Student student : studentList) {
            System.out.println("Student ID: " + student.id + ", CGPA: " + student.cgpa);
        }
    }
}
