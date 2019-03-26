package com.playjo.project.playjo.domain;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;
import javax.persistence.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "notice")
@Setter
@Getter

public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notice_no;

    @Lob
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;

//    public Notice() {
//        users = new ArrayList<>();
//    }


}
