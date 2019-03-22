package com.playjo.project.playjo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "category")
@Setter
@Getter
public class Category {

    @Column(length = 255)
    private int category_no;

    @OneToMany(mappedBy = "place")
    private List<Place> placeList;

    public Category() {
        placeList = new ArrayList<>();
    }


}
