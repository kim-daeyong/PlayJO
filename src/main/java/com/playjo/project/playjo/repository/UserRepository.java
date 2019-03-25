package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.email=:email")
    User findMyAccount(@Param("email") String email);
//
//    @Query("SELECT u FROM User u inner join fetch u.wishList WHERE u.email=:email")
//    User findMyCategoryList(@Param("email") String email);

}

