package com.playjo.project.playjo.repotest;


import com.playjo.project.playjo.domain.Review;
import com.playjo.project.playjo.repository.ReviewRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.data.domain.Pageable;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ReviewRepoTest {

    @Autowired
    ReviewRepository reviewRepository;

    @Test
    public void init() {

    }

    @Test
    public void getReviewsByPlaceNo() throws Exception {
        Pageable page = PageRequest.of(1, 5);
        Page<Review> all = reviewRepository.getReviewsByPlaceNo(1L, page);
        System.out.println("Review 1");
       /* System.out.println("리뷰 전체 : "+all.getTotalElements());
        for(Review review : all){
            System.out.println("NAME "+review.getNickName());*/

    }
}





   /*     @Test
        public void getReviews() throws Exception{
            Pageable pageable = PageRequest.of(0,5);
            Page<Review> reviews = reviewRepository.getReviews(pageable);


        }*//*


    }*/
/*
    @Test
    public void getReviews() throws Exception{

        Page<Review> reviews = reviewRepository.getReviews(pageable);
        for(Review review : reviews){
            System.out.println(review.getTitle());
*/