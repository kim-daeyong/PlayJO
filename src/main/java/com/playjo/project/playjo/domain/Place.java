package com.playjo.project.playjo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "place")
@Setter
@Getter
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long place_no;

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
    private Date regDate;
    @Column(length = 255)
    private Long readcount;
    @Column(length = 5)
    private int ratingAVG;

    @ManyToOne
    @JoinColumn(name = "category_no")
    private Category category;

    @OneToMany(mappedBy = "place")
    private List<Review> reviews;

    @OneToMany(mappedBy = "place",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<PlaceImage> placeImages;

    @ManyToMany
    @JoinTable(name = "wish_has_place",
            joinColumns = {@JoinColumn(name = "place_no",referencedColumnName = "place_no")},
            inverseJoinColumns = {@JoinColumn(name = "wish_no", referencedColumnName = "wish_no")}
    )
    private Set<Wish> wishs;

    public Place() {
        regDate = new Date();
        placeImages = new ArrayList<>();
        wishs = new HashSet<>();

    }
}
