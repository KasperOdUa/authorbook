package com.example.authorbook_.repository;

import com.example.authorbook_.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

List<Book> findAllByAuthorId(int authorId);


}