package com.playjo.project.playjo.repotest;


import com.playjo.project.playjo.domain.Review;
import com.playjo.project.playjo.repository.ReviewRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class ReviewRepoTest {



    @Autowired
    ReviewRepository reviewRepository;

    @Test
    public void init(){

    }

    @Test
    public void findAll(){

        List<Review> all = reviewRepository.findAll();
        for(Review list : all){
            System.out.println(list);
        }
    }
}
