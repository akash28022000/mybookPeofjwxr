package com.springbook.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int book_id;
	
	private String book_titleString;
	
	private  String isbnString;
	
	
	
	private String book_file_name;
	
	private int  borrow_duration;
	
	private  double borrow_price;

	@ManyToOne
	@JoinColumn(name = "publisher_id")
	private publisher publisher; 
	
	@OneToOne(mappedBy ="book")
	
	private Book_issue book_issue;

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_titleString() {
		return book_titleString;
	}

	public void setBook_titleString(String book_titleString) {
		this.book_titleString = book_titleString;
	}

	public String getIsbnString() {
		return isbnString;
	}

	public void setIsbnString(String isbnString) {
		this.isbnString = isbnString;
	}

	public String getBook_file_name() {
		return book_file_name;
	}

	public void setBook_file_name(String book_file_name) {
		this.book_file_name = book_file_name;
	}

	public int getBorrow_duration() {
		return borrow_duration;
	}

	public void setBorrow_duration(int borrow_duration) {
		this.borrow_duration = borrow_duration;
	}

	public double getBorrow_price() {
		return borrow_price;
	}

	public void setBorrow_price(double borrow_price) {
		this.borrow_price = borrow_price;
	}

	public publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(publisher publisher) {
		this.publisher = publisher;
	}

	public Book_issue getBook_issue() {
		return book_issue;
	}

	public void setBook_issue(Book_issue book_issue) {
		this.book_issue = book_issue;
	}

	public Book(int book_id, String book_titleString, String isbnString, String book_file_name, int borrow_duration,
			double borrow_price, com.springbook.entities.publisher publisher, Book_issue book_issue) {
		super();
		this.book_id = book_id;
		this.book_titleString = book_titleString;
		this.isbnString = isbnString;
		this.book_file_name = book_file_name;
		this.borrow_duration = borrow_duration;
		this.borrow_price = borrow_price;
		this.publisher = publisher;
		this.book_issue = book_issue;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_titleString=" + book_titleString + ", isbnString=" + isbnString
				+ ", book_file_name=" + book_file_name + ", borrow_duration=" + borrow_duration + ", borrow_price="
				+ borrow_price + ", publisher=" + publisher + ", book_issue=" + book_issue + "]";
	}
	
}
