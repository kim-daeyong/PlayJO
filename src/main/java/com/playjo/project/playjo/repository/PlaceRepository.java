package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Place;
import com.playjo.project.playjo.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PlaceRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT P FROM Place p INNER JOIN FETCH p.category ORDER BY P.id DESC ",
            countQuery = "SELECT count(p) FROM Post p")
    public Page<Place> getPlace(Pageable pageable);

    @Query("SELECT distinct p FROM Place p INNER JOIN FETCH p.category INNER JOIN FETCH p.account LEFT JOIN FETCH p.imageFiles WHERE p.id = :id")
    public Place getPlace(@Param("id")Long id);


}
