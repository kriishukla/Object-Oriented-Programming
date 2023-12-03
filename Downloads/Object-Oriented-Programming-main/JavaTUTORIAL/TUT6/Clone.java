import java.lang.*;

class Emp implements Cloneable {
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

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Clone {
        public static void main(String[] args) {
        Emp emp = new Emp(29, "Singh");
        try {
            Emp emp2 = (Emp) emp.clone();
            emp2.setName("hello");
            System.out.println(emp.getID() + " " + emp.getName());
            System.out.println(emp2.getID() + " " + emp2.getName());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}