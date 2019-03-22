package com.playjo.project.playjo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "place")
@Setter
@Getter

public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int board_no;

    @Column(length = 255)
    private String name;
    @Column(length = 255)
    private String value1;
    @Column(length = 255)
    private String value2;
    @Column(length = 255)
    private String location;
    @Column(length = 255)
    private String explain;
    @Column(name = "regdate")
    private Date regdate;
    @Column(length = 255)
    private Long readcount;
    @Column(length = 5)
    private int ratingAVG;

    @ManyToOne
    @JoinColumn(name = "category")
    private List<Category> category_no;


    @OneToMany(mappedBy = "placeImage")
    private List<PlaceImage> placeImage;

    @OneToMany(mappedBy = "review")
    private List<Review> review_no;

    @OneToMany(mappedBy = "place",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<PlaceImage> placeimage;

    public Place() {
        regdate = new Date();
        category_no = new ArrayList<>();
        placeImage = new ArrayList<>();

    }
}
