package com.mustunal.moviedetails.controller;

import com.mustunal.moviedetails.domain.MovieDetail;
import com.mustunal.moviedetails.service.MovieDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movie-details")
public class MovieDetailsController {

    private final MovieDetailsService movieDetailsService;

    @Autowired
    public MovieDetailsController(MovieDetailsService movieDetailsService) {
        this.movieDetailsService = movieDetailsService;
    }

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/{id}")
    public MovieDetail getMovieDetailById(@PathVariable long id){
        return movieDetailsService.getMovieDetailById(id);
    }
}
