package com.playjo.project.playjo.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "user")
@Setter
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(length = 255)
    private String email;

    @Column(length = 45)
    private String name;

    @Column(length = 45)
    private String nickName;

    @Column(length = 20)
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


    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "user_roles",
            joinColumns = {@JoinColumn(name = "user_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")}
    )
    private Set<Role> roles;

    public User() {
        regDate = new Date();
        reviews = new ArrayList<>();
        notices = new ArrayList<>();
        wishs = new ArrayList<>();
        replys = new ArrayList<>();
        roles = new HashSet<>();

    }

    public void addRole(Role role) {
        if(roles == null)
            roles = new HashSet<>();
        roles.add(role);
    }

}
