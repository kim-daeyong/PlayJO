package com.playjo.project.playjo.repotest;


import com.playjo.project.playjo.domain.Place;
import com.playjo.project.playjo.repository.PlaceRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

//    @Test
//    public void findAll() {
//
//        List<Place> all = placeRepository.findAll();
//        for (Place list : all) {
//            System.out.println(list);
//        }
//    }


//    @Test
//    public void getPlaceCateOrderByRating() throws Exception{
//        Pageable page = PageRequest.of(1, 3);
//        Page<Place> all = placeRepository.getPlacesRatingByCateNo(1, page);
//        System.out.println("place cate 1");
//        System.out.println("전체 건수 : " + all.getTotalElements());
//        for(Place place : all){
//            System.out.println("Name,위치 : " + place.getName()+ " " + place.getLocation());
//            System.out.println(" ratingave : " + place.getRatingAvg());
//        }
//    }

//    @Test
//    public void getPlaceCateOrderByRating() throws Exception{
//        Pageable page = PageRequest.of(1, 3);
//        Page<Place> all = placeRepository.getPlaces(page);
//        System.out.println("place cate 1");
//        System.out.println("전체 건수 : " + all.getTotalElements());
//        for(Place place : all){
//            System.out.println("Name,위치 : " + place.getName()+ " " + place.getLocation());
//            System.out.println(" readCount : " + place.getRatingAvg());
//            System.out.println(" view : " + place.getReadCount());
//        }
//    }





//    @Test
//    public void getPlaces() throws Exception{
//
//    Pageable pageable = PageRequest.of(0,5);
//    Page<Place> posts = placeRepository.getPlaces(pageable);
////        Assert.assertEquals(5, posts.getSize());
//        for(Place post : posts){
//        System.out.println(post.getName());
//        System.out.println(post.getCategoryid().getCateName());
//    }
//}



}
