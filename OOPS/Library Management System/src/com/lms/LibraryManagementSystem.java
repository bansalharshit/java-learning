package com.lms;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Adding Some Initial Books
        library.addBook(new Book("Mind Management","Swami Mukundanandan"));
        library.addBook(new Book("Deep Work","Cal Newport"));
        library.addBook(new Book("Java Basics", "James Gosling"));

        // Add User
        Admin admin = new Admin("Alice",1);
        Member member1 = new Member("Harshit",2);

        System.out.println("---- Welcome to the Library Management System ----");
        while(true)
        {
            System.out.println("\n1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show All Book");
            System.out.println("6. Exit");

            System.out.println("Please Choose Your Option");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the Book Title : ");
                    String title = sc.nextLine();
                    System.out.println("Enter the Author Name : ");
                    String author = sc.nextLine();
                    library.addBook(new Book(title,author));
                    break;
                case 2:
                    System.out.println("Enter the Book Title to Search ");
                    String bookTitle = sc.nextLine();
                    library.searchBook(bookTitle);
                    break;
                case 3:
                    System.out.println("Enter the Book Title to Borrow Book ");
                    library.borrowBook(sc.nextLine(),member1);
                    break;
                case 4:
                    System.out.println("Enter the Book Title to Return Book ");
                    library.returnBook(sc.nextLine(),member1);
                    break;
                case 5:
                    System.out.println("\n List of Books Present in Library");
                    library.displayAllBooks();
                    break;
                case 6:
                    System.out.println("Exiting..., Thank You for Using the App");
                    System.exit(0);
                default:
                    System.out.println("Invalid Option ");
            }
        }
    }
}