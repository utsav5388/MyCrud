package com.example.Service;

import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Book;
import com.example.Repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	private BookRepo repository;
	
	public Book saveBook(Book book) {
		return repository.save(book);
	}
	
	public List<Book> saveBooks(List<Book>books) {
		return repository.saveAll(books);
	}
	
	public List<Book> getbook(){
		return repository.findAll();
	}
	
	
	public Book getbookId(int bookid){
		return repository.getById(bookid);
	}
	
	//get
//	public Book getbookName(String bookName){
	//	return repository.findbyName (bookName);
	//}
	
	//delete
	/*
	 * public String deleteBook(int bookid) { repository.deleteById(bookid); return
	 * "delete"+bookid;
	 * 
	 * }
	 */
	//update
	public void updateBook(String name, int bookid)
	{
		Book book2 = repository.findById(bookid).get();
		book2.setBookName(name);
		repository.save(book2);
	}

	public String deleteBook(int bookid) {

		 repository.deleteById(bookid);
		 return "delete"+bookid;
		 
	}
	
	
	

}
