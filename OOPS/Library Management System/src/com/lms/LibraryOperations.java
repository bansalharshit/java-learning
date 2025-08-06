package com.lms;

public interface LibraryOperations {
    void addBook(Book book);
    void searchBook(String title);
    void borrowBook(String title,User user);
    void returnBook(String title,User user);
}
