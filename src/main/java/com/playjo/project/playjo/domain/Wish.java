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
    private int board_no;
    @Column(length = 45)
    public String category;
    @Column(length = 255)
    private String name;
    @Column(length = 255)
    private String location;
    @Column(length = 255)
    private int user_user_no;


    @ManyToOne
    @JoinColumn(name = "user_no")
    private List<User> users;

    public Wish() {

        users = new ArrayList<>();
    }
}


