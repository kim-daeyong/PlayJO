package com.playjo.project.playjo.repotest;


import com.playjo.project.playjo.domain.Notice;
import com.playjo.project.playjo.repository.NoticeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class NoticeRepoTest {


    @Autowired
    NoticeRepository noticeRepository;

    @Test
    public void init(){





    }

    @Test
    public void getNotice() throws Exception{
        Pageable page = PageRequest.of(1, 3);
        Page<Notice> all = noticeRepository.getNotice(page);
        System.out.println("place cate 1");
        System.out.println("전체 건수 : " + all.getTotalElements());
        for(Notice notice : all){
            System.out.println("컨텐츠 : " + notice.getContent());
        }
    }


}
