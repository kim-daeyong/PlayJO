package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Wish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface WishRepository extends JpaRepository<Wish,Long> {
//    @Query("select w from Wish w where w.email = :email")
//    public Wish getWishByName(@Param("email")String name);
}
