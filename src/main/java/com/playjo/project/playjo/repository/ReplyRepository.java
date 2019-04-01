package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Reply;

import com.playjo.project.playjo.domain.Review;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Long> {



   /* @Query("SELECT rp FROM Reply rp inner join rp.reviewReply rr where rr.id = :id order by rr.id desc")
    Page<Reply> getReplyByReviewNo(@Param("id") Long id, Pageable pageable);
*/
/*
@Query(value = "SELECT rp FROM Reply rp INNER JOIN FETCH rp.content ORDER BY rp.id DESC",
    countQuery = "SELECT count(rp) FROM Reply rp")
    Page<Reply> getReplys(Pageable pageable);

@Query("SELECT distinct rp FROM Reply rp INNER JOIN FETCH rp.reviewReply INNER JOIN FETCH rp.userReply LEFT JOIN FETCH rp.userReply WHERE rp.id = :id")
    public Reply getReply(@Param("id") Long id);
*/
/*@Query("SELECT rp FROM Reply rp inner join rp.reviewReply rr where rr.id order by rr.id desc")
Page<Reply> getReplyByReplyNo(@Param("id")Long id,Pageable pageable);*/




    @Query("SELECT rr FROM Reply rr where rr.reviewReply.id= :id order by rr.id desc")
    Page<Reply> getReplyByReplyNo(@Param("id")Long id,Pageable pageable);

}