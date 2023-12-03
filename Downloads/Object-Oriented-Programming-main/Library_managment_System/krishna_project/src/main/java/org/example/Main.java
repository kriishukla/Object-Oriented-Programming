package org.example;

import java.util.*;

import java.time.LocalDateTime;

import java.time.Duration;

class FourEntryTuple {
    public String first;

    public String second;
    public int third;
    public int fourth;

    public FourEntryTuple(String first, String second, int third, int fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }


    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }

    public int getFourth() {
        return fourth;
    }
}

class ThreeEntryTuple {
    public int first;
    public String second;
    public String third;
    public LocalDateTime issuanceTime;

    public ThreeEntryTuple(int first, String second, String third) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.issuanceTime = null;
    }

    public int getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public String getThird() {
        return third;
    }
}

class Library {

    private Set<String> registeredPhoneNumbers;
    public ThreeEntryTuple[] getThreeEntryTupleArray() {
        return threeEntryTupleArray;
    }

    public int getThreeEntryTupleCount() {
        return threeEntryTupleCount;
    }

    private FourEntryTuple[] fourEntryTupleArray;
    public ThreeEntryTuple[] threeEntryTupleArray;
    private int twoEntryTupleCount;
    public int threeEntryTupleCount;
    private int member_id = 10000;
    private int bookid = 1;


    public Library() {
        fourEntryTupleArray = new FourEntryTuple[100];
        threeEntryTupleArray = new ThreeEntryTuple[100];
        twoEntryTupleCount = 0;
        threeEntryTupleCount = 0;
        bookid=1;
        registeredPhoneNumbers = new HashSet<>();
    }

    void registerMembers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: "); // name could be supposed as ELizabeth-2
        String name = scanner.nextLine();

        int age;
        while (true) {
            System.out.print("Enter Age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer for Age.");
                scanner.nextLine();
            }
        }
        // phone is a string may be you want to give your mobile has +91,0129-
        String phoneNumber;
        while (true) {
            System.out.print("Enter Phone: ");
            phoneNumber = scanner.nextLine();

            if (registeredPhoneNumbers.contains(phoneNumber)) {
                System.out.println("Phone number is not unique. Please enter a unique phone number.");
            } else {
                // Phone number is unique, add it to the set
                registeredPhoneNumbers.add(phoneNumber);
                break;
            }
        }

        fourEntryTupleArray[twoEntryTupleCount++] = new FourEntryTuple(name, phoneNumber, 0, member_id);
        member_id++;
        System.out.println("Member registered successfully!");


    }

    void removeMembers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Phone: ");
        String phoneNumber = scanner.nextLine();

        int indexToRemove = -1;
        for (int i = 0; i < twoEntryTupleCount; i++) {
            FourEntryTuple tuple = fourEntryTupleArray[i];
            if (tuple.getFirst().equals(name) && tuple.getSecond().equals(phoneNumber)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
//            System.out.println(twoEntryTupleCount);
//                fourEntryTupleArray[indexToRemove] = fourEntryTupleArray[twoEntryTupleCount];
//                twoEntryTupleCount--;
            for (int i = indexToRemove; i < twoEntryTupleCount - 1; i++) {
                fourEntryTupleArray[i] = fourEntryTupleArray[i + 1];
            }
            fourEntryTupleArray[twoEntryTupleCount - 1] = null;
            twoEntryTupleCount--;
            System.out.println("Member removed successfully.");
        } else {
            System.out.println("Member not found.");
        }

    }

    void addBooks() {
        Scanner scanner = new Scanner(System.in);


        /*
        while (true) {
            System.out.print("Enter Book ID: ");
            if (scanner.hasNextInt()) {
                bookId = scanner.nextInt();
                scanner.nextLine();

                boolean isDuplicate = false;
                for (int i = 0; i < threeEntryTupleCount; i++) {
                    if (threeEntryTupleArray[i] != null && threeEntryTupleArray[i].getFirst() == bookId) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    System.out.println("Book ID is already used. Please enter a unique Book ID.");
                } else {
                    break;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer for Book ID.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
*/
        System.out.print("Enter Book name: ");
        String bookName = scanner.nextLine();

        System.out.print("Enter Author name: ");
        String authorName = scanner.nextLine();



        int copies;
        while (true) {
            System.out.print("Enter Number of Copies: ");
            if (scanner.hasNextInt()) {
                copies = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer for Copies.");
                scanner.nextLine();
            }

        }


        for (int i =0 ; i<copies;i++){
            threeEntryTupleArray[threeEntryTupleCount++] = new ThreeEntryTuple(bookid, bookName, authorName);
            bookid++;
        }
        System.out.println("Book added successfully!");




    }
    void removeBooks() {
        Scanner scanner = new Scanner(System.in);



        int bookId;
        while (true) {
            System.out.print("Enter Book id: ");
            if (scanner.hasNextInt()) {
                bookId= scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer for Copies.");
                scanner.nextLine();
            }

        }

        int indexToRemove = -1;
        for (int i = 0; i < threeEntryTupleCount; i++) {
            ThreeEntryTuple tuple = threeEntryTupleArray[i];
            if (tuple.getFirst() == bookId) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < threeEntryTupleCount - 1; i++) {
                threeEntryTupleArray[i] = threeEntryTupleArray[i + 1];
            }
            threeEntryTupleArray[threeEntryTupleCount - 1] = null;
            threeEntryTupleCount--;
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }

    }

    void viewAllMembers() {
        for (int i = 0; i < twoEntryTupleCount; i++) {
            FourEntryTuple tuple = fourEntryTupleArray[i];
            System.out.println("Name: " + tuple.getFirst() + "\nPhone: " + tuple.getSecond()+"\n");
        }
    }

    void viewAllBooks() {
        for (int i = 0; i < threeEntryTupleCount; i++) {
            ThreeEntryTuple tuple = threeEntryTupleArray[i];
            System.out.println("Book ID: " + tuple.getFirst() + "\nBook Name: " + tuple.getSecond() + "\nAuthor: " + tuple.getThird()+"\n");
        }
    }
    boolean memberExists(String memberName, String memberPhone) {
        for (int i = 0; i < twoEntryTupleCount; i++) {
            FourEntryTuple tuple = fourEntryTupleArray[i];
            if (tuple.getFirst().equals(memberName) && tuple.getSecond().equals(memberPhone)) {
                return true;
            }
        }
        return false;
    }
}

