import java.util.Objects;

public class Employee {
    private int id;
    private String name;

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(14, "Raman");
        Employee emp2 = new Employee(29, "Shreya");
        Employee emp3 = new Employee(14, "Raman");
        Employee emp4 = emp;
        
        System.out.println(emp.toString());
        System.out.println(emp.equals(emp2)); 
        System.out.println(emp.equals(emp3)); 
        System.out.println(emp.equals(emp4));    
    }
}