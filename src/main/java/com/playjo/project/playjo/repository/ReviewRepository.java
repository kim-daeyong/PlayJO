package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    @Query(value = "SELECT re From Review re ORDER BY re.review_no DESC")
    public Page<Review> getReviews(Pageable pageable);


    @Query("SELECT distinct re FROM Review re INNER JOIN FETCH re.place INNER JOIN FETCH re.user LEFT JOIN FETCH re.reviewImg WEHRE re.review_no = :review_no")
    public Review getReview(@Param("review_no") Long review_no);
}
