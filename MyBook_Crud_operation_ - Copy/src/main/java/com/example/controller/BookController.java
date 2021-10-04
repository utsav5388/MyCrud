package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Book;
import com.example.Service.BookService;

@RestController

public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/add")
	public Book addbook(@RequestBody Book book)
	{
		return bookService.saveBook(book);
	}
	
	//post
	@PostMapping("/addbooks")
	public List<Book> addbook(@RequestBody List<Book> book)
	{
		return bookService.saveBooks(book);
	}
	
	//get
	@GetMapping("/book")
	public List<Book>findallBooks(){
		return bookService.getbook();
	}
	
	//get
	@GetMapping("/book/{id}")
	public Book findbookbyid(@PathVariable int id) {
		return bookService.getbookId(id);
	}
	
	//get
//	@GetMapping("/book/{name}")
//	public Book findbookbyname(@PathVariable String name) {
//		return bookService.getbookName(name);
//	}
	
	//update
	@PutMapping("/update/{id}")
	public void updatebookName(@RequestParam("name") String name,@PathVariable("id") int bookId)
	{
		this.bookService.updateBook(name,bookId);
	}
	
	//delete
	//@DeleteMapping("/delete/{id}")
	
	

    @DeleteMapping(value = "/delete/{Id}")
	public String deleteBook(@PathVariable  int bookId)
	{
		return bookService.deleteBook(bookId);
	}
	
	
	
}
