package com.playjo.project.playjo.repository;

import com.playjo.project.playjo.domain.Notice;
import com.playjo.project.playjo.domain.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NoticeRepository extends JpaRepository<Notice,Long> {
//    @Query("SELECT a from Notice a WHERE a.email =  :email")
//    public Notice getNoticeByuserEmail(@Param("email")String email);

 /*   @Query("SELECT n from Notice n where n.noticeNo = :noticeNo")


    public List<Notice> getNotices(@Param("noticeNo")Long noticeNo);
*/
}