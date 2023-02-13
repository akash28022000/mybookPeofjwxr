package com.springbook.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Members {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int memeber_id  ;
	
	private String name;
	
	private LocalDateTime memebership_date;  
	
	
	private String username;  
	
	private String password; 
	
	@OneToOne(mappedBy = "members")
	private Book_issue book_issue;

	public int getMemeber_id() {
		return memeber_id;
	}

	public void setMemeber_id(int memeber_id) {
		this.memeber_id = memeber_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getMemebership_date() {
		return memebership_date;
	}

	public void setMemebership_date(LocalDateTime memebership_date) {
		this.memebership_date = memebership_date;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Book_issue getBook_issue() {
		return book_issue;
	}

	public void setBook_issue(Book_issue book_issue) {
		this.book_issue = book_issue;
	}

	public Members(int memeber_id, String name, LocalDateTime memebership_date, String username, String password,
			Book_issue book_issue) {
		super();
		this.memeber_id = memeber_id;
		this.name = name;
		this.memebership_date = memebership_date;
		this.username = username;
		this.password = password;
		this.book_issue = book_issue;
	}

	public Members() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Members [memeber_id=" + memeber_id + ", name=" + name + ", memebership_date=" + memebership_date
				+ ", username=" + username + ", password=" + password + ", book_issue=" + book_issue + "]";
	}
	
}
