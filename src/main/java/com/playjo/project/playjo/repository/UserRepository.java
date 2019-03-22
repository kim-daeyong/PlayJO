package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT a from User u WHERE u.email = :email")
    public User getUserByEmail(@Param("email") String email);
}

