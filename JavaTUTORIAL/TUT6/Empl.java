import java.util.*;

class Address {
    private int houseNo;

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int num) {
        this.houseNo = num;
    }

    public Address(int houNo) {
        this.houseNo = houNo;
    }
}

public class Empl implements Cloneable {
    private int id;
    private String name;
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Empl(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address adr1 = new Address(311);
        Empl emp = new Empl(29, "Singh", adr1);
        Empl emp2 = (Empl) emp.clone();

        System.out.println(emp.getID() + " " + emp.getName() + " " + emp.getAddress().getHouseNo());
        System.out.println(emp2.getID() + " " + emp2.getName() + " " + emp2.getAddress().getHouseNo());

        adr1.setHouseNo(23);
        System.out.println(emp.getID() + " " + emp.getName() + " " + emp.getAddress().getHouseNo()); 
        System.out.println(emp2.getID() + " " + emp2.getName() + " " + emp2.getAddress().getHouseNo()); 
    }
}
