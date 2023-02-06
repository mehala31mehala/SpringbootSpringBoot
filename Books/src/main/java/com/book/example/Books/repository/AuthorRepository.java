package com.book.example.Books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.example.Books.entity.Author;


@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {

}
