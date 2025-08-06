package com.lms;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private static int totalBook = 0;

    // constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        totalBook++;
    }
    // getter method to get manipulate the private Member(Variable) of that class


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public static int getTotalBook() {
        return totalBook;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + (isAvailable ? " (Available " : " (Borrowed) ") +
                '}';
    }

}