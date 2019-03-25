package com.playjo.project.playjo.repotest;

import com.playjo.project.playjo.domain.User;
import com.playjo.project.playjo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class UserRepoTest {


    @Autowired
    UserRepository userRepository;

    @Test
    public void init(){

    }

    @Test
    public void findAll(){

        List<User> all = userRepository.findAll();
        for(User list : all){
            System.out.println(list);
        }
    }
//
//    @Test
//    public void findMyGrades() throws Exception {
//        Optional<User> user = userRepository.findById(1L);
//        System.out.println(user.get().getEmail());
//    }


}
