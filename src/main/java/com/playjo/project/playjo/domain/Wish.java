package com.playjo.project.playjo.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "wish")
@Setter
@Getter
@ToString
@Builder
public class Wish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(length = 45)
    public String category;
    @Column(length = 255)
    private String name;
    @Lob
    private String location;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User userId;

//
//    @ManyToMany
//    @JoinTable(name = "wishplace",
//            joinColumns = {@JoinColumn(name = "wish_wish_no",referencedColumnName = "wish_no")},
//            inverseJoinColumns = {@JoinColumn(name = "place_place_no", referencedColumnName = "place_no")}
//    )
//    private List<Place> places;

    @ManyToMany
    @JoinTable(
            name = "wishplace",
            joinColumns = @JoinColumn(name = "wish_id"),
            inverseJoinColumns = @JoinColumn(name = "place_id")
    )
    private List<Place> places;


    public Wish() {

        places = new ArrayList<>();
    }

}