package com.playjo.project.playjo.domain;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "place_image")
@Setter
@Getter
public class PlaceImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="placeimg_no")
    private Long placeImgNo;

    @Column
    private String name;
    @Column(length = 255)
    private String saveFileName;
    @Column(length = 255)
    private String mimeType;
    @Column(length = 255)
    private Long length;

    @Column(name = "regdate")
    private Date regDate;

    @ManyToOne
    @JoinColumn(name = "place_no")
    private Place place;



    public PlaceImage() {
        regDate = new Date();
    }
}
