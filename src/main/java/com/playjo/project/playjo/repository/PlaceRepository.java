package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Place;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface PlaceRepository extends JpaRepository<Place, Long> {

    //Place의 리스트를 각 카테고리에 해당하는 값으로 불러와 평점avr(추천)로 정렬한다.
    @Query("SELECT p FROM Place p " +
            "inner join p.categoryid c " +
            "LEFT JOIN p.placeImages " +
            "where c.id = :id order by p.ratingAvg desc")
    Page<Place> getPlacesRatingByCateNo(@Param("id") int id,Pageable pageable);

    //Place의 리스트를 각 카테고리에 해당하는 값으로 불러와 ReadCount순(인기)으로 정렬한다.
    @Query("SELECT p FROM Place p " +
            "inner join p.categoryid c " +
            "LEFT JOIN p.placeImages" +
            " where c.id = :id order by p.readCount desc")
    Page<Place> getPlacesReadByCateNo(@Param("id") int id,Pageable pageable);

    //Place의 상세보기
    @Query("SELECT distinct p FROM Place p " +
            "INNER JOIN fetch p.categoryid " +
            "LEFT JOIN fetch p.placeImages WHERE p.id = :id")
    public Place getPlaceDetail(@Param("id") Long id);

    //랜덤하게 불러오기(메인 및 각 Place Page용
//    @Query(value = "SELECT p FROM Place p inner join p.categoryid c where c.id = :id order by RAND",nativeQuery = true)
//    public Place getPlaceRandom(@Param("id") Long id);



}
