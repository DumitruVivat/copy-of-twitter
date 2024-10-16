package com.example.copyoftwitter.repository;

import com.example.copyoftwitter.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String email);
}
