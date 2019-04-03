package com.playjo.project.playjo.repository.Custum;

import com.playjo.project.playjo.domain.Place;

import java.util.List;

public interface PlaceRepositoryCustum {


    public List<Place> getPlaces(Long categoryId, int start, int limit, String searchKind, String searchStr);
    public Long getPlaceReadcount(Long categoryId, String searchKind, String searchStr);
}
