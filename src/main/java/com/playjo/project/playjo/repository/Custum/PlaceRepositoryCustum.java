package com.playjo.project.playjo.repository.Custum;

import com.playjo.project.playjo.domain.Place;

import java.util.List;

public interface PlaceRepositoryCustum {


    public List<Place> getMainPlaces(Long categoryId, int start, int limit, String searchKind, String searchStr);

    public List<Place> getPlacesReadcount(Long categoryId, int start, int limit, String searchKind, String searchStr);
    public List<Place> getPlacesRatingAvg(Long categoryId, int start, int limit, String searchKind, String searchStr);

    public Long getPlaceReadcount(Long categoryId, String searchKind, String searchStr);
}
