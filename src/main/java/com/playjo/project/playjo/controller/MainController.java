package com.playjo.project.playjo.controller;


import com.playjo.project.playjo.domain.Place;
import com.playjo.project.playjo.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class MainController {
    @Autowired
    PlaceService placeService;

    @GetMapping("/main")
    public String main(
            @RequestParam(name = "page", required = false, defaultValue = "1") int page,
            @RequestParam(name = "categoryId", required = false) Long categoryId,
            @RequestParam(name = "searchKind", required = false) String searchKind,
            @RequestParam(name = "searchStr", required = false) String searchStr,
            Model model){

//        List<Place> places1 = placeService.getPlacesRating(page, categoryId, searchKind, searchStr);
//        model.addAttribute("plcaes1", places1);
//        List<Place> places2 = placeService.getPlacesRead(page, categoryId, searchKind, searchStr);
//        model.addAttribute("plcaes2", places2);
        return "index";
    }
}
