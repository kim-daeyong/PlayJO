package com.playjo.project.playjo.domain;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "category")
@Setter
@Getter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int category_no;

    @Column(length = 255)
    private String cateName;

    @OneToMany(mappedBy = "category")
    private List<Place> places;
//
//    public Category() {
//        places = new ArrayList<>();
//    }


}
