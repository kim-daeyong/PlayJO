package com.playjo.project.playjo.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
@Setter
@Getter
public class User {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_no;

    @Column
    private int role;

    @Column(length = 255)
    private String email;

    @Column(length = 255)
    private String name;

    @Column(length = 255)
    private String nickName;

    @Column(length = 255)
    private String password;

    @Column
    private int birth;

    @Column(name = "regdate")
    private Date regDate;


    public User() {
        regDate = new Date();

    }

    @OneToMany(mappedBy = "review")
    private List<Review> review;

    @OneToMany(mappedBy = "notice")
    private List<Notice> notice;

    @OneToMany(mappedBy = "wishlist")
    private List<Wish> wishlist;


}
