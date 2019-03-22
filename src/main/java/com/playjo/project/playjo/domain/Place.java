package com.playjo.project.playjo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "place")
@Setter
@Getter

public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardNo;

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
    private List<Review> reviewNo;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "place_wish",
            joinColumns = {@JoinColumn(name = "place_no",referencedColumnName = "place_no")},
            inverseJoinColumns = {@JoinColumn(name = "wish_no", referencedColumnName = "wish_no")}
    )
    private Set<Wish> wish;

    public Place() {
        regdate = new Date();
        category_no = new ArrayList<>();
        placeImage = new ArrayList<>();

    }
}
