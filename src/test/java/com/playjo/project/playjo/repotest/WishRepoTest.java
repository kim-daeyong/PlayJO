package com.playjo.project.playjo.repotest;


import com.playjo.project.playjo.domain.Wish;
import com.playjo.project.playjo.repository.WishRepository;
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
public class WishRepoTest {



    @Autowired
    WishRepository wishRepository;

    @Test
    public void init(){

    }

    @Test
    public void findAll(){

        List<Wish> all = wishRepository.findAll();
        for(Wish list : all){
            System.out.println(list);
        }
    }
}
