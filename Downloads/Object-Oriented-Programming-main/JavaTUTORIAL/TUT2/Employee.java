import java.util.Scanner;

public class Employee {
    private String name;
    private int employeeID;
    private double salary;

    public Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for employee ID
    public int getEmployeeID() {
        return employeeID;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary value. Salary cannot be negative.");
        }
    }

    @Override
    public String toString() {
        return "Employee Information:\n" +
               "Name: " + name + "\n" +
               "Employee ID: " + employeeID + "\n" +
               "Salary: $" + salary;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt for and read the employee ID
        System.out.println("Enter Employee ID: ");
        int eid;
        if (sc.hasNextInt()) {
            eid = sc.nextInt();
        } else {
            System.out.println("Invalid employee ID.");
            sc.close();
            return; // Exit the program if input is invalid
        }

        // Consume the newline character left in the buffer
        sc.nextLine();

        // Prompt for and read the employee name
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();

        // Create an Employee object
        Employee employee = new Employee(name, eid, 50000.0);

        // Display employee information
        System.out.println(employee);

        // Prompt for and set the updated salary
        System.out.println("\nEnter Updated Salary: ");
        double updatedSalary;
        if (sc.hasNextDouble()) {
            updatedSalary = sc.nextDouble();
        } else {
            System.out.println("Invalid salary value.");
            sc.close();
            return; // Exit the program if input is invalid
        }

        employee.setSalary(updatedSalary);

        // Display updated employee information
        System.out.println("\nUpdated Employee Information:");
        System.out.println(employee);

        // Close the scanner
        sc.close();
    }
}
