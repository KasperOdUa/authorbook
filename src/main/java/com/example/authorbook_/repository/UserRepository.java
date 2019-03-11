package com.example.authorbook_.repository;

import com.example.authorbook_.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
