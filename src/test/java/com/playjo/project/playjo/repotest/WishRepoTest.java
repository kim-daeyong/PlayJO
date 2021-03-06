package com.playjo.project.playjo.repotest;


import com.playjo.project.playjo.domain.Place;
import com.playjo.project.playjo.domain.Wish;
import com.playjo.project.playjo.repository.WishRepository;
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
import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class WishRepoTest {


    @Autowired
    WishRepository wishRepository;

    @Test
    public void init() {

    }

//    @Test
//    public void findAll() {
//
//        List<Wish> all = wishRepository.findAll();
//        for (Wish list : all) {
//            System.out.println(list.getLocation()+list.getName());
//        }
//    }
//    @Test
//    public void findById() {
//        Optional<Wish> wish = wishRepository.findById(2L);
//        System.out.println(wish.get().getLocation()+wish.get().getName());
//    }

//    @Test
//    public void wishByUserNo() throws Exception {
//        List<Wish> all = wishRepository.wishByUserNo(2L);
//        for (Wish list : all) {
//            System.out.println(list.getLocation()+list.getName());
//        }
//    }

    @Test
    public void getWishList() throws Exception{
        Pageable page = PageRequest.of(1, 3);
        Page<Wish> all = wishRepository.getWishs(1L, page);
        System.out.println("wish");
        System.out.println("전체 건수 : " + all.getTotalElements());
        for(Wish wish : all){
            System.out.println("Name,위치 : " + wish.getName()+ " " + wish.getLocation());
        }
    }


}