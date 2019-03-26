package com.playjo.project.playjo.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reply")
@Setter
@Getter
public class Reply {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="reply_no")
    private Long replyNo;


    @Lob
    private String content;

    @Column(length = 255)
    private String nickName;

    @Column(name = "regdate")
    private Date regDate;


    @ManyToOne
    @JoinColumn(name = "review_no")
    @JsonIgnore
    private Review review;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;

    public Reply() {
        regDate = new Date();

        
    }
}
