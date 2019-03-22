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
    private int wish_no;
    @Column(length = 45)
    public String category;
    @Column(length = 255)
    private String name;
    @Column(length = 255)
    private String location;

    @ManyToOne
    @JoinColumn(name = "user")
    private List<User> userList;

    public Wish() {

        userList = new ArrayList<>();
    }
}