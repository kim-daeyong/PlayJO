package com.playjo.project.playjo.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "wish")
@Setter
@Getter
public class Wish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wish_no;
    @Column(length = 45)
    public String category;
    @Column(length = 255)
    private String name;
    @Column(length = 255)
    private String location;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;


    @ManyToMany
    @JoinTable(name = "wishplace",
            joinColumns = {@JoinColumn(name = "wish_wish_no",referencedColumnName = "wish_no")},
            inverseJoinColumns = {@JoinColumn(name = "place_place_no", referencedColumnName = "place_no")}
    )
    private List<Place> places;

    public Wish() {
        places = new ArrayList<>();
    }

}