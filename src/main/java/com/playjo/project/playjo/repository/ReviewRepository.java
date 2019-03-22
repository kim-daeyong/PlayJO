package com.playjo.project.playjo.repository;

import org.springframework.data.jpa.repository.Query;

public interface ReviewRepository {

    @Query(value = "SELECT re From Review re INNER JOIN FETCH re.")
}
