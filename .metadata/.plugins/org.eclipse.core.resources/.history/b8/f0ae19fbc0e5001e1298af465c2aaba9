package service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import util.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements IBookService {
    @Override
    public List<Book> getAll() {
        List<Book> books= BookDetails.showBooks();
        return books;
    }

    @Override
    public List<Book> getByAuthorStaetsWith(String author) throws BookNotFoundException {
        List<Book> books=BookDetails.showBooks();
        List<Book> bookByAuthor=new ArrayList<>();
        for (Book book:books){
            if (book.getAuthor().startsWith(author))
                bookByAuthor.add(book);
        }
        if (bookByAuthor.isEmpty())
            throw new BookNotFoundException("book by this author not found");
        return bookByAuthor;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> books=BookDetails.showBooks();
        List<Book> bookByCategory=new ArrayList<>();
        for (Book book:books){
            if (book.getCatagory().startsWith(category))
                bookByCategory.add(book);
        }
        if (bookByCategory.isEmpty())
            throw new BookNotFoundException("book not found by category");
        return bookByCategory;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> books=BookDetails.showBooks();
        List<Book> bookByPrice=new ArrayList<>();
        for (Book book:books){
            if (book.getPrice()<=price)
                bookByPrice.add(book);
        }
        if (bookByPrice.isEmpty())
            throw new BookNotFoundException("book not found price less than");
        return bookByPrice;
    }

    @Override
    public List<Book> getByAuthorCointainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> books=BookDetails.showBooks();
        List<Book> bookByAuthorAndCategory=new ArrayList<>();
        for (Book book:books){
            if (book.getAuthor().equals(author)&& book.getCatagory().equals(category))
                bookByAuthorAndCategory.add(book);
        }
        if (bookByAuthorAndCategory.isEmpty())
            throw new BookNotFoundException("book not found author and category");
        return bookByAuthorAndCategory;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        List<Book> books=BookDetails.showBooks();
        for (Book book:books){
            if (book.getBookid()==(bookId))
                return book;
        }
        return null;
    }
}
