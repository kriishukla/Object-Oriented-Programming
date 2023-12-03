import java.util.Scanner;

class Contact implements Cloneable {
   private long phoneNo;
   private String email;
   private String address;

   public void setPhoneNo(long phoneNo) {
      this.phoneNo = phoneNo;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   Contact(long phoneNo, String email, String address) {
      this.phoneNo = phoneNo;
      this.email = email;
      this.address = address;
   }
   public void displayContact() {
      System.out.println("Phone no: " + this.phoneNo);
      System.out.println("Email: " + this.email);
      System.out.println("Address: " + this.address);
   }
   @Override
   protected Object clone() throws CloneNotSupportedException {
      return super.clone();
   }
}

public class StudentData implements Cloneable {
   private String name;
   private int age;
   private Contact contact;
   public StudentData(String name, int age, Contact contact) {
      this.name = name;
      this.age = age;
      this.contact = contact;
   }

   public void displayData() {
      System.out.println("Name : " + this.name);
      System.out.println("Age : " + this.age);
      contact.displayContact();
   }

   @Override
   protected Object clone() throws CloneNotSupportedException {
      StudentData student = (StudentData) super.clone();
      student.contact = (Contact) contact.clone();
      return student;
   }

   public static void main(String[] args) throws CloneNotSupportedException {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name ");
      String name = sc.next();
      System.out.println("Enter your age ");
      int age = sc.nextInt();
      System.out.println("#############Contact details#############");
      System.out.println("Enter your phone number: ");
      long phoneNo = sc.nextLong();
      System.out.println("Enter your Email ID: ");
      String email = sc.next();
      System.out.println("Enter your address: ");
      String address = sc.next();
      System.out.println(" ");

      StudentData std = new StudentData(name, age, new Contact(phoneNo, email, address));
      StudentData copiedStd = (StudentData) std.clone();
      copiedStd.contact.setPhoneNo(000000000);
      copiedStd.contact.setEmail("XXXXXXXXXX");
      copiedStd.contact.setAddress("XXXXXXXXXX");
      System.out.println("Contents of the copied object::");
      copiedStd.displayData();
      System.out.println(" ");
      System.out.println("Contents of the original object::");
      std.displayData();
   }
}