package com.bookapp.client;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import service.IBookService;
import service.BookServiceImpl;

import java.util.List;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the name");
        String name=scanner.next();
        IBookService iBookService=new BookServiceImpl();
        List<Book> booksByCategory;
        try {
            booksByCategory=iBookService.getByCategory(name);
            for (Book book:booksByCategory)
                System.out.println(book);
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("*************************");
        String authorName=scanner.next();
        System.out.println("find books by author");
        List<Book> booksByAuthor;
        try {
            booksByAuthor=iBookService.getByAuthorStaetsWith(authorName);
            for (Book book:booksByAuthor)
                System.out.println(book);
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }
    }
}
