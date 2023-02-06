package com.book.example.Books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.example.Books.entity.Author;
import com.book.example.Books.service.AuthorService;

@RestController
public class BookController {
	@Autowired
	public AuthorService authorService;
	
	@PostMapping("/post")
	private String save(@RequestBody Author author) {
		authorService.save(author);
		return "done";
	}
	

}
