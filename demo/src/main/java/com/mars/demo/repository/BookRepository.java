package com.mars.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mars.demo.entitiy.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
