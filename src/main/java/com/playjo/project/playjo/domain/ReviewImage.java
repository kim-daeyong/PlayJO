package com.playjo.project.playjo.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reviewimage")
@Setter
@Getter
public class ReviewImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(length = 255)
    private String name; // 오리지널 파일 명
    private Long length;

    @Column(length = 255)
    private String saveFileName;

    @Column(length = 255)
    private String mimeType;

    @Column( name = "regdate")
    private Date regdate;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "review_id")
    private Review reviewId;

}
