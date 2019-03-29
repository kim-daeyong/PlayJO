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
    @Column(name="id")
    private Long id;

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
    @JoinColumn(name = "user_id")
    private User userReview;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place placeReview;

    @OneToMany(mappedBy = "reviewReply", cascade = {CascadeType.REMOVE})
    private List<Reply> replys;

    @OneToMany(mappedBy = "reviewImg",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<ReviewImage> reviewImages;

    public Review() {
        regdate = new Date();
        replys = new ArrayList<>();
        reviewImages = new ArrayList<>();
    }

}