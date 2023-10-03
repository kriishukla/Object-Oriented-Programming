public class Library {
    private String title;
    private String author;
    private boolean isAvailable;

    public Library(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Initially, the book is available
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book '" + title + "' by " + author + " has been borrowed.");
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
        }
    }

    // Method to return the book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book '" + title + "' by " + author + " has been returned.");
        } else {
            System.out.println("The book '" + title + "' is already available. No need to return.");
        }
    }

    // Method to check the availability status of the book
    public boolean isBookAvailable() {
        return isAvailable;
    }

    public static void main(String[] args) {
        // Create a LibraryBook object
        Library book = new Library("The Great Gatsby", "F. Scott Fitzgerald");

        // Borrow the book
        book.borrowBook();

        // Try to borrow the book again (should display "unavailable" message)
        book.borrowBook();

        // Return the book
        book.returnBook();

        // Try to return the book again (should display "already available" message)
        book.returnBook();

        // Check the availability status of the book
        boolean available = book.isBookAvailable();
        System.out.println("Book Availability: " + (available ? "Available" : "Unavailable"));
    }
}
