package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface NoticeRepository extends JpaRepository<Notice,Long> {
//    @Query("SELECT a from Notice a WHERE a.email =  :email")
//    public Notice getNoticeByuserEmail(@Param("email")String email);


}
