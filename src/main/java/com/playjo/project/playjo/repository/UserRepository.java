package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Review;
import com.playjo.project.playjo.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {


/*
    @Query("SELECT u FROM User u inner join u.email p where p.id = :id order by r.id desc")
    Page<User> getUserByEmail(@Param("id")Long id, Pageable pageable);
*/
/*
@Query("SELECT u from User u WHERE U.email = :email")
    public User getUserByEmail(@Param("email") String email);
*/


}