package com.book.example.Books.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.example.Books.entity.Author;
import com.book.example.Books.repository.AuthorRepository;
import com.book.example.Books.repository.BookRepository;

@Service
public class AuthorService {
	@Autowired
	private AuthorRepository authorRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	public String save(Author author) {
		authorRepository.saveAndFlush(author);
		return "ok";
	}

}
