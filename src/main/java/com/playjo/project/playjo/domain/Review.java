package com.playjo.project.playjo.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "review")
@Setter
@Getter
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long board_no;

    @Column(length = 255)
    private String nickName;

    @Column
    private int rating;

    @Column(length = 255)
    private String title;

    @Lob
    private String content;

    @Column(name = "regdate")
    private Date regdate;


    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;

    @ManyToOne
    @JoinColumn(name = "board_no")
    private Place Place;

    @OneToMany(mappedBy = "review")
    private List<Reply> reply;

    @OneToMany(mappedBy = "review",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<ReviewImage> reviewImage;


    public Review() {
        regdate = new Date();
        reply = new ArrayList<>();
        reviewImage = new ArrayList<>();
    }

}