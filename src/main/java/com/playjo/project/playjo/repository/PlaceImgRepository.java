package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.PlaceImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public  interface PlaceImgRepository extends JpaRepository<PlaceImage,Long> {
    
}
