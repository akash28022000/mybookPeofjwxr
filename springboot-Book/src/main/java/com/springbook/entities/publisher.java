package com.springbook.entities;

import java.security.spec.XECPrivateKeySpec;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int publisher_id; 
	
	private String publisher_name;  
	
	@OneToMany(mappedBy = "publisher",cascade = CascadeType.ALL)
	private List<Book> books=new ArrayList<>();

	public int getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}

	public String getPublisher_name() {
		return publisher_name;
	}

	public void setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public publisher(int publisher_id, String publisher_name, List<Book> books) {
		super();
		this.publisher_id = publisher_id;
		this.publisher_name = publisher_name;
		this.books = books;
	}

	public publisher() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "publisher [publisher_id=" + publisher_id + ", publisher_name=" + publisher_name + ", books=" + books
				+ "]";
	}
	
}
