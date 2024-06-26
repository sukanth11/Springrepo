package com.bookapp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.Queries;
@Repository
public class IBookRepositoryImpl implements IBookRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addBook(Book book) {
		Object[] bookArr= {book.getTitle(),book.getAuthor(),book.getPrice(),book.getCategory()};
		jdbcTemplate.update(Queries.INSERTQUERY,bookArr);
		
	}

	@Override
	public void updateBook(int bookId, double price) {
		jdbcTemplate.update(Queries.UPDATEQUERY,price,bookId);
		
	}

	@Override
	public void deleteBook(int bookId) {
		jdbcTemplate.update(Queries.DELETEQUERY,bookId);
		
	}

	@Override
	public Book findById(int bookId) throws IdNotFoundException {
		Book book=jdbcTemplate.queryForObject(Queries.SELECTBYIDQUERY,Book.class,bookId);
		return book;
	}

	@Override
	public List<Book> findAll() {
		org.springframework.jdbc.core.RowMapper<Book> mapper=new BookMapper();
		List<Book> books=jdbcTemplate.query(Queries.SELECTQUERY, mapper);
		return books;
	}

	@Override
	public List<Book> findByAuthor(String author) throws BookNotFoundException {
		return jdbcTemplate.query(Queries.SELECTBYAUTHORQUERY,(rs, rowNum)->{
			Book book=new Book();
			book.setAuthor(rs.getString("author"));
			book.setBookid(rs.getInt("book_id"));
			book.setTitle(rs.getString("title"));
			book.setCategory(rs.getString("category"));
			book.setPrice(rs.getDouble("price"));
			return book;
		},author);
	}

	@Override
	public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
		List<Book> books=jdbcTemplate.query(Queries.SELECTBYPRICEQUERY, new BookMapper(),price);
		return books;
	}

	@Override
	public List<Book> findByAuthorCategory(String author, String Category) throws BookNotFoundException {
		List<Book> books=jdbcTemplate.query(Queries.SELECTBYAUTHCATQUERY, new BookMapper(),author,Category);
		return books;
	}

//	@Override
//	public List<Book> findByCategory(String category) throws BookNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Book> findByAuthorCointainsAndCategory(String author, String category) throws BookNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Book> findByAuthorStartsWith(String author) throws BookNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	
}
