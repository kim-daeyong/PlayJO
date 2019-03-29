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

    /*  @Query(value = "SELECT re FROM Reply re INNER JOIN FETCH re.review ORDER BY re.replyNo DESC",
              countQuery = "SELECT count(re) FROM Reply re")
      public Page<Reply> getReviews(Pageable pageable);

      @Query("SELECT distinct re FROM Reply re INNER JOIN FETCH re.review INNER JOIN FETCH re.user LEFT JOIN FETCH re.user WHERE re.replyNo = :replyNo")
      public Reply getReply(@Param("replyNO") Long replyNo);

  */



//    @Query("SELECT r From Reply r WHERE r.review.review_no = :review_no")
//    public List<Reply> getReply(@Param("review_no") Long review_no);


/*    @Query("SELECT re FROM Reply re WHERE re.review.reviewNo = :reviewNo")
    public List<Reply> getReplys(@Param("reviewNo")Long reviewNo);*/
}