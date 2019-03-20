package com.playjo.project.playjo.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "reply")
@Setter
@Getter
public class Reply {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reply_no;


    @Lob
    @Column(name="content", length=512)
    private String content;

    @Column(length = 255)
    private String nickName;


    @ManyToOne
    @JoinColumn(name = "review_no")
    @JsonIgnore
    private Review review;

    @Column(name = "regdate")
    private Date regDate;

    public Reply() {
        regDate = new Date();
    }
}
