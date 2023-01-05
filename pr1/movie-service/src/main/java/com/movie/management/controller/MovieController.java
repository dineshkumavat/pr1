package com.movie.management.controller;


import com.movie.management.Entity.Movie;
import com.movie.management.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;
    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id){
        return movieService.getMovieById(id);
    }

    @PostMapping("/")
    public Movie saveMovie(@RequestBody Movie movie){
        return movieService.saveMovie(movie);
    }

}
