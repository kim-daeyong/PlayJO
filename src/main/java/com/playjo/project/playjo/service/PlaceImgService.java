package com.playjo.project.playjo.service;


import com.playjo.project.playjo.domain.PlaceImage;
import com.playjo.project.playjo.repository.PlaceImgRepository;
import com.playjo.project.playjo.repository.PlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PlaceImgService {
    private final PlaceImgRepository placeImgRepository;

    @Transactional(readOnly = true)
    public PlaceImage placeImage(Long id){

        return placeImgRepository.findById(id).get();
    }
}
