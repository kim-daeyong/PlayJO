package com.playjo.project.playjo.repository.Custum;

import com.playjo.project.playjo.domain.Place;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class PlaceRepositoryImpl extends QuerydslRepositorySupport implements PlaceRepositoryCustum {

    public PlaceRepositoryImpl(){

        super(Place.class); // entity클래스 정보를 부모 클래스에게 전달.
    }

    @Override
    public List<Place> getPlaces(Long categoryId, int start, int limit, String searchKind, String searchStr) {
        return null;
    }

    @Override
    public Long getPlaceReadcount(Long categoryId, String searchKind, String searchStr) {
        return null;
    }

//    private void searchWhere(String searchKind, String searchStr, QPost qPost, JPQLQuery<Post> jpqlQuery) {
//        if ("NAME_SEARCH".equals(searchKind)) {
//            jpqlQuery.where(qPost.account.name.like("%" + searchStr + "%"));
//        } else if ("TITLE_SEARCH".equals(searchKind)) {
//            jpqlQuery.where(qPost.title.like("%" + searchStr + "%"));
//        } else if ("CONTENT_SEARCH".equals(searchKind)) {
//            jpqlQuery.where(qPost.content.like("%" + searchStr + "%"));
//        } else if ("TITLE_OR_CONTENT_SEARCH".equals(searchKind)) {
//            jpqlQuery.where(qPost.title.like("%" + searchStr + "%")
//                    .or(qPost.content.like("%" + searchStr + "%")));
//        }
//    }
}
