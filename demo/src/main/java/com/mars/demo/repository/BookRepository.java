package com.mars.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mars.demo.entitiy.Book;

@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book, Long> {

}
