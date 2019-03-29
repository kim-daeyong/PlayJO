package com.playjo.project.playjo.repotest;

import com.playjo.project.playjo.domain.Reply;
import com.playjo.project.playjo.domain.Review;
import com.playjo.project.playjo.repository.ReplyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest

public class ReplyRepoTest {
    @Autowired
    ReplyRepository replyRepository;

    @Test
    public void Test() {
    }

    @Test
    public void findAll() {
        List<Reply> all = replyRepository.findAll();
        for (Reply list : all) {
            System.out.println(list);
        }
    }
}