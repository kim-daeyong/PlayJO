package com.playjo.project.playjo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="category")
@Setter
@Getter


public class category {

    @Column(length=255)
    private int category_no;

    @OneToMany
    @JoinColumn(name = "list_place")
    private List<category> categoryList;



}
