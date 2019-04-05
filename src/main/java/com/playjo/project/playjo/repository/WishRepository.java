package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Wish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface WishRepository extends JpaRepository<Wish,Long> {

    //아이디의 wish로 지정해둔 place에 해당하는 값으로 불러온다.
    @Query("SELECT w FROM Wish w inner join w.userId u where u.id = :id order by w.id desc")
    Page<Wish> getWishs(@Param("id") Long id, Pageable pageable);



}
