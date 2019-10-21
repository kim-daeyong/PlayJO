package com.playjo.project.playjo.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reply")
@Setter
@Getter
@ToString
@Builder
public class Reply {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


    @Lob
    private String content;

    @Column(length = 45)
    private String nickName;

    @Column(name = "regdate")
    private Date regDate;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "review_id")
    @JsonIgnore
    private Review reviewId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User userId;

    public Reply() {
        regDate = new Date();

        
    }

}
