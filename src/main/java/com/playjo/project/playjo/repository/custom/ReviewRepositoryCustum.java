package com.playjo.project.playjo.repository.custom;

import com.playjo.project.playjo.domain.Review;

import java.util.List;

public interface ReviewRepositoryCustum {


    public List<Review> getReviews(Long categoryId, int start, int limit, String searchKind, String searchStr);
    public long getReviewCount(String searchKind, String searchStr);

}
