package com.playjo.project.playjo.domain;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "placeimage")
@Setter
@Getter
public class PlaceImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

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

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "place_id")
    private Place placeId;



    public PlaceImage() {
        regDate = new Date();
    }
}
