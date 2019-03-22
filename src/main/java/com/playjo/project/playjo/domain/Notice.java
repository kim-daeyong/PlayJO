package com.playjo.project.playjo.domain;


import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;
import org.springframework.data.annotation.Id;

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
    private int noticeNo;

    @Lob
    private String content;

    @ManyToOne
    @JoinColumn(name = "user")
    private List<User> userList;

    public Notice() {
        userList = new ArrayList<>();
    }


}