class Member {
    private ThreeEntryTuple[] myBooks;
    private int myBookCount;
    private long fine;
    private int day;

    private ThreeEntryTuple[] bookTupleArray;
    private int bookTupleCount;
    public Member() {
        myBooks = new ThreeEntryTuple[100];
        myBookCount = 0;
        fine = 0;
        day = 0;
        bookTupleArray = new ThreeEntryTuple[100];
        bookTupleCount = 0;
    }

    void listAvailableBooks(ThreeEntryTuple[] bookTupleArray, int threeEntryTupleCount) {

        for (int i = 0; i < threeEntryTupleCount; i++) {
            ThreeEntryTuple tuple = bookTupleArray[i];
            System.out.println("Book ID: " + tuple.getFirst() + "\nBook Name: " + tuple.getSecond() + "\nAuthor: " + tuple.getThird()+"\n");
        }
    }
    void listMyBooks() {
        for (int i = 0; i < myBookCount; i++) {
            ThreeEntryTuple tuple = myBooks[i];
            System.out.println("Book ID: " + tuple.getFirst() + "\nBook Name: " + tuple.getSecond() + "\nAuthor: " + tuple.getThird()+"\n");
        }
    }

    void issueBook(Library lib, ThreeEntryTuple[] bookTupleArray, int bookTupleCount) {
        if (myBookCount==2){
            System.out.println("First return a book");
        }
        else if (fine == 0) {
            Scanner scanner = new Scanner(System.in);

            int bookId;
            while (true) {
                System.out.print("Enter Book ID: ");
                if (scanner.hasNextInt()) {
                    bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid integer for Book ID.");
                    scanner.nextLine(); // Consume the invalid input
                }
            }

            System.out.print("Enter Book Name: "); // Ask for book name
            String bookName = scanner.nextLine(); // Read book name

            int foundIndex = -1; // Initialize to an invalid index

            for (int i = 0; i < bookTupleCount; i++) {
                if (bookTupleArray[i].getFirst() == bookId && bookTupleArray[i].getSecond().equals(bookName)) {
                    foundIndex = i;
                    break;
                }
            }

            if (foundIndex != -1) {
                ThreeEntryTuple bookToIssue = lib.threeEntryTupleArray[foundIndex];
                bookToIssue.issuanceTime = LocalDateTime.now();
                myBooks[myBookCount++] = bookToIssue;

                lib.threeEntryTupleArray[foundIndex] = lib.threeEntryTupleArray[lib.threeEntryTupleCount-1];
                lib.threeEntryTupleCount--;
                // Shift books in the array and update book IDs
//                for (int i = foundIndex; i < bookTupleCount - 1; i++) {
//                    bookTupleArray[i] = bookTupleArray[i + 1];
//                }
                // Decrease the bookTupleCount
                bookTupleCount--;

                System.out.println("Book issued successfully!");
            } else {
                System.out.println("Book not found.");
            }
        } else {
            System.out.println("First pay the fine: " + fine);
        }
    }



    void returnBook(Library lib, ThreeEntryTuple[] bookTupleArray, int bookTupleCount) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        LocalDateTime currentTime = LocalDateTime.now();
        ThreeEntryTuple returnedBook = null;

        for (int i = 0; i < this.myBookCount; i++) {
            ThreeEntryTuple tuple = this.myBooks[i];
            if (tuple.getFirst() == bookId) {
                returnedBook = tuple;
                break;
            }
        }

