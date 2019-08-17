package com.playjo.project.playjo.controller.api;


import com.playjo.project.playjo.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reply/api")
@RequiredArgsConstructor
public class ReplyAPIController {

    @Autowired
    private ReplyService replyService;




}
