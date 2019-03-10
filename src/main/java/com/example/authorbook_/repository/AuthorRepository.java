package com.example.authorbook_.repository;

import com.example.authorbook_.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository <Author, Integer>{
}
