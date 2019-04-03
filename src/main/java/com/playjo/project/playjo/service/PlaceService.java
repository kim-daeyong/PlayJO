package com.playjo.project.playjo.service;


import com.playjo.project.playjo.domain.Category;
import com.playjo.project.playjo.domain.Place;
import com.playjo.project.playjo.domain.User;
import com.playjo.project.playjo.repository.CategoryRepository;
import com.playjo.project.playjo.repository.PlaceRepository;
import com.playjo.project.playjo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlaceService {
    private final PlaceRepository placeRepository;
    private final UserRepository userRepository;
    private final CategoryRepository categoryRepository;

    public final static String NAME_SEARCH = "name_search";
    public final static String TITLE_SEARCH = "title_search";
    public final static String CONTENT_SEARCH = "content_search";
    public final static String TITLE_OR_CONTENT_SEARCH = "title_content_search";


//    @Transactional(readOnly = true)
//    public List<Place> getPlacesRating(int page, Long categoryId, String searchKind, String searchStr) {
//        int limit = 5;
//        int start = page * limit - limit;
//        return placeRepository.getPlacesRatingByCateNo(categoryId, start, limit, searchKind, searchStr);
//    }
//    public List<Place> getPlacesRead(int page, Long categoryId, String searchKind, String searchStr) {
//        int limit = 5;
//        int start = page * limit - limit;
//        return placeRepository.getPlacesRatingByCateNo(categoryId, start, limit, searchKind, searchStr);
//
//    }


    @Transactional
    public Place addPlace(Place place, Long categoryId){
        Optional<Category> optionalCategory
                = categoryRepository.findById(categoryId);
        place.setCategoryid(optionalCategory.get());

        return placeRepository.save(place);
    }

    @Transactional(readOnly = true)
    public Place getPlace(Long id) {
        return placeRepository.getPlaceDetail(id);
    }

    @Transactional(readOnly = true)
//    public List<Place> getPlaces(int page, Long categoryId, String searchKind, String searchStr){
    public List<Place> getMainPlace(int page, Long categoryId){

        int limit = 3;
        int start = page * limit - limit;
//        return placeRepository.getPlacesRatingByCateNo(categoryId, start, limit, searchKind, searchStr);
      return null;
    }


}
