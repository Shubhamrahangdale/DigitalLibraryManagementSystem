# 📚 Digital Library Management System

## 📝 Introduction
The **Digital Library Management System** is a console-based application developed in Java. It provides users with an easy-to-use interface to manage a collection of books. Users can add new books, view the entire collection, search for specific books, update book information, and delete books from the system.

---

## 🌟 Features
- **Add a New Book:** Enter details like ID, title, author, publication year, and availability status.
- **View All Books:** Display all books currently stored in the library.
- **Search for a Book:** Look up a book by its unique ID.
- **Update Book Details:** Modify the book's title, author, publication year, and availability status.
- **Remove a Book:** Delete a book from the collection using its ID.
- **Exit:** Close the application gracefully.

---

## 🛠️ Prerequisites
To run the application, ensure you have the following installed on your system:
- **Java Development Kit (JDK) 8 or higher**
- **Git** (for cloning the repository)

---

## 🚀 Installation and Setup

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd DigitalLibrary
2. **Compile the Java file:**
   --bash
   javac -encoding UTF-8 DigitalLibrary.java
3. **Run the application:**
   --bash
   java DigitalLibrary

## 💡Usage
After running the application, you will be presented with the following menu:
--bash 
Digital Library Management System
1. Add New Book
2. View Book Collection
3. Search Book
4. Update Book Information
5. Delete Book
6. Exit
Select an option:

Select an option by entering the corresponding number.

Follow the prompts to perform the desired action.

## Screenshots:
![2025-03-28 (5)](https://github.com/user-attachments/assets/c5296187-458f-4cf3-a24f-4e2d06fa9800)

![2025-03-28 (6)](https://github.com/user-attachments/assets/9e73840b-4955-4da4-87f4-cef5b523798d)

![2025-03-28 (7)](https://github.com/user-attachments/assets/614d5030-7e82-47d5-b251-392aa1be7c19)

![2025-03-28 (9)](https://github.com/user-attachments/assets/45a6a7dc-1b37-4234-bffd-31df9e50b82d)

## 🚧 Challenges and Reflections
## Challenges Faced
**Encoding Issues:**
         Encountered character encoding problems during compilation.
         Resolved by using the -encoding UTF-8 flag while compiling.
**Error Handling:**
        Implemented robust error handling to manage invalid inputs and unexpected 
        scenarios.
**Data Validation:**
        Ensured that all book details (title, author, and availability status) were correctly formatted and not left empty.


## 🌱 Future Improvements
**Database Integration:**
Integrating a database (e.g., MySQL, MongoDB) to persist book data.

**GUI Enhancement:**
Adding a graphical interface using JavaFX to improve user interaction.

**File-Based Storage:**
Implementing file I/O to save and load the book collection between sessions.

**Enhanced Search:**
Implementing search capabilities by title and author, in addition to the ID.













