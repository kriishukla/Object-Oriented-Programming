import java.util.Scanner;

class Professor {
    private String name;
    private int yearsOfExperience;

    public Professor(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}

class Student {
    private String studentName;
    private int rollNo;

    public Student(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getRollNo() {
        return rollNo;
    }
}

class Course {
    private Professor professor;
    private Student[] students = new Student[2];

    public Course(Professor professor, Student student1, Student student2) {
        this.professor = professor;
        students[0] = student1;
        students[1] = student2;
    }

    public void dispProf() {
        System.out.println("Professor Information:");
        System.out.println("Name: " + professor.getName());
        System.out.println("Years of Experience: " + professor.getYearsOfExperience());
    }

    public void dispStudents() {
        System.out.println("Student Information:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + students[i].getStudentName());
            System.out.println("Roll No: " + students[i].getRollNo());
        }
    }
}

public class data{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Professor's Name:");
        String professorName = scanner.nextLine();
        System.out.println("Enter Years of Experience:");
        int professorExperience = scanner.nextInt();
        Professor professor = new Professor(professorName, professorExperience);

        Student[] students = new Student[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter Student " + (i + 1) + "'s Name:");
            String studentName = scanner.next();
            System.out.println("Enter Student " + (i + 1) + "'s Roll No:");
            int studentRollNo = scanner.nextInt();
            students[i] = new Student(studentName, studentRollNo);
        }

        Course course = new Course(professor, students[0], students[1]);

        course.dispProf();
        course.dispStudents();

        scanner.close();
    }
}
