package com.book.example.Books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.example.Books.entity.Book;


@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
