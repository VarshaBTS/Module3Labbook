package com.jpastart.lab2;

import java.util.List;


public class AuthorBookServiceImpl implements AuthorBookService {

	AuthorBookDAOImpl dao= new AuthorBookDAOImpl();
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getBooksByAuthor(String author_name) {
		// TODO Auto-generated method stub
		return dao.getBooksByAuthor(author_name);
	}

	@Override
	public List<Book> getBooksByPriceRange(double min, double max) {
		// TODO Auto-generated method stub
		if(min>=0&&max>0&&min<max)
			return dao.getBooksByPriceRange(min, max);
		else
			return null;
	}

	@Override
	public List<String> getAuthorName(long b_id) {
		// TODO Auto-generated method stub
		if(b_id>0)
			return dao.getAuthorName(b_id);
		else
			return null;
	}

}
