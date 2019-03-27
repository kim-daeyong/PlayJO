package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Wish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WishRepository extends JpaRepository<Wish,Long> {

    @Query("SELECT w FROM Wish w WHERE w.userNO=:userNo")
    List<Wish> wishByUserNo(@Param("user_no") Long userNo);

}
