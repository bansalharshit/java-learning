# Java File Reader with Exception Handling

This Java application demonstrates how to **read a text file from the system** using `BufferedReader`, while also handling common exceptions like missing files or I/O errors. It ensures that file resources are properly closed using a `finally` block.

---

## ✅ Features

- Reads a file line by line.
- Handles:
  - `FileNotFoundException` (if file is missing).
  - `IOException` (if reading fails).
- Uses `finally` to close resources gracefully.

---

## 🛠️ Requirements

- Java 8 or higher
- Any Java IDE or command-line setup

---

## 📂 Files

- `FileReadWithHandling.java` – main Java source file
- `sample.txt` – text file to be read (place it in the project root)

---

## 🚀 How to Run

1. **Place a text file** (e.g., `sample.txt`) in your project directory.
2. **Compile and run the Java file:**

   ```bash
   javac src/com/frwh/FileReadWithHandling.java
   java com.frwh.FileReadWithHandling
