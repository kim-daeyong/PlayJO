package com.playjo.project.playjo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "placeImage")
@Setter
@Getter
public class PlaceImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int placeimg_no;

    @Column
    private String name;
    @Column(length = 255)
    private String savefilename;
    @Column(length = 255)
    private String mimetype;
    @Column(length = 255)
    private int length;

    @Column(name = "regdate")
    private Date regdate;

    @ManyToOne
    @JoinColumn(name = "place_no")
    private Place place;


}
