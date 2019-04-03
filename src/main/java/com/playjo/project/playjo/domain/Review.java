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

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User userReview;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "place_id")
    private Place placeId;

    @OneToMany(mappedBy = "reviewReply",fetch=FetchType.LAZY, cascade = {CascadeType.REMOVE})
    private List<Reply> replys;

    @OneToMany(mappedBy = "reviewId",fetch=FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<ReviewImage> reviewImages;

    public Review() {
        regdate = new Date();
        replys = new ArrayList<>();
        reviewImages = new ArrayList<>();
    }


//        public void addReviewImg(ReviewImage reviewImage) {
//        if(reviewImage == null)
//            reviewImage = new ArrayList<>();
//            reviewImage.setReview(this); // 쌍방향이기 때문에 this를 참조하도록 한다.
//            reviewImage.add(reviewImage);
//    }

}