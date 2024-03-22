package com.bookapp;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappBasicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappBasicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
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