        if (returnedBook != null) {
            Duration timeDifference = Duration.between(returnedBook.issuanceTime, currentTime);
            long seconds = timeDifference.getSeconds();

            if (seconds > 10) {
                fine = fine + 3*seconds;
            }

            int indexToRemove = -1;
            for (int i = 0; i < this.myBookCount; i++) {
                ThreeEntryTuple tuple = this.myBooks[i];
                if (tuple.getFirst() == bookId) {
                    indexToRemove = i;
                    break;
                }
            }

            if (indexToRemove != -1) {
                lib.threeEntryTupleArray[lib.threeEntryTupleCount] = this.myBooks[indexToRemove];
                lib.threeEntryTupleCount++;
                this.myBooks[indexToRemove] = this.myBooks[this.myBookCount-1];
                this.myBookCount --;

                System.out.println("Book returned successfully.");
            } else {
                System.out.println("Book not found.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    void payFine() {
        if (fine>0){
            System.out.println("Fine paid.");
            fine=0;
        }
        else{
            System.out.println("You Don't need to pay a fine");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 1;

        Library library = new Library(); // Moved this line outside the loop
        Member member = new Member();

        while (x == 1) {
            System.out.println("Library Portal Initialized….\n" +
                    "---------------------------------\n" +
                    "1.   Enter as a librarian\n" +
                    "2.   Enter as a member\n" +
                    "3.   Exit\n" +
                    "---------------------------------");

            int choice;
            while (true) {
                System.out.print("Enter your choice: ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid integer for your choice.");
                    scanner.nextLine(); // Consume the invalid input
                }
            }

            if (choice == 1) {
                int z = 1;
                while (z == 1) {
                    System.out.println("---------------------------------\n" +
                            "1.  Register a member\n" +
                            "2.  Remove a member\n" +
                            "3.  Add a book\n" +
                            "4.  Remove a book\n" +
                            "5.  View all members\n" +
                            "6.  View all books\n" +
                            "7.  Back\n" +
                            "---------------------------------");

                    int librarianChoice;
                    while (true) {
                        System.out.print("Enter your choice: ");
                        if (scanner.hasNextInt()) {
                            librarianChoice = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline character
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter a valid integer for your choice.");
                            scanner.nextLine(); // Consume the invalid input
                        }
                    }

                    if (librarianChoice == 1) {
                        library.registerMembers();
                    } else if (librarianChoice == 2) {
                        library.removeMembers();
                    } else if (librarianChoice == 3) {
                        library.addBooks();
                    } else if (librarianChoice == 4) {
                        library.removeBooks();
                    } else if (librarianChoice == 5) {
                        library.viewAllMembers();
                    } else if (librarianChoice == 6) {
                        library.viewAllBooks();
                    } else if (librarianChoice == 7) {
                        z = 0;
                    } else {
                        System.out.println("Invalid choice");
                    }
                }
            } else if (choice == 2) {
                int y = 1;

                // Consume the newline left from previous input

                System.out.print("Enter Name: ");
                String memberName = scanner.nextLine();

                System.out.print("Enter Phone: ");
                String memberPhone = scanner.nextLine();

                if (!library.memberExists(memberName, memberPhone)) {
                    System.out.println("Member does not exist.");
                    y=0;// Exit the program
                } else {
                    System.out.println("Welcome " + memberName + " MemberId: " + memberPhone);
                }

                while (y == 1) {
                    // Implement member's menu options
                    System.out.println("---------------------------------\n" +
                            "1.  List Available Books\n" +
                            "2.  List My Books\n" +
                            "3.  Issue Book\n" +
                            "4.  Return Book\n" +
                            "5.  Pay Fine\n" +
                            "6.  Back\n" +
                            "---------------------------------");

                    int memberChoice;
                    while (true) {
                        System.out.print("Enter your choice: ");
                        if (scanner.hasNextInt()) {
                            memberChoice = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline character
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter a valid integer for your choice.");
                            scanner.nextLine(); // Consume the invalid input
                        }
                    }

                    if (memberChoice == 1) {
                        member.listAvailableBooks(library.getThreeEntryTupleArray(), library.getThreeEntryTupleCount());
                    } else if (memberChoice == 2) {
                        member.listMyBooks();
                    } else if (memberChoice == 3) {
                        member.issueBook(library, library.getThreeEntryTupleArray(), library.getThreeEntryTupleCount());
                    } else if (memberChoice == 4) {
                        member.returnBook(library, library.getThreeEntryTupleArray(), library.getThreeEntryTupleCount());
                    } else if (memberChoice == 5) {
                        member.payFine();
                    } else if (memberChoice == 6) {
                        y = 0;
                    } else {
                        System.out.println("Invalid Option");
                    }
                }
            } else if (choice == 3) {
                x = 0;
                System.out.println("---------------------------------\n" +
                        "Thanks for visiting!\n" +
                        "---------------------------------");
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }
}