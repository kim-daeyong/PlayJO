package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

    @Query("SELECT r From Reply r WHERE r.review.review_no = :review_no")
    public List<Reply> getReply(@Param("review_no") Long review_no);
}

