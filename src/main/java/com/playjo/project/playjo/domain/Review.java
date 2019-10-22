package com.playjo.project.playjo.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "review")
@Setter
@Getter
@ToString
@Builder
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(length = 45)
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
    private User userId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "place_id")
    private Place placeId;

    @OneToMany(mappedBy = "reviewId",fetch=FetchType.LAZY, cascade = {CascadeType.REMOVE})
    private List<Reply> replys;

    @OneToMany(mappedBy = "reviewId",fetch=FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<ReviewImage> reviewImages;

    public Review() {
        regdate = new Date();
        replys = new ArrayList<>();
        reviewImages = new ArrayList<>();
    }

    // 리뷰 리스트에서 짧게 보이는 것
    public String getShortContent(){
        if(content.length() > 100)
            return content.substring(0, 100);
        else
            return content;
    }


        public void addReviewImg(ReviewImage reviewImage) {
        if(reviewImages == null)
            reviewImages = new ArrayList<>();
            reviewImage.setReviewId(this);
            reviewImages.add(reviewImage);
    }

}