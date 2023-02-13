package com.springbook.entities;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Book_issue {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int book_issue_id ;  
	
 
	
	
	
	private  LocalDateTime issue_date; 
	
	private LocalDateTime return_date;
	
	private double borrow_amount;
	
	private  double late_return_fee_amount;
	
	@OneToOne
	@JoinColumn(name="order_id")
	private  Book_is_order book_is_order;

	@OneToOne(mappedBy = "")
	@JoinColumn(name = "book_id")
	private Book book;
	
	@OneToOne
	@JoinColumn(name = "member_id")
	private Members members;

	public int getBook_issue_id() {
		return book_issue_id;
	}

	public void setBook_issue_id(int book_issue_id) {
		this.book_issue_id = book_issue_id;
	}

	public LocalDateTime getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(LocalDateTime issue_date) {
		this.issue_date = issue_date;
	}

	public LocalDateTime getReturn_date() {
		return return_date;
	}

	public void setReturn_date(LocalDateTime return_date) {
		this.return_date = return_date;
	}

	public double getBorrow_amount() {
		return borrow_amount;
	}

	public void setBorrow_amount(double borrow_amount) {
		this.borrow_amount = borrow_amount;
	}

	public double getLate_return_fee_amount() {
		return late_return_fee_amount;
	}

	public void setLate_return_fee_amount(double late_return_fee_amount) {
		this.late_return_fee_amount = late_return_fee_amount;
	}

	public Book_is_order getBook_is_order() {
		return book_is_order;
	}

	public void setBook_is_order(Book_is_order book_is_order) {
		this.book_is_order = book_is_order;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Members getMembers() {
		return members;
	}

	public void setMembers(Members members) {
		this.members = members;
	}

	public Book_issue(int book_issue_id, LocalDateTime issue_date, LocalDateTime return_date, double borrow_amount,
			double late_return_fee_amount, Book_is_order book_is_order, Book book, Members members) {
		super();
		this.book_issue_id = book_issue_id;
		this.issue_date = issue_date;
		this.return_date = return_date;
		this.borrow_amount = borrow_amount;
		this.late_return_fee_amount = late_return_fee_amount;
		this.book_is_order = book_is_order;
		this.book = book;
		this.members = members;
	}

	public Book_issue() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book_issue [book_issue_id=" + book_issue_id + ", issue_date=" + issue_date + ", return_date="
				+ return_date + ", borrow_amount=" + borrow_amount + ", late_return_fee_amount="
				+ late_return_fee_amount + ", book_is_order=" + book_is_order + ", book=" + book + ", members="
				+ members + "]";
	}
	
}
