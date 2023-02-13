package com.springbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springbook.dao.BookRepo;
import com.springbook.entities.Book;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private BookRepo bookRepo;
	
	//get all book---->>>
	
	public List<Book>getAllBook()
	{
		List<Book> findAll = this.bookRepo.findAll();
		
		return findAll;
	}
	
	// get by id-->>>
	
	public Book getBookById( int id) {
		
		Book book=null;
		try {
			book=this.bookRepo.getById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	//add the book---->.
	
	public Book addBook(Book book)
	{
		Book save = this.bookRepo.save(book);
		
		return save;
	}
	
	//delete the book--->>
	
	public void dltBook(int bid) {
		bookRepo.deleteById(bid);
	}
	
	//update the book--->.>
	
	public void updateBook(Book book ,int id) {
		
		book.setBook_id(id);
	}
	
	//get the book by order id and book id--->>
	
	//public Book bookByIDAndOrderId(int id,int id2) {
		
	//	bookRepo.ge
	//}
}
