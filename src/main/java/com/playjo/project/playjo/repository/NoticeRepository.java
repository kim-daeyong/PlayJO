package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Notice;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NoticeRepository extends JpaRepository<Notice,Long> {


    //Notice의 리스트를 불러온다.
    @Query("SELECT n FROM Notice n inner join n.userNotice order by n.id desc")
    Page<Notice> getNotice(Pageable pageable);


    public List<Notice> getNotices(@Param("noticeNo")Long noticeNo);
*/
}