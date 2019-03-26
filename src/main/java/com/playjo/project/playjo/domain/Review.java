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
    private Long review_no;

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
    @JoinColumn(name = "place_no")
    private Place place;

    @OneToMany(mappedBy = "review")
    private List<Reply> replys;

    @OneToMany(mappedBy = "review",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<ReviewImage> reviewImages;

    public Review() {
        regdate = new Date();
        replys = new ArrayList<>();
        reviewImages = new ArrayList<>();
    }

}