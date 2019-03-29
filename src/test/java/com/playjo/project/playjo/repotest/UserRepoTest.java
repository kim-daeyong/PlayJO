package com.playjo.project.playjo.repotest;

import com.playjo.project.playjo.domain.User;
import com.playjo.project.playjo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepoTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void init() {

    }

    @Test
    public void findAll() throws Exception {
        List<User> all = userRepository.findAll();
        for (User list : all) {
            System.out.println(list.getEmail());
        }
    }

    /*  @Test
      public void findById() {
          Optional<User> user = userRepository.findById(2L);
          System.out.println(user.get().getEmail());
      }*/
/*
    @Test
    public void placeByEmail() throws Exception {

    }

    @Test
    public void findReply() {

    }
*/

//
//    @Test
//    public void findMyGrades() throws Exception {
//        Optional<User> user = userRepository.findById(1L);
//        System.out.println(user.get().getEmail());
//    }


}