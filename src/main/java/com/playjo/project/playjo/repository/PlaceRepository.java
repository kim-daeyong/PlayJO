package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Place;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlaceRepository extends JpaRepository<Place, Long> {
//    @Query(value = "SELECT P FROM Place p INNER JOIN FETCH p.category ORDER BY P.id DESC ",
//            countQuery = "SELECT count(p) FROM Post p")
//    public Page<Place> getPlace(Pageable pageable);
//
//    @Query("SELECT distinct p FROM Place p INNER JOIN FETCH p.category INNER JOIN FETCH p.account LEFT JOIN FETCH p.imageFiles WHERE p.id = :id")
//    public Place getPlace(@Param("id")Long id);
//


//  //Place의 리스트를 각 카테고리에 해당하는 값으로 불러온다.
//    @Query("SELECT p FROM Place p inner join fetch p.categoryNo where p.categoryNo = :categoryNo order by p.ratingAvg desc")
//    public Page<Place> getPlacesByCateNo(@Param("categoryNo") int categoryNo, Pageable pageable);

    //Place의 리스트를 각 카테고리에 해당하는 값으로 불러온다.
    @Query("SELECT p FROM Place p inner join p.categoryid c where c.id = :id order by p.ratingAvg desc")
    Page<Place> getPlacesByCateNo(@Param("id") int id,Pageable pageable);



//    @Query(value = "SELECT p FROM Place p order by p.ratingAvg desc")
//    public Page<Place> getPlaces(Pageable pageable);

}
