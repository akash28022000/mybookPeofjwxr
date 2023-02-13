package com.springbook.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Book_is_order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int order_id; 
	
	private double totel_amount ;
	
	private String order_staus ;
	
	@OneToOne(mappedBy ="book_is_order" )
	private Book_issue  book_issue;

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public double getTotel_amount() {
		return totel_amount;
	}

	public void setTotel_amount(double totel_amount) {
		this.totel_amount = totel_amount;
	}

	public String getOrder_staus() {
		return order_staus;
	}

	public void setOrder_staus(String order_staus) {
		this.order_staus = order_staus;
	}

	public Book_issue getBook_issue() {
		return book_issue;
	}

	public void setBook_issue(Book_issue book_issue) {
		this.book_issue = book_issue;
	}

	public Book_is_order(int order_id, double totel_amount, String order_staus, Book_issue book_issue) {
		super();
		this.order_id = order_id;
		this.totel_amount = totel_amount;
		this.order_staus = order_staus;
		this.book_issue = book_issue;
	}

	public Book_is_order() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book_is_order [order_id=" + order_id + ", totel_amount=" + totel_amount + ", order_staus=" + order_staus
				+ ", book_issue=" + book_issue + "]";
	}
	
}
