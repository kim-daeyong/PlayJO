package com.playjo.project.playjo.repository.custom;

import com.playjo.project.playjo.domain.QReview;
import com.playjo.project.playjo.domain.Review;
import com.querydsl.jpa.JPQLQuery;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class ReviewRepositoryImpl extends QuerydslRepositorySupport implements ReviewRepositoryCustum {


    public ReviewRepositoryImpl(){
        super(Review.class);

    }

    @Override
    public List<Review> getReviews(Long categoryId, int start, int limit, String searchKind, String searchStr) {

       QReview qReview = QReview.review;
        JPQLQuery<Review> jpqlQuery = from(qReview).innerJoin(qReview.user).fetchJoin()
                                        .innerJoin(qReview.place)

        return null;
    }

    @Override
    public long getReviewCount(String searchKind, String searchStr) {
        return 0;
    }
}
