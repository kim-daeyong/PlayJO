package com.playjo.project.playjo.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="place")
@Getter
@Setter
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name ="name")
    private String name;

    @Column
    private String value1;

    @Column
    private String value2;

    @Lob
    private String location;

    @Lob
    private String detail;

    @Column(name = "reg_date")
    private Date regDate;

    @Column(name = "read_count")
    private Long readCount;

    @Column(name = "rating_Avg")
    private Double ratingAvg;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category categoryId;

    @OneToMany(mappedBy = "placeId",fetch=FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<PlaceImage> placeImages;

    @OneToMany(mappedBy = "placeId",fetch=FetchType.LAZY)
    private List<Review> reivews;


    @ManyToMany(mappedBy = "places")
    private List<Wish> wishPlace;

    public Place() {
        regDate = new Date();
        placeImages = new ArrayList<>();
        reivews = new ArrayList<>();
        wishPlace = new ArrayList<>();
    }

    public void addPlaceImg(PlaceImage placeImage) {
        if(placeImages == null)
            placeImages = new ArrayList<>();
        placeImage.setPlaceId(this); // 쌍방향이기 때문에 this를 참조하도록 한다.
        placeImages.add(placeImage);
    }


//    public String getShortContent(){
//        if(content.length() > 100)
//            return content.substring(0, 100);
//        else
//            return content;
//    }
//
//    public String getStripTitle(){
//        return StringEscapeUtils.escapeHtml4(title);
//    }
//
//    public String getStripContent(){
////        return Jsoup.parse(content).text();
//        String str = StringEscapeUtils.escapeHtml4(content);
//        return str.replaceAll("\n", "<br>");
//    }


}
