package com.playjo.project.playjo.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "review_image")
@Setter
@Getter
public class ReviewImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewImg_no;

    @Column(length = 255)
    private String name; // 오리지널 파일 명
    private long length;

    @Column(length = 255)
    private String saveFileName;

    @Column(length = 255)
    private String mimeType;

    @Column( name = "regdate")
    private Date regdate;

    @ManyToOne
    @JoinColumn(name = "review_no")
    private Review review;

}
