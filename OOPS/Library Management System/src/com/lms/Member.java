package com.lms;

import java.util.ArrayList;
import java.util.List;

public class Member extends User{

    private List<Book> borrowedBook = new ArrayList<>();
    public static final int MAX_BORROW_LIMIT = 3;// final Variable

    public Member(String name, int id) {
        super(name, id);
    }

    public void borrowBook(Book book)
    {
        if(borrowedBook.size()<MAX_BORROW_LIMIT)
        {
            borrowedBook.add(book);
            System.out.println(name+ " borrowed "+book.getTitle());
        }else
            System.out.println("Borrow Limit Reached!");
    }

    public void returnBook(Book book)
    {
        borrowedBook.remove(book);
        System.out.println(name + " returned "+book.getTitle());
    }

    public int getBorrowedBooksCount() {
        return borrowedBook.size();
    }


    @Override
    public void displayUserDetails()
    {
        System.out.println("Name "+ name + " Id "+id + " Book Borrowed "+borrowedBook.size());
    }

}
