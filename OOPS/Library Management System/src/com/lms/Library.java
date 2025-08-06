package com.lms;
import java.util.*;
public class Library implements LibraryOperations{
    private ArrayList<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book)
    {
        books.add(book);
        System.out.println(book.getTitle()+ " added to Library. ");
    }

    @Override
    public void searchBook(String title)
    {
        for(Book book:books)
        {
            if(book.getTitle().equalsIgnoreCase(title))
            {
                System.out.println(book);
                return;
            }
        }
        System.out.println(title + " book not found");
    }

    @Override
    public void borrowBook(String title,User user)
    {
        if(user instanceof Member)
        {
            Member member = (Member) user;
            for(Book book : books)
            {
                if(book.getTitle().equalsIgnoreCase(title) && book.isAvailable())
                {
                    // Checking Borrow Limit Before Marking the Book Unavailbe
                    if(member.getBorrowedBooksCount()<Member.MAX_BORROW_LIMIT)
                    {
                        book.setAvailable(false);
                        member.borrowBook(book);
                        System.out.println("You have Borrowed Book "+ title);

                    }else
                    {
                        System.out.println("Borrow limit reached! Cannot borrow more than " + Member.MAX_BORROW_LIMIT + " books.");
                    }
                    return;
                }
            }
        }

        System.out.println(title + " book is not available for Borrowing");
    }

    public void returnBook(String title,User user)
    {
        for(Book book : books)
        {
            if(book.getTitle().equalsIgnoreCase(title) && !book.isAvailable())
            {
                book.setAvailable(true);
                System.out.println("You have Successfully Return the Book "+ title);
                if(user instanceof Member)
                    ((Member) user).returnBook(book);
                return;
            }
        }
        System.out.println("Invalid Book Return Attempt");
    }

    public void displayAllBooks()
    {
        for(Book book: books)
        {
            System.out.println(book);
        }
        System.out.println("Total Number of Books: "+Book.getTotalBook());
    }
}
