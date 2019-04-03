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
    @Column(name="id")
    private Long id;

    @Column
    private int role;

    @Column(length = 255)
    private String email;

    @Column(length = 255)
    private String name;

    @Column(length = 100)
    private String nickName;

    @Column(length = 100)
    private String password;

    @Column
    private int birth;

    @Column(name = "regdate")
    private Date regDate;


    @OneToMany(mappedBy = "userId",fetch=FetchType.LAZY)
    private List<Review> reviews;

    @OneToMany(mappedBy = "userId",fetch=FetchType.LAZY)
    private List<Reply> replys;

    @OneToMany(mappedBy = "userId",fetch=FetchType.LAZY)
    private List<Notice> notices;

    @OneToMany(mappedBy = "userId",fetch=FetchType.LAZY)
    private List<Wish> wishs;


    public User() {
        regDate = new Date();
        reviews = new ArrayList<>();
        notices = new ArrayList<>();
        wishs = new ArrayList<>();
        replys = new ArrayList<>();

    }

}
