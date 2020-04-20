package com.jpastart.lab2;

import java.util.List;



public interface AuthorBookDAO {
	
	public List<Book> getAllBooks();
	
	public List<Book> getBooksByAuthor(String author_name);
	
	public List<Book> getBooksByPriceRange(double min,double max);
	
	public List<String> getAuthorName(long b_id);
}
