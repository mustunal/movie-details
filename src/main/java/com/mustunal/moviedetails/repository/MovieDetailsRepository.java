package com.mustunal.moviedetails.repository;

import com.mustunal.moviedetails.domain.MovieDetail;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MovieDetailsRepository {
    private Map<Long,MovieDetail> movieDetailMap = new HashMap<>();

    public MovieDetailsRepository() {
        initMovieDetails();
    }

    private void initMovieDetails() {
        MovieDetail movieDetail = new MovieDetail(1,"Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",9.3f);
        movieDetailMap.put(1L,movieDetail);

        movieDetail = new MovieDetail(2,"An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into much more.",8.8f);
        movieDetailMap.put(2L,movieDetail);

        movieDetail = new MovieDetail(2,"The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.",9.0f);
        movieDetailMap.put(2L,movieDetail);
    }

    public MovieDetail getMovieDetailById(long id) {
        return movieDetailMap.get(id);
    }
}
