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
    @JoinColumn(name = "cotegory_no")
    private List<Category> category;




    @OneToMany(mappedBy = "review_no")
    private List<Review> reviews;

    @OneToMany(mappedBy = "place",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<PlaceImage> placeImages;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "place_wish",
            joinColumns = {@JoinColumn(name = "place_no",referencedColumnName = "place_no")},
            inverseJoinColumns = {@JoinColumn(name = "wish_no", referencedColumnName = "wish_no")}
    )
    private Set<Wish> wish;

    public Place() {
        regdate = new Date();
        category = new ArrayList<>();
        placeImages = new ArrayList<>();

    }
}
