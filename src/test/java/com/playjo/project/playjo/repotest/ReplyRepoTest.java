package com.playjo.project.playjo.repotest;

import com.playjo.project.playjo.domain.Reply;
import com.playjo.project.playjo.domain.Review;
import com.playjo.project.playjo.repository.ReplyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest

public class ReplyRepoTest {
    @Autowired
    ReplyRepository replyRepository;

    @Test
    public void init() {
    }

   @Test
    public void getReplyByReviewNo() throws Exception{
        Pageable page = PageRequest.of(1,5);
        Page<Reply> all = replyRepository.findAll(page);

        System.out.println("review");
        for (Reply list : all) {
            System.out.println(list);
        }
    }

    @Test
    public void getReplyByReplyNo() throws Exception {
        Pageable page = PageRequest.of(1, 5);
        Page<Reply> all = replyRepository.getReplyByReplyNo(1L,page);
        System.out.println("Reply 1");
        System.out.println("리뷰의 댓글 : "+all.getTotalElements());
        for(Reply reply : all){
            System.out.println("NAME: " + reply.getNickName());
            System.out.println("NAME: " + reply.getContent());
        }
    }

}