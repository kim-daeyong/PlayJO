package com.playjo.project.playjo.controller;


import com.playjo.project.playjo.service.impl.WishService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wishs")
@RequiredArgsConstructor
public class WishController {

    private final WishService wishService;
}
