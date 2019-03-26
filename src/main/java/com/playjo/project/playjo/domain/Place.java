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
    @Column(name="place_no")
    private Long placeNo;

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
    private int ratingAvg;

    @ManyToOne
    @JoinColumn(name = "category_no")
    private Category category;

    @OneToMany(mappedBy = "place",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<PlaceImage> placeImages;

    @OneToMany(mappedBy = "place")
    private List<Review> reivews;

    public Place() {
        regDate = new Date();
        placeImages = new ArrayList<>();
        reivews = new ArrayList<>();
    }
}
