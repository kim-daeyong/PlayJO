package com.playjo.project.playjo.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="place")
@Getter
@Setter
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name ="name")
    private String name;

    @Column
    private String value1;

    @Column
    private String value2;

    @Lob
    private String location;

    @Lob
    private String detail;

    @Column(name = "reg_date")
    private Date regDate;

    @Column(name = "read_count")
    private Long readCount;

    @Column(name = "rating_Avg")
    private Double ratingAvg;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categoryid;

    @OneToMany(mappedBy = "placeImg",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<PlaceImage> placeImages;

    @OneToMany(mappedBy = "placeReview")
    private List<Review> reivews;


    @ManyToMany(mappedBy = "places")
    private List<Wish> wishPlace;

    public Place() {
        regDate = new Date();
        placeImages = new ArrayList<>();
        reivews = new ArrayList<>();
        wishPlace = new ArrayList<>();
    }
}
