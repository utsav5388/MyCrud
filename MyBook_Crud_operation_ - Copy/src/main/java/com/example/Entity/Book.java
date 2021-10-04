package com.example.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_table")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	
	private String bookName;
	
	private String bookAuthor;
	
	private int bookPages;
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getBookPages() {
		return bookPages;
	}
	public void setBookPages(int bookPages) {
		this.bookPages = bookPages;
	}
	public Book(String bookName, String bookAuthor, int bookId, int bookPages) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookPages = bookPages;
	}
	public Book(int bookId) {
		
		this.bookId = bookId;
	}
	public Book() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "book [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookId=" + bookId + ", bookPages="
				+ bookPages + "]";
	}
	

}
