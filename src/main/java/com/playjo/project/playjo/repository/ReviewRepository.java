package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReviewRepository extends JpaRepository<Review, Long>{

 /*   @Query(value = "SELECT r FROM Review r INNER JOIN FETCH r.place ORDER BY r.reviewNo DESC",
            countQuery = "Select count(r) FROM Review r")
    public Page<Review> getReviews(Pageable pageable);*/




//    @Query(value = "SELECT re From Review re ORDER BY re.review_no DESC")
//    public Page<Review> getReviews(Pageable pageable);
//
//    @Query("SELECT distinct re FROM Review re INNER JOIN FETCH re.place INNER JOIN FETCH re.user LEFT JOIN FETCH re.reviewImg WEHRE re.review_no = :review_no")
//    public Review getReview(@Param("review_no") Long review_no);

/*    @Query(value = "SELECT r FROM Review r INNER JOIN FETCH r.place ORDER BY r.reviewNo DESC",
            countQuery = "SELECT count(r) FROM Review r")
    public Page<Review> getReviews(Pageable pageable);

    @Query("SELECT distinct r FROM Review r INNER JOIN FETCH r.place INNER JOIN FETCH r.user LEFT JOIN FETCH r.reviewImages WHERE r.reviewNo = :reviewNo")
    public Review getReview(@Param("reviewNo") Long reviewNo);*/
@Query("SELECT r FROM Review r inner join r.placeReview re where re.id = :id order by r.id desc")
    Page<Review> getReviewsByPlaceNo(@Param("id")Long id,Pageable pageable);

}