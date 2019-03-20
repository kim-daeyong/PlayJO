package com.playjo.project.playjo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "list_image")
@Setter
@Getter
public class PlaceImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int image_no;

    @Column
    private String name;
    @Column(length = 255)
    private String savefilename;
    @Column(length = 255)
    private String mimetype;
    @Column(length = 255)
    private int length;



}
