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
    @Column(name="id")
    private Long id;


    @Lob
    private String content;

    @Column(length = 255)
    private String nickName;

    @Column(name = "regdate")
    private Date regDate;


    @ManyToOne
    @JoinColumn(name = "review_id")
    @JsonIgnore
    private Review reviewReply;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userReply;

    public Reply() {
        regDate = new Date();

        
    }
}
