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
    @Column(name="id")
    private int id;

    @Column(length = 45)
    private String cateName;

    @OneToMany(mappedBy = "categoryId", fetch=FetchType.LAZY)
    private List<Place> places;

    public Category() {
        places = new ArrayList<>();

    }
}