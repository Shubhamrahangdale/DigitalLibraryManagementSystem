import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

// Class to represent a book in the library
class LibraryBook {
    private String title;
    private String author;
    private int year;
    private String status;

    public LibraryBook(String title, String author, int year, String status) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty.");
        }
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be empty.");
        }
        if (!status.equalsIgnoreCase("Available") && !status.equalsIgnoreCase("Checked Out")) {
            throw new IllegalArgumentException("Status must be either 'Available' or 'Checked Out'.");
        }
        this.title = title;
        this.author = author;
        this.year = year;
        this.status = status;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public String getStatus() { return status; }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty.");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be empty.");
        }
        this.author = author;
    }

    public void setStatus(String status) {
        if (!status.equalsIgnoreCase("Available") && !status.equalsIgnoreCase("Checked Out")) {
            throw new IllegalArgumentException("Status must be either 'Available' or 'Checked Out'.");
        }
        this.status = status;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year + ", Status: " + status;
    }
}

// Main class for the Digital Library System
public class DigitalLibrary {
    private static final Map<Integer, LibraryBook> libraryCollection = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(DigitalLibrary.class.getName());

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nDigital Library Management System");
            System.out.println("1. Add a New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search for a Book");
            System.out.println("4. Update Book Details");
            System.out.println("5. Remove a Book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = getIntInput();
            switch (choice) {
                case 1 -> addBook();
                case 2 -> viewBooks();
                case 3 -> searchBook();
                case 4 -> updateBook();
                case 5 -> deleteBook();
                case 6 -> {
                    logger.info("Thank you for using the Digital Library!");
                    scanner.close();
                    return;
                }
                default -> logger.warning("Invalid choice! Please select a valid option.");
            }
        }
    }

    // Method to add a new book
    private static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = getIntInput();

        if (libraryCollection.containsKey(id)) {
            logger.warning("A book with this ID already exists!");
            return;
        }

        System.out.print("Enter Book Title: ");
        String title = getNonEmptyInput("Title");

        System.out.print("Enter Author: ");
        String author = getNonEmptyInput("Author");

        System.out.print("Enter Publication Year: ");
        int year = getIntInput();

        System.out.print("Enter Availability Status (Available/Checked Out): ");
        String status = getValidStatusInput();

        libraryCollection.put(id, new LibraryBook(title, author, year, status));
        logger.info("Book added successfully!");
    }

    // Method to validate status input
    private static String getValidStatusInput() {
        while (true) {
            String status = scanner.nextLine().trim();
            if (status.equalsIgnoreCase("Available") || status.equalsIgnoreCase("Checked Out")) {
                return status;
            }
            logger.warning("Status must be either 'Available' or 'Checked Out'. Please enter a valid status: ");
        }
    }

    // Method to view all books
    private static void viewBooks() {
        if (libraryCollection.isEmpty()) {
            logger.info("No books available in the library.");
        } else {
            logger.info("\nLibrary Collection:");
            libraryCollection.forEach((id, book) -> 
                logger.info("ID: " + id + " -> " + book));
        }
    }

    // Method to search for a book by ID
    private static void searchBook() {
        System.out.print("Enter Book ID to search: ");
        int id = getIntInput();

        LibraryBook book = libraryCollection.get(id);
        if (book != null) {
            logger.info("Book Found: " + book);
        } else {
            logger.warning("No book found with this ID.");
        }
    }

    // Method to update book details
    private static void updateBook() {
        System.out.print("Enter Book ID to update: ");
        int id = getIntInput();

        LibraryBook book = libraryCollection.get(id);
        if (book == null) {
            logger.warning("No book found with this ID.");
            return;
        }

        System.out.print("Enter new Book Title (leave blank to keep current): ");
        String newTitle = scanner.nextLine().trim();
        if (!newTitle.isEmpty()) {
            book.setTitle(newTitle);
        }

        System.out.print("Enter new Author (leave blank to keep current): ");
        String newAuthor = scanner.nextLine().trim();
        if (!newAuthor.isEmpty()) {
            book.setAuthor(newAuthor);
        }

        System.out.print("Enter new Availability Status (Available/Checked Out, leave blank to keep current): ");
        String newStatus = scanner.nextLine().trim();
        if (!newStatus.isEmpty() && (newStatus.equalsIgnoreCase("Available") || newStatus.equalsIgnoreCase("Checked Out"))) {
            book.setStatus(newStatus);
        }

        logger.info("Book details updated successfully!");
    }

    // Method to delete a book
    private static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int id = getIntInput();

        if (libraryCollection.remove(id) != null) {
            logger.info("Book removed successfully!");
        } else {
            logger.warning("No book found with this ID.");
        }
    }

    // Helper method for safe integer input
    private static int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                logger.warning("Invalid input! Please enter a valid number: ");
            }
        }
    }

    // Helper method for non-empty string input
    private static String getNonEmptyInput(String fieldName) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            logger.warning(fieldName + " cannot be empty. Please enter a valid input: ");
        }
    }
}
