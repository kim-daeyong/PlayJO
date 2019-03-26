package com.playjo.project.playjo.repotest;


import com.playjo.project.playjo.domain.Place;
import com.playjo.project.playjo.repository.PlaceRepository;
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
public class PlaceRepoTest {

    @Autowired
    PlaceRepository placeRepository;

    @Test
    public void init(){

    }

    @Test
    public void findAll(){

//        List<Place> all = placeRepository.findAll();
//        for(Place list : all){
//            System.out.println(list);
        }

}
