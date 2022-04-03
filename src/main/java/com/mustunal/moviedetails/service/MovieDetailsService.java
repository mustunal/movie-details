package com.mustunal.moviedetails.service;

import com.mustunal.moviedetails.domain.MovieDetail;
import com.mustunal.moviedetails.repository.MovieDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieDetailsService {
    private final MovieDetailsRepository movieDetailsRepository;

    @Autowired
    public MovieDetailsService(MovieDetailsRepository movieDetailsRepository) {
        this.movieDetailsRepository = movieDetailsRepository;
    }

    public MovieDetail getMovieDetailById(long id) {
        return movieDetailsRepository.getMovieDetailById(id);
    }
}
