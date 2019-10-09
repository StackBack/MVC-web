package com.example.myproject.repository;

import com.example.myproject.domain.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends JpaRepository<CustomUser, Long> {
    CustomUser findByLogin(@Param("login") String login);
    boolean existsByEmail(@Param("email") String email);
    boolean existsByLogin(@Param("login") String login);
}
