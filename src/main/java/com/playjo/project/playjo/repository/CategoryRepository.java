package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long> {
//    @Query("select c from Category  c order by c.ordering ASC")
//    public List<Category> getAll();


}
