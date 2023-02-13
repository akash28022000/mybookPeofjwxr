package com.springbook.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.springbook.entities.Book;

public interface BookRepo  extends JpaRepository<Book, Integer>{
	
//@Query("select b FROM Book b AND B1 FROM Book_is_order WHERE b.Book=:n and B1.BOOK=:p")
//	public List<Book> findByIdAndOrderId(@Param("n")Book book,@Param("b")Book book2);

}
