📚 Digital Library Management System
📝 Introduction
The Digital Library Management System is a console-based application developed in Java. It enables users to manage a collection of books by providing features to add, view, search, update, and delete book records. The system ensures data integrity and offers a user-friendly interaction.

🌟 Features
Add a New Book: Enter details like ID, title, author, publication year, and availability status.

View All Books: Display all books currently stored in the library.

Search for a Book: Look up a book by its unique ID.

Update Book Details: Modify the book's title, author, and availability status.

Remove a Book: Delete a book from the collection using its ID.

Exit: Close the application gracefully.

💻 Prerequisites
Java Development Kit (JDK) 8 or higher

Git (for cloning the repository)

🚀 Installation and Setup
Clone the repository:

bash
Copy
Edit
git clone <repository-url>
cd DigitalLibrary
Compile the Java file:

bash
Copy
Edit
javac -encoding UTF-8 DigitalLibrary.java
Run the application:

bash
Copy
Edit
java DigitalLibrary
📂 Usage
Upon running the application, you will see the following menu:

sql
Copy
Edit
Digital Library Management System
1. Add a New Book
2. View All Books
3. Search for a Book
4. Update Book Details
5. Remove a Book
6. Exit
Choose an option:
Simply enter the corresponding number to perform the desired action.

💡 Challenges and Reflections
🚧 Challenges Faced
Encoding Issues:
Encountered problems with special characters during compilation, which was resolved by specifying UTF-8 encoding.

Error Handling:
Implemented robust error handling to manage invalid input and unexpected scenarios.

Data Validation:
Ensured that book details such as title, author, and status were correctly formatted and not left empty.

🔧 Improvements
Database Integration:
Currently, the book data is stored in memory. Integrating a database (e.g., MySQL or MongoDB) would add persistence.

Graphical User Interface (GUI):
Transitioning to a GUI using JavaFX would improve user experience.

File I/O:
Adding file-based storage would allow saving and loading book data between sessions.

Advanced Search:
Implementing search by title or author in addition to ID.
