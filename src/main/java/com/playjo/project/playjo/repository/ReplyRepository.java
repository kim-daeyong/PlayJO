package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Reply;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

    @Query("SELECT rr FROM Reply rr where rr.review.id = :id order by rr.id desc")
    Page<Reply> getReplyByReplyNo(@Param("id")Long id, Pageable pageable);
}

