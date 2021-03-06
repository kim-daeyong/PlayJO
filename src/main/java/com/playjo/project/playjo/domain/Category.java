package com.playjo.project.playjo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "category")
@Setter
@Getter
@ToString
@Builder
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